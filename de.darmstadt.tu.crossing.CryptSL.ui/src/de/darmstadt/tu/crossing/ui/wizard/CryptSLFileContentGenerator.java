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
	// the list for storing abbreviated method names
	private static List<String> abbrList;

	// the map for storing names of class methods and their parameters
	private Map<String, List<Method>> classMethods = new HashMap<String, List<Method>>();;

	// the map for storing class constructors and their parameters
	private Map<String, List<Constructor>> classConstructors = new HashMap<String, List<Constructor>>();

	// the map for storing methods with their return parameters
	private Map<Method, String> methodReturnMap = new HashMap<>();

	// the map for storing object types and object names of method and constructor
	// parameters
	private Map<String, List<String>> parameterMap = new HashMap<String, List<String>>();

	public CryptSLFileContentGenerator() {

		// add predefined keywords of cryptsl grammar to abbreviation list in order to
		// avoid further grammar errors.
		abbrList = new ArrayList<String>();
		abbrList.add("alg");
		abbrList.add("mode");
		abbrList.add("pad");
		abbrList.add("in");
		abbrList.add("this");
		abbrList.add("length");
		abbrList.add("T");
		abbrList.add("E");
	}

	/**
	 * for given class and className generate the content of cryptsl rule file.
	 * 
	 * @return the content as a string
	 */
	protected String generateContent(Class<?> c, String className) {
		String content = "SPEC " + className + "\n";
		if (c != null) {
			Method[] methods = c.getDeclaredMethods();
			if (methods.length > 0) {
				// put methods to classMethods map to use them later in "EVENTS" section.
				createMethodMap(methods);
				// if class does not have getInstance() method
				// put class constructors to classConstructors map to use them in "EVENTS" later
				// section.
				if (!classMethods.containsKey("getInstance")) {
					Constructor constructors[] = c.getDeclaredConstructors();
					createConstructorMap(constructors);
				}

				// create a map which stores method and their return variables.
				Map<Method, String> returnMap = createReturnMap(methodReturnMap);

				// store return methods parameters in a set to use for "OBJECTS" section of rule
				// later
				// file
				Set<String> returnSet = new HashSet<>();
				returnMap.entrySet().forEach(entry -> {
					returnSet.add(entry.getValue());
				});

				// the list to store class methods and constructors appropriate to
				// cryptsl grammar. It will be used for "EVENTS" section of rule file later .
				List<String> eventList = createEventList(classMethods, returnMap);
				if (classConstructors.size() > 0) {
					eventList.addAll(createConstructorList(classConstructors));
				}

				// the list to store methods and constructors parameters.
				// It will be used for "OBJECTS" section of the rule file. later
				List<String> objectList = createparamObj(parameterMap);

				// add objects to the content
				content = content + "OBJECTS";

				for (String ret : returnSet) {
					content = content + "\n\t" + ret + ";";
				}

				for (String obj : objectList) {
					content = content + "\n\t" + obj + ";";
				}

				// add events to the content
				content = content + "\n\nEVENTS";

				for (String event : eventList) {
					content = content + "\n\t" + event;
				}

				content = content + "\nORDER\n*";
				content = content + "\n\n//CONSTRAINTS//*";
				content = content + "\n\n//REQUIRES//*";
				content = content + "\n\n//ENSURES//*";

			}
		} else {
			// classname is not found in project's class path, create a rule file template
			content = content + "//'" + className + "' class is not found!";
			content = content + "\n\nOBJECTS\n*";
			content = content + "\n\nEVENTS\n*";
			content = content + "\n\nORDER\n*";
			content = content + "\n\n//CONSTRAINTS\n//*";
			content = content + "\n\n//REQUIRES\n//*";
			content = content + "\n\n//ENSURES\n//*";
		}
		return content;
	}

	/**
	 * put names of methods and their parameters to classMethods map. For methods
	 * which have same name, maps them to the same parameterList and update the
	 * parameter list with new added parameters.
	 * 
	 * If methods return type is string, int, byte or long add it to
	 * methodReturnMap.
	 */

	private void createMethodMap(Method[] methods) {
		List<Method> parameterList = new ArrayList<Method>();
		for (Method method : methods) {
			if (Modifier.isPublic(method.getModifiers()) && !method.getName().contains("toString")) {
				if (!classMethods.containsKey(method.getName())) {
					parameterList = new ArrayList<Method>();
					parameterList.add(method);
					classMethods.put(method.getName(), parameterList);
				} else {
					parameterList.add(method);
					classMethods.put(method.getName(), parameterList);
				}
				if (!method.getReturnType().getName().contains("void")) {
					if (method.getReturnType().getName().contains("String")
							|| method.getReturnType().getName().contains("int")
							|| method.getReturnType().getName().contains("byte")
							|| method.getReturnType().getName().contains("long")) {
						methodReturnMap.put(method, method.getReturnType().getName());
					}
				}
			}
		}
	}

	/**
	 * add names of constructors and their parameters to classConstructors map. For
	 * constructors which have same name, maps them to the same parameterList and
	 * update the parameter list with new added parameters.
	 */
	private void createConstructorMap(Constructor[] constructors) {
		List<Constructor> constructorVarlist = new ArrayList<Constructor>();
		for (Constructor constructor : constructors) {
			if (!classConstructors.containsKey(constructor.getDeclaringClass().getSimpleName())) {
				constructorVarlist = new ArrayList<Constructor>();
				constructorVarlist.add(constructor);
				classConstructors.put(constructor.getDeclaringClass().getSimpleName(), constructorVarlist);
			} else {
				constructorVarlist.add(constructor);
				classConstructors.put(constructor.getDeclaringClass().getSimpleName(), constructorVarlist);
			}
		}
	}

	/**
	 * for given methodReturnMap which contains methods and their return types
	 * returns a map which stores methods and their return objects.
	 */
	private Map<Method, String> createReturnMap(Map<Method, String> methodReturnMap) {
		Map<Method, String> newMap = new HashMap<>();
		methodReturnMap.entrySet().forEach(entry -> {
			// create an return object for given methodName and return type.
			String returnObject = createRetrunObject(entry.getKey().getName(), entry.getValue());
			newMap.put(entry.getKey(), returnObject);
		});
		return newMap;
	}

	/**
	 * for given method name and return type generates a return object. e.g: for
	 * given methodname: "getBlockSize" and return type: "int" returns "int
	 * blockSize"
	 */
	private String createRetrunObject(String methodName, String returnType) {
		String objectName = returnType + " ";
		if (methodName.substring(0, 3).contains("get")) {
			methodName = methodName.substring(3, methodName.length());
			methodName = methodName.toLowerCase().charAt(0) + methodName.substring(1);
			objectName = objectName + methodName;
		} else {
			boolean hasUppercase = !methodName.equals(methodName.toLowerCase());
			if (hasUppercase) {
				String abr = "";
				for (int i = 0; i < methodName.length() - 1; i++) {
					if (Character.isUpperCase(methodName.charAt(i))) {
						if (i == 0) {
							abr = abr + methodName.substring(i, Math.min(i + 3, methodName.length())).toLowerCase();
						} else {
							abr = abr + methodName.substring(i, Math.min(i + 3, methodName.length()));
						}
					}
				}
				Character.toLowerCase(methodName.charAt(0));
				objectName = objectName + methodName;
			} else {
				objectName = objectName + methodName.substring(0, Math.min(methodName.length(), 11));
			}
		}
		return objectName;
	}

	/**
	 * for given classMethods and returnMap create a list for "EVENTS" section of
	 * rules file.
	 */
	private List<String> createEventList(Map<String, List<Method>> classMethods, Map<Method, String> returnMap) {
		Iterator<Entry<String, List<Method>>> it = classMethods.entrySet().iterator();
		List<String> eventList = new ArrayList<String>();

		Map<String, String> objectMap = new HashMap<String, String>();
		String event = "";
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			String methodName = (String) pair.getKey();
			List<Method> methods = (List<Method>) pair.getValue();
			objectMap = createMethodParameterMap(methods);
			String abbr = genarateMethodAbbr(methodName);
			String group = "";

			// if there are more than one method which has same name
			// group them in rule file.
			if (methods.size() > 1) {
				if (methodName.substring(0, 3).equals("get")) {
					group = methodName.substring(3, methodName.length()) + "s := ";
				} else {
					group = methodName + "s := ";
					group = group.substring(0, 1).toUpperCase() + group.substring(1);
				}
				for (int i = 1; i <= methods.size(); i++) {
					group = group + (abbr + i + "| ");
				}
				group = group.substring(0, group.length() - 2) + ";\n";

			}
			int k = 1;
			for (Method m : methods) {
				String ret = "";
				// if method has a return value add it to the rule file accordingly.
				// e.g: bloSiz : blockSize = getBlockSize();
				if (returnMap.containsKey(m)) {
					String retvalue = returnMap.get(m);
					retvalue = retvalue.substring(retvalue.indexOf(" ") + 1, retvalue.length());
					ret = ret + retvalue + " = ";
				}

				// if there are more than one method with same name
				// use same abbreviation for all of them by appending the counter.
				if (methods.size() <= 1) {
					event = abbr;
					Parameter[] params = m.getParameters();
					if (params.length < 1) {
						event = event + " : " + ret + methodName + "();";
					} else {
						event = event + " : " + ret + methodName + "(";
						for (Parameter p : params) {
							String parameter = objectMap.get(p.toString()) + ", ";
							event = event + parameter;
						}
						event = event.substring(0, event.length() - 2) + ");";
					}
					eventList.add(event);
				} else {
					event = abbr + k;
					k = k + 1;
					Parameter[] params = m.getParameters();
					if (params.length < 1) {
						event = event + " : " + ret + methodName + "();";
					} else {
						event = event + " : " + ret + methodName + "(";
						for (Parameter p : params) {
							String parameter = objectMap.get(p.toString()) + ", ";
							event = event + parameter;
						}
					}
					event = event.substring(0, event.length() - 2) + ");";
					eventList.add(event);
				}
			}
			eventList.add(group);
			it.remove();
		}
		return eventList;
	}

	/**
	 * for given classConstructors create a list for "EVENTS" section of rules file.
	 * works same as createEventList method.
	 */
	private List<String> createConstructorList(Map<String, List<Constructor>> classConstructurs) {
		Iterator<Entry<String, List<Constructor>>> it = classConstructurs.entrySet().iterator();
		List<String> eventList = new ArrayList<String>();
		Map<String, String> objectMap = new HashMap<String, String>();
		String event = "";
		event = "";
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			String constName = (String) pair.getKey();
			List<Constructor> constructors = (List<Constructor>) pair.getValue();
			objectMap = createConstructorParameterMap(constructors);
			String abbr = genarateMethodAbbr(constName);
			String group = "";
			if (constructors.size() > 1) {
				group = abbr + "s := ";
				int i = 1;
				for (Constructor c : constructors) {
					group = group + (abbr + i + "| ");
					i = i + 1;
				}
				group = group.substring(0, group.length() - 2) + ";\n";

			}
			int k = 1;
			for (Constructor c : constructors) {
				if (constructors.size() <= 1) {
					event = abbr;
					Parameter[] params = c.getParameters();
					if (params.length < 1) {
						event = event + " : " + constName + "();";
					} else {
						event = event + " : " + constName + "(";
						for (Parameter p : params) {
							String parameter = objectMap.get(p.toString()) + ", ";
							event = event + parameter;
						}
						event = event.substring(0, event.length() - 2) + ");";
					}
					eventList.add(event);
				} else {
					event = abbr + k;
					k = k + 1;
					Parameter[] params = c.getParameters();
					if (params.length < 1) {
						event = event + " : " + constName + "();";
					} else {
						event = event + " : " + constName + "(";
						for (Parameter p : params) {
							String parameter = objectMap.get(p.toString()) + ", ";
							event = event + parameter;
						}
					}
					event = event.substring(0, event.length() - 2) + ");";
					eventList.add(event);
				}
			}
			eventList.add(group);
			it.remove();
		}
		return eventList;
	}

	/**
	 * for a given method name generates a unique abbreviation by checking if they
	 * are already added to abbrList
	 */
	private String genarateMethodAbbr(String methodName) {
		String abbr = "";
		Random r = new Random();
		// if methodName contains "get" remove it and use the left string as abbr.
		if (methodName.contains("get")) {
			abbr = abbr + Character.toLowerCase(methodName.charAt(3));
			if (!abbrList.contains(abbr)) {
				abbrList.add(abbr);
			} else {
				// if methodName contains upper cases, use the upper cases and the 3 chars after
				// them.
				abbr = "";
				for (int i = 0; i < methodName.length() - 1; i++) {
					if (Character.isUpperCase(methodName.charAt(i))) {
						abbr = abbr + methodName.substring(i, Math.min(i + 3, methodName.length()));
					}
				}
				abbr = Character.toLowerCase(abbr.charAt(0)) + abbr.substring(1);
				if (!abbrList.contains(abbr)) {
					abbrList.add(abbr);
				} else {
					// if no unique abbr found generate one by using chars of method name randomly.
					abbr = "";
					String randomalph = methodName.replaceAll("[AEIOUaeiou]", "");
					abbr = abbr + Character.toString(randomalph.charAt(r.nextInt(randomalph.length())));
					abbr = Character.toLowerCase(abbr.charAt(0)) + abbr.substring(1);
					abbrList.add(abbr);
				}
			}
		} else {
			// if first char of method did not used as an abbr before use it.
			abbr = Character.toString(methodName.charAt(0)).toLowerCase();
			if (!abbrList.contains(abbr)) {
				abbrList.add(abbr);
			} else {
				// if methodName contains upper cases, use the upper cases and the 3 chars after
				// them.
				boolean hasUppercase = !methodName.equals(methodName.toLowerCase());
				if (hasUppercase) {
					abbr = "";
					for (int i = 0; i < methodName.length() - 1; i++) {
						if (Character.isUpperCase(methodName.charAt(i))) {
							if (Character.isUpperCase(methodName.charAt(i + 1))) {
								abbr = abbr + methodName.substring(i, Math.min(i + 3, methodName.length()));
								break;
							} else {
								abbr = abbr + methodName.substring(i, Math.min(i + 3, methodName.length()));
							}
						}
					}
					abbr = Character.toLowerCase(abbr.charAt(0)) + abbr.substring(1);
					if (!abbrList.contains(abbr)) {
						abbrList.add(abbr);
					} else {
						// if no unique abbr found generate one by using chars of method name randomly.
						abbr = "";
						String randomalph = methodName.replaceAll("[AEIOUaeiou]", "");
						abbr = abbr + Character.toString(randomalph.charAt(r.nextInt(randomalph.length())));
						abbr = Character.toLowerCase(abbr.charAt(0)) + abbr.substring(1);
						abbrList.add(abbr);
					}
				}
			}
		}
		return abbr;
	}

	/**
	 * for given object Map which stores object types and the list of the objects of
	 * the that type. Returns an objectList which stores objectType + object Name as
	 * a string without checking if objectName is unique or not
	 */
	private List<String> createparamObj(Map<String, List<String>> objMap) {
		Iterator<Entry<String, List<String>>> it = objMap.entrySet().iterator();
		List<String> objectList = new ArrayList<String>();
		List<String> params = new ArrayList<String>();
		String objectType;
		String obj;
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			params = (List<String>) pair.getValue();
			objectType = (String) pair.getKey();
			for (String objectName : params) {
				obj = objectType + " " + objectName;
				objectList.add(obj);
			}
			it.remove();
		}
		return objectList;
	}

	/**
	 * for given method variances list which stores methods with same name, process
	 * method parameters and maps parameter types to a list of unique parameter
	 * names
	 */
	private Map<String, String> createMethodParameterMap(List<Method> methodvariances) {
		Map<String, String> methodParameterMap = new HashMap<String, String>();
		Set<String> paramSet = new HashSet<String>();
		for (Method m : methodvariances) {
			Parameter[] params = m.getParameters();
			for (Parameter p : params) {
				paramSet.add(p.toString());
			}
		}
		for (String p : paramSet) {
			String param = p.toString();
			// String[] objectVariables = param.split("\\s+");
			String objectType = param.substring(0, param.lastIndexOf(" "));
			String parameter = createObject(p);
			List<String> objectList = new ArrayList<String>();
			if (parameterMap.containsKey(objectType)) {
				objectList = parameterMap.get(objectType);
				int size = objectList.size() + 1;
				parameter = (parameter + size).toString();
				objectList.add(parameter);
				parameterMap.put(objectType, objectList);
			} else {
				int size = 1;
				parameter = (parameter + size).toString();
				objectList.add(parameter);
				parameterMap.put(objectType, objectList);
			}
			if (!methodParameterMap.containsKey(p)) {
				methodParameterMap.put(p, parameter);
			}
		}
		return methodParameterMap;
	}

	/**
	 * for given constructor variances list which stores constructors, process
	 * method parameters and maps parameter types to a list of unique parameter
	 * names
	 */
	private Map<String, String> createConstructorParameterMap(List<Constructor> constructorVariances) {
		Map<String, String> parameterMap = new HashMap<String, String>();
		Set<String> paramSet = new HashSet<String>();
		for (Constructor c : constructorVariances) {
			Parameter[] params = c.getParameters();
			for (Parameter p : params) {
				paramSet.add(p.toString());
			}
		}
		for (String p : paramSet) {
			String param = p.toString();
			// String[] objectVariables = param.split("\\s+");
			String objectType = param.substring(0, param.lastIndexOf(" "));
			String parameter = createObject(p);
			List<String> objectList = new ArrayList<String>();
			if (this.parameterMap.containsKey(objectType)) {
				objectList = this.parameterMap.get(objectType);
				int size = objectList.size() + 1;
				parameter = (parameter + size).toString();
				objectList.add(parameter);
				this.parameterMap.put(objectType, objectList);
			} else {
				int size = 1;
				parameter = (parameter + size).toString();
				objectList.add(parameter);
				this.parameterMap.put(objectType, objectList);
			}
			if (!parameterMap.containsKey(p)) {
				parameterMap.put(p, parameter);
			}
		}
		return parameterMap;
	}

	/**
	 * for a given parameter (string) p generates a string with objectType +
	 * objectName to be used in "OBJECTS" section of the rule file. e.g: given
	 * "java.lang.String" returns "java.lang.String string1"
	 */

	private String createObject(String p) {
		String objectType = p.substring(0, p.lastIndexOf(" "));
		String objectName;
		int index = objectType.lastIndexOf(".");
		if (index > 0) {
			objectName = objectType.substring(index + 1);
			if (objectName.length() <= 9) {
				objectName = objectName.toLowerCase();
			} else {
				boolean hasUppercase = !objectName.equals(objectName.toLowerCase());
				if (hasUppercase) {
					String abr = "";
					for (int i = 0; i < objectName.length() - 1; i++) {
						if (Character.isUpperCase(objectName.charAt(i))) {
							if (i == 0) {
								abr = abr + objectName.substring(i, Math.min(i + 3, objectName.length())).toLowerCase();
							} else {
								abr = abr + objectName.substring(i, Math.min(i + 3, objectName.length()));
							}
						}
					}
					objectName = abr;
				} else {
					objectName = objectName.substring(0, Math.min(objectName.length(), 11));
				}
			}
		} else {
			boolean hasUppercase = !objectType.equals(objectType.toLowerCase());
			if (!hasUppercase && objectType.matches("[a-zA-Z]+") && objectType.length() < 5) {
				objectName = objectType;
			} else {
				objectName = objectType.substring(0, 2)
						+ objectType.substring(2, objectType.length()).replaceAll("[AEIOUaeiou]", "");
			}
		}
		// if object type is an array append "Array" to objectName
		if (objectType.contains("[")) {
			objectName = objectName + "Array";
		} else if (objectType.contains("Map")) {
			objectName = objectName + "Map";
		} else if (objectType.contains("List")) {
			objectName = objectName + "List";
		} else if (objectType.contains("Set")) {
			objectName = objectName + "Set";
		}
		return objectName.replaceAll("[^a-zA-Z]", "");
	}
}