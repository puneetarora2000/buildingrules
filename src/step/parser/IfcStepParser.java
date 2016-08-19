/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.step.parser;



import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Vector;
import ifc4javatoolbox.step.parser.util.InstanceLineNrReference;
import ifc4javatoolbox.step.parser.util.NodeObject;
import ifc4javatoolbox.step.parser.util.ProgressEvent;
import ifc4javatoolbox.step.parser.util.StepParserProgressListener;
import ifc4javatoolbox.ifc4.BINARY;
import ifc4javatoolbox.ifc4.BOOLEAN;
import ifc4javatoolbox.ifc4.CloneableObject;
import ifc4javatoolbox.ifc4.DOUBLE;
import ifc4javatoolbox.ifc4.ENUM;
import ifc4javatoolbox.ifc4.File_Description;
import ifc4javatoolbox.ifc4.File_Name;
import ifc4javatoolbox.ifc4.File_Schema;
import ifc4javatoolbox.ifc4.INTEGER;
import ifc4javatoolbox.ifc4.InternalAccess;
import ifc4javatoolbox.ifc4.InternalAccessClass;
import ifc4javatoolbox.ifc4.LIST;
import ifc4javatoolbox.ifc4.LOGICAL;
import ifc4javatoolbox.ifc4.ObjectFactory;
import ifc4javatoolbox.ifc4.SET;
import ifc4javatoolbox.ifc4.STRING;
import ifc4javatoolbox.ifc4.TypeInterface;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcStepParser
{
	private static final String PACKAGE_NAME = "ifc4javatoolbox.ifc4.";

	//private static final long serialVersionUID = 1L;

	public static int errorCounter = 0;
	private Vector<StepParserProgressListener> listenerList = null;
	private static HashMap<Integer, InternalAccessClass> entityInstanceNameMap = null;
	private File_Schema file_Schema = null;
	private File_Description file_Description = null;
	private File_Name file_Name = null;

	/**
	 * Constructs a new IfcStepParser object using standard parameters.
	 */
	public IfcStepParser()
	{
	}

	/**
	 * Registers a new StepParserProgressListener object to the parser, to
	 * receive progress information see {@link StepParserProgressListener}.
	 * @param listener
	 *            the listener object
	 */
	public void addStepParserProgressListener(
			StepParserProgressListener listener)
	{
		if (listenerList == null) listenerList = new Vector<StepParserProgressListener>(1, 1);
		listenerList.add(listener);
	}

	private void fireProgressEvent(ProgressEvent event) {
		if (listenerList != null) {
			for (int i = 0; i < listenerList.size(); i++) {
				StepParserProgressListener listener = (StepParserProgressListener) listenerList
						.get(i);
				listener.progressActionPerformed(event);
			}
		}
	}

	/**
	 * Removes a StepParserProgressListener object.
	 * @param listener
	 *            the listener to remove
	 */
	public void removeStepParserProgressListener(
			StepParserProgressListener listener)
	{
		if (listenerList != null) listenerList.remove(listener);
		if (listenerList.size() == 0) listenerList = null;
	}

	/**
	 * Removes all StepParserProgressListners from this object.
	 */
	public void removeAllStepParserPogressListeners() {
		listenerList = null;
	}

	/**
	 * Cleans up the memory.
	 */
	public void destruct() {
		StepParserTokenManager.destruct();
		listenerList = null;
		entityInstanceNameMap = null;
		file_Description = null;
		file_Name = null;
		file_Schema = null;
	}
	

	/**
	 * This method returns the IFC file's header entity FILE_SCHEMA.
	 * @return the header entity FILE_SCHEMA
	 */
	public File_Schema getFile_Schema() {
		return file_Schema;
	}

	/**
	 * This method returns the IFC file's header entity FILE_DESCRIPTION.
	 * @return the header entity FILE_DESCRIPTION
	 */
	public File_Description getFile_Description() {
		return file_Description;
	}

	/**
	 * This method returns the IFC file's header entity FILE_NAME.
	 * @return the header entity FILE_NAME
	 */
	public File_Name getFile_Name() {
		return file_Name;
	}

	/**
	 * Reads an IFC Zip file.
	 * @param ifcZipFile
	 *            the IFC zip file to red
	 * @return an URLFileCache object
	 * @throws Exception
	 *             exception is thrown if the file could not be read.
	 */
	public URLFileCache readIfcZipFile(File ifcZipFile) throws Exception {
		initReadStepFile();
		URLFileCache urlFileCache = new URLFileCache();
		urlFileCache.loadZipFile(ifcZipFile);
		entityInstanceNameMap = StepParserTokenManager
				.startParsing(urlFileCache);
		finishReadStepFile();
		return urlFileCache;
	}

	/**
	 * Reads an IFC STEP file from the given URLFileCache object.
	 * @param urlFileCache
	 *            the URLFileCache object to red from.
	 * @throws Exception
	 *             exception is thrown if the file could not be read.
	 */
	public void readStepFile(URLFileCache urlFileCache) throws Exception {
		initReadStepFile();
		entityInstanceNameMap = StepParserTokenManager
				.startParsing(urlFileCache);
		finishReadStepFile();
	}

	/**
	 * Reads an IFC STEP file from the given URL.
	 * @param url
	 *            URL to read the IFC STEP file from.
	 * @return an URLFileCache object
	 * @throws Exception
	 *             exception is thrown if the file could not be read.
	 */
	public URLFileCache readStepFile(URL url) throws Exception {
		initReadStepFile();
		URLFileCache urlFileCache = new URLFileCache();
		urlFileCache.loadFile(url);
		entityInstanceNameMap = StepParserTokenManager
				.startParsing(urlFileCache);
		finishReadStepFile();
		return urlFileCache;
	}

	/**
	 * Reads an IFC STEP file presented by the file object.
	 * @param file
	 *            the File object that represents the path to the IFC STEP file.
	 * @throws Exception
	 *             exception is thrown if the file could not be read.
	 */
	public void readStepFile(File file) throws Exception {
		initReadStepFile();
		entityInstanceNameMap = StepParserTokenManager.startParsing(file);
		finishReadStepFile();
	}

	private void initReadStepFile() {
		StepParserTokenManager
				.addStepParserProgressListener(new StepParserProgressListener()
				{
					@Override
					public void progressActionPerformed(ProgressEvent event) {
						fireProgressEvent(event);
					}
				});
	}

	private void finishReadStepFile() {
		//HEADER
		initNode(file_Description = StepParserTokenManager.getFile_Description());
		initNode(file_Name = StepParserTokenManager.getFile_Name());
		initNode(file_Schema = StepParserTokenManager.getFile_Schema());
		
		StepParserTokenManager.destruct();
		System.runFinalization();

		fireProgressEvent(new ProgressEvent(0, "initialize objects..."));
		int counter = 0;
		int progress = 0;
		int progressStep = entityInstanceNameMap.size() / 100;
		for (InternalAccessClass node : entityInstanceNameMap.values()) {
			initNode(node);
			InternalAccess.setStepParameter(node, null);
			counter++;
			if (counter >= progressStep) {
				fireProgressEvent(new ProgressEvent(++progress,
						"initialize objects..."));
				counter = 0;
			}
		}
		fireProgressEvent(new ProgressEvent(0, " "));
		System.runFinalization();
		System.gc();
	}

	private static Object resolveCollections(NodeObject nodeObject, String type)
	{
		type = type.toUpperCase();
		ArrayList<CloneableObject> parameters = nodeObject.getParameter();
		for (int i = 0; i < parameters.size(); i++) {
			CloneableObject object = parameters.get(i);
			if (object instanceof InstanceLineNrReference) {
				parameters.set(i, entityInstanceNameMap
						.get(((InstanceLineNrReference) object).getLineNr()));
			} else if (object instanceof DOUBLE) {
				DOUBLE doubleObject = (DOUBLE) object;
				try {
					DOUBLE integerParameter = (DOUBLE) ObjectFactory.createInstance(type);
					integerParameter.setValue(doubleObject.value);
					parameters.set(i, integerParameter);
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			} else if (object instanceof STRING) {
				STRING stringObject = (STRING) object;
				try {
					STRING stringParameter = (STRING) ObjectFactory.createInstance(type);
					stringParameter.setValue(stringObject);
					parameters.set(i, stringParameter);
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			} else if (object instanceof LIST) {
				@SuppressWarnings("unchecked")
				LIST<CloneableObject> listObject = (LIST<CloneableObject>) object;
				try {
					String className = listObject.getClass().getCanonicalName();
					String nextType = className.substring(
							className.indexOf("<"), className.lastIndexOf(">"));
					resolveCollections(nodeObject, nextType);
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			} else if (object instanceof INTEGER) {
				INTEGER integerObject = (INTEGER) object;
				try {
					INTEGER integerParameter = (INTEGER) ObjectFactory.createInstance(type);
					integerParameter.setValue(integerObject.value);
					parameters.set(i, integerParameter);
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			}else if (object instanceof ENUM) {
				ENUM enumObject = (ENUM) object;
				try {
					CloneableObject enumParameter = (ENUM) ObjectFactory.createInstance(type);
					((ENUM) enumParameter).setValue(enumObject.stringValue);
					parameters.set(i, enumParameter);
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			}  else if (object instanceof BINARY) {
				BINARY byteObject = (BINARY) object;
				try {
					BINARY byteParameter = (BINARY) ObjectFactory.createInstance(type);
					byteParameter.setValue(byteObject.value);
					parameters.set(i, byteParameter);
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			}   else if (object instanceof NodeObject) {
				NodeObject inlineObject = (NodeObject) object;
				try {
					String className = inlineObject.getClassName();
					CloneableObject inlineParameter = (CloneableObject) ObjectFactory.createInstance(className);

					if (inlineParameter instanceof InternalAccessClass) {
						resolveCollections(inlineObject, className);
						InternalAccess.initialize((InternalAccessClass) inlineParameter, inlineObject.getParameter());
						parameters.set(i, inlineParameter);
					} else {
						resolveCollections(inlineObject, className);
						((TypeInterface) inlineParameter).setValue(inlineObject
								.getParameter().get(0));
						parameters.set(i, inlineParameter);
					}
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			} else if (object instanceof LOGICAL) {
				LOGICAL logicalObject = (LOGICAL) object;
				try {
					Object classObject = ObjectFactory.createInstance(type);
					if (BOOLEAN.class.isAssignableFrom(classObject.getClass()))
					{
						BOOLEAN booleanParameter = (BOOLEAN) classObject;
						booleanParameter.setValue(logicalObject.value);
						parameters.set(i, booleanParameter);
					} else {
						LOGICAL logicalParameter = (LOGICAL) classObject;
						logicalParameter.setValue(logicalObject.value);
						parameters.set(i, logicalParameter);
					}
				}
				catch (Exception e) {
					errorCounter++;
					e.printStackTrace();
				}
			}

		}
		return nodeObject;
	}

	private static Object initNode(InternalAccessClass ClassInterfaceObject) 
	{
		ArrayList<CloneableObject> parameters = InternalAccess.getStepParameter(ClassInterfaceObject);
		for (int i = 0; i < parameters.size(); i++) {
			Object object = parameters.get(i);
			if (object instanceof InstanceLineNrReference) {
				parameters.set(i, entityInstanceNameMap
						.get(((InstanceLineNrReference) object).getLineNr()));
			} else if (object instanceof DOUBLE) {
				DOUBLE doubleObject = (DOUBLE) object;
				String[] parameterList = null;
				try {
					parameterList = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject);
					DOUBLE doubleParameter = (DOUBLE) ObjectFactory.createInstance(parameterList[i].toUpperCase());
					doubleParameter.setValue(doubleObject.value);
					parameters.set(i, doubleParameter);
				}
				catch (Exception e) {
					errorCounter++;
					System.out.println("Behandle DOUBLE");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("ParameterListe: " + parameterList);
					System.out.println("Index: " + i);
				}
			} else if (object instanceof STRING) {
				STRING stringObject = (STRING) object;
				String[] parameterList = null;
				try {
					parameterList = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject);
					STRING stringParameter = (STRING) ObjectFactory.createInstance(parameterList[i].toUpperCase());
					stringParameter.setValue(stringObject);
					parameters.set(i, stringParameter);
				}
				catch (Exception e) {
					errorCounter++;
					System.out.println("Behandle STRING");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("ParameterListe: " + parameterList);
					System.out.println("Index: " + i);
				}
			} else if (object instanceof LIST) {
				@SuppressWarnings("unchecked")
				LIST<CloneableObject> listObject = (LIST<CloneableObject>) object;
				try {
					String[] parameterList = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject);
					String className = parameterList[i];

					if ((className.contains("SET") || className
							.contains("LIST")))
					{
						String nextType = className.substring(
								className.indexOf("<") + 1,
								className.lastIndexOf(">"));
						NodeObject dummyObject = new NodeObject();
						dummyObject.setParameter(listObject);
						dummyObject.setClassName(nextType);
						resolveCollections(dummyObject, nextType);
						if (parameterList[i].contains("SET")) {
							parameters.set(i, new SET<CloneableObject>(
									dummyObject.getParameter()));
						} else
							parameters.set(i, new LIST<CloneableObject>(
									dummyObject.getParameter()));
					} else {
						Class<?> parameterClass = Class.forName(PACKAGE_NAME
								+ className);
						String superClassName = parameterClass
								.getGenericSuperclass().toString();
						superClassName = superClassName.replace(PACKAGE_NAME,
								"");
						String nextType = superClassName.substring(
								superClassName.indexOf("<") + 1,
								superClassName.lastIndexOf(">"));
						NodeObject dummyObject = new NodeObject();
						dummyObject.setParameter(listObject);
						dummyObject.setClassName(nextType);
						resolveCollections(dummyObject, nextType);
						TypeInterface TypeInterface = (TypeInterface) ObjectFactory.createInstance(className.toUpperCase());
						TypeInterface.setValue(dummyObject.getParameter());
						parameters.set(i, TypeInterface);
					}
				}
				catch (Exception e) {
					errorCounter++;
					System.out.println("Behandle LIST");
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Index= " + i);
					System.out.println("Instanziiere: "
							+ ClassInterfaceObject.getClass().getName());
				}
			} else if (object instanceof ENUM) {
				ENUM enumObject = (ENUM) object;
				String[] parameterList = null;
				try {
					parameterList = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject);
					CloneableObject enumParameter = (ENUM) ObjectFactory.createInstance(parameterList[i].toUpperCase());
					((ENUM) enumParameter).setValue(enumObject.stringValue);
					parameters.set(i, enumParameter);
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("\nTo many parameter for initializing");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("Index: " + i);
					System.out.println("Parameter at index " + i
							+ " has been ignored!\n");
					parameters.remove(i);
				}
				catch (Exception e) {
					errorCounter++;
					System.out.println("Behandle ENUM");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("ParameterListe: " + parameterList);
					System.out.println("Index: " + i);

					e.printStackTrace();
				}
			} else if (object instanceof INTEGER) {
				INTEGER integerObject = (INTEGER) object;
				String[] parameterList = null;
				try {
					parameterList = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject);
					INTEGER integerParameter = (INTEGER) ObjectFactory.createInstance(parameterList[i].toUpperCase());
					integerParameter.setValue(integerObject.value);
					parameters.set(i, integerParameter);
				}
				catch (Exception e) {
					e.printStackTrace();
					errorCounter++;
					System.out.println("Behandle INTEGER");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("ParameterListe: " + parameterList);
					System.out.println("Index: " + i);
				}
			} else if (object instanceof BINARY) {
				BINARY byteObject = (BINARY) object;
				String[] parameterList = null;
				try {
					parameterList = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject);
					BINARY byteParameter = (BINARY) ObjectFactory.createInstance(parameterList[i].toUpperCase());
					byteParameter.setValue(byteObject.value);
					parameters.set(i, byteParameter);
				}
				catch (Exception e) {
					errorCounter++;
					System.out.println("Behandle BINARY");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("ParameterListe: " + parameterList);
					System.out.println("Index: " + i);
				}
			} else if (object instanceof NodeObject) {
				NodeObject inlineObject = (NodeObject) object;
				try {
					String className = inlineObject.getClassName();
					CloneableObject inlineParameter = (CloneableObject) ObjectFactory.createInstance(className);

					if (inlineParameter instanceof InternalAccessClass) {
						resolveCollections(inlineObject, className);
						InternalAccess.initialize((InternalAccessClass) inlineParameter, inlineObject.getParameter());
						parameters.set(i, inlineParameter);
					} else {
						resolveCollections(inlineObject, className);
						((TypeInterface) inlineParameter).setValue(inlineObject
								.getParameter().get(0));
						parameters.set(i, inlineParameter);
					}
				}
				catch (Exception e) {
					errorCounter++;
					System.out.println("Behandle INLINE");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("Index: " + i);
				}
			} else if (object instanceof LOGICAL) {
				LOGICAL logicalObject = (LOGICAL) object;
				try {
					String[] parameterList = InternalAccess.getNonInverseAttributeTypes(ClassInterfaceObject);
					Class<?> classObject = Class.forName(PACKAGE_NAME
							+ parameterList[i]);
					if (BOOLEAN.class.isAssignableFrom(classObject)) {
						BOOLEAN booleanParameter = (BOOLEAN) classObject
								.newInstance();
						booleanParameter.setValue(logicalObject.value);
						parameters.set(i, booleanParameter);
					} else {
						LOGICAL logicalParameter = (LOGICAL) classObject
								.newInstance();
						logicalParameter.setValue(logicalObject.value);
						parameters.set(i, logicalParameter);
					}
				}
				catch (Exception e) {
					errorCounter++;
					System.out.println("Behandle LOGICAL");
					System.out.println("Klasse: "
							+ ClassInterfaceObject.getClass().getName());
					System.out.println("STEP LINE NR "
							+ ClassInterfaceObject.getStepLineNumber());
					System.out.println("Parameter: " + parameters);
					System.out.println("Index: " + i);
				}
			}
		}
		try {
			InternalAccess.initialize(ClassInterfaceObject, parameters);
			InternalAccess.setStepParameter(ClassInterfaceObject, null);
		}
		catch (Exception e) {
			System.out.println("## Versuche init von "
					+ entityInstanceNameMap.get("#"
							+ ClassInterfaceObject.getStepLineNumber()) + " mit ");
			System.out.println("## " + parameters);
			System.out.println("STEP NR: " + "#"
					+ ClassInterfaceObject.getStepLineNumber());
			errorCounter++;
			e.printStackTrace();
		}

		return ClassInterfaceObject;

	}

	/**
	 * This method returns all IFC objects that were parsed.
	 * @return the IFC obejcts
	 */
	public Collection<InternalAccessClass> getIfcObjects() {
		return entityInstanceNameMap.values();
	}

	/**
	 * This Method returns a sorted list of all parsed IFC objects. The IFC
	 * objects are sorted by their STEP entity instance names.
	 * @return sorted list of IFC objects
	 */
	public ArrayList<InternalAccessClass> getIfcObjectsSorted() {
		TreeSet<Integer> sortedLineNumbers = new TreeSet<Integer>(
				entityInstanceNameMap.keySet());
		ArrayList<InternalAccessClass> ifcObjectsSorted = new ArrayList<InternalAccessClass>();
		for (Integer number : sortedLineNumbers) {
			ifcObjectsSorted.add(entityInstanceNameMap.get(number));
		}
		return ifcObjectsSorted;
	}

	/**
	 * This method returns a HashMap object that has the entity instance name as
	 * key and its corresponding IFC object as value.
	 * @return the entity instance name, IFC object mapping
	 */
	public HashMap<Integer, InternalAccessClass> getEntityInstanceNameMap() {
		return entityInstanceNameMap;
	}
}