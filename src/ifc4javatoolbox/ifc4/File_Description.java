/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity File_Description<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class File_Description extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<STRING>","STRING"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** description is an DEMANDED attribute - may not be null**/
	protected LIST<STRING> description;
	/** implementationLevel is an DEMANDED attribute - may not be null**/
	protected STRING implementationLevel;
	/**
	* The default constructor.
	**/
	public File_Description(){}

	/**
	* Constructs a new File_Description object using the given parameters.
	*
	* @param description DEMANDED parameter of type LIST<STRING> - may not be null.
	* @param implementationLevel DEMANDED parameter of type STRING - may not be null.
	**/
	public File_Description(LIST<STRING> description, STRING implementationLevel)
	{
		this.description = description;
		this.implementationLevel = implementationLevel;
		resolveInverses();
	}

	/**
	 * This method initializes the File_Description object using the given parameters.
	*
	* @param description DEMANDED parameter of type LIST<STRING> - may not be null.
	* @param implementationLevel DEMANDED parameter of type STRING - may not be null.
	**/
	public void setParameters(LIST<STRING> description, STRING implementationLevel)
	{
		this.description = description;
		this.implementationLevel = implementationLevel;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.description = (LIST<STRING>) parameters.get(0);
		this.implementationLevel = (STRING) parameters.get(1);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return File_Description.nonInverseAttributes;	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	private java.util.HashSet<String> getRedefinedDerivedAttributeTypes()
	{
		java.util.HashSet<String> redefinedDerivedAttributes = new java.util.HashSet<String>();
		return redefinedDerivedAttributes;	}

	/**
 * This method returns the object IFC  STEP representation. This method is called by the IfcModel object to write IFC STEP files.
	 *
	 * @return the IFC STEP representation of this object
	**/
	public String getStepLine()
	{
		String stepString = new String("#"+this.stepLineNumber+"= ");
		stepString = stepString.concat("FILE_DESCRIPTION(");
		if(getRedefinedDerivedAttributeTypes().contains("description")) stepString = stepString.concat("*,");
		else{
		if(this.description != null)		stepString = stepString.concat(((RootInterface)this.description).getStepParameter(STRING.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("implementationLevel")) stepString = stepString.concat("*);");
		else{
		if(this.implementationLevel != null)		stepString = stepString.concat(((RootInterface)this.implementationLevel).getStepParameter(STRING.class.isInterface())+");");
		else		stepString = stepString.concat("$);");
		}
		return stepString;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		return "#" + this.stepLineNumber;
	}

	/**
	 * This method returns the line number within a IFC  STEP representation. This method is called from other objects, where this one is referenced.
	 *
	 * @return the STEP line number
	**/
	public int getStepLineNumber()
	{
		return this.stepLineNumber;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepLineNumber(int number)
	{
		this.stepLineNumber = number;
	}

	/**
	* This method sets the description attribute to the given value.
	*
	* @param description OPTIONAL value to set
	**/
	public void setdescription(LIST<STRING> description)
	{
		this.description = description;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the description attribute.
	*
	* @return a copy of the description list
	**/
	public LIST<STRING> getdescription()
	{
		if(this.description != null)
			return new LIST<STRING>(this.description);
		return null;
	}

	/**
	* This method adds an STRING object to the description list.
	* @param description element to be appended to this list.
	**/
	public void adddescription(STRING description)
	{
		if(this.description == null)
			this.description = new LIST<STRING>();
		this.description.add(description);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of STRING objects to the description list.
	* @param description collection containing elements to be added to this list.
	**/
	public void addAlldescription(java.util.Collection<STRING> description)
	{
		if(this.description == null)
			this.description = new LIST<STRING>();
		this.description.addAll(description);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the description list.
	**/
	public void cleardescription()
	{
		if(this.description != null)
		{
			this.description.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an STRING object from the description list.
	* @param description element to be removed from this list.
	**/
	public void removedescription(STRING description)
	{
		if(this.description != null)
		{
			this.description.remove(description);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of STRING objects from the description list.
	* @param description collection containing elements to be removed from this list.
	**/
	public void removeAlldescription(java.util.Collection<STRING> description)
	{
		if(this.description != null)
		{
			this.description.removeAll(description);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the implementationLevel attribute to the given value.
	*
	* @param implementationLevel OPTIONAL value to set
	**/
	public void setimplementationLevel(STRING implementationLevel)
	{
		this.implementationLevel = implementationLevel;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the implementationLevel attribute.
	*
	* @return the value of implementationLevel
	/**/
	public STRING getimplementationLevel()
	{
		return this.implementationLevel;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepParameter(java.util.ArrayList<CloneableObject> parameter)
	{
		this.stepParameter = parameter;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	java.util.ArrayList<CloneableObject> getStepParameter()
	{
		return this.stepParameter;
	}

	/**
	 * This method registers an ObjectChangeListener to this object. An event is fired whenever one of its values was changed.
	 * 
	 *@param listener the listener to register
	**/
	public void addObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	listenerList = new java.util.HashSet<ObjectChangeListener>(1,1);
		listenerList.add(listener);
	}

	/**
	 * This method unregisters an ObjectChangeListener from this object.
	 * 
	 *@param listener the listener to unregister
	**/
	public void removeObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	return;
		listenerList.remove(listener);
		if (listenerList.size()==0) listenerList = null;
	}

	/**
	 * This method removes all currently registered ObjectChangeListeners from this object.
	**/
	public void removeAllObjectChangeListeners()
	{
		listenerList = null;
	}

	protected void fireChangeEvent()
	{
		if(listenerList == null) return;
		for(ObjectChangeListener listener : listenerList)
			listener.ifcModelObjectChange(this);
	}

	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	@SuppressWarnings("unchecked")
	public Object clone()
	{
		File_Description file_Description = new File_Description();
		if(this.description != null)
			file_Description.setdescription((LIST<STRING>)this.description.clone());
		if(this.implementationLevel != null)
			file_Description.setimplementationLevel((STRING)this.implementationLevel.clone());
		return file_Description;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		File_Description file_Description = new File_Description();
		if(this.description != null)
			file_Description.setdescription(this.description);
		if(this.implementationLevel != null)
			file_Description.setimplementationLevel(this.implementationLevel);
		return file_Description;
	}

	/**
	* This method returns the objects standard description.
	*
	* @return the standard description
	**/
	public String toString()
	{
		return "#"+ this.getStepLineNumber() + " " + this.getClass().getSimpleName();
	}


}
