/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcAsset<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcAsset extends IfcGroup implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcIdentifier","IfcCostValue","IfcCostValue","IfcCostValue","IfcActorSelect","IfcActorSelect","IfcPerson","IfcDate","IfcCostValue"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Identification is an OPTIONAL attribute**/
	protected IfcIdentifier Identification;
	/** OriginalValue is an OPTIONAL attribute**/
	protected IfcCostValue OriginalValue;
	/** CurrentValue is an OPTIONAL attribute**/
	protected IfcCostValue CurrentValue;
	/** TotalReplacementCost is an OPTIONAL attribute**/
	protected IfcCostValue TotalReplacementCost;
	/** Owner is an OPTIONAL attribute**/
	protected IfcActorSelect Owner;
	/** User is an OPTIONAL attribute**/
	protected IfcActorSelect User;
	/** ResponsiblePerson is an OPTIONAL attribute**/
	protected IfcPerson ResponsiblePerson;
	/** IncorporationDate is an OPTIONAL attribute**/
	protected IfcDate IncorporationDate;
	/** DepreciatedValue is an OPTIONAL attribute**/
	protected IfcCostValue DepreciatedValue;
	/**
	* The default constructor.
	**/
	public IfcAsset(){}

	/**
	* Constructs a new IfcAsset object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param OriginalValue OPTIONAL parameter of type IfcCostValue
	* @param CurrentValue OPTIONAL parameter of type IfcCostValue
	* @param TotalReplacementCost OPTIONAL parameter of type IfcCostValue
	* @param Owner OPTIONAL parameter of type IfcActorSelect
	* @param User OPTIONAL parameter of type IfcActorSelect
	* @param ResponsiblePerson OPTIONAL parameter of type IfcPerson
	* @param IncorporationDate OPTIONAL parameter of type IfcDate
	* @param DepreciatedValue OPTIONAL parameter of type IfcCostValue
	**/
	public IfcAsset(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcCostValue OriginalValue, IfcCostValue CurrentValue, IfcCostValue TotalReplacementCost, IfcActorSelect Owner, IfcActorSelect User, IfcPerson ResponsiblePerson, IfcDate IncorporationDate, IfcCostValue DepreciatedValue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.OriginalValue = OriginalValue;
		this.CurrentValue = CurrentValue;
		this.TotalReplacementCost = TotalReplacementCost;
		this.Owner = Owner;
		this.User = User;
		this.ResponsiblePerson = ResponsiblePerson;
		this.IncorporationDate = IncorporationDate;
		this.DepreciatedValue = DepreciatedValue;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcAsset object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param OriginalValue OPTIONAL parameter of type IfcCostValue
	* @param CurrentValue OPTIONAL parameter of type IfcCostValue
	* @param TotalReplacementCost OPTIONAL parameter of type IfcCostValue
	* @param Owner OPTIONAL parameter of type IfcActorSelect
	* @param User OPTIONAL parameter of type IfcActorSelect
	* @param ResponsiblePerson OPTIONAL parameter of type IfcPerson
	* @param IncorporationDate OPTIONAL parameter of type IfcDate
	* @param DepreciatedValue OPTIONAL parameter of type IfcCostValue
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcCostValue OriginalValue, IfcCostValue CurrentValue, IfcCostValue TotalReplacementCost, IfcActorSelect Owner, IfcActorSelect User, IfcPerson ResponsiblePerson, IfcDate IncorporationDate, IfcCostValue DepreciatedValue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.OriginalValue = OriginalValue;
		this.CurrentValue = CurrentValue;
		this.TotalReplacementCost = TotalReplacementCost;
		this.Owner = Owner;
		this.User = User;
		this.ResponsiblePerson = ResponsiblePerson;
		this.IncorporationDate = IncorporationDate;
		this.DepreciatedValue = DepreciatedValue;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.Identification = (IfcIdentifier) parameters.get(5);
		this.OriginalValue = (IfcCostValue) parameters.get(6);
		this.CurrentValue = (IfcCostValue) parameters.get(7);
		this.TotalReplacementCost = (IfcCostValue) parameters.get(8);
		this.Owner = (IfcActorSelect) parameters.get(9);
		this.User = (IfcActorSelect) parameters.get(10);
		this.ResponsiblePerson = (IfcPerson) parameters.get(11);
		this.IncorporationDate = (IfcDate) parameters.get(12);
		this.DepreciatedValue = (IfcCostValue) parameters.get(13);
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
		return IfcAsset.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCASSET(");
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
		if(getRedefinedDerivedAttributeTypes().contains("OriginalValue")) stepString = stepString.concat("*,");
		else{
		if(this.OriginalValue != null)		stepString = stepString.concat(((RootInterface)this.OriginalValue).getStepParameter(IfcCostValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CurrentValue")) stepString = stepString.concat("*,");
		else{
		if(this.CurrentValue != null)		stepString = stepString.concat(((RootInterface)this.CurrentValue).getStepParameter(IfcCostValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TotalReplacementCost")) stepString = stepString.concat("*,");
		else{
		if(this.TotalReplacementCost != null)		stepString = stepString.concat(((RootInterface)this.TotalReplacementCost).getStepParameter(IfcCostValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Owner")) stepString = stepString.concat("*,");
		else{
		if(this.Owner != null)		stepString = stepString.concat(((RootInterface)this.Owner).getStepParameter(IfcActorSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("User")) stepString = stepString.concat("*,");
		else{
		if(this.User != null)		stepString = stepString.concat(((RootInterface)this.User).getStepParameter(IfcActorSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ResponsiblePerson")) stepString = stepString.concat("*,");
		else{
		if(this.ResponsiblePerson != null)		stepString = stepString.concat(((RootInterface)this.ResponsiblePerson).getStepParameter(IfcPerson.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("IncorporationDate")) stepString = stepString.concat("*,");
		else{
		if(this.IncorporationDate != null)		stepString = stepString.concat(((RootInterface)this.IncorporationDate).getStepParameter(IfcDate.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DepreciatedValue")) stepString = stepString.concat("*);");
		else{
		if(this.DepreciatedValue != null)		stepString = stepString.concat(((RootInterface)this.DepreciatedValue).getStepParameter(IfcCostValue.class.isInterface())+");");
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
	* This method sets the OriginalValue attribute to the given value.
	*
	* @param OriginalValue DEMANDED value to set - may not be null
	**/
	public void setOriginalValue(IfcCostValue OriginalValue)
	{
		this.OriginalValue = OriginalValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the OriginalValue attribute.
	*
	* @return the value of OriginalValue
	/**/
	public IfcCostValue getOriginalValue()
	{
		return this.OriginalValue;
	}

	/**
	* This method sets the CurrentValue attribute to the given value.
	*
	* @param CurrentValue DEMANDED value to set - may not be null
	**/
	public void setCurrentValue(IfcCostValue CurrentValue)
	{
		this.CurrentValue = CurrentValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CurrentValue attribute.
	*
	* @return the value of CurrentValue
	/**/
	public IfcCostValue getCurrentValue()
	{
		return this.CurrentValue;
	}

	/**
	* This method sets the TotalReplacementCost attribute to the given value.
	*
	* @param TotalReplacementCost DEMANDED value to set - may not be null
	**/
	public void setTotalReplacementCost(IfcCostValue TotalReplacementCost)
	{
		this.TotalReplacementCost = TotalReplacementCost;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TotalReplacementCost attribute.
	*
	* @return the value of TotalReplacementCost
	/**/
	public IfcCostValue getTotalReplacementCost()
	{
		return this.TotalReplacementCost;
	}

	/**
	* This method sets the Owner attribute to the given value.
	*
	* @param Owner DEMANDED value to set - may not be null
	**/
	public void setOwner(IfcActorSelect Owner)
	{
		this.Owner = Owner;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Owner attribute.
	*
	* @return the value of Owner
	/**/
	public IfcActorSelect getOwner()
	{
		return this.Owner;
	}

	/**
	* This method sets the User attribute to the given value.
	*
	* @param User DEMANDED value to set - may not be null
	**/
	public void setUser(IfcActorSelect User)
	{
		this.User = User;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the User attribute.
	*
	* @return the value of User
	/**/
	public IfcActorSelect getUser()
	{
		return this.User;
	}

	/**
	* This method sets the ResponsiblePerson attribute to the given value.
	*
	* @param ResponsiblePerson DEMANDED value to set - may not be null
	**/
	public void setResponsiblePerson(IfcPerson ResponsiblePerson)
	{
		this.ResponsiblePerson = ResponsiblePerson;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ResponsiblePerson attribute.
	*
	* @return the value of ResponsiblePerson
	/**/
	public IfcPerson getResponsiblePerson()
	{
		return this.ResponsiblePerson;
	}

	/**
	* This method sets the IncorporationDate attribute to the given value.
	*
	* @param IncorporationDate DEMANDED value to set - may not be null
	**/
	public void setIncorporationDate(IfcDate IncorporationDate)
	{
		this.IncorporationDate = IncorporationDate;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the IncorporationDate attribute.
	*
	* @return the value of IncorporationDate
	/**/
	public IfcDate getIncorporationDate()
	{
		return this.IncorporationDate;
	}

	/**
	* This method sets the DepreciatedValue attribute to the given value.
	*
	* @param DepreciatedValue DEMANDED value to set - may not be null
	**/
	public void setDepreciatedValue(IfcCostValue DepreciatedValue)
	{
		this.DepreciatedValue = DepreciatedValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DepreciatedValue attribute.
	*
	* @return the value of DepreciatedValue
	/**/
	public IfcCostValue getDepreciatedValue()
	{
		return this.DepreciatedValue;
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
		IfcAsset ifcAsset = new IfcAsset();
		if(this.GlobalId != null)
			ifcAsset.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcAsset.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcAsset.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcAsset.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcAsset.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.Identification != null)
			ifcAsset.setIdentification((IfcIdentifier)this.Identification.clone());
		if(this.OriginalValue != null)
			ifcAsset.setOriginalValue((IfcCostValue)this.OriginalValue.clone());
		if(this.CurrentValue != null)
			ifcAsset.setCurrentValue((IfcCostValue)this.CurrentValue.clone());
		if(this.TotalReplacementCost != null)
			ifcAsset.setTotalReplacementCost((IfcCostValue)this.TotalReplacementCost.clone());
		if(this.Owner != null)
			ifcAsset.setOwner((IfcActorSelect)this.Owner.clone());
		if(this.User != null)
			ifcAsset.setUser((IfcActorSelect)this.User.clone());
		if(this.ResponsiblePerson != null)
			ifcAsset.setResponsiblePerson((IfcPerson)this.ResponsiblePerson.clone());
		if(this.IncorporationDate != null)
			ifcAsset.setIncorporationDate((IfcDate)this.IncorporationDate.clone());
		if(this.DepreciatedValue != null)
			ifcAsset.setDepreciatedValue((IfcCostValue)this.DepreciatedValue.clone());
		return ifcAsset;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcAsset ifcAsset = new IfcAsset();
		if(this.GlobalId != null)
			ifcAsset.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcAsset.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcAsset.setName(this.Name);
		if(this.Description != null)
			ifcAsset.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcAsset.setObjectType(this.ObjectType);
		if(this.Identification != null)
			ifcAsset.setIdentification(this.Identification);
		if(this.OriginalValue != null)
			ifcAsset.setOriginalValue(this.OriginalValue);
		if(this.CurrentValue != null)
			ifcAsset.setCurrentValue(this.CurrentValue);
		if(this.TotalReplacementCost != null)
			ifcAsset.setTotalReplacementCost(this.TotalReplacementCost);
		if(this.Owner != null)
			ifcAsset.setOwner(this.Owner);
		if(this.User != null)
			ifcAsset.setUser(this.User);
		if(this.ResponsiblePerson != null)
			ifcAsset.setResponsiblePerson(this.ResponsiblePerson);
		if(this.IncorporationDate != null)
			ifcAsset.setIncorporationDate(this.IncorporationDate);
		if(this.DepreciatedValue != null)
			ifcAsset.setDepreciatedValue(this.DepreciatedValue);
		return ifcAsset;
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
