package de.darmstadt.tu.crossing.ui.wizard;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.FileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.WorkspaceFileGenerator;

import de.darmstadt.tu.crossing.ui.utils.ClassLoader;
import de.darmstadt.tu.crossing.ui.utils.ClassPathSolver;

@FileTemplate(label="CryptSL file wizard", icon="file_template.png", description="Create a file with CryptSL File Wizard")
public final class CryptSLFile extends AbstractFileTemplate{
	StringTemplateVariable classNamefield= text("Class Name", "");
	@Override
	public void generateFiles(IFileGenerator generator) {
		String content="";
		if(generator instanceof WorkspaceFileGenerator) {
			String javaClassName = classNamefield.getValue().replaceAll("\\s","");
			try {
				Class claz = Class.forName(javaClassName);
				content = generateContent(claz,javaClassName);
			} catch (ClassNotFoundException e) {
				Collection<String> classpath = getProjectClassPath(getFolder());
				if(classpath.size()>0) {
					Class<?> claz =  getClassMethods(javaClassName,classpath);
					content= generateContent(claz,javaClassName);
				}else {
					System.out.println(javaClassName+" is not found");
					e.printStackTrace();
				}
			}
		}
		 generator.generate(getFolder()+"/"+getName()+".cryptsl", content);

	}
	public String createObjectName(String objectType) {
		String objectName=null;
		int index=objectType.lastIndexOf(".");
		if(index>0) {
			objectName=objectType.substring(index+1);
			if(objectName.length()<=9) {
				objectName = objectType + " " + objectName.toLowerCase();
			}
			else {
				boolean hasUppercase = !objectName.equals(objectName.toLowerCase());
				if(hasUppercase) {
					String abr="";
					for(int i=0;i<objectName.length()-1; i++) {
				        if(Character.isUpperCase(objectName.charAt(i))) {
				        	if(i==0) {
				        		abr=abr+objectName.substring(i,Math.min(i+3, objectName.length())).toLowerCase();
				        	}else {
				        		abr=abr+objectName.substring(i,Math.min(i+3, objectName.length()));
				        	} 
				        }
				    }
					objectName =objectType + " " + abr;
				}else {
					objectName =objectType + " " + objectName.substring(0,Math.min(objectName.length(), 11));
				}
			}
			
		}else {
			boolean hasUppercase = !objectType.equals(objectType.toLowerCase());
			if(!hasUppercase && objectType.matches("[a-zA-Z]+") && objectType.length()<5) {
				objectName = objectType + " " + objectType;
			}else {
				objectName = objectType + " "+ objectType.substring(0,2)+objectType.substring(2,objectType.length()).replaceAll("[AEIOUaeiou]", "").replaceAll("[^a-zA-Z]", "");
			}
		}
		
		return objectName;
	}
	public List<String> createObjectList (Set<String> objectSet){
		String objectName= null;
		String objectType=null;
		List <String> params = new ArrayList<String>();
		for(String param: objectSet) {
			String[] objectVariables = param.split("\\s+");
			objectType=objectVariables[0];
			objectName = createObjectName(objectType); 
			params.add(objectName);
		}
		Set <String> uniqParams= new HashSet<String>();
		Map<String, Long> counts =
			    params.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		for(String param : params) {
			if(counts.get(param) == 1) {
				if(param.contains("string") || param.contains("int") 
					|| param.contains("long") || param.contains("byte")) {
					uniqParams.add(param+"1");
				}else {
					uniqParams.add(param);
				}
				
			}else {
				for(int i=1; i<=counts.get(param);i++) {
					uniqParams.add(param + i);
				}
			}
		}
		List<String> sortedObjects= new ArrayList<>(uniqParams);
		Collections.sort(sortedObjects);
		return sortedObjects;
	}
	public String createRetrunObject(String methodName, String returnType) {
		String objectName="";
		objectName= objectName+returnType + " ";
		if(methodName.substring(0,3).contains("get")) {
			methodName = methodName.substring(3,methodName.length());
			methodName = methodName.toLowerCase().charAt(0) + methodName.substring(1);
			objectName = objectName+methodName;
		}else {
			boolean hasUppercase = !methodName.equals(methodName.toLowerCase());
			if(hasUppercase) {
				String abr="";
				for(int i=0;i<methodName.length()-1; i++) {
			        if(Character.isUpperCase(methodName.charAt(i))) {
			        	if(i==0) {
			        		abr=abr+methodName.substring(i,Math.min(i+3, methodName.length())).toLowerCase();
			        	}else {
			        		abr=abr+methodName.substring(i,Math.min(i+3, methodName.length()));
			        	} 
			        }
			    }
				Character.toLowerCase(methodName.charAt(0));
				objectName =objectName + methodName;
			}else {
				objectName =objectName + methodName.substring(0,Math.min(methodName.length(), 11));
			}
		}
		
		return objectName;	
	}
	public List<String> createReturnList (Map<String,String> returnsmap){
		List <String> params = new ArrayList<String>();
		returnsmap.entrySet().forEach(entry->{
			params.add(createRetrunObject(entry.getKey(),entry.getValue()));
		});
		return params;
	}
	
	public Map<String,String> createReturnMap (Map<String,String> returnsmap){
		Map<String,String> newMap = new HashMap<>();
		returnsmap.entrySet().forEach(entry->{
			newMap.put(entry.getKey(), createRetrunObject(entry.getKey(),entry.getValue()));
		});
		return newMap;
		
	}
	
	public List <String> createEventList (Map<String, List<List<String>>> methods, List<String>objectList, Map<String,String> returnMap){
		List <String> eventList = new ArrayList<String>();
		List <String> abbrList = new ArrayList<String>();
	    methods.entrySet().forEach(entry->{
			String methodName = entry.getKey();
			List<List<String>> parameters = entry.getValue();
			String abbr =  "";
			Random r = new Random();
			if(methodName.contains("get")) {
				abbr = abbr + Character.toLowerCase(methodName.charAt(3));
				if(!abbrList.contains(abbr)) {
					abbrList.add(abbr);
				}else {
					abbr="";
					for(int i=0;i<methodName.length()-1; i++) {
				        if(Character.isUpperCase(methodName.charAt(i))) {
				        		abbr=abbr+methodName.substring(i,Math.min(i+3, methodName.length()));
				        }
				    }
					abbr = Character.toLowerCase(abbr.charAt(0))+abbr.substring(1);
					if(!abbrList.contains(abbr)) {
						abbrList.add(abbr);
					}else {
						abbr="";
						String randomalph = methodName.replaceAll("[AEIOUaeiou]", "");
						abbr = abbr+ Character.toString(randomalph.charAt(r.nextInt(randomalph.length())));
						abbr = Character.toLowerCase(abbr.charAt(0))+abbr.substring(1);
						abbrList.add(abbr);
					}
				}
			}else {
				abbr = Character.toString(methodName.charAt(0)).toLowerCase();
				if(!abbrList.contains(abbr)) {
					abbrList.add(abbr);
				}else {
					boolean hasUppercase = !methodName.equals(methodName.toLowerCase());
					if(hasUppercase) {
						abbr="";
						for(int i=0;i<methodName.length()-1; i++) {
					        if(Character.isUpperCase(methodName.charAt(i))) {
					        		if(Character.isUpperCase(methodName.charAt(i+1))) {
					        			abbr=abbr+methodName.substring(i,Math.min(i+3,methodName.length()));
					        			break;
					        		}else {
					        			abbr=abbr+methodName.substring(i,Math.min(i+3, methodName.length()));
					        		}
					        }
						}
						abbr = Character.toLowerCase(abbr.charAt(0))+abbr.substring(1);
						if(abbrList.contains(abbr)) {
							abbrList.add(abbr);
						}
						else {
							abbr="";
							String randomalph = methodName.replaceAll("[AEIOUaeiou]", "");
							abbr = abbr+ Character.toString(randomalph.charAt(r.nextInt(randomalph.length())));
							abbr = Character.toLowerCase(abbr.charAt(0))+abbr.substring(1);
							abbrList.add(abbr);
						}
					}else {
						abbr=Character.toString(methodName.charAt(0));
						if(!abbrList.contains(abbr)) {
							abbrList.add(abbr);
						}else {
							String randomalph = methodName.replaceAll("[AEIOUaeiou]", "");
							abbr = abbr+ Character.toString(randomalph.charAt(r.nextInt(randomalph.length())));
							abbr = Character.toLowerCase(abbr.charAt(0))+abbr.substring(1);
							abbrList.add(abbr);
						}
					}
				}	
			}
			
			for(int i=0; i<parameters.size();i++) {
				List<String> params = parameters.get(i);
				params=getAbbrevation(params,objectList);
				String method= null;
				String returnVal = "";
				if (returnMap.containsKey(methodName)) {
					int index = returnMap.get(methodName).indexOf(" ");
					returnVal = returnMap.get(methodName).substring(index+1, returnMap.get(methodName).length());
					returnVal = returnVal +" = ";
				}
				if(parameters.size()>1) {
					method = abbr + (i+1) + ": " + returnVal + methodName + "(";
				}else {
					method = abbr + ": " + returnVal + methodName + "(";
				}
				for(String param: params) {
					method=method + param +", ";
				}
				if(method.lastIndexOf(",") > 0) {
					method=method.substring(0, method.lastIndexOf(","));
				}
				method=method+");";
				eventList.add(method);
			} 
			
			if(parameters.size()>1) {
			   String aggr = "";
			   if(methodName.indexOf("get") == 0) {
				   aggr = aggr+methodName.substring(3,methodName.length()) + Character.toString('s') + " := ";
			   }else {
				   aggr = methodName + Character.toString('s') + " := ";
			   }
				for(int k = 0; k<parameters.size();k++) {
					aggr = aggr + abbr + (k+1) + " "
							+ "| ";
				}
				if(aggr.lastIndexOf("|") > 0) {
					aggr=aggr.substring(0, aggr.lastIndexOf("|"));
				}
				aggr=aggr+";\n";
				eventList.add(aggr);
			}else {
				eventList.add(" ");
			}
		 });
	
	    return eventList;
	}
	
