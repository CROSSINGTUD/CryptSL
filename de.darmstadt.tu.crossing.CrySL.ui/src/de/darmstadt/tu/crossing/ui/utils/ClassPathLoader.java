package de.darmstadt.tu.crossing.ui.utils;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.io.File;
import java.io.IOException;

public class ClassPathLoader {


	/**
	 * for the given keyClassName and classpath entry load the class from the given
	 * path. file.
	 */
	public static Class<?> LoadClassFromPath(String name, String path) {
		File base = new File(path);
		try(URLClassLoader loader = new URLClassLoader(new URL[] { base.toURI().toURL() });) {
			return loader.loadClass(name);
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error reading class '" + name + "' from path: '" + path + "' " + e);
		} catch(SecurityException e) {
			System.err.println(e);
		}
		return null;
	}

	/**
	 * for the given path to jar file return the list of class names
	 */
	public static List<String> LoadClassListFromPath(String path) {
		File base = new File(path);
		List<String> classes = new ArrayList<String>();
		if (base.isDirectory()) {
			// if given path is a directory load the class from the directory.
			List<File> classList = recursivelyListFiles(base);
			for (File f : classList) {
				if (!f.getName().endsWith(".class"))
					continue;
				classes.add(pathToQualifiedName(relativePath(f, base)));
			}
		}
		else {
			// else load the class from jar
			try(JarFile jar = new JarFile(path)) {
				for(Enumeration<JarEntry> e = jar.entries(); e.hasMoreElements();) {
					JarEntry entry = e.nextElement();
					if (entry.isDirectory() || !entry.getName().endsWith(".class"))
						continue;
					classes.add(pathToQualifiedName(entry.getName()));
				}
			} catch (IOException e1) {
				System.err.println("Error reading classes from path: '" + path + "' " + e1);
			} catch(SecurityException e) {
				System.err.println(e);
			}
		}
		return classes;
	}

	/**
	 * Returns the qualified name of the path of a `.class` file.
	 */
	private static String pathToQualifiedName(String path) {
		return path
			.substring(0, path.length() - 6) // remove `.class` file extension
			.replace(File.separatorChar, '.'); // map path to class name separator
	}

	/**
	 * Returns the path of file relative to base.
	 * Returns garbage if file is not in the tree of base.
	 */
	private static String relativePath(File file, File base) {
		try {
		return file.getAbsolutePath()
			.substring(base.getAbsolutePath().length() + 1);
		} catch(IndexOutOfBoundsException e) { return file.getAbsolutePath(); }
	}


	public static List<File> recursivelyListFiles(File path) {
		return recursivelyListFiles(path, new LinkedList<>());
	}

	public static List<File> recursivelyListFiles(File path, List<File> files) {
		if(!path.isDirectory()) return files;
		try {
			for (File file : path.listFiles()) {
				if (file.isFile())
					files.add(file);
				else if (file.isDirectory())
					recursivelyListFiles(file, files);
			}
		} catch(NullPointerException | SecurityException e) {
			System.err.println(e);
		}
		return files;
	}
}
