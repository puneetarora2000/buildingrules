/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTask<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTask extends IfcProcess implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcIdentifier","IfcText","IfcLabel","IfcLabel","BOOLEAN","INTEGER","IfcTaskTime","IfcTaskTypeEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Status is an OPTIONAL attribute**/
	protected IfcLabel Status;
	/** WorkMethod is an OPTIONAL attribute**/
	protected IfcLabel WorkMethod;
	/** IsMilestone is an DEMANDED attribute - may not be null**/
	protected BOOLEAN IsMilestone;
	/** Priority is an OPTIONAL attribute**/
	protected INTEGER Priority;
	/** TaskTime is an OPTIONAL attribute**/
	protected IfcTaskTime TaskTime;
	/** PredefinedType is an OPTIONAL attribute**/
	protected IfcTaskTypeEnum PredefinedType;
	/**
	* The default constructor.
	**/
	public IfcTask(){}

	/**
	* Constructs a new IfcTask object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param LongDescription OPTIONAL parameter of type IfcText
	* @param Status OPTIONAL parameter of type IfcLabel
	* @param WorkMethod OPTIONAL parameter of type IfcLabel
	* @param IsMilestone DEMANDED parameter of type BOOLEAN - may not be null.
	* @param Priority OPTIONAL parameter of type INTEGER
	* @param TaskTime OPTIONAL parameter of type IfcTaskTime
	* @param PredefinedType OPTIONAL parameter of type IfcTaskTypeEnum
	**/
	public IfcTask(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcText LongDescription, IfcLabel Status, IfcLabel WorkMethod, BOOLEAN IsMilestone, INTEGER Priority, IfcTaskTime TaskTime, IfcTaskTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.LongDescription = LongDescription;
		this.Status = Status;
		this.WorkMethod = WorkMethod;
		this.IsMilestone = IsMilestone;
		this.Priority = Priority;
		this.TaskTime = TaskTime;
		this.PredefinedType = PredefinedType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTask object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param LongDescription OPTIONAL parameter of type IfcText
	* @param Status OPTIONAL parameter of type IfcLabel
	* @param WorkMethod OPTIONAL parameter of type IfcLabel
	* @param IsMilestone DEMANDED parameter of type BOOLEAN - may not be null.
	* @param Priority OPTIONAL parameter of type INTEGER
	* @param TaskTime OPTIONAL parameter of type IfcTaskTime
	* @param PredefinedType OPTIONAL parameter of type IfcTaskTypeEnum
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcText LongDescription, IfcLabel Status, IfcLabel WorkMethod, BOOLEAN IsMilestone, INTEGER Priority, IfcTaskTime TaskTime, IfcTaskTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.LongDescription = LongDescription;
		this.Status = Status;
		this.WorkMethod = WorkMethod;
		this.IsMilestone = IsMilestone;
		this.Priority = Priority;
		this.TaskTime = TaskTime;
		this.PredefinedType = PredefinedType;
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
		this.LongDescription = (IfcText) parameters.get(6);
		this.Status = (IfcLabel) parameters.get(7);
		this.WorkMethod = (IfcLabel) parameters.get(8);
		this.IsMilestone = (BOOLEAN) parameters.get(9);
		this.Priority = (INTEGER) parameters.get(10);
		this.TaskTime = (IfcTaskTime) parameters.get(11);
		this.PredefinedType = (IfcTaskTypeEnum) parameters.get(12);
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
		return IfcTask.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTASK(");
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
		if(getRedefinedDerivedAttributeTypes().contains("Status")) stepString = stepString.concat("*,");
		else{
		if(this.Status != null)		stepString = stepString.concat(((RootInterface)this.Status).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WorkMethod")) stepString = stepString.concat("*,");
		else{
		if(this.WorkMethod != null)		stepString = stepString.concat(((RootInterface)this.WorkMethod).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("IsMilestone")) stepString = stepString.concat("*,");
		else{
		if(this.IsMilestone != null)		stepString = stepString.concat(((RootInterface)this.IsMilestone).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Priority")) stepString = stepString.concat("*,");
		else{
		if(this.Priority != null)		stepString = stepString.concat(((RootInterface)this.Priority).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TaskTime")) stepString = stepString.concat("*,");
		else{
		if(this.TaskTime != null)		stepString = stepString.concat(((RootInterface)this.TaskTime).getStepParameter(IfcTaskTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*);");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcTaskTypeEnum.class.isInterface())+");");
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
	* This method sets the WorkMethod attribute to the given value.
	*
	* @param WorkMethod DEMANDED value to set - may not be null
	**/
	public void setWorkMethod(IfcLabel WorkMethod)
	{
		this.WorkMethod = WorkMethod;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the WorkMethod attribute.
	*
	* @return the value of WorkMethod
	/**/
	public IfcLabel getWorkMethod()
	{
		return this.WorkMethod;
	}

	/**
	* This method sets the IsMilestone attribute to the given value.
	*
	* @param IsMilestone OPTIONAL value to set
	**/
	public void setIsMilestone(BOOLEAN IsMilestone)
	{
		this.IsMilestone = IsMilestone;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the IsMilestone attribute.
	*
	* @return the value of IsMilestone
	/**/
	public BOOLEAN getIsMilestone()
	{
		return this.IsMilestone;
	}

	/**
	* This method sets the Priority attribute to the given value.
	*
	* @param Priority DEMANDED value to set - may not be null
	**/
	public void setPriority(INTEGER Priority)
	{
		this.Priority = Priority;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Priority attribute.
	*
	* @return the value of Priority
	/**/
	public INTEGER getPriority()
	{
		return this.Priority;
	}

	/**
	* This method sets the TaskTime attribute to the given value.
	*
	* @param TaskTime DEMANDED value to set - may not be null
	**/
	public void setTaskTime(IfcTaskTime TaskTime)
	{
		this.TaskTime = TaskTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TaskTime attribute.
	*
	* @return the value of TaskTime
	/**/
	public IfcTaskTime getTaskTime()
	{
		return this.TaskTime;
	}

	/**
	* This method sets the PredefinedType attribute to the given value.
	*
	* @param PredefinedType DEMANDED value to set - may not be null
	**/
	public void setPredefinedType(IfcTaskTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcTaskTypeEnum getPredefinedType()
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
	public Object clone()
	{
		IfcTask ifcTask = new IfcTask();
		if(this.GlobalId != null)
			ifcTask.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcTask.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcTask.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcTask.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcTask.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.Identification != null)
			ifcTask.setIdentification((IfcIdentifier)this.Identification.clone());
		if(this.LongDescription != null)
			ifcTask.setLongDescription((IfcText)this.LongDescription.clone());
		if(this.Status != null)
			ifcTask.setStatus((IfcLabel)this.Status.clone());
		if(this.WorkMethod != null)
			ifcTask.setWorkMethod((IfcLabel)this.WorkMethod.clone());
		if(this.IsMilestone != null)
			ifcTask.setIsMilestone((BOOLEAN)this.IsMilestone.clone());
		if(this.Priority != null)
			ifcTask.setPriority((INTEGER)this.Priority.clone());
		if(this.TaskTime != null)
			ifcTask.setTaskTime((IfcTaskTime)this.TaskTime.clone());
		if(this.PredefinedType != null)
			ifcTask.setPredefinedType((IfcTaskTypeEnum)this.PredefinedType.clone());
		return ifcTask;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTask ifcTask = new IfcTask();
		if(this.GlobalId != null)
			ifcTask.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcTask.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcTask.setName(this.Name);
		if(this.Description != null)
			ifcTask.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcTask.setObjectType(this.ObjectType);
		if(this.Identification != null)
			ifcTask.setIdentification(this.Identification);
		if(this.LongDescription != null)
			ifcTask.setLongDescription(this.LongDescription);
		if(this.Status != null)
			ifcTask.setStatus(this.Status);
		if(this.WorkMethod != null)
			ifcTask.setWorkMethod(this.WorkMethod);
		if(this.IsMilestone != null)
			ifcTask.setIsMilestone(this.IsMilestone);
		if(this.Priority != null)
			ifcTask.setPriority(this.Priority);
		if(this.TaskTime != null)
			ifcTask.setTaskTime(this.TaskTime);
		if(this.PredefinedType != null)
			ifcTask.setPredefinedType(this.PredefinedType);
		return ifcTask;
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
