package de.darmstadt.tu.crossing.ui.wizard;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

import de.darmstadt.tu.crossing.ui.utils.ClassPathLoader;
import de.darmstadt.tu.crossing.ui.utils.ClassPathSolver;

public class CryptSLFileUtil {

	/**
	 * for a given className returns a string by replacing '.' to '\\'
	 */
	public static String createPath(String className) {
		String path = "";
		if (!className.isEmpty()) {
			int endIndex = className.lastIndexOf(".");
			if (endIndex != -1) {
				path = className.substring(0, endIndex);
			}
		}
		path = path.replaceAll("\\.", "\\\\");
		return path;
	}

	/**
	 * for given folderName and className to be appropriate to java project
	 * structure, generate all required directories
	 * 
	 * @return absolute path of generated directory as a string
	 */
	public static String generateDirectory(String folderName, String className) {
		String relativePath = createPath(className);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IFile file = root.getFile(new Path(folderName));
		IProject project = file.getProject();
		IPath path = file.getRawLocation();
		String absolutePath = path.toString() + System.getProperty("file.separator") + relativePath;
		java.nio.file.Path folderpath = Paths.get(absolutePath);
		// if directory exists?
		if (!Files.exists(folderpath)) {
			try {
				Files.createDirectories(folderpath);
				project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (IOException | CoreException e) {
				// fail to create directory
				System.err.println("Fail to create directory: ' " + absolutePath + "' " + e);
			}
		}
		return absolutePath;
	}

	/**
	 * for a given folderName
	 * 
	 * @return the project's class path which it belongs
	 */
	public static Collection<String> getProjectClassPath(String folderName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IFile file = root.getFile(new Path(folderName));
		IProject project = file.getProject();
		IJavaProject targetProject;
		try {
			if (project.hasNature(JavaCore.NATURE_ID)) {
				targetProject = JavaCore.create(project);
				Collection<String> classpath = ClassPathSolver.getClasspath(targetProject);
				return classpath;
			}

		} catch (CoreException e) {
			System.err.println("Fail to check projects Nature : ' " + project.getName() + "' " + e);
		}
		return null;
	}

	/**
	 * for a given className return class methods
	 */
	public static Class<?> getClass(String className, Collection<String> classpath) {
		Class<?> c;
		for (String path : classpath) {
			c = ClassPathLoader.LoadClassFromPath(className, path);
			if (c != null) {
				return c;
			}
		}
		return null;
	}
}