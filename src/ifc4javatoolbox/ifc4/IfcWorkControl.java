/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcWorkControl<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcWorkControl extends IfcControl implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcIdentifier","IfcDateTime","SET<IfcPerson>","IfcLabel","IfcDuration","IfcDuration","IfcDateTime","IfcDateTime"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** CreationDate is an DEMANDED attribute - may not be null**/
	protected IfcDateTime CreationDate;
	/** Creators is an OPTIONAL attribute**/
	protected SET<IfcPerson> Creators;
	/** Purpose is an OPTIONAL attribute**/
	protected IfcLabel Purpose;
	/** Duration is an OPTIONAL attribute**/
	protected IfcDuration Duration;
	/** TotalFloat is an OPTIONAL attribute**/
	protected IfcDuration TotalFloat;
	/** StartTime is an DEMANDED attribute - may not be null**/
	protected IfcDateTime StartTime;
	/** FinishTime is an OPTIONAL attribute**/
	protected IfcDateTime FinishTime;
	/**
	* The default constructor.
	**/
	public IfcWorkControl(){}

	/**
	* Constructs a new IfcWorkControl object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param CreationDate DEMANDED parameter of type IfcDateTime - may not be null.
	* @param Creators OPTIONAL parameter of type SET<IfcPerson>
	* @param Purpose OPTIONAL parameter of type IfcLabel
	* @param Duration OPTIONAL parameter of type IfcDuration
	* @param TotalFloat OPTIONAL parameter of type IfcDuration
	* @param StartTime DEMANDED parameter of type IfcDateTime - may not be null.
	* @param FinishTime OPTIONAL parameter of type IfcDateTime
	**/
	public IfcWorkControl(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcDateTime CreationDate, SET<IfcPerson> Creators, IfcLabel Purpose, IfcDuration Duration, IfcDuration TotalFloat, IfcDateTime StartTime, IfcDateTime FinishTime)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.CreationDate = CreationDate;
		this.Creators = Creators;
		this.Purpose = Purpose;
		this.Duration = Duration;
		this.TotalFloat = TotalFloat;
		this.StartTime = StartTime;
		this.FinishTime = FinishTime;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcWorkControl object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param CreationDate DEMANDED parameter of type IfcDateTime - may not be null.
	* @param Creators OPTIONAL parameter of type SET<IfcPerson>
	* @param Purpose OPTIONAL parameter of type IfcLabel
	* @param Duration OPTIONAL parameter of type IfcDuration
	* @param TotalFloat OPTIONAL parameter of type IfcDuration
	* @param StartTime DEMANDED parameter of type IfcDateTime - may not be null.
	* @param FinishTime OPTIONAL parameter of type IfcDateTime
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identification, IfcDateTime CreationDate, SET<IfcPerson> Creators, IfcLabel Purpose, IfcDuration Duration, IfcDuration TotalFloat, IfcDateTime StartTime, IfcDateTime FinishTime)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identification = Identification;
		this.CreationDate = CreationDate;
		this.Creators = Creators;
		this.Purpose = Purpose;
		this.Duration = Duration;
		this.TotalFloat = TotalFloat;
		this.StartTime = StartTime;
		this.FinishTime = FinishTime;
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
		this.CreationDate = (IfcDateTime) parameters.get(6);
		this.Creators = (SET<IfcPerson>) parameters.get(7);
		this.Purpose = (IfcLabel) parameters.get(8);
		this.Duration = (IfcDuration) parameters.get(9);
		this.TotalFloat = (IfcDuration) parameters.get(10);
		this.StartTime = (IfcDateTime) parameters.get(11);
		this.FinishTime = (IfcDateTime) parameters.get(12);
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
		return IfcWorkControl.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCWORKCONTROL(");
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
		if(getRedefinedDerivedAttributeTypes().contains("CreationDate")) stepString = stepString.concat("*,");
		else{
		if(this.CreationDate != null)		stepString = stepString.concat(((RootInterface)this.CreationDate).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Creators")) stepString = stepString.concat("*,");
		else{
		if(this.Creators != null)		stepString = stepString.concat(((RootInterface)this.Creators).getStepParameter(IfcPerson.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Purpose")) stepString = stepString.concat("*,");
		else{
		if(this.Purpose != null)		stepString = stepString.concat(((RootInterface)this.Purpose).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Duration")) stepString = stepString.concat("*,");
		else{
		if(this.Duration != null)		stepString = stepString.concat(((RootInterface)this.Duration).getStepParameter(IfcDuration.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TotalFloat")) stepString = stepString.concat("*,");
		else{
		if(this.TotalFloat != null)		stepString = stepString.concat(((RootInterface)this.TotalFloat).getStepParameter(IfcDuration.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("StartTime")) stepString = stepString.concat("*,");
		else{
		if(this.StartTime != null)		stepString = stepString.concat(((RootInterface)this.StartTime).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FinishTime")) stepString = stepString.concat("*);");
		else{
		if(this.FinishTime != null)		stepString = stepString.concat(((RootInterface)this.FinishTime).getStepParameter(IfcDateTime.class.isInterface())+");");
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
	* This method sets the CreationDate attribute to the given value.
	*
	* @param CreationDate OPTIONAL value to set
	**/
	public void setCreationDate(IfcDateTime CreationDate)
	{
		this.CreationDate = CreationDate;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CreationDate attribute.
	*
	* @return the value of CreationDate
	/**/
	public IfcDateTime getCreationDate()
	{
		return this.CreationDate;
	}

	/**
	* This method sets the Creators attribute to the given value.
	*
	* @param Creators DEMANDED value to set - may not be null
	**/
	public void setCreators(SET<IfcPerson> Creators)
	{
		this.Creators = Creators;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Creators attribute.
	*
	* @return a copy of the Creators set
	**/
	public SET<IfcPerson> getCreators()
	{
		if(this.Creators != null)
			return new SET<IfcPerson>(this.Creators);
		return null;
	}

	/**
	* This method adds an IfcPerson object to the Creators set.
	* @param Creators element to be appended to this set.
	**/
	public void addCreators(IfcPerson Creators)
	{
		if(this.Creators == null)
			this.Creators = new SET<IfcPerson>();
		this.Creators.add(Creators);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcPerson objects to the Creators set.
	* @param Creators collection containing elements to be added to this set.
	**/
	public void addAllCreators(java.util.Collection<IfcPerson> Creators)
	{
		if(this.Creators == null)
			this.Creators = new SET<IfcPerson>();
		this.Creators.addAll(Creators);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Creators set.
	**/
	public void clearCreators()
	{
		if(this.Creators != null)
		{
			this.Creators.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcPerson object from the Creators set.
	* @param Creators element to be removed from this set.
	**/
	public void removeCreators(IfcPerson Creators)
	{
		if(this.Creators != null)
		{
			this.Creators.remove(Creators);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcPerson objects from the Creators set.
	* @param Creators collection containing elements to be removed from this set.
	**/
	public void removeAllCreators(java.util.Collection<IfcPerson> Creators)
	{
		if(this.Creators != null)
		{
			this.Creators.removeAll(Creators);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Purpose attribute to the given value.
	*
	* @param Purpose DEMANDED value to set - may not be null
	**/
	public void setPurpose(IfcLabel Purpose)
	{
		this.Purpose = Purpose;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Purpose attribute.
	*
	* @return the value of Purpose
	/**/
	public IfcLabel getPurpose()
	{
		return this.Purpose;
	}

	/**
	* This method sets the Duration attribute to the given value.
	*
	* @param Duration DEMANDED value to set - may not be null
	**/
	public void setDuration(IfcDuration Duration)
	{
		this.Duration = Duration;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Duration attribute.
	*
	* @return the value of Duration
	/**/
	public IfcDuration getDuration()
	{
		return this.Duration;
	}

	/**
	* This method sets the TotalFloat attribute to the given value.
	*
	* @param TotalFloat DEMANDED value to set - may not be null
	**/
	public void setTotalFloat(IfcDuration TotalFloat)
	{
		this.TotalFloat = TotalFloat;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TotalFloat attribute.
	*
	* @return the value of TotalFloat
	/**/
	public IfcDuration getTotalFloat()
	{
		return this.TotalFloat;
	}

	/**
	* This method sets the StartTime attribute to the given value.
	*
	* @param StartTime OPTIONAL value to set
	**/
	public void setStartTime(IfcDateTime StartTime)
	{
		this.StartTime = StartTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the StartTime attribute.
	*
	* @return the value of StartTime
	/**/
	public IfcDateTime getStartTime()
	{
		return this.StartTime;
	}

	/**
	* This method sets the FinishTime attribute to the given value.
	*
	* @param FinishTime DEMANDED value to set - may not be null
	**/
	public void setFinishTime(IfcDateTime FinishTime)
	{
		this.FinishTime = FinishTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FinishTime attribute.
	*
	* @return the value of FinishTime
	/**/
	public IfcDateTime getFinishTime()
	{
		return this.FinishTime;
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
