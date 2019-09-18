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
	     URL jarUrl;
		try {
			jarUrl = new File(jarPath).toURI().toURL(); 
			URLClassLoader loader = new URLClassLoader(new URL[]{jarUrl});
			JarFile jar;
			try {
				jar = new JarFile(jarPath);
				Enumeration<JarEntry> e = jar.entries();
				boolean found = false;
				while (e.hasMoreElements() && !found) {
		            JarEntry je = (JarEntry) e.nextElement();
		            if(je.isDirectory() || !je.getName().endsWith(".class")){
		                continue;
		            }
		            String classname =
		                    je.getName().replace('/', '.').substring(0, je.getName().length() - 6).split("\\$")[0];
		            if (classname.equals(keyClass)){
		            	 try {
							Class<?> c = loader.loadClass(classname);
							//Method [] methods=c.getMethods();
							//return methods;
							return c;
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							System.out.println(classname + "is not found");
						}
		            	 found = true;
		            }
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
}