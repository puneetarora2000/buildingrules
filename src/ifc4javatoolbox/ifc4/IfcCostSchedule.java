/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcCostSchedule<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCostSchedule extends IfcControl implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcIdentifier","IfcCostScheduleTypeEnum","IfcLabel","IfcDateTime","IfcDateTime"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** PredefinedType is an OPTIONAL attribute**/
	protected IfcCostScheduleTypeEnum PredefinedType;
	/** Status is an OPTIONAL attribute**/
	protected IfcLabel Status;
	/** SubmittedOn is an OPTIONAL attribute**/
	protected IfcDateTime SubmittedOn;
	/** UpdateDate is an OPTIONAL attribute**/
	protected IfcDateTime UpdateDate;
	/**
	* The default constructor.
	**/
	public IfcCostSchedule(){}

	/**
	* Constructs a new IfcCostSchedule object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param PredefinedType OPTIONAL parameter of type IfcCostScheduleTypeEnum
	* @param Status OPTIONAL parameter of type IfcLabel
	* @param SubmittedOn OPTIONAL parameter of type IfcDateTime
	* @param UpdateDate OPTIONAL parameter of type IfcDateTime
	**/
	public IfcCostSchedule(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcCostScheduleTypeEnum PredefinedType, IfcLabel Status, IfcDateTime SubmittedOn, IfcDateTime UpdateDate)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.PredefinedType = PredefinedType;
		this.Status = Status;
		this.SubmittedOn = SubmittedOn;
		this.UpdateDate = UpdateDate;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCostSchedule object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param PredefinedType OPTIONAL parameter of type IfcCostScheduleTypeEnum
	* @param Status OPTIONAL parameter of type IfcLabel
	* @param SubmittedOn OPTIONAL parameter of type IfcDateTime
	* @param UpdateDate OPTIONAL parameter of type IfcDateTime
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcCostScheduleTypeEnum PredefinedType, IfcLabel Status, IfcDateTime SubmittedOn, IfcDateTime UpdateDate)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.PredefinedType = PredefinedType;
		this.Status = Status;
		this.SubmittedOn = SubmittedOn;
		this.UpdateDate = UpdateDate;
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
		this.PredefinedType = (IfcCostScheduleTypeEnum) parameters.get(6);
		this.Status = (IfcLabel) parameters.get(7);
		this.SubmittedOn = (IfcDateTime) parameters.get(8);
		this.UpdateDate = (IfcDateTime) parameters.get(9);
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
		return IfcCostSchedule.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCOSTSCHEDULE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*,");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcCostScheduleTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Status")) stepString = stepString.concat("*,");
		else{
		if(this.Status != null)		stepString = stepString.concat(((RootInterface)this.Status).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SubmittedOn")) stepString = stepString.concat("*,");
		else{
		if(this.SubmittedOn != null)		stepString = stepString.concat(((RootInterface)this.SubmittedOn).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UpdateDate")) stepString = stepString.concat("*);");
		else{
		if(this.UpdateDate != null)		stepString = stepString.concat(((RootInterface)this.UpdateDate).getStepParameter(IfcDateTime.class.isInterface())+");");
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
	public void setPredefinedType(IfcCostScheduleTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcCostScheduleTypeEnum getPredefinedType()
	{
		return this.PredefinedType;
	}

	/**
	* This method sets the Status attribute to the given value.
	*
	* @param Status DEMANDED value to set - may not be null
	**/
	public void setStatus(IfcLabel Status)
	{
		this.Status = Status;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Status attribute.
	*
	* @return the value of Status
	/**/
	public IfcLabel getStatus()
	{
		return this.Status;
	}

	/**
	* This method sets the SubmittedOn attribute to the given value.
	*
	* @param SubmittedOn DEMANDED value to set - may not be null
	**/
	public void setSubmittedOn(IfcDateTime SubmittedOn)
	{
		this.SubmittedOn = SubmittedOn;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SubmittedOn attribute.
	*
	* @return the value of SubmittedOn
	/**/
	public IfcDateTime getSubmittedOn()
	{
		return this.SubmittedOn;
	}

	/**
	* This method sets the UpdateDate attribute to the given value.
	*
	* @param UpdateDate DEMANDED value to set - may not be null
	**/
	public void setUpdateDate(IfcDateTime UpdateDate)
	{
		this.UpdateDate = UpdateDate;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UpdateDate attribute.
	*
	* @return the value of UpdateDate
	/**/
	public IfcDateTime getUpdateDate()
	{
		return this.UpdateDate;
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
		IfcCostSchedule ifcCostSchedule = new IfcCostSchedule();
		if(this.GlobalId != null)
			ifcCostSchedule.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcCostSchedule.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcCostSchedule.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcCostSchedule.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcCostSchedule.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.Identification != null)
			ifcCostSchedule.setIdentification((IfcIdentifier)this.Identification.clone());
		if(this.PredefinedType != null)
			ifcCostSchedule.setPredefinedType((IfcCostScheduleTypeEnum)this.PredefinedType.clone());
		if(this.Status != null)
			ifcCostSchedule.setStatus((IfcLabel)this.Status.clone());
		if(this.SubmittedOn != null)
			ifcCostSchedule.setSubmittedOn((IfcDateTime)this.SubmittedOn.clone());
		if(this.UpdateDate != null)
			ifcCostSchedule.setUpdateDate((IfcDateTime)this.UpdateDate.clone());
		return ifcCostSchedule;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCostSchedule ifcCostSchedule = new IfcCostSchedule();
		if(this.GlobalId != null)
			ifcCostSchedule.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcCostSchedule.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcCostSchedule.setName(this.Name);
		if(this.Description != null)
			ifcCostSchedule.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcCostSchedule.setObjectType(this.ObjectType);
		if(this.Identification != null)
			ifcCostSchedule.setIdentification(this.Identification);
		if(this.PredefinedType != null)
			ifcCostSchedule.setPredefinedType(this.PredefinedType);
		if(this.Status != null)
			ifcCostSchedule.setStatus(this.Status);
		if(this.SubmittedOn != null)
			ifcCostSchedule.setSubmittedOn(this.SubmittedOn);
		if(this.UpdateDate != null)
			ifcCostSchedule.setUpdateDate(this.UpdateDate);
		return ifcCostSchedule;
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
