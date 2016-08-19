/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcResourceTime<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcResourceTime extends IfcSchedulingTime implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcDataOriginEnum","IfcLabel","IfcDuration","IfcPositiveRatioMeasure","IfcDateTime","IfcDateTime","IfcLabel","IfcDuration","BOOLEAN","IfcDateTime","IfcDuration","IfcPositiveRatioMeasure","IfcDateTime","IfcDateTime","IfcDuration","IfcPositiveRatioMeasure","IfcPositiveRatioMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ScheduleWork is an OPTIONAL attribute**/
	protected IfcDuration ScheduleWork;
	/** ScheduleUsage is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure ScheduleUsage;
	/** ScheduleStart is an OPTIONAL attribute**/
	protected IfcDateTime ScheduleStart;
	/** ScheduleFinish is an OPTIONAL attribute**/
	protected IfcDateTime ScheduleFinish;
	/** ScheduleContour is an OPTIONAL attribute**/
	protected IfcLabel ScheduleContour;
	/** LevelingDelay is an OPTIONAL attribute**/
	protected IfcDuration LevelingDelay;
	/** IsOverAllocated is an OPTIONAL attribute**/
	protected BOOLEAN IsOverAllocated;
	/** StatusTime is an OPTIONAL attribute**/
	protected IfcDateTime StatusTime;
	/** ActualWork is an OPTIONAL attribute**/
	protected IfcDuration ActualWork;
	/** ActualUsage is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure ActualUsage;
	/** ActualStart is an OPTIONAL attribute**/
	protected IfcDateTime ActualStart;
	/** ActualFinish is an OPTIONAL attribute**/
	protected IfcDateTime ActualFinish;
	/** RemainingWork is an OPTIONAL attribute**/
	protected IfcDuration RemainingWork;
	/** RemainingUsage is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure RemainingUsage;
	/** Completion is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure Completion;
	/**
	* The default constructor.
	**/
	public IfcResourceTime(){}

	/**
	* Constructs a new IfcResourceTime object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param DataOrigin OPTIONAL parameter of type IfcDataOriginEnum
	* @param UserDefinedDataOrigin OPTIONAL parameter of type IfcLabel
	* @param ScheduleWork OPTIONAL parameter of type IfcDuration
	* @param ScheduleUsage OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ScheduleStart OPTIONAL parameter of type IfcDateTime
	* @param ScheduleFinish OPTIONAL parameter of type IfcDateTime
	* @param ScheduleContour OPTIONAL parameter of type IfcLabel
	* @param LevelingDelay OPTIONAL parameter of type IfcDuration
	* @param IsOverAllocated OPTIONAL parameter of type BOOLEAN
	* @param StatusTime OPTIONAL parameter of type IfcDateTime
	* @param ActualWork OPTIONAL parameter of type IfcDuration
	* @param ActualUsage OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ActualStart OPTIONAL parameter of type IfcDateTime
	* @param ActualFinish OPTIONAL parameter of type IfcDateTime
	* @param RemainingWork OPTIONAL parameter of type IfcDuration
	* @param RemainingUsage OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param Completion OPTIONAL parameter of type IfcPositiveRatioMeasure
	**/
	public IfcResourceTime(IfcLabel Name, IfcDataOriginEnum DataOrigin, IfcLabel UserDefinedDataOrigin, IfcDuration ScheduleWork, IfcPositiveRatioMeasure ScheduleUsage, IfcDateTime ScheduleStart, IfcDateTime ScheduleFinish, IfcLabel ScheduleContour, IfcDuration LevelingDelay, BOOLEAN IsOverAllocated, IfcDateTime StatusTime, IfcDuration ActualWork, IfcPositiveRatioMeasure ActualUsage, IfcDateTime ActualStart, IfcDateTime ActualFinish, IfcDuration RemainingWork, IfcPositiveRatioMeasure RemainingUsage, IfcPositiveRatioMeasure Completion)
	{
		this.Name = Name;
		this.DataOrigin = DataOrigin;
		this.UserDefinedDataOrigin = UserDefinedDataOrigin;
		this.ScheduleWork = ScheduleWork;
		this.ScheduleUsage = ScheduleUsage;
		this.ScheduleStart = ScheduleStart;
		this.ScheduleFinish = ScheduleFinish;
		this.ScheduleContour = ScheduleContour;
		this.LevelingDelay = LevelingDelay;
		this.IsOverAllocated = IsOverAllocated;
		this.StatusTime = StatusTime;
		this.ActualWork = ActualWork;
		this.ActualUsage = ActualUsage;
		this.ActualStart = ActualStart;
		this.ActualFinish = ActualFinish;
		this.RemainingWork = RemainingWork;
		this.RemainingUsage = RemainingUsage;
		this.Completion = Completion;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcResourceTime object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param DataOrigin OPTIONAL parameter of type IfcDataOriginEnum
	* @param UserDefinedDataOrigin OPTIONAL parameter of type IfcLabel
	* @param ScheduleWork OPTIONAL parameter of type IfcDuration
	* @param ScheduleUsage OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ScheduleStart OPTIONAL parameter of type IfcDateTime
	* @param ScheduleFinish OPTIONAL parameter of type IfcDateTime
	* @param ScheduleContour OPTIONAL parameter of type IfcLabel
	* @param LevelingDelay OPTIONAL parameter of type IfcDuration
	* @param IsOverAllocated OPTIONAL parameter of type BOOLEAN
	* @param StatusTime OPTIONAL parameter of type IfcDateTime
	* @param ActualWork OPTIONAL parameter of type IfcDuration
	* @param ActualUsage OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ActualStart OPTIONAL parameter of type IfcDateTime
	* @param ActualFinish OPTIONAL parameter of type IfcDateTime
	* @param RemainingWork OPTIONAL parameter of type IfcDuration
	* @param RemainingUsage OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param Completion OPTIONAL parameter of type IfcPositiveRatioMeasure
	**/
	public void setParameters(IfcLabel Name, IfcDataOriginEnum DataOrigin, IfcLabel UserDefinedDataOrigin, IfcDuration ScheduleWork, IfcPositiveRatioMeasure ScheduleUsage, IfcDateTime ScheduleStart, IfcDateTime ScheduleFinish, IfcLabel ScheduleContour, IfcDuration LevelingDelay, BOOLEAN IsOverAllocated, IfcDateTime StatusTime, IfcDuration ActualWork, IfcPositiveRatioMeasure ActualUsage, IfcDateTime ActualStart, IfcDateTime ActualFinish, IfcDuration RemainingWork, IfcPositiveRatioMeasure RemainingUsage, IfcPositiveRatioMeasure Completion)
	{
		this.Name = Name;
		this.DataOrigin = DataOrigin;
		this.UserDefinedDataOrigin = UserDefinedDataOrigin;
		this.ScheduleWork = ScheduleWork;
		this.ScheduleUsage = ScheduleUsage;
		this.ScheduleStart = ScheduleStart;
		this.ScheduleFinish = ScheduleFinish;
		this.ScheduleContour = ScheduleContour;
		this.LevelingDelay = LevelingDelay;
		this.IsOverAllocated = IsOverAllocated;
		this.StatusTime = StatusTime;
		this.ActualWork = ActualWork;
		this.ActualUsage = ActualUsage;
		this.ActualStart = ActualStart;
		this.ActualFinish = ActualFinish;
		this.RemainingWork = RemainingWork;
		this.RemainingUsage = RemainingUsage;
		this.Completion = Completion;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.DataOrigin = (IfcDataOriginEnum) parameters.get(1);
		this.UserDefinedDataOrigin = (IfcLabel) parameters.get(2);
		this.ScheduleWork = (IfcDuration) parameters.get(3);
		this.ScheduleUsage = (IfcPositiveRatioMeasure) parameters.get(4);
		this.ScheduleStart = (IfcDateTime) parameters.get(5);
		this.ScheduleFinish = (IfcDateTime) parameters.get(6);
		this.ScheduleContour = (IfcLabel) parameters.get(7);
		this.LevelingDelay = (IfcDuration) parameters.get(8);
		this.IsOverAllocated = (BOOLEAN) parameters.get(9);
		this.StatusTime = (IfcDateTime) parameters.get(10);
		this.ActualWork = (IfcDuration) parameters.get(11);
		this.ActualUsage = (IfcPositiveRatioMeasure) parameters.get(12);
		this.ActualStart = (IfcDateTime) parameters.get(13);
		this.ActualFinish = (IfcDateTime) parameters.get(14);
		this.RemainingWork = (IfcDuration) parameters.get(15);
		this.RemainingUsage = (IfcPositiveRatioMeasure) parameters.get(16);
		this.Completion = (IfcPositiveRatioMeasure) parameters.get(17);
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
		return IfcResourceTime.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRESOURCETIME(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DataOrigin")) stepString = stepString.concat("*,");
		else{
		if(this.DataOrigin != null)		stepString = stepString.concat(((RootInterface)this.DataOrigin).getStepParameter(IfcDataOriginEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedDataOrigin")) stepString = stepString.concat("*,");
		else{
		if(this.UserDefinedDataOrigin != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedDataOrigin).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ScheduleWork")) stepString = stepString.concat("*,");
		else{
		if(this.ScheduleWork != null)		stepString = stepString.concat(((RootInterface)this.ScheduleWork).getStepParameter(IfcDuration.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ScheduleUsage")) stepString = stepString.concat("*,");
		else{
		if(this.ScheduleUsage != null)		stepString = stepString.concat(((RootInterface)this.ScheduleUsage).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ScheduleStart")) stepString = stepString.concat("*,");
		else{
		if(this.ScheduleStart != null)		stepString = stepString.concat(((RootInterface)this.ScheduleStart).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ScheduleFinish")) stepString = stepString.concat("*,");
		else{
		if(this.ScheduleFinish != null)		stepString = stepString.concat(((RootInterface)this.ScheduleFinish).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ScheduleContour")) stepString = stepString.concat("*,");
		else{
		if(this.ScheduleContour != null)		stepString = stepString.concat(((RootInterface)this.ScheduleContour).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LevelingDelay")) stepString = stepString.concat("*,");
		else{
		if(this.LevelingDelay != null)		stepString = stepString.concat(((RootInterface)this.LevelingDelay).getStepParameter(IfcDuration.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("IsOverAllocated")) stepString = stepString.concat("*,");
		else{
		if(this.IsOverAllocated != null)		stepString = stepString.concat(((RootInterface)this.IsOverAllocated).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("StatusTime")) stepString = stepString.concat("*,");
		else{
		if(this.StatusTime != null)		stepString = stepString.concat(((RootInterface)this.StatusTime).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ActualWork")) stepString = stepString.concat("*,");
		else{
		if(this.ActualWork != null)		stepString = stepString.concat(((RootInterface)this.ActualWork).getStepParameter(IfcDuration.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ActualUsage")) stepString = stepString.concat("*,");
		else{
		if(this.ActualUsage != null)		stepString = stepString.concat(((RootInterface)this.ActualUsage).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ActualStart")) stepString = stepString.concat("*,");
		else{
		if(this.ActualStart != null)		stepString = stepString.concat(((RootInterface)this.ActualStart).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ActualFinish")) stepString = stepString.concat("*,");
		else{
		if(this.ActualFinish != null)		stepString = stepString.concat(((RootInterface)this.ActualFinish).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RemainingWork")) stepString = stepString.concat("*,");
		else{
		if(this.RemainingWork != null)		stepString = stepString.concat(((RootInterface)this.RemainingWork).getStepParameter(IfcDuration.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RemainingUsage")) stepString = stepString.concat("*,");
		else{
		if(this.RemainingUsage != null)		stepString = stepString.concat(((RootInterface)this.RemainingUsage).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Completion")) stepString = stepString.concat("*);");
		else{
		if(this.Completion != null)		stepString = stepString.concat(((RootInterface)this.Completion).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+");");
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
	* This method sets the ScheduleWork attribute to the given value.
	*
	* @param ScheduleWork DEMANDED value to set - may not be null
	**/
	public void setScheduleWork(IfcDuration ScheduleWork)
	{
		this.ScheduleWork = ScheduleWork;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ScheduleWork attribute.
	*
	* @return the value of ScheduleWork
	/**/
	public IfcDuration getScheduleWork()
	{
		return this.ScheduleWork;
	}

	/**
	* This method sets the ScheduleUsage attribute to the given value.
	*
	* @param ScheduleUsage DEMANDED value to set - may not be null
	**/
	public void setScheduleUsage(IfcPositiveRatioMeasure ScheduleUsage)
	{
		this.ScheduleUsage = ScheduleUsage;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ScheduleUsage attribute.
	*
	* @return the value of ScheduleUsage
	/**/
	public IfcPositiveRatioMeasure getScheduleUsage()
	{
		return this.ScheduleUsage;
	}

	/**
	* This method sets the ScheduleStart attribute to the given value.
	*
	* @param ScheduleStart DEMANDED value to set - may not be null
	**/
	public void setScheduleStart(IfcDateTime ScheduleStart)
	{
		this.ScheduleStart = ScheduleStart;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ScheduleStart attribute.
	*
	* @return the value of ScheduleStart
	/**/
	public IfcDateTime getScheduleStart()
	{
		return this.ScheduleStart;
	}

	/**
	* This method sets the ScheduleFinish attribute to the given value.
	*
	* @param ScheduleFinish DEMANDED value to set - may not be null
	**/
	public void setScheduleFinish(IfcDateTime ScheduleFinish)
	{
		this.ScheduleFinish = ScheduleFinish;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ScheduleFinish attribute.
	*
	* @return the value of ScheduleFinish
	/**/
	public IfcDateTime getScheduleFinish()
	{
		return this.ScheduleFinish;
	}

	/**
	* This method sets the ScheduleContour attribute to the given value.
	*
	* @param ScheduleContour DEMANDED value to set - may not be null
	**/
	public void setScheduleContour(IfcLabel ScheduleContour)
	{
		this.ScheduleContour = ScheduleContour;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ScheduleContour attribute.
	*
	* @return the value of ScheduleContour
	/**/
	public IfcLabel getScheduleContour()
	{
		return this.ScheduleContour;
	}

	/**
	* This method sets the LevelingDelay attribute to the given value.
	*
	* @param LevelingDelay DEMANDED value to set - may not be null
	**/
	public void setLevelingDelay(IfcDuration LevelingDelay)
	{
		this.LevelingDelay = LevelingDelay;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LevelingDelay attribute.
	*
	* @return the value of LevelingDelay
	/**/
	public IfcDuration getLevelingDelay()
	{
		return this.LevelingDelay;
	}

	/**
	* This method sets the IsOverAllocated attribute to the given value.
	*
	* @param IsOverAllocated DEMANDED value to set - may not be null
	**/
	public void setIsOverAllocated(BOOLEAN IsOverAllocated)
	{
		this.IsOverAllocated = IsOverAllocated;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the IsOverAllocated attribute.
	*
	* @return the value of IsOverAllocated
	/**/
	public BOOLEAN getIsOverAllocated()
	{
		return this.IsOverAllocated;
	}

	/**
	* This method sets the StatusTime attribute to the given value.
	*
	* @param StatusTime DEMANDED value to set - may not be null
	**/
	public void setStatusTime(IfcDateTime StatusTime)
	{
		this.StatusTime = StatusTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the StatusTime attribute.
	*
	* @return the value of StatusTime
	/**/
	public IfcDateTime getStatusTime()
	{
		return this.StatusTime;
	}

	/**
	* This method sets the ActualWork attribute to the given value.
	*
	* @param ActualWork DEMANDED value to set - may not be null
	**/
	public void setActualWork(IfcDuration ActualWork)
	{
		this.ActualWork = ActualWork;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ActualWork attribute.
	*
	* @return the value of ActualWork
	/**/
	public IfcDuration getActualWork()
	{
		return this.ActualWork;
	}

	/**
	* This method sets the ActualUsage attribute to the given value.
	*
	* @param ActualUsage DEMANDED value to set - may not be null
	**/
	public void setActualUsage(IfcPositiveRatioMeasure ActualUsage)
	{
		this.ActualUsage = ActualUsage;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ActualUsage attribute.
	*
	* @return the value of ActualUsage
	/**/
	public IfcPositiveRatioMeasure getActualUsage()
	{
		return this.ActualUsage;
	}

	/**
	* This method sets the ActualStart attribute to the given value.
	*
	* @param ActualStart DEMANDED value to set - may not be null
	**/
	public void setActualStart(IfcDateTime ActualStart)
	{
		this.ActualStart = ActualStart;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ActualStart attribute.
	*
	* @return the value of ActualStart
	/**/
	public IfcDateTime getActualStart()
	{
		return this.ActualStart;
	}

	/**
	* This method sets the ActualFinish attribute to the given value.
	*
	* @param ActualFinish DEMANDED value to set - may not be null
	**/
	public void setActualFinish(IfcDateTime ActualFinish)
	{
		this.ActualFinish = ActualFinish;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ActualFinish attribute.
	*
	* @return the value of ActualFinish
	/**/
	public IfcDateTime getActualFinish()
	{
		return this.ActualFinish;
	}

	/**
	* This method sets the RemainingWork attribute to the given value.
	*
	* @param RemainingWork DEMANDED value to set - may not be null
	**/
	public void setRemainingWork(IfcDuration RemainingWork)
	{
		this.RemainingWork = RemainingWork;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RemainingWork attribute.
	*
	* @return the value of RemainingWork
	/**/
	public IfcDuration getRemainingWork()
	{
		return this.RemainingWork;
	}

	/**
	* This method sets the RemainingUsage attribute to the given value.
	*
	* @param RemainingUsage DEMANDED value to set - may not be null
	**/
	public void setRemainingUsage(IfcPositiveRatioMeasure RemainingUsage)
	{
		this.RemainingUsage = RemainingUsage;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RemainingUsage attribute.
	*
	* @return the value of RemainingUsage
	/**/
	public IfcPositiveRatioMeasure getRemainingUsage()
	{
		return this.RemainingUsage;
	}

	/**
	* This method sets the Completion attribute to the given value.
	*
	* @param Completion DEMANDED value to set - may not be null
	**/
	public void setCompletion(IfcPositiveRatioMeasure Completion)
	{
		this.Completion = Completion;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Completion attribute.
	*
	* @return the value of Completion
	/**/
	public IfcPositiveRatioMeasure getCompletion()
	{
		return this.Completion;
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
		IfcResourceTime ifcResourceTime = new IfcResourceTime();
		if(this.Name != null)
			ifcResourceTime.setName((IfcLabel)this.Name.clone());
		if(this.DataOrigin != null)
			ifcResourceTime.setDataOrigin((IfcDataOriginEnum)this.DataOrigin.clone());
		if(this.UserDefinedDataOrigin != null)
			ifcResourceTime.setUserDefinedDataOrigin((IfcLabel)this.UserDefinedDataOrigin.clone());
		if(this.ScheduleWork != null)
			ifcResourceTime.setScheduleWork((IfcDuration)this.ScheduleWork.clone());
		if(this.ScheduleUsage != null)
			ifcResourceTime.setScheduleUsage((IfcPositiveRatioMeasure)this.ScheduleUsage.clone());
		if(this.ScheduleStart != null)
			ifcResourceTime.setScheduleStart((IfcDateTime)this.ScheduleStart.clone());
		if(this.ScheduleFinish != null)
			ifcResourceTime.setScheduleFinish((IfcDateTime)this.ScheduleFinish.clone());
		if(this.ScheduleContour != null)
			ifcResourceTime.setScheduleContour((IfcLabel)this.ScheduleContour.clone());
		if(this.LevelingDelay != null)
			ifcResourceTime.setLevelingDelay((IfcDuration)this.LevelingDelay.clone());
		if(this.IsOverAllocated != null)
			ifcResourceTime.setIsOverAllocated((BOOLEAN)this.IsOverAllocated.clone());
		if(this.StatusTime != null)
			ifcResourceTime.setStatusTime((IfcDateTime)this.StatusTime.clone());
		if(this.ActualWork != null)
			ifcResourceTime.setActualWork((IfcDuration)this.ActualWork.clone());
		if(this.ActualUsage != null)
			ifcResourceTime.setActualUsage((IfcPositiveRatioMeasure)this.ActualUsage.clone());
		if(this.ActualStart != null)
			ifcResourceTime.setActualStart((IfcDateTime)this.ActualStart.clone());
		if(this.ActualFinish != null)
			ifcResourceTime.setActualFinish((IfcDateTime)this.ActualFinish.clone());
		if(this.RemainingWork != null)
			ifcResourceTime.setRemainingWork((IfcDuration)this.RemainingWork.clone());
		if(this.RemainingUsage != null)
			ifcResourceTime.setRemainingUsage((IfcPositiveRatioMeasure)this.RemainingUsage.clone());
		if(this.Completion != null)
			ifcResourceTime.setCompletion((IfcPositiveRatioMeasure)this.Completion.clone());
		return ifcResourceTime;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcResourceTime ifcResourceTime = new IfcResourceTime();
		if(this.Name != null)
			ifcResourceTime.setName(this.Name);
		if(this.DataOrigin != null)
			ifcResourceTime.setDataOrigin(this.DataOrigin);
		if(this.UserDefinedDataOrigin != null)
			ifcResourceTime.setUserDefinedDataOrigin(this.UserDefinedDataOrigin);
		if(this.ScheduleWork != null)
			ifcResourceTime.setScheduleWork(this.ScheduleWork);
		if(this.ScheduleUsage != null)
			ifcResourceTime.setScheduleUsage(this.ScheduleUsage);
		if(this.ScheduleStart != null)
			ifcResourceTime.setScheduleStart(this.ScheduleStart);
		if(this.ScheduleFinish != null)
			ifcResourceTime.setScheduleFinish(this.ScheduleFinish);
		if(this.ScheduleContour != null)
			ifcResourceTime.setScheduleContour(this.ScheduleContour);
		if(this.LevelingDelay != null)
			ifcResourceTime.setLevelingDelay(this.LevelingDelay);
		if(this.IsOverAllocated != null)
			ifcResourceTime.setIsOverAllocated(this.IsOverAllocated);
		if(this.StatusTime != null)
			ifcResourceTime.setStatusTime(this.StatusTime);
		if(this.ActualWork != null)
			ifcResourceTime.setActualWork(this.ActualWork);
		if(this.ActualUsage != null)
			ifcResourceTime.setActualUsage(this.ActualUsage);
		if(this.ActualStart != null)
			ifcResourceTime.setActualStart(this.ActualStart);
		if(this.ActualFinish != null)
			ifcResourceTime.setActualFinish(this.ActualFinish);
		if(this.RemainingWork != null)
			ifcResourceTime.setRemainingWork(this.RemainingWork);
		if(this.RemainingUsage != null)
			ifcResourceTime.setRemainingUsage(this.RemainingUsage);
		if(this.Completion != null)
			ifcResourceTime.setCompletion(this.Completion);
		return ifcResourceTime;
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
