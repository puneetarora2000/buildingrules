/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTableColumn<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTableColumn extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcLabel","IfcText","IfcUnit","IfcReference"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Identifier is an OPTIONAL attribute**/
	protected IfcIdentifier Identifier;
	/** Name is an OPTIONAL attribute**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** Unit is an OPTIONAL attribute**/
	protected IfcUnit Unit;
	/** ReferencePath is an OPTIONAL attribute**/
	protected IfcReference ReferencePath;
	/**
	* The default constructor.
	**/
	public IfcTableColumn(){}

	/**
	* Constructs a new IfcTableColumn object using the given parameters.
	*
	* @param Identifier OPTIONAL parameter of type IfcIdentifier
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param Unit OPTIONAL parameter of type IfcUnit
	* @param ReferencePath OPTIONAL parameter of type IfcReference
	**/
	public IfcTableColumn(IfcIdentifier Identifier, IfcLabel Name, IfcText Description, IfcUnit Unit, IfcReference ReferencePath)
	{
		this.Identifier = Identifier;
		this.Name = Name;
		this.Description = Description;
		this.Unit = Unit;
		this.ReferencePath = ReferencePath;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTableColumn object using the given parameters.
	*
	* @param Identifier OPTIONAL parameter of type IfcIdentifier
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param Unit OPTIONAL parameter of type IfcUnit
	* @param ReferencePath OPTIONAL parameter of type IfcReference
	**/
	public void setParameters(IfcIdentifier Identifier, IfcLabel Name, IfcText Description, IfcUnit Unit, IfcReference ReferencePath)
	{
		this.Identifier = Identifier;
		this.Name = Name;
		this.Description = Description;
		this.Unit = Unit;
		this.ReferencePath = ReferencePath;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Identifier = (IfcIdentifier) parameters.get(0);
		this.Name = (IfcLabel) parameters.get(1);
		this.Description = (IfcText) parameters.get(2);
		this.Unit = (IfcUnit) parameters.get(3);
		this.ReferencePath = (IfcReference) parameters.get(4);
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
		return IfcTableColumn.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTABLECOLUMN(");
		if(getRedefinedDerivedAttributeTypes().contains("Identifier")) stepString = stepString.concat("*,");
		else{
		if(this.Identifier != null)		stepString = stepString.concat(((RootInterface)this.Identifier).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Unit")) stepString = stepString.concat("*,");
		else{
		if(this.Unit != null)		stepString = stepString.concat(((RootInterface)this.Unit).getStepParameter(IfcUnit.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ReferencePath")) stepString = stepString.concat("*);");
		else{
		if(this.ReferencePath != null)		stepString = stepString.concat(((RootInterface)this.ReferencePath).getStepParameter(IfcReference.class.isInterface())+");");
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
	* This method sets the Identifier attribute to the given value.
	*
	* @param Identifier DEMANDED value to set - may not be null
	**/
	public void setIdentifier(IfcIdentifier Identifier)
	{
		this.Identifier = Identifier;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Identifier attribute.
	*
	* @return the value of Identifier
	/**/
	public IfcIdentifier getIdentifier()
	{
		return this.Identifier;
	}

	/**
	* This method sets the Name attribute to the given value.
	*
	* @param Name DEMANDED value to set - may not be null
	**/
	public void setName(IfcLabel Name)
	{
		this.Name = Name;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Name attribute.
	*
	* @return the value of Name
	/**/
	public IfcLabel getName()
	{
		return this.Name;
	}

	/**
	* This method sets the Description attribute to the given value.
	*
	* @param Description DEMANDED value to set - may not be null
	**/
	public void setDescription(IfcText Description)
	{
		this.Description = Description;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Description attribute.
	*
	* @return the value of Description
	/**/
	public IfcText getDescription()
	{
		return this.Description;
	}

	/**
	* This method sets the Unit attribute to the given value.
	*
	* @param Unit DEMANDED value to set - may not be null
	**/
	public void setUnit(IfcUnit Unit)
	{
		this.Unit = Unit;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Unit attribute.
	*
	* @return the value of Unit
	/**/
	public IfcUnit getUnit()
	{
		return this.Unit;
	}

	/**
	* This method sets the ReferencePath attribute to the given value.
	*
	* @param ReferencePath DEMANDED value to set - may not be null
	**/
	public void setReferencePath(IfcReference ReferencePath)
	{
		this.ReferencePath = ReferencePath;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ReferencePath attribute.
	*
	* @return the value of ReferencePath
	/**/
	public IfcReference getReferencePath()
	{
		return this.ReferencePath;
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
	public Object clone()
	{
		IfcTableColumn ifcTableColumn = new IfcTableColumn();
		if(this.Identifier != null)
			ifcTableColumn.setIdentifier((IfcIdentifier)this.Identifier.clone());
		if(this.Name != null)
			ifcTableColumn.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcTableColumn.setDescription((IfcText)this.Description.clone());
		if(this.Unit != null)
			ifcTableColumn.setUnit((IfcUnit)this.Unit.clone());
		if(this.ReferencePath != null)
			ifcTableColumn.setReferencePath((IfcReference)this.ReferencePath.clone());
		return ifcTableColumn;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTableColumn ifcTableColumn = new IfcTableColumn();
		if(this.Identifier != null)
			ifcTableColumn.setIdentifier(this.Identifier);
		if(this.Name != null)
			ifcTableColumn.setName(this.Name);
		if(this.Description != null)
			ifcTableColumn.setDescription(this.Description);
		if(this.Unit != null)
			ifcTableColumn.setUnit(this.Unit);
		if(this.ReferencePath != null)
			ifcTableColumn.setReferencePath(this.ReferencePath);
		return ifcTableColumn;
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
