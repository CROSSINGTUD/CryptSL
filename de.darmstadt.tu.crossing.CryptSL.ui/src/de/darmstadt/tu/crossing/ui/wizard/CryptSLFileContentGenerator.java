package de.darmstadt.tu.crossing.ui.wizard;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class CryptSLFileContentGenerator {
	private static List <String> abbrList;
	private Map<String,List<Method>> methodVariances = new HashMap<String,List<Method>>();;
	private Map<Method, String> returnsmap = new HashMap<>();
	private Map<String,List<Constructor>> classConstructors = new HashMap<String,List<Constructor>>();
	private static Map<String, List<String>> objectListMap = new HashMap<String, List<String>>();
    public CryptSLFileContentGenerator() {
    	abbrList = new ArrayList<String>();
    	abbrList.add("alg");
        abbrList.add("mode"); 
        abbrList.add("pad");
        abbrList.add("in");
        abbrList.add("this");
        abbrList.add("length");
    }

	protected String generateContent(Class<?> c, String javaClassName) {
		String content = "SPEC " + javaClassName + "\n";
		Method[] methods = c.getDeclaredMethods();
		if(methods.length>0) {
			createMethodMap(methods);
			if(!methodVariances.containsKey("getInstance")) {
				 Constructor constructors[] = c.getDeclaredConstructors();
				 createConstructorMap(constructors);
			}
			 
		    Map<Method,String> returnMap = createReturnMap(returnsmap);
		    Set<String> returnSet = new HashSet<>();
		    returnMap.entrySet().forEach(entry->{
		    	returnSet.add(entry.getValue());
		    });
		    
		    List<String> eventList = createEvents(methodVariances,returnMap);
		    if(classConstructors.size() > 0) {
		    	eventList.addAll(createConstructorList(classConstructors));
		    }
		    
		    List<String> objectList  = createparamObj(objectListMap);
		    
		    content = content +"OBJECTS";
		    
		    for (String ret : returnSet) {
		        content =  content + "\n\t" + ret + ";";
		    }
		    
		    for (String obj : objectList) {
		        content =  content + "\n\t" + obj +";";
		    }
		    
		    content = content + "\n\nEVENTS";
		    
	
		    for (String event : eventList) {
		        content =  content + "\n\t" + event;
		    }
		    content = content + "\n\nORDER\n*";
		    content = content + "\n\n//CONSTRAINTS\n//*";
		    content = content + "\n\n//REQUIRES\n//*";
		    content = content + "\n\n//ENSURES\n//*";
			
		}
		return content;
	}

	private void createConstructorMap(Constructor[] constructors) {
		List<Constructor> constructorVarlist =  new ArrayList<Constructor>();
	    for(Constructor constructor:constructors) {
	    	if (!classConstructors.containsKey(constructor.getDeclaringClass().getSimpleName())) {
	    		constructorVarlist =  new ArrayList<Constructor>();
	    		constructorVarlist.add(constructor);
	    		classConstructors.put(constructor.getDeclaringClass().getSimpleName(), constructorVarlist);
        	  } else {
        		  constructorVarlist.add(constructor);        		  
        		  classConstructors.put(constructor.getDeclaringClass().getSimpleName(), constructorVarlist);
        	  }
	    }
    }

	private void createMethodMap(Method[] methods) {
		List<Method> methodvarlist =  new ArrayList<Method>();
	    for (Method method : methods) {
           if (Modifier.isPublic(method.getModifiers())&& !method.getName().contains("toString")){
        	  if (!methodVariances.containsKey(method.getName())) {
        		  methodvarlist = new ArrayList<Method>();
        		  methodvarlist.add(method);
        		  methodVariances.put(method.getName(), methodvarlist);
        	  }else {
        		  methodvarlist.add(method);        		  
        		  methodVariances.put(method.getName(), methodvarlist);
        	  }
        	  if(!method.getReturnType().getName().contains("void")) {
      	    	if(method.getReturnType().getName().contains("String") ||
      	    			method.getReturnType().getName().contains("int") || 
      	    			method.getReturnType().getName().contains("byte") ||
      	    			method.getReturnType().getName().contains("long")){
      	    		returnsmap.put(method,method.getReturnType().getName());
      	    	}
      	    }
           }
	    }
	}

	private Map<Method,String> createReturnMap (Map<Method,String> returnsmap){
		Map<Method,String> newMap = new HashMap<>();
		returnsmap.entrySet().forEach(entry->{
			newMap.put(entry.getKey(), createRetrunObject(entry.getKey().getName(),entry.getValue()));
		});
		return newMap;
	}
	
	private String createRetrunObject(String methodName, String returnType) {
		String objectName = "";
		objectName= objectName+returnType + " ";
		if(methodName.substring(0,3).contains("get")) {
			methodName = methodName.substring(3,methodName.length());
			methodName = methodName.toLowerCase().charAt(0) + methodName.substring(1);
			objectName = objectName + methodName;
		}else {
			boolean hasUppercase = !methodName.equals(methodName.toLowerCase());
			if(hasUppercase) {
				String abr = "";
				for(int i=0;i<methodName.length()-1; i++) {
			        if(Character.isUpperCase(methodName.charAt(i))) {
			        	if(i == 0) {
			        		abr = abr + methodName.substring(i,Math.min(i+3, methodName.length())).toLowerCase();
			        	}else {
			        		abr = abr + methodName.substring(i,Math.min(i+3, methodName.length()));
			        	} 
			        }
			    }
				Character.toLowerCase(methodName.charAt(0));
				objectName = objectName + methodName;
			}else {
				objectName = objectName + methodName.substring(0,Math.min(methodName.length(), 11));
			}
		}
		return objectName;	
	}
	
	private List<String> createEvents(Map<String, List<Method>> methodvariances, Map<Method,String> returnMap) {
		Iterator<Entry<String, List<Method>>> it = methodvariances.entrySet().iterator();
		List<String> eventList = new ArrayList<String>();
		
		Map<String, String> objectMap = new HashMap<String,String>();
		String event = "";
	    while (it.hasNext()) {
	       Map.Entry pair = (Map.Entry)it.next();
	       String methodName = (String) pair.getKey();
	       List<Method> methods = (List<Method>) pair.getValue();
	       objectMap = createMethodParameterMap (methods);
	       String abbr = createMethodAbbr(methodName);
	       String group = "";
	       if(methods.size()>1) {
	    	   if(methodName.substring(0, 3).equals("get")) {
	    		   group = methodName.substring(3,methodName.length())+"s := ";
	    	   }else {
	    		   group = methodName +"s := ";
	    		   group = group.substring(0, 1).toUpperCase() + group.substring(1);
	    	   }
	    	   for (int i = 1; i <= methods.size(); i++) {
				group = group +(abbr + i + "| ");
			}
	    	   group= group.substring(0, group.length()-2)+ ";\n";
	    	   
	       }
	       int k=1;
	       for(Method m:methods) {
	    	   String ret = "";
    		   if(returnMap.containsKey(m)) {
    			   String retvalue = returnMap.get(m);
    			   retvalue = retvalue.substring(retvalue.indexOf(" ")+1, retvalue.length());
    			   ret = ret +retvalue + " = ";
    		   }
	    	   if(methods.size()<=1) {
	    		   event = abbr;
		    	   Parameter[] params = m.getParameters();
		    	   if(params.length<1) {
		    		   event = event+" : " + ret + methodName + "();";
		    	   }else {
		    		   event = event+" : " + ret + methodName + "(";
		    		   for(Parameter p: params) {
		    			   String parameter = objectMap.get(p.toString()) +", ";
			    		   event = event + parameter;
			    	   }
			    	   event = event.substring(0, event.length()-2) + ");";
		    	   }
			       eventList.add(event);
	    	   }else {
	    		   event = abbr+k;
	    		   k=k+1;
	    		   Parameter[] params = m.getParameters();
		    	   if(params.length<1) {
		    		   event = event+" : " + ret + methodName + "();";
		    	   }else {
		    		   event = event+" : " + ret + methodName + "(";
		    		   for(Parameter p: params) {
		    			   String parameter = objectMap.get(p.toString()) +", ";
			    		   event = event + parameter;
			    	   }
		    	   }
		    	   event = event.substring(0, event.length()-2) + ");";
			       eventList.add(event);
	    	   }
	       }
	       eventList.add(group);
	       it.remove();
	    }
		return eventList;
	}

	private List<String> createConstructorList(
			Map<String, List<Constructor>> classConstructurs) {
		Iterator<Entry<String, List<Constructor>>> it = classConstructurs.entrySet().iterator();
		List<String> eventList = new ArrayList<String>();
		Map<String, String> objectMap = new HashMap<String,String>();
		String event = "";
		event = "";
	    while (it.hasNext()) {
	       Map.Entry pair = (Map.Entry)it.next();
	       String constName = (String) pair.getKey();
	       List<Constructor> constructors = (List<Constructor>) pair.getValue(); 
	       objectMap = createConstructorParameterMap (constructors);
	       String abbr = createMethodAbbr(constName);
	       String group = "";
	       if(constructors.size()>1) {
	    	   group = abbr +"s := ";
	    	   int i=1;
	    	   for(Constructor c:constructors) {
	    		   group = group + (abbr + i +"| ");
	    		   i = i+1;
	    	   }
	    	   group= group.substring(0, group.length()-2)+ ";\n";
	    	   
	       }
	       int k=1;
	       for(Constructor c:constructors) {
	    	   if(constructors.size()<=1) {
	    		   event = abbr;
		    	   Parameter[] params = c.getParameters();
		    	   if(params.length<1) {
		    		   event = event+" : " +constName + "();";
		    	   }else {
		    		   event = event+" : " +constName + "(";
		    		   for(Parameter p: params) {
		    			   String parameter = objectMap.get(p.toString()) +", ";
			    		   event = event + parameter;
			    	   }
			    	   event = event.substring(0, event.length()-2) + ");";
		    	   }
			       eventList.add(event);
	    	   }else {
	    		   event = abbr + k;
	    		   k=k+1;
	    		   Parameter[] params = c.getParameters();
		    	   if(params.length<1) {
		    		   event = event+" : " +constName + "();";
		    	   }else {
		    		   event = event+" : " +constName + "(";
		    		   for(Parameter p: params) {
		    			   String parameter = objectMap.get(p.toString()) +", ";
			    		   event = event + parameter;
			    	   }
		    	   }
		    	   event = event.substring(0, event.length()-2) + ");";
			       eventList.add(event);
	    	   }
	       }
	       eventList.add(group);
	       it.remove();
	    }
	    return eventList;
	}
	
	private String createMethodAbbr(String methodName) {
		String abbr = "";
		Random r = new Random();
		if(methodName.contains("get")) {
			abbr = abbr + Character.toLowerCase(methodName.charAt(3));
			if(!abbrList.contains(abbr)) {
				abbrList.add(abbr);
			}else {
				abbr = "";
				for(int i=0;i<methodName.length()-1; i++) {
			        if(Character.isUpperCase(methodName.charAt(i))) {
			        		abbr = abbr + methodName.substring(i,Math.min(i+3, methodName.length()));
			        }
			    }
				abbr = Character.toLowerCase(abbr.charAt(0))+abbr.substring(1);
				if(!abbrList.contains(abbr)) {
					abbrList.add(abbr);
				}else {
					abbr="";
					String randomalph = methodName.replaceAll("[AEIOUaeiou]", "");
					abbr = abbr + Character.toString(randomalph.charAt(r.nextInt(randomalph.length())));
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
				        			abbr = abbr + methodName.substring(i,Math.min(i+3,methodName.length()));
				        			break;
				        		}else {
				        			abbr = abbr + methodName.substring(i,Math.min(i+3, methodName.length()));
				        		}
				        }
					}
					abbr = Character.toLowerCase(abbr.charAt(0))+abbr.substring(1);
					if(!abbrList.contains(abbr)) {
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
		return abbr;
	}
	
	private List<String> createparamObj(Map<String, List<String>> objMap) {
		Iterator<Entry<String, List<String>>> it = objMap.entrySet().iterator();
		List<String> objectList = new ArrayList<String>();
		List <String> params = new ArrayList<String>();
		String type;
		String obj;
	    while (it.hasNext()) {
	    	Map.Entry pair = (Map.Entry)it.next();
	    	params = (List<String>) pair.getValue();
	    	type = (String) pair.getKey();
	    	for(String p:params) {
	    		obj = type + " "+p;
	    		objectList.add(obj);
	    	}

	       it.remove();
	    }
		return objectList;
	}
	
	private Map<String,String> createMethodParameterMap (List<Method> methodvariances){
	       Map<String, String> parameterMap = new HashMap<String,String>();
	       Set<String> paramSet = new HashSet<String>(); 
	       for(Method m:methodvariances) {
	    	   Parameter[] params = m.getParameters();
	    		   for(Parameter p: params) {
		    			   paramSet.add(p.toString());
			    	}
	       	}
			for(String p:paramSet) {
				    String param = p.toString();
					String[] objectVariables = param.split("\\s+");
					String objectType = objectVariables[0];
				    String parameter = createParamAbbr(p.toString());
				    List<String> objectList = new ArrayList<String>();
					if(this.objectListMap.containsKey(objectType)) {
						objectList = this.objectListMap.get(objectType);
						int size = objectList.size()+1;
						parameter = (parameter + size).toString();
						objectList.add(parameter);
						this.objectListMap.put(objectType, objectList);
					}else {
						int size = 1;
						parameter = (parameter + size).toString();
						objectList.add(parameter);
						this.objectListMap.put(objectType, objectList);
					}
					 if(!parameterMap.containsKey(p)) {
					  parameterMap.put(p, parameter);
				    }
				  }  
		   return parameterMap;		  
	    }
	
	
	private Map<String,String> createConstructorParameterMap (List<Constructor> constructors){
	       Map<String, String> parameterMap = new HashMap<String,String>();
	       Set<String> paramSet = new HashSet<String>(); 
	       for(Constructor c: constructors) {
	    	   Parameter[] params = c.getParameters();
	    		   for(Parameter p: params) {
		    			   paramSet.add(p.toString());
			    	}
	       	}
			for(String p:paramSet) {
				    String param = p.toString();
					String[] objectVariables = param.split("\\s+");
					String objectType = objectVariables[0];
				    String parameter = createParamAbbr(p.toString());
				    List<String> objectList = new ArrayList<String>();
					if(this.objectListMap.containsKey(objectType)) {
						objectList = this.objectListMap.get(objectType);
						int size = objectList.size()+1;
						parameter = (parameter + size).toString();
						objectList.add(parameter);
						this.objectListMap.put(objectType, objectList);
					}else {
						int size = 1;
						parameter = (parameter + size).toString();
						objectList.add(parameter);
						this.objectListMap.put(objectType, objectList);
					}
					 if(!parameterMap.containsKey(p)) {
					  parameterMap.put(p, parameter);
				    }
				  }  
		   return parameterMap;		  
	    }
	
	private String createParamAbbr(String p) {
		// TODO Auto-generated method stub
		String objectName = null;
		String[] objectVariables = p.split("\\s+");
		String objectType = objectVariables[0];
		objectName = createObjectName(objectType); 
		if(objectType.contains("[")) {
			objectName = objectName +"Array";
		}
		return objectName;
	}
	
	private String createObjectName(String objectType) {
		String objectName = null;
		int index = objectType.lastIndexOf(".");
		if(index>0) {
			objectName = objectType.substring(index+1);
			if(objectName.length() <= 9) {
				objectName = objectName.toLowerCase();
			}
			else {
				boolean hasUppercase = !objectName.equals(objectName.toLowerCase());
				if(hasUppercase) {
					String abr = "";
					for(int i=0; i<objectName.length()-1; i++) {
				        if(Character.isUpperCase(objectName.charAt(i))) {
				        	if(i==0) {
				        		abr = abr + objectName.substring(i,Math.min(i+3, objectName.length())).toLowerCase();
				        	}else {
				        		abr = abr + objectName.substring(i,Math.min(i+3, objectName.length()));
				        	} 
				        }
				    }
					objectName = abr;
				}else {
					objectName =  objectName.substring(0,Math.min(objectName.length(), 11));
				}
			}	
		}else {
			boolean hasUppercase = !objectType.equals(objectType.toLowerCase());
			if(!hasUppercase && objectType.matches("[a-zA-Z]+") && objectType.length()<5) {
				objectName = objectType;
			}else {
				objectName = objectType.substring(0,2)+objectType.substring(2,objectType.length()).replaceAll("[AEIOUaeiou]", "").replaceAll("[^a-zA-Z]", "");
			}
		}
		return objectName;
	}
}