package de.darmstadt.tu.crossing.ui.utils;

import java.net.MalformedURLException;
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
	 * for the given keyClassName and path to jar file
	 * load the class from the jar file.
	 */
	public static Class<?> LoadClassFromJar(String keyClassName, String jarPath) {
		URL jarUrl = null;
		try {
			jarUrl = new File(jarPath).toURI().toURL();
			URLClassLoader loader = new URLClassLoader(new URL[] { jarUrl });
			JarFile jar = new JarFile(jarPath);
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
		} catch (IOException e1) {
			System.err.println("Error reading jar file: '" + jarPath + "' " + e1);
		} catch (ClassNotFoundException e1) {
			System.err.println("Error loading class: " + e1);
		}
		return null;
	}
    
	/**
	 * for the given path to jar file
	 * return the list of class names
	 */
	public static List<String> LoadClassListFromJar(String jarPath) {
		URL jarUrl = null;
		try {
			jarUrl = new File(jarPath).toURI().toURL();
			URLClassLoader loader = new URLClassLoader(new URL[] { jarUrl });
			JarFile jar = new JarFile(jarPath);
			boolean found = false;
			Enumeration<JarEntry> e = jar.entries();
			List<String> classes = new ArrayList<String>();
			while (e.hasMoreElements() && !found) {
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
			return classes;
		} catch (IOException e1) {
			System.err.println("Error reading jar file: '" + jarPath + "' " + e1);
		}
		return null;
	}
}