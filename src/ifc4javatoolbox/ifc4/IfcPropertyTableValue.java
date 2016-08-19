/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcPropertyTableValue<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPropertyTableValue extends IfcSimpleProperty implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcText","LIST<IfcValue>","LIST<IfcValue>","IfcText","IfcUnit","IfcUnit","IfcCurveInterpolationEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** DefiningValues is an OPTIONAL attribute**/
	protected LIST<IfcValue> DefiningValues;
	/** DefinedValues is an OPTIONAL attribute**/
	protected LIST<IfcValue> DefinedValues;
	/** Expression is an OPTIONAL attribute**/
	protected IfcText Expression;
	/** DefiningUnit is an OPTIONAL attribute**/
	protected IfcUnit DefiningUnit;
	/** DefinedUnit is an OPTIONAL attribute**/
	protected IfcUnit DefinedUnit;
	/** CurveInterpolation is an OPTIONAL attribute**/
	protected IfcCurveInterpolationEnum CurveInterpolation;
	/**
	* The default constructor.
	**/
	public IfcPropertyTableValue(){}

	/**
	* Constructs a new IfcPropertyTableValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param DefiningValues OPTIONAL parameter of type LIST<IfcValue>
	* @param DefinedValues OPTIONAL parameter of type LIST<IfcValue>
	* @param Expression OPTIONAL parameter of type IfcText
	* @param DefiningUnit OPTIONAL parameter of type IfcUnit
	* @param DefinedUnit OPTIONAL parameter of type IfcUnit
	* @param CurveInterpolation OPTIONAL parameter of type IfcCurveInterpolationEnum
	**/
	public IfcPropertyTableValue(IfcIdentifier Name, IfcText Description, LIST<IfcValue> DefiningValues, LIST<IfcValue> DefinedValues, IfcText Expression, IfcUnit DefiningUnit, IfcUnit DefinedUnit, IfcCurveInterpolationEnum CurveInterpolation)
	{
		this.Name = Name;
		this.Description = Description;
		this.DefiningValues = DefiningValues;
		this.DefinedValues = DefinedValues;
		this.Expression = Expression;
		this.DefiningUnit = DefiningUnit;
		this.DefinedUnit = DefinedUnit;
		this.CurveInterpolation = CurveInterpolation;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPropertyTableValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param DefiningValues OPTIONAL parameter of type LIST<IfcValue>
	* @param DefinedValues OPTIONAL parameter of type LIST<IfcValue>
	* @param Expression OPTIONAL parameter of type IfcText
	* @param DefiningUnit OPTIONAL parameter of type IfcUnit
	* @param DefinedUnit OPTIONAL parameter of type IfcUnit
	* @param CurveInterpolation OPTIONAL parameter of type IfcCurveInterpolationEnum
	**/
	public void setParameters(IfcIdentifier Name, IfcText Description, LIST<IfcValue> DefiningValues, LIST<IfcValue> DefinedValues, IfcText Expression, IfcUnit DefiningUnit, IfcUnit DefinedUnit, IfcCurveInterpolationEnum CurveInterpolation)
	{
		this.Name = Name;
		this.Description = Description;
		this.DefiningValues = DefiningValues;
		this.DefinedValues = DefinedValues;
		this.Expression = Expression;
		this.DefiningUnit = DefiningUnit;
		this.DefinedUnit = DefinedUnit;
		this.CurveInterpolation = CurveInterpolation;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcIdentifier) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.DefiningValues = (LIST<IfcValue>) parameters.get(2);
		this.DefinedValues = (LIST<IfcValue>) parameters.get(3);
		this.Expression = (IfcText) parameters.get(4);
		this.DefiningUnit = (IfcUnit) parameters.get(5);
		this.DefinedUnit = (IfcUnit) parameters.get(6);
		this.CurveInterpolation = (IfcCurveInterpolationEnum) parameters.get(7);
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
		return IfcPropertyTableValue.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPROPERTYTABLEVALUE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DefiningValues")) stepString = stepString.concat("*,");
		else{
		if(this.DefiningValues != null)		stepString = stepString.concat(((RootInterface)this.DefiningValues).getStepParameter(IfcValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DefinedValues")) stepString = stepString.concat("*,");
		else{
		if(this.DefinedValues != null)		stepString = stepString.concat(((RootInterface)this.DefinedValues).getStepParameter(IfcValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Expression")) stepString = stepString.concat("*,");
		else{
		if(this.Expression != null)		stepString = stepString.concat(((RootInterface)this.Expression).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DefiningUnit")) stepString = stepString.concat("*,");
		else{
		if(this.DefiningUnit != null)		stepString = stepString.concat(((RootInterface)this.DefiningUnit).getStepParameter(IfcUnit.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DefinedUnit")) stepString = stepString.concat("*,");
		else{
		if(this.DefinedUnit != null)		stepString = stepString.concat(((RootInterface)this.DefinedUnit).getStepParameter(IfcUnit.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CurveInterpolation")) stepString = stepString.concat("*);");
		else{
		if(this.CurveInterpolation != null)		stepString = stepString.concat(((RootInterface)this.CurveInterpolation).getStepParameter(IfcCurveInterpolationEnum.class.isInterface())+");");
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
	* This method sets the DefiningValues attribute to the given value.
	*
	* @param DefiningValues DEMANDED value to set - may not be null
	**/
	public void setDefiningValues(LIST<IfcValue> DefiningValues)
	{
		this.DefiningValues = DefiningValues;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the DefiningValues attribute.
	*
	* @return a copy of the DefiningValues list
	**/
	public LIST<IfcValue> getDefiningValues()
	{
		if(this.DefiningValues != null)
			return new LIST<IfcValue>(this.DefiningValues);
		return null;
	}

	/**
	* This method adds an IfcValue object to the DefiningValues list.
	* @param DefiningValues element to be appended to this list.
	**/
	public void addDefiningValues(IfcValue DefiningValues)
	{
		if(this.DefiningValues == null)
			this.DefiningValues = new LIST<IfcValue>();
		this.DefiningValues.add(DefiningValues);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcValue objects to the DefiningValues list.
	* @param DefiningValues collection containing elements to be added to this list.
	**/
	public void addAllDefiningValues(java.util.Collection<IfcValue> DefiningValues)
	{
		if(this.DefiningValues == null)
			this.DefiningValues = new LIST<IfcValue>();
		this.DefiningValues.addAll(DefiningValues);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the DefiningValues list.
	**/
	public void clearDefiningValues()
	{
		if(this.DefiningValues != null)
		{
			this.DefiningValues.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcValue object from the DefiningValues list.
	* @param DefiningValues element to be removed from this list.
	**/
	public void removeDefiningValues(IfcValue DefiningValues)
	{
		if(this.DefiningValues != null)
		{
			this.DefiningValues.remove(DefiningValues);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcValue objects from the DefiningValues list.
	* @param DefiningValues collection containing elements to be removed from this list.
	**/
	public void removeAllDefiningValues(java.util.Collection<IfcValue> DefiningValues)
	{
		if(this.DefiningValues != null)
		{
			this.DefiningValues.removeAll(DefiningValues);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the DefinedValues attribute to the given value.
	*
	* @param DefinedValues DEMANDED value to set - may not be null
	**/
	public void setDefinedValues(LIST<IfcValue> DefinedValues)
	{
		this.DefinedValues = DefinedValues;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the DefinedValues attribute.
	*
	* @return a copy of the DefinedValues list
	**/
	public LIST<IfcValue> getDefinedValues()
	{
		if(this.DefinedValues != null)
			return new LIST<IfcValue>(this.DefinedValues);
		return null;
	}

	/**
	* This method adds an IfcValue object to the DefinedValues list.
	* @param DefinedValues element to be appended to this list.
	**/
	public void addDefinedValues(IfcValue DefinedValues)
	{
		if(this.DefinedValues == null)
			this.DefinedValues = new LIST<IfcValue>();
		this.DefinedValues.add(DefinedValues);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcValue objects to the DefinedValues list.
	* @param DefinedValues collection containing elements to be added to this list.
	**/
	public void addAllDefinedValues(java.util.Collection<IfcValue> DefinedValues)
	{
		if(this.DefinedValues == null)
			this.DefinedValues = new LIST<IfcValue>();
		this.DefinedValues.addAll(DefinedValues);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the DefinedValues list.
	**/
	public void clearDefinedValues()
	{
		if(this.DefinedValues != null)
		{
			this.DefinedValues.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcValue object from the DefinedValues list.
	* @param DefinedValues element to be removed from this list.
	**/
	public void removeDefinedValues(IfcValue DefinedValues)
	{
		if(this.DefinedValues != null)
		{
			this.DefinedValues.remove(DefinedValues);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcValue objects from the DefinedValues list.
	* @param DefinedValues collection containing elements to be removed from this list.
	**/
	public void removeAllDefinedValues(java.util.Collection<IfcValue> DefinedValues)
	{
		if(this.DefinedValues != null)
		{
			this.DefinedValues.removeAll(DefinedValues);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Expression attribute to the given value.
	*
	* @param Expression DEMANDED value to set - may not be null
	**/
	public void setExpression(IfcText Expression)
	{
		this.Expression = Expression;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Expression attribute.
	*
	* @return the value of Expression
	/**/
	public IfcText getExpression()
	{
		return this.Expression;
	}

	/**
	* This method sets the DefiningUnit attribute to the given value.
	*
	* @param DefiningUnit DEMANDED value to set - may not be null
	**/
	public void setDefiningUnit(IfcUnit DefiningUnit)
	{
		this.DefiningUnit = DefiningUnit;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DefiningUnit attribute.
	*
	* @return the value of DefiningUnit
	/**/
	public IfcUnit getDefiningUnit()
	{
		return this.DefiningUnit;
	}

	/**
	* This method sets the DefinedUnit attribute to the given value.
	*
	* @param DefinedUnit DEMANDED value to set - may not be null
	**/
	public void setDefinedUnit(IfcUnit DefinedUnit)
	{
		this.DefinedUnit = DefinedUnit;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DefinedUnit attribute.
	*
	* @return the value of DefinedUnit
	/**/
	public IfcUnit getDefinedUnit()
	{
		return this.DefinedUnit;
	}

	/**
	* This method sets the CurveInterpolation attribute to the given value.
	*
	* @param CurveInterpolation DEMANDED value to set - may not be null
	**/
	public void setCurveInterpolation(IfcCurveInterpolationEnum CurveInterpolation)
	{
		this.CurveInterpolation = CurveInterpolation;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CurveInterpolation attribute.
	*
	* @return the value of CurveInterpolation
	/**/
	public IfcCurveInterpolationEnum getCurveInterpolation()
	{
		return this.CurveInterpolation;
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
		IfcPropertyTableValue ifcPropertyTableValue = new IfcPropertyTableValue();
		if(this.Name != null)
			ifcPropertyTableValue.setName((IfcIdentifier)this.Name.clone());
		if(this.Description != null)
			ifcPropertyTableValue.setDescription((IfcText)this.Description.clone());
		if(this.DefiningValues != null)
			ifcPropertyTableValue.setDefiningValues((LIST<IfcValue>)this.DefiningValues.clone());
		if(this.DefinedValues != null)
			ifcPropertyTableValue.setDefinedValues((LIST<IfcValue>)this.DefinedValues.clone());
		if(this.Expression != null)
			ifcPropertyTableValue.setExpression((IfcText)this.Expression.clone());
		if(this.DefiningUnit != null)
			ifcPropertyTableValue.setDefiningUnit((IfcUnit)this.DefiningUnit.clone());
		if(this.DefinedUnit != null)
			ifcPropertyTableValue.setDefinedUnit((IfcUnit)this.DefinedUnit.clone());
		if(this.CurveInterpolation != null)
			ifcPropertyTableValue.setCurveInterpolation((IfcCurveInterpolationEnum)this.CurveInterpolation.clone());
		return ifcPropertyTableValue;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPropertyTableValue ifcPropertyTableValue = new IfcPropertyTableValue();
		if(this.Name != null)
			ifcPropertyTableValue.setName(this.Name);
		if(this.Description != null)
			ifcPropertyTableValue.setDescription(this.Description);
		if(this.DefiningValues != null)
			ifcPropertyTableValue.setDefiningValues(this.DefiningValues);
		if(this.DefinedValues != null)
			ifcPropertyTableValue.setDefinedValues(this.DefinedValues);
		if(this.Expression != null)
			ifcPropertyTableValue.setExpression(this.Expression);
		if(this.DefiningUnit != null)
			ifcPropertyTableValue.setDefiningUnit(this.DefiningUnit);
		if(this.DefinedUnit != null)
			ifcPropertyTableValue.setDefinedUnit(this.DefinedUnit);
		if(this.CurveInterpolation != null)
			ifcPropertyTableValue.setCurveInterpolation(this.CurveInterpolation);
		return ifcPropertyTableValue;
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
