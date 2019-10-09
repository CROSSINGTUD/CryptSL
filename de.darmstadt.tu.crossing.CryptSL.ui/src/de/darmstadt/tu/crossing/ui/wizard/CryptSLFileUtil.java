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
	
	public static String createPath(String javaClassName) {
		String dir ="";
		if (null != javaClassName && javaClassName.length() > 0 )
		{
		    int endIndex = javaClassName.lastIndexOf(".");
		    if (endIndex != -1)  
		    {
		        dir = javaClassName.substring(0, endIndex); 
		    }
		} 
		dir = dir.replaceAll("\\.","\\\\");
		return dir;
	}
	
	public static String generateDirectory(String folder, String javaClassName) {	
		String dir = createPath(javaClassName);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IFile file = root.getFile(new Path(folder));
		IProject project = file.getProject();
		IPath path = file.getRawLocation();
		String folderpath2 = path.toString()+"/"+dir;
		java.nio.file.Path folderpath= Paths.get(folderpath2);
        //if directory exists?
        if (!Files.exists(folderpath)) {
            try {
            	Files.createDirectories(folderpath);
            	project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
            } catch (IOException | CoreException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
        return folderpath2;
	}
	
	public static Collection<String> getProjectClassPath(String folderName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IFile file = root.getFile(new Path(folderName));
		IProject project = file.getProject();
		IJavaProject targetProject;
		try {
			if (project.hasNature(JavaCore.NATURE_ID)) {
			    targetProject = JavaCore.create(project);
			    Collection<String> classpath=ClassPathSolver.getClasspath(targetProject);
			    return classpath;
			}
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Class<?> getClassMethods(String classname, Collection<String> classpath) {
		Class<?> c;
		for(String path:classpath) {
			c=ClassPathLoader.LoadClassFromJar(classname, path);
			if(c != null) {
				return c;
			}
		}
		return null;
	}
}