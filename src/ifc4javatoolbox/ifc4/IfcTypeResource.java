/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTypeResource<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcTypeResource extends IfcTypeObject implements ClassInterface, IfcResourceSelect
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcIdentifier","SET<IfcPropertySetDefinition>","IfcIdentifier","IfcText","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Identification is an OPTIONAL attribute**/
	protected IfcIdentifier Identification;
	/** LongDescription is an OPTIONAL attribute**/
	protected IfcText LongDescription;
	/** ResourceType is an OPTIONAL attribute**/
	protected IfcLabel ResourceType;
	protected SET<IfcRelAssignsToResource> ResourceOf_Inverse;
	/**
	* The default constructor.
	**/
	public IfcTypeResource(){}

	/**
	* Constructs a new IfcTypeResource object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableOccurrence OPTIONAL parameter of type IfcIdentifier
	* @param HasPropertySets OPTIONAL parameter of type SET<IfcPropertySetDefinition>
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param LongDescription OPTIONAL parameter of type IfcText
	* @param ResourceType OPTIONAL parameter of type IfcLabel
	**/
	public IfcTypeResource(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcIdentifier ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, IfcIdentifier Identification, IfcText LongDescription, IfcLabel ResourceType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableOccurrence = ApplicableOccurrence;
		this.HasPropertySets = HasPropertySets;
		this.Identification = Identification;
		this.LongDescription = LongDescription;
		this.ResourceType = ResourceType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTypeResource object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableOccurrence OPTIONAL parameter of type IfcIdentifier
	* @param HasPropertySets OPTIONAL parameter of type SET<IfcPropertySetDefinition>
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param LongDescription OPTIONAL parameter of type IfcText
	* @param ResourceType OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcIdentifier ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, IfcIdentifier Identification, IfcText LongDescription, IfcLabel ResourceType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableOccurrence = ApplicableOccurrence;
		this.HasPropertySets = HasPropertySets;
		this.Identification = Identification;
		this.LongDescription = LongDescription;
		this.ResourceType = ResourceType;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.ApplicableOccurrence = (IfcIdentifier) parameters.get(4);
		this.HasPropertySets = (SET<IfcPropertySetDefinition>) parameters.get(5);
		this.Identification = (IfcIdentifier) parameters.get(6);
		this.LongDescription = (IfcText) parameters.get(7);
		this.ResourceType = (IfcLabel) parameters.get(8);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		ResourceOf_Inverse = null;
	}

	private void resolveInverses()
	{
		if(HasPropertySets != null)
		{
			for(IfcPropertySetDefinition HasPropertySets$ : HasPropertySets)
			{
				if(HasPropertySets$.DefinesType_Inverse == null)
				{
					HasPropertySets$.DefinesType_Inverse = new SET<IfcTypeObject>();
				}
				HasPropertySets$.DefinesType_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcTypeResource.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTYPERESOURCE(");
		if(getRedefinedDerivedAttributeTypes().contains("GlobalId")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalId != null)		stepString = stepString.concat(((RootInterface)this.GlobalId).getStepParameter(IfcGloballyUniqueId.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OwnerHistory")) stepString = stepString.concat("*,");
		else{
		if(this.OwnerHistory != null)		stepString = stepString.concat(((RootInterface)this.OwnerHistory).getStepParameter(IfcOwnerHistory.class.isInterface())+",");
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
		if(getRedefinedDerivedAttributeTypes().contains("ApplicableOccurrence")) stepString = stepString.concat("*,");
		else{
		if(this.ApplicableOccurrence != null)		stepString = stepString.concat(((RootInterface)this.ApplicableOccurrence).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("HasPropertySets")) stepString = stepString.concat("*,");
		else{
		if(this.HasPropertySets != null)		stepString = stepString.concat(((RootInterface)this.HasPropertySets).getStepParameter(IfcPropertySetDefinition.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Identification")) stepString = stepString.concat("*,");
		else{
		if(this.Identification != null)		stepString = stepString.concat(((RootInterface)this.Identification).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LongDescription")) stepString = stepString.concat("*,");
		else{
		if(this.LongDescription != null)		stepString = stepString.concat(((RootInterface)this.LongDescription).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ResourceType")) stepString = stepString.concat("*);");
		else{
		if(this.ResourceType != null)		stepString = stepString.concat(((RootInterface)this.ResourceType).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method returns a copy of the set of the ResourceOf_Inverse attribute.
	*
	* @return a copy of the ResourceOf_Inverse set
	**/
	public SET<IfcRelAssignsToResource> getResourceOf_Inverse()
	{
		if(this.ResourceOf_Inverse != null)
			return new SET<IfcRelAssignsToResource>(this.ResourceOf_Inverse);
		return null;
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
	* This method sets the LongDescription attribute to the given value.
	*
	* @param LongDescription DEMANDED value to set - may not be null
	**/
	public void setLongDescription(IfcText LongDescription)
	{
		this.LongDescription = LongDescription;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LongDescription attribute.
	*
	* @return the value of LongDescription
	/**/
	public IfcText getLongDescription()
	{
		return this.LongDescription;
	}

	/**
	* This method sets the ResourceType attribute to the given value.
	*
	* @param ResourceType DEMANDED value to set - may not be null
	**/
	public void setResourceType(IfcLabel ResourceType)
	{
		this.ResourceType = ResourceType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ResourceType attribute.
	*
	* @return the value of ResourceType
	/**/
	public IfcLabel getResourceType()
	{
		return this.ResourceType;
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