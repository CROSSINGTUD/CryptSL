package de.darmstadt.tu.crossing.ui.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;

public class ClassLoader {

	public static Class<?> LoadFromJar(String keyClass,String jarPath) {
	     URL jarUrl = null;
		try {
			jarUrl = new File(jarPath).toURI().toURL(); 
			URLClassLoader loader = new URLClassLoader(new URL[]{jarUrl});
			JarFile jar = null;
			boolean found = false;
			jar = new JarFile(jarPath);
			Enumeration<JarEntry> e = jar.entries();
			while (e.hasMoreElements() && !found) {
	            JarEntry je = (JarEntry) e.nextElement();
	            if(je.isDirectory() || !je.getName().endsWith(".class")){
	                continue;
	            }
	            String classname =
	                    je.getName().replace('/', '.').substring(0, je.getName().length() - 6).split("\\$")[0];
	            if (classname.equals(keyClass)){
	            	found = true;
					Class<?> c = loader.loadClass(classname);
					return c;
	            }
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return null;
	}
}