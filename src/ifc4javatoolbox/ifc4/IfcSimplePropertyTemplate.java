/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcSimplePropertyTemplate<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSimplePropertyTemplate extends IfcPropertyTemplate implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcSimplePropertyTemplateTypeEnum","IfcLabel","IfcLabel","IfcPropertyEnumeration","IfcUnit","IfcUnit","IfcLabel","IfcStateEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** TemplateType is an OPTIONAL attribute**/
	protected IfcSimplePropertyTemplateTypeEnum TemplateType;
	/** PrimaryMeasureType is an OPTIONAL attribute**/
	protected IfcLabel PrimaryMeasureType;
	/** SecondaryMeasureType is an OPTIONAL attribute**/
	protected IfcLabel SecondaryMeasureType;
	/** Enumerators is an OPTIONAL attribute**/
	protected IfcPropertyEnumeration Enumerators;
	/** PrimaryUnit is an OPTIONAL attribute**/
	protected IfcUnit PrimaryUnit;
	/** SecondaryUnit is an OPTIONAL attribute**/
	protected IfcUnit SecondaryUnit;
	/** Expression is an OPTIONAL attribute**/
	protected IfcLabel Expression;
	/** AccessState is an OPTIONAL attribute**/
	protected IfcStateEnum AccessState;
	/**
	* The default constructor.
	**/
	public IfcSimplePropertyTemplate(){}

	/**
	* Constructs a new IfcSimplePropertyTemplate object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param TemplateType OPTIONAL parameter of type IfcSimplePropertyTemplateTypeEnum
	* @param PrimaryMeasureType OPTIONAL parameter of type IfcLabel
	* @param SecondaryMeasureType OPTIONAL parameter of type IfcLabel
	* @param Enumerators OPTIONAL parameter of type IfcPropertyEnumeration
	* @param PrimaryUnit OPTIONAL parameter of type IfcUnit
	* @param SecondaryUnit OPTIONAL parameter of type IfcUnit
	* @param Expression OPTIONAL parameter of type IfcLabel
	* @param AccessState OPTIONAL parameter of type IfcStateEnum
	**/
	public IfcSimplePropertyTemplate(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcSimplePropertyTemplateTypeEnum TemplateType, IfcLabel PrimaryMeasureType, IfcLabel SecondaryMeasureType, IfcPropertyEnumeration Enumerators, IfcUnit PrimaryUnit, IfcUnit SecondaryUnit, IfcLabel Expression, IfcStateEnum AccessState)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.TemplateType = TemplateType;
		this.PrimaryMeasureType = PrimaryMeasureType;
		this.SecondaryMeasureType = SecondaryMeasureType;
		this.Enumerators = Enumerators;
		this.PrimaryUnit = PrimaryUnit;
		this.SecondaryUnit = SecondaryUnit;
		this.Expression = Expression;
		this.AccessState = AccessState;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSimplePropertyTemplate object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param TemplateType OPTIONAL parameter of type IfcSimplePropertyTemplateTypeEnum
	* @param PrimaryMeasureType OPTIONAL parameter of type IfcLabel
	* @param SecondaryMeasureType OPTIONAL parameter of type IfcLabel
	* @param Enumerators OPTIONAL parameter of type IfcPropertyEnumeration
	* @param PrimaryUnit OPTIONAL parameter of type IfcUnit
	* @param SecondaryUnit OPTIONAL parameter of type IfcUnit
	* @param Expression OPTIONAL parameter of type IfcLabel
	* @param AccessState OPTIONAL parameter of type IfcStateEnum
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcSimplePropertyTemplateTypeEnum TemplateType, IfcLabel PrimaryMeasureType, IfcLabel SecondaryMeasureType, IfcPropertyEnumeration Enumerators, IfcUnit PrimaryUnit, IfcUnit SecondaryUnit, IfcLabel Expression, IfcStateEnum AccessState)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.TemplateType = TemplateType;
		this.PrimaryMeasureType = PrimaryMeasureType;
		this.SecondaryMeasureType = SecondaryMeasureType;
		this.Enumerators = Enumerators;
		this.PrimaryUnit = PrimaryUnit;
		this.SecondaryUnit = SecondaryUnit;
		this.Expression = Expression;
		this.AccessState = AccessState;
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
		this.TemplateType = (IfcSimplePropertyTemplateTypeEnum) parameters.get(4);
		this.PrimaryMeasureType = (IfcLabel) parameters.get(5);
		this.SecondaryMeasureType = (IfcLabel) parameters.get(6);
		this.Enumerators = (IfcPropertyEnumeration) parameters.get(7);
		this.PrimaryUnit = (IfcUnit) parameters.get(8);
		this.SecondaryUnit = (IfcUnit) parameters.get(9);
		this.Expression = (IfcLabel) parameters.get(10);
		this.AccessState = (IfcStateEnum) parameters.get(11);
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
		return IfcSimplePropertyTemplate.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSIMPLEPROPERTYTEMPLATE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("TemplateType")) stepString = stepString.concat("*,");
		else{
		if(this.TemplateType != null)		stepString = stepString.concat(((RootInterface)this.TemplateType).getStepParameter(IfcSimplePropertyTemplateTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PrimaryMeasureType")) stepString = stepString.concat("*,");
		else{
		if(this.PrimaryMeasureType != null)		stepString = stepString.concat(((RootInterface)this.PrimaryMeasureType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SecondaryMeasureType")) stepString = stepString.concat("*,");
		else{
		if(this.SecondaryMeasureType != null)		stepString = stepString.concat(((RootInterface)this.SecondaryMeasureType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Enumerators")) stepString = stepString.concat("*,");
		else{
		if(this.Enumerators != null)		stepString = stepString.concat(((RootInterface)this.Enumerators).getStepParameter(IfcPropertyEnumeration.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PrimaryUnit")) stepString = stepString.concat("*,");
		else{
		if(this.PrimaryUnit != null)		stepString = stepString.concat(((RootInterface)this.PrimaryUnit).getStepParameter(IfcUnit.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SecondaryUnit")) stepString = stepString.concat("*,");
		else{
		if(this.SecondaryUnit != null)		stepString = stepString.concat(((RootInterface)this.SecondaryUnit).getStepParameter(IfcUnit.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Expression")) stepString = stepString.concat("*,");
		else{
		if(this.Expression != null)		stepString = stepString.concat(((RootInterface)this.Expression).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("AccessState")) stepString = stepString.concat("*);");
		else{
		if(this.AccessState != null)		stepString = stepString.concat(((RootInterface)this.AccessState).getStepParameter(IfcStateEnum.class.isInterface())+");");
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
	* This method sets the TemplateType attribute to the given value.
	*
	* @param TemplateType DEMANDED value to set - may not be null
	**/
	public void setTemplateType(IfcSimplePropertyTemplateTypeEnum TemplateType)
	{
		this.TemplateType = TemplateType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TemplateType attribute.
	*
	* @return the value of TemplateType
	/**/
	public IfcSimplePropertyTemplateTypeEnum getTemplateType()
	{
		return this.TemplateType;
	}

	/**
	* This method sets the PrimaryMeasureType attribute to the given value.
	*
	* @param PrimaryMeasureType DEMANDED value to set - may not be null
	**/
	public void setPrimaryMeasureType(IfcLabel PrimaryMeasureType)
	{
		this.PrimaryMeasureType = PrimaryMeasureType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PrimaryMeasureType attribute.
	*
	* @return the value of PrimaryMeasureType
	/**/
	public IfcLabel getPrimaryMeasureType()
	{
		return this.PrimaryMeasureType;
	}

	/**
	* This method sets the SecondaryMeasureType attribute to the given value.
	*
	* @param SecondaryMeasureType DEMANDED value to set - may not be null
	**/
	public void setSecondaryMeasureType(IfcLabel SecondaryMeasureType)
	{
		this.SecondaryMeasureType = SecondaryMeasureType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SecondaryMeasureType attribute.
	*
	* @return the value of SecondaryMeasureType
	/**/
	public IfcLabel getSecondaryMeasureType()
	{
		return this.SecondaryMeasureType;
	}

	/**
	* This method sets the Enumerators attribute to the given value.
	*
	* @param Enumerators DEMANDED value to set - may not be null
	**/
	public void setEnumerators(IfcPropertyEnumeration Enumerators)
	{
		this.Enumerators = Enumerators;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Enumerators attribute.
	*
	* @return the value of Enumerators
	/**/
	public IfcPropertyEnumeration getEnumerators()
	{
		return this.Enumerators;
	}

	/**
	* This method sets the PrimaryUnit attribute to the given value.
	*
	* @param PrimaryUnit DEMANDED value to set - may not be null
	**/
	public void setPrimaryUnit(IfcUnit PrimaryUnit)
	{
		this.PrimaryUnit = PrimaryUnit;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PrimaryUnit attribute.
	*
	* @return the value of PrimaryUnit
	/**/
	public IfcUnit getPrimaryUnit()
	{
		return this.PrimaryUnit;
	}

	/**
	* This method sets the SecondaryUnit attribute to the given value.
	*
	* @param SecondaryUnit DEMANDED value to set - may not be null
	**/
	public void setSecondaryUnit(IfcUnit SecondaryUnit)
	{
		this.SecondaryUnit = SecondaryUnit;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SecondaryUnit attribute.
	*
	* @return the value of SecondaryUnit
	/**/
	public IfcUnit getSecondaryUnit()
	{
		return this.SecondaryUnit;
	}

	/**
	* This method sets the Expression attribute to the given value.
	*
	* @param Expression DEMANDED value to set - may not be null
	**/
	public void setExpression(IfcLabel Expression)
	{
		this.Expression = Expression;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Expression attribute.
	*
	* @return the value of Expression
	/**/
	public IfcLabel getExpression()
	{
		return this.Expression;
	}

	/**
	* This method sets the AccessState attribute to the given value.
	*
	* @param AccessState DEMANDED value to set - may not be null
	**/
	public void setAccessState(IfcStateEnum AccessState)
	{
		this.AccessState = AccessState;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the AccessState attribute.
	*
	* @return the value of AccessState
	/**/
	public IfcStateEnum getAccessState()
	{
		return this.AccessState;
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
		IfcSimplePropertyTemplate ifcSimplePropertyTemplate = new IfcSimplePropertyTemplate();
		if(this.GlobalId != null)
			ifcSimplePropertyTemplate.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcSimplePropertyTemplate.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcSimplePropertyTemplate.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcSimplePropertyTemplate.setDescription((IfcText)this.Description.clone());
		if(this.TemplateType != null)
			ifcSimplePropertyTemplate.setTemplateType((IfcSimplePropertyTemplateTypeEnum)this.TemplateType.clone());
		if(this.PrimaryMeasureType != null)
			ifcSimplePropertyTemplate.setPrimaryMeasureType((IfcLabel)this.PrimaryMeasureType.clone());
		if(this.SecondaryMeasureType != null)
			ifcSimplePropertyTemplate.setSecondaryMeasureType((IfcLabel)this.SecondaryMeasureType.clone());
		if(this.Enumerators != null)
			ifcSimplePropertyTemplate.setEnumerators((IfcPropertyEnumeration)this.Enumerators.clone());
		if(this.PrimaryUnit != null)
			ifcSimplePropertyTemplate.setPrimaryUnit((IfcUnit)this.PrimaryUnit.clone());
		if(this.SecondaryUnit != null)
			ifcSimplePropertyTemplate.setSecondaryUnit((IfcUnit)this.SecondaryUnit.clone());
		if(this.Expression != null)
			ifcSimplePropertyTemplate.setExpression((IfcLabel)this.Expression.clone());
		if(this.AccessState != null)
			ifcSimplePropertyTemplate.setAccessState((IfcStateEnum)this.AccessState.clone());
		return ifcSimplePropertyTemplate;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSimplePropertyTemplate ifcSimplePropertyTemplate = new IfcSimplePropertyTemplate();
		if(this.GlobalId != null)
			ifcSimplePropertyTemplate.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcSimplePropertyTemplate.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcSimplePropertyTemplate.setName(this.Name);
		if(this.Description != null)
			ifcSimplePropertyTemplate.setDescription(this.Description);
		if(this.TemplateType != null)
			ifcSimplePropertyTemplate.setTemplateType(this.TemplateType);
		if(this.PrimaryMeasureType != null)
			ifcSimplePropertyTemplate.setPrimaryMeasureType(this.PrimaryMeasureType);
		if(this.SecondaryMeasureType != null)
			ifcSimplePropertyTemplate.setSecondaryMeasureType(this.SecondaryMeasureType);
		if(this.Enumerators != null)
			ifcSimplePropertyTemplate.setEnumerators(this.Enumerators);
		if(this.PrimaryUnit != null)
			ifcSimplePropertyTemplate.setPrimaryUnit(this.PrimaryUnit);
		if(this.SecondaryUnit != null)
			ifcSimplePropertyTemplate.setSecondaryUnit(this.SecondaryUnit);
		if(this.Expression != null)
			ifcSimplePropertyTemplate.setExpression(this.Expression);
		if(this.AccessState != null)
			ifcSimplePropertyTemplate.setAccessState(this.AccessState);
		return ifcSimplePropertyTemplate;
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