	public List<String> getAbbrevation(List<String> parameters, List<String> objects) {
		String[] paramtypes = new String [objects.size()];
		String[] paramabbr = new String [objects.size()];
		List<String> parameterList = new ArrayList<String>();
		for(int i=0; i<objects.size();i++ ) {
			String[] objectVariables = objects.get(i).split("\\s+");
			paramtypes[i] = objectVariables[0];
			paramabbr[i]=objectVariables[1];
		}
		for(String param: parameters) {
			for(int i=0;i<paramtypes.length;i++) {
				if(param.equals(paramtypes[i])) {
					parameterList.add(paramabbr[i]);
					paramtypes[i]="";
					break;
				}
			}
		}
		return parameterList;
	}
	public Collection<String> getProjectClassPath(String folderName) {
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
			System.out.println(e.getMessage());
		}
		return null;
	}
	public Class<?> getClassMethods(String classname, Collection<String> classpath) {
		Class<?> c;
		for(String path:classpath) {
			c=ClassLoader.LoadFromJar(classname, path);
			if(c != null) {
				return c;
			}
		}
		return null;
	}
	public String generateContent(Class<?> c, String javaClassName) {
		Map<String, List<List<String>>> methodsmap = new HashMap<>();
		Method[] methods = c.getDeclaredMethods();
		List<List<String>> parameters = new ArrayList<List<String>>();
		Set <String> objectSet = new HashSet<String>();
		Map<String, String> returnsmap = new HashMap<>();
	    for (Method method : methods) {
           if (Modifier.isPublic(method.getModifiers())&& !method.getName().contains("toString")){
        	   	List<String> methodParameters = new ArrayList<String>(); 	   	
        		for(Parameter parameter: method.getParameters()) {
	        		  if(!parameter.toString().contains("Class")) {
	        			  methodParameters.add(parameter.getParameterizedType().getTypeName());
	        			  objectSet.add(parameter.toString());
	        		  }
        		 } 
        	    if(methodsmap.containsKey(method.getName())) {
        	    	parameters.add(methodParameters);
        	    	methodsmap.put(method.getName(), parameters);
        	    }else {
        	    	parameters = new ArrayList<List<String>>();
        	    	parameters.add(methodParameters);
        	    	methodsmap.put(method.getName(), parameters);
        	    }
        	    if(!method.getReturnType().getName().contains("void")) {
        	    	if(method.getReturnType().getName().contains("String") ||
        	    			method.getReturnType().getName().contains("int") || 
        	    			method.getReturnType().getName().contains("byte") ||
        	    			method.getReturnType().getName().contains("long")){
        	    		returnsmap.put(method.getName(),method.getReturnType().getName());
        	    	}
        	    }
	       }
	    }
	    if(!methodsmap.containsKey("getInstance")) {
		    Constructor constructors[] = c.getDeclaredConstructors();
		    for(Constructor constructor:constructors) {
		    	List<String> methodParameters = new ArrayList<String>();
	    		for(Parameter parameter: constructor.getParameters()) {
	        		  if(!parameter.toString().contains("Class")) {
	        			  methodParameters.add(parameter.getParameterizedType().getTypeName());
	        			  objectSet.add(parameter.toString());
	        		  }
	    		 } 
	    	    if(methodsmap.containsKey(constructor.getDeclaringClass().getSimpleName())) {
	    	    	parameters.add(methodParameters);
	    	    	methodsmap.put(constructor.getDeclaringClass().getSimpleName(), parameters);
	    	    }else {
	    	    	parameters = new ArrayList<List<String>>();
	    	    	parameters.add(methodParameters);
	    	    	methodsmap.put(constructor.getDeclaringClass().getSimpleName(), parameters);
	    	    }
		    }
	    }
	    String content = "SPEC " + javaClassName + "\n";
	    content = content +"OBJECTS";
	    
	    List<String> objectList = new ArrayList<String>();
	    objectList = createObjectList(objectSet);
	    for (String object : objectList) {
	        content =  content + "\n\t" + object + ";";
	    }
	    
	    Map<String,String> returnMap = new HashMap();
	    returnMap = createReturnMap(returnsmap);
	    List<String> returnList = new ArrayList<>();
	    returnMap.entrySet().forEach(entry->{
	    	returnList.add(entry.getValue());
	    });
	    
	    for (String ret : returnList) {
	        content =  content + "\n\t" + ret + ";";
	    }
	    content = content + "\n\nEVENTS";
	    
	    List<String> eventList = new ArrayList<String>();
	    eventList = createEventList(methodsmap,objectList,returnMap);
	    
	    for (String event : eventList) {
	        content =  content + "\n\t" + event;
	    }
	    content = content + "\n\n//ORDER\n//*";
	    content = content + "\n\n//CONSTRAINTS\n//*";
	    content = content + "\n\n//REQUIRES\n//*";
	    content = content + "\n\n//ENSURES\n//*";
		return content;
	}

}