package crysl;

import crysl.parsing.CrySLModelReader;
import crysl.parsing.CrySLParserException;
import crysl.rule.CrySLRule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrySLParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrySLParser.class);
    private static final String CRYSL_FILE_ENDING = ".crysl";

    /**
     * Reads the rules from a specific path. The path can either direct to a directory containing
     * the .crysl files or a .zip file.
     *
     * @param path path to a directory or .zip file containing the .crysl files
     * @return the {@link CrySLRule} objects from the path
     * @throws IOException if there are problems reading the files
     */
    public Collection<CrySLRule> parseRulesFromPath(String path) throws IOException {
        if (isZipFile(path)) {
            return parseRulesFromZipArchive(path);
        }

        return parseRulesFromDirectory(path);
    }

    public Collection<CrySLRule> parseRulesFromDirectory(String path) throws IOException {
        File directory = new File(path);
        if (!directory.exists()) {
            throw new FileNotFoundException("Directory " + path + " does not exist");
        }

        if (!directory.isDirectory()) {
            throw new IOException(path + " is not a directory");
        }

        Collection<File> files = Arrays.asList(directory.listFiles());
        return parseRulesFromFiles(files);
    }

    public Collection<CrySLRule> parseRulesFromFiles(Collection<File> files) {
        Collection<CrySLRule> result = new HashSet<>();

        for (File file : files) {
            try {
                CrySLRule rule = parseRuleFromFile(file);

                if (result.contains(rule)) {
                    LOGGER.warn("Rule for class {} appears multiple times", rule.getClassName());
                    continue;
                }

                result.add(rule);
            } catch (CrySLParserException e) {
                LOGGER.error(e.getMessage());
            }
        }
        return result;
    }

    public CrySLRule parseRuleFromFile(File file) throws CrySLParserException {
        String fileName = file.getName();
        if (!fileName.endsWith(CRYSL_FILE_ENDING)) {
            throw new CrySLParserException(
                    "The extension of " + fileName + " does not match " + CRYSL_FILE_ENDING);
        }

        CrySLModelReader modelReader = new CrySLModelReader();
        return modelReader.readRule(file);
    }

    private boolean isZipFile(String path) {
        File file = new File(path);

        // Copied from
        // https://stackoverflow.com/questions/33934178/how-to-identify-a-zip-file-in-java
        int fileSignature;

        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            fileSignature = raf.readInt();
        } catch (IOException e) {
            return false;
        }
        return fileSignature == 0x504B0304
                || fileSignature == 0x504B0506
                || fileSignature == 0x504B0708;
    }

    public Collection<CrySLRule> parseRulesFromZipArchive(String path) throws IOException {
        Collection<CrySLRule> result = new HashSet<>();
        File file = new File(path);

        try (ZipFile zipFile = new ZipFile(file)) {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();

                if (entry.isDirectory()) {
                    continue;
                }

                try {
                    CrySLRule rule = parseRuleFromZipEntry(entry, zipFile, file);
                    result.add(rule);
                } catch (CrySLParserException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
        return result;
    }

    private CrySLRule parseRuleFromZipEntry(ZipEntry entry, ZipFile zipFile, File file)
            throws CrySLParserException {
        String entryName = entry.getName();
        if (entry.isDirectory() || !entryName.endsWith(CRYSL_FILE_ENDING)) {
            throw new CrySLParserException("ZIP entry " + entryName + " is not a CrySL file");
        }

        try {
            String name = createUniqueZipEntryName(file, entry);
            CrySLModelReader reader = new CrySLModelReader();

            InputStream inputStream = zipFile.getInputStream(entry);
            CrySLRule rule = reader.readRule(inputStream, name);
            inputStream.close();

            return rule;
        } catch (IOException ex) {
            throw new CrySLParserException(
                    "Could not read file "
                            + entry.getName()
                            + " from Zip archive "
                            + ex.getMessage());
        }
    }

    /**
     * For zip file entries there is no real URI. Using the raw absolute path of the zip file will
     * cause an exception when trying to resolve/create the resource in the {@link
     * CrySLModelReader#readRule(File)} methods. Solution: Create a custom URI with the following
     * scheme: uri := [HexHashedAbsoluteZipFilePath][SystemFileSeparator][ZipEntryName] This scheme
     * has the properties that it still is unique system-wide, The hash will be the same for the
     * same file, so you could know if two rules come from the same ruleset file, and you still can
     * get the information of the zipped file.
     *
     * @param zipFile the File that holds the zip archive
     * @param zipEntry the Zip entry to create the name for
     * @return the unique name
     */
    private static String createUniqueZipEntryName(File zipFile, ZipEntry zipEntry) {
        StringBuilder sb = new StringBuilder();

        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        messageDigest.update(zipFile.getAbsolutePath().getBytes());
        byte[] updatedFileName = messageDigest.digest(zipFile.getAbsolutePath().getBytes());

        String partFileName = bytesToHex(updatedFileName);
        sb.append(partFileName);
        sb.append(File.separator);
        sb.append(zipEntry.getName());
        return sb.toString();
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) sb.append(String.format("%02x", b));
        return sb.toString();
    }
}
