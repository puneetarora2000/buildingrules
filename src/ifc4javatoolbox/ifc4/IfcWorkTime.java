/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcWorkTime<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcWorkTime extends IfcSchedulingTime implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcDataOriginEnum","IfcLabel","IfcRecurrencePattern","IfcDate","IfcDate"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RecurrencePattern is an OPTIONAL attribute**/
	protected IfcRecurrencePattern RecurrencePattern;
	/** Start is an OPTIONAL attribute**/
	protected IfcDate Start;
	/** Finish is an OPTIONAL attribute**/
	protected IfcDate Finish;
	/**
	* The default constructor.
	**/
	public IfcWorkTime(){}

	/**
	* Constructs a new IfcWorkTime object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param DataOrigin OPTIONAL parameter of type IfcDataOriginEnum
	* @param UserDefinedDataOrigin OPTIONAL parameter of type IfcLabel
	* @param RecurrencePattern OPTIONAL parameter of type IfcRecurrencePattern
	* @param Start OPTIONAL parameter of type IfcDate
	* @param Finish OPTIONAL parameter of type IfcDate
	**/
	public IfcWorkTime(IfcLabel Name, IfcDataOriginEnum DataOrigin, IfcLabel UserDefinedDataOrigin, IfcRecurrencePattern RecurrencePattern, IfcDate Start, IfcDate Finish)
	{
		this.Name = Name;
		this.DataOrigin = DataOrigin;
		this.UserDefinedDataOrigin = UserDefinedDataOrigin;
		this.RecurrencePattern = RecurrencePattern;
		this.Start = Start;
		this.Finish = Finish;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcWorkTime object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param DataOrigin OPTIONAL parameter of type IfcDataOriginEnum
	* @param UserDefinedDataOrigin OPTIONAL parameter of type IfcLabel
	* @param RecurrencePattern OPTIONAL parameter of type IfcRecurrencePattern
	* @param Start OPTIONAL parameter of type IfcDate
	* @param Finish OPTIONAL parameter of type IfcDate
	**/
	public void setParameters(IfcLabel Name, IfcDataOriginEnum DataOrigin, IfcLabel UserDefinedDataOrigin, IfcRecurrencePattern RecurrencePattern, IfcDate Start, IfcDate Finish)
	{
		this.Name = Name;
		this.DataOrigin = DataOrigin;
		this.UserDefinedDataOrigin = UserDefinedDataOrigin;
		this.RecurrencePattern = RecurrencePattern;
		this.Start = Start;
		this.Finish = Finish;
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
		this.RecurrencePattern = (IfcRecurrencePattern) parameters.get(3);
		this.Start = (IfcDate) parameters.get(4);
		this.Finish = (IfcDate) parameters.get(5);
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
		return IfcWorkTime.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCWORKTIME(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RecurrencePattern")) stepString = stepString.concat("*,");
		else{
		if(this.RecurrencePattern != null)		stepString = stepString.concat(((RootInterface)this.RecurrencePattern).getStepParameter(IfcRecurrencePattern.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Start")) stepString = stepString.concat("*,");
		else{
		if(this.Start != null)		stepString = stepString.concat(((RootInterface)this.Start).getStepParameter(IfcDate.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Finish")) stepString = stepString.concat("*);");
		else{
		if(this.Finish != null)		stepString = stepString.concat(((RootInterface)this.Finish).getStepParameter(IfcDate.class.isInterface())+");");
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
	* This method sets the RecurrencePattern attribute to the given value.
	*
	* @param RecurrencePattern DEMANDED value to set - may not be null
	**/
	public void setRecurrencePattern(IfcRecurrencePattern RecurrencePattern)
	{
		this.RecurrencePattern = RecurrencePattern;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RecurrencePattern attribute.
	*
	* @return the value of RecurrencePattern
	/**/
	public IfcRecurrencePattern getRecurrencePattern()
	{
		return this.RecurrencePattern;
	}

	/**
	* This method sets the Start attribute to the given value.
	*
	* @param Start DEMANDED value to set - may not be null
	**/
	public void setStart(IfcDate Start)
	{
		this.Start = Start;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Start attribute.
	*
	* @return the value of Start
	/**/
	public IfcDate getStart()
	{
		return this.Start;
	}

	/**
	* This method sets the Finish attribute to the given value.
	*
	* @param Finish DEMANDED value to set - may not be null
	**/
	public void setFinish(IfcDate Finish)
	{
		this.Finish = Finish;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Finish attribute.
	*
	* @return the value of Finish
	/**/
	public IfcDate getFinish()
	{
		return this.Finish;
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
		IfcWorkTime ifcWorkTime = new IfcWorkTime();
		if(this.Name != null)
			ifcWorkTime.setName((IfcLabel)this.Name.clone());
		if(this.DataOrigin != null)
			ifcWorkTime.setDataOrigin((IfcDataOriginEnum)this.DataOrigin.clone());
		if(this.UserDefinedDataOrigin != null)
			ifcWorkTime.setUserDefinedDataOrigin((IfcLabel)this.UserDefinedDataOrigin.clone());
		if(this.RecurrencePattern != null)
			ifcWorkTime.setRecurrencePattern((IfcRecurrencePattern)this.RecurrencePattern.clone());
		if(this.Start != null)
			ifcWorkTime.setStart((IfcDate)this.Start.clone());
		if(this.Finish != null)
			ifcWorkTime.setFinish((IfcDate)this.Finish.clone());
		return ifcWorkTime;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcWorkTime ifcWorkTime = new IfcWorkTime();
		if(this.Name != null)
			ifcWorkTime.setName(this.Name);
		if(this.DataOrigin != null)
			ifcWorkTime.setDataOrigin(this.DataOrigin);
		if(this.UserDefinedDataOrigin != null)
			ifcWorkTime.setUserDefinedDataOrigin(this.UserDefinedDataOrigin);
		if(this.RecurrencePattern != null)
			ifcWorkTime.setRecurrencePattern(this.RecurrencePattern);
		if(this.Start != null)
			ifcWorkTime.setStart(this.Start);
		if(this.Finish != null)
			ifcWorkTime.setFinish(this.Finish);
		return ifcWorkTime;
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
