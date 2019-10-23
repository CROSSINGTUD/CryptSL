package de.darmstadt.tu.crossing.ui.utils;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;

public class ClassPathLoader {

	/**
	 * for the given keyClassName and classpath entry load the class from the given
	 * path. file.
	 */
	public static Class<?> LoadClassFromPath(String keyClassName, String path) {
		URL url = null;
		File file = new File(path);
		try {
			url = file.toURI().toURL();
			URLClassLoader loader = new URLClassLoader(new URL[] { url });
			if (file.isDirectory()) {
				// if given path is a directory load the class from the directory.
				List<File> classList = new ArrayList<File>();
				classList = createFileList(path);
				for (File f : classList) {
					if (f.isDirectory() || !f.getName().endsWith(".class")) {
						continue;
					}

					String absolutePath = f.getAbsoluteFile().getPath();
					int indexof = absolutePath.indexOf(path) + path.length() + 1;
					String className = absolutePath.substring(indexof);
					className = className.replace(System.getProperty("file.separator"), ".")
							.substring(0, className.length() - 6).split("\\$")[0];
					if (className.equals(keyClassName)) {
						Class<?> c;
						c = loader.loadClass(className);
						return c;

					}
				}

			} else {
				// else load the class from jar
				JarFile jar;
				jar = new JarFile(path);
				boolean found = false;
				Enumeration<JarEntry> e = jar.entries();
				while (e.hasMoreElements() && !found) {
					JarEntry je = (JarEntry) e.nextElement();
					if (je.isDirectory() || !je.getName().endsWith(".class")) {
						continue;
					}
					String className = je.getName().replace('/', '.').substring(0, je.getName().length() - 6)
							.split("\\$")[0];
					if (className.equals(keyClassName)) {
						found = true;
						Class<?> c = loader.loadClass(className);
						return c;
					}
				}

			}
		} catch (ClassNotFoundException e) {
			System.err.println(keyClassName + " class not found in projects classpath. " + e);
		} catch (IOException e1) {
			System.err.println("Error reading class from path: '" + path + "' " + e1);
		}

		return null;
	}

	/**
	 * for the given path to jar file return the list of class names
	 */
	public static List<String> LoadClassListFromPath(String path) {
		File file = new File(path);
		List<String> classes = new ArrayList<String>();
		URL url = null;
		try {
			url = file.toURI().toURL();
			URLClassLoader loader = new URLClassLoader(new URL[] { url });
			if (file.isDirectory()) {
				List<File> classList = createFileList(path);
				if (!classList.isEmpty()) {
					for (File f : classList) {
						if (f.isDirectory() || !f.getName().endsWith(".class")) {
							continue;
						}
						String absolutePath = f.getAbsoluteFile().getPath();
						int indexof = absolutePath.indexOf(path) + path.length() + 1;
						String className = absolutePath.substring(indexof);
						className = className.replace(System.getProperty("file.separator"), ".")
								.substring(0, className.length() - 6).split("\\$")[0];
						if (!classes.contains(className)) {
							classes.add(className);
						}
					}
				}

			} else {
				JarFile jar = new JarFile(path);
				Enumeration<JarEntry> e = jar.entries();
				while (e.hasMoreElements()) {
					JarEntry je = (JarEntry) e.nextElement();
					if (je.isDirectory() || !je.getName().endsWith(".class")) {
						continue;
					}
					String classname = je.getName().replace('/', '.').substring(0, je.getName().length() - 6)
							.split("\\$")[0];
					if (!classes.contains(classname)) {
						classes.add(classname);
					}
				}
			}
		} catch (IOException e1) {
			System.err.println("Error loading classes from path: '" + path + "' " + e1);
		}
		return classes;

	}

	public static List<File> createFileList(String path) {
		List<File> fileList = new ArrayList<File>();
		getFileListFromDirectory(path, fileList);
		return fileList;
	}

	public static void getFileListFromDirectory(String directoryName, List<File> files) {
		File directory = new File(directoryName);
		// Get all files from a directory.
		File[] fList = directory.listFiles();
		if (fList != null)
			for (File file : fList) {
				if (file.isFile()) {
					files.add(file);
				} else if (file.isDirectory()) {
					getFileListFromDirectory(file.getAbsolutePath(), files);
				}
			}
	}
}
