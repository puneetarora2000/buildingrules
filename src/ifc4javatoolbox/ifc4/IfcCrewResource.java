/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcCrewResource<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCrewResource extends IfcConstructionResource implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcIdentifier","IfcText","IfcResourceTime","LIST<IfcAppliedValue>","IfcPhysicalQuantity","IfcCrewResourceTypeEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** PredefinedType is an OPTIONAL attribute**/
	protected IfcCrewResourceTypeEnum PredefinedType;
	/**
	* The default constructor.
	**/
	public IfcCrewResource(){}

	/**
	* Constructs a new IfcCrewResource object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param LongDescription OPTIONAL parameter of type IfcText
	* @param Usage OPTIONAL parameter of type IfcResourceTime
	* @param BaseCosts OPTIONAL parameter of type LIST<IfcAppliedValue>
	* @param BaseQuantity OPTIONAL parameter of type IfcPhysicalQuantity
	* @param PredefinedType OPTIONAL parameter of type IfcCrewResourceTypeEnum
	**/
	public IfcCrewResource(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcText LongDescription, IfcResourceTime Usage, LIST<IfcAppliedValue> BaseCosts, IfcPhysicalQuantity BaseQuantity, IfcCrewResourceTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.LongDescription = LongDescription;
		this.Usage = Usage;
		this.BaseCosts = BaseCosts;
		this.BaseQuantity = BaseQuantity;
		this.PredefinedType = PredefinedType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCrewResource object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param LongDescription OPTIONAL parameter of type IfcText
	* @param Usage OPTIONAL parameter of type IfcResourceTime
	* @param BaseCosts OPTIONAL parameter of type LIST<IfcAppliedValue>
	* @param BaseQuantity OPTIONAL parameter of type IfcPhysicalQuantity
	* @param PredefinedType OPTIONAL parameter of type IfcCrewResourceTypeEnum
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcText LongDescription, IfcResourceTime Usage, LIST<IfcAppliedValue> BaseCosts, IfcPhysicalQuantity BaseQuantity, IfcCrewResourceTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.LongDescription = LongDescription;
		this.Usage = Usage;
		this.BaseCosts = BaseCosts;
		this.BaseQuantity = BaseQuantity;
		this.PredefinedType = PredefinedType;
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
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.Identification = (IfcIdentifier) parameters.get(5);
		this.LongDescription = (IfcText) parameters.get(6);
		this.Usage = (IfcResourceTime) parameters.get(7);
		this.BaseCosts = (LIST<IfcAppliedValue>) parameters.get(8);
		this.BaseQuantity = (IfcPhysicalQuantity) parameters.get(9);
		this.PredefinedType = (IfcCrewResourceTypeEnum) parameters.get(10);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
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
		return IfcCrewResource.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCREWRESOURCE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ObjectType")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectType != null)		stepString = stepString.concat(((RootInterface)this.ObjectType).getStepParameter(IfcLabel.class.isInterface())+",");
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
		if(getRedefinedDerivedAttributeTypes().contains("Usage")) stepString = stepString.concat("*,");
		else{
		if(this.Usage != null)		stepString = stepString.concat(((RootInterface)this.Usage).getStepParameter(IfcResourceTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BaseCosts")) stepString = stepString.concat("*,");
		else{
		if(this.BaseCosts != null)		stepString = stepString.concat(((RootInterface)this.BaseCosts).getStepParameter(IfcAppliedValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BaseQuantity")) stepString = stepString.concat("*,");
		else{
		if(this.BaseQuantity != null)		stepString = stepString.concat(((RootInterface)this.BaseQuantity).getStepParameter(IfcPhysicalQuantity.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*);");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcCrewResourceTypeEnum.class.isInterface())+");");
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
	* This method sets the PredefinedType attribute to the given value.
	*
	* @param PredefinedType DEMANDED value to set - may not be null
	**/
	public void setPredefinedType(IfcCrewResourceTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcCrewResourceTypeEnum getPredefinedType()
	{
		return this.PredefinedType;
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
		IfcCrewResource ifcCrewResource = new IfcCrewResource();
		if(this.GlobalId != null)
			ifcCrewResource.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcCrewResource.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcCrewResource.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcCrewResource.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcCrewResource.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.Identification != null)
			ifcCrewResource.setIdentification((IfcIdentifier)this.Identification.clone());
		if(this.LongDescription != null)
			ifcCrewResource.setLongDescription((IfcText)this.LongDescription.clone());
		if(this.Usage != null)
			ifcCrewResource.setUsage((IfcResourceTime)this.Usage.clone());
		if(this.BaseCosts != null)
			ifcCrewResource.setBaseCosts((LIST<IfcAppliedValue>)this.BaseCosts.clone());
		if(this.BaseQuantity != null)
			ifcCrewResource.setBaseQuantity((IfcPhysicalQuantity)this.BaseQuantity.clone());
		if(this.PredefinedType != null)
			ifcCrewResource.setPredefinedType((IfcCrewResourceTypeEnum)this.PredefinedType.clone());
		return ifcCrewResource;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCrewResource ifcCrewResource = new IfcCrewResource();
		if(this.GlobalId != null)
			ifcCrewResource.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcCrewResource.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcCrewResource.setName(this.Name);
		if(this.Description != null)
			ifcCrewResource.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcCrewResource.setObjectType(this.ObjectType);
		if(this.Identification != null)
			ifcCrewResource.setIdentification(this.Identification);
		if(this.LongDescription != null)
			ifcCrewResource.setLongDescription(this.LongDescription);
		if(this.Usage != null)
			ifcCrewResource.setUsage(this.Usage);
		if(this.BaseCosts != null)
			ifcCrewResource.setBaseCosts(this.BaseCosts);
		if(this.BaseQuantity != null)
			ifcCrewResource.setBaseQuantity(this.BaseQuantity);
		if(this.PredefinedType != null)
			ifcCrewResource.setPredefinedType(this.PredefinedType);
		return ifcCrewResource;
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
