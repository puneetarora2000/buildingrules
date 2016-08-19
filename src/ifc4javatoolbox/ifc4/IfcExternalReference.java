/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcExternalReference<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcExternalReference extends InternalAccessClass implements IfcObjectReferenceSelect, IfcResourceObjectSelect, ClassInterface, IfcLightDistributionDataSourceSelect
{
	private static final String[] nonInverseAttributes = new String[]{"IfcURIReference","IfcIdentifier","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Location is an OPTIONAL attribute**/
	protected IfcURIReference Location;
	/** Identification is an OPTIONAL attribute**/
	protected IfcIdentifier Identification;
	/** Name is an OPTIONAL attribute**/
	protected IfcLabel Name;
	protected SET<IfcExternalReferenceRelationship> ExternalReferenceForResources_Inverse;
	/**
	* The default constructor.
	**/
	public IfcExternalReference(){}

	/**
	* Constructs a new IfcExternalReference object using the given parameters.
	*
	* @param Location OPTIONAL parameter of type IfcURIReference
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param Name OPTIONAL parameter of type IfcLabel
	**/
	public IfcExternalReference(IfcURIReference Location, IfcIdentifier Identification, IfcLabel Name)
	{
		this.Location = Location;
		this.Identification = Identification;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcExternalReference object using the given parameters.
	*
	* @param Location OPTIONAL parameter of type IfcURIReference
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param Name OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcURIReference Location, IfcIdentifier Identification, IfcLabel Name)
	{
		this.Location = Location;
		this.Identification = Identification;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Location = (IfcURIReference) parameters.get(0);
		this.Identification = (IfcIdentifier) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		ExternalReferenceForResources_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcExternalReference.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCEXTERNALREFERENCE(");
		if(getRedefinedDerivedAttributeTypes().contains("Location")) stepString = stepString.concat("*,");
		else{
		if(this.Location != null)		stepString = stepString.concat(((RootInterface)this.Location).getStepParameter(IfcURIReference.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Identification")) stepString = stepString.concat("*,");
		else{
		if(this.Identification != null)		stepString = stepString.concat(((RootInterface)this.Identification).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*);");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method returns a copy of the set of the ExternalReferenceForResources_Inverse attribute.
	*
	* @return a copy of the ExternalReferenceForResources_Inverse set
	**/
	public SET<IfcExternalReferenceRelationship> getExternalReferenceForResources_Inverse()
	{
		if(this.ExternalReferenceForResources_Inverse != null)
			return new SET<IfcExternalReferenceRelationship>(this.ExternalReferenceForResources_Inverse);
		return null;
	}

	/**
	* This method sets the Location attribute to the given value.
	*
	* @param Location DEMANDED value to set - may not be null
	**/
	public void setLocation(IfcURIReference Location)
	{
		this.Location = Location;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Location attribute.
	*
	* @return the value of Location
	/**/
	public IfcURIReference getLocation()
	{
		return this.Location;
	}

	/**
	* This method sets the Identification attribute to the given value.
	*
	* @param Identification DEMANDED value to set - may not be null
	**/
	public void setIdentification(IfcIdentifier Identification)
	{
		this.Identification = Identification;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Identification attribute.
	*
	* @return the value of Identification
	/**/
	public IfcIdentifier getIdentification()
	{
		return this.Identification;
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
	public abstract Object clone();

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public abstract Object shallowCopy();

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