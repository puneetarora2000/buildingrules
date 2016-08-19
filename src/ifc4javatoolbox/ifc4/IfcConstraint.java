/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcConstraint<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcConstraint extends InternalAccessClass implements IfcResourceObjectSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcConstraintEnum","IfcLabel","IfcActorSelect","IfcDateTime","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** ConstraintGrade is an DEMANDED attribute - may not be null**/
	protected IfcConstraintEnum ConstraintGrade;
	/** ConstraintSource is an OPTIONAL attribute**/
	protected IfcLabel ConstraintSource;
	/** CreatingActor is an OPTIONAL attribute**/
	protected IfcActorSelect CreatingActor;
	/** CreationTime is an OPTIONAL attribute**/
	protected IfcDateTime CreationTime;
	/** UserDefinedGrade is an OPTIONAL attribute**/
	protected IfcLabel UserDefinedGrade;
	protected SET<IfcExternalReferenceRelationship> HasExternalReferences_Inverse;
	protected SET<IfcResourceConstraintRelationship> PropertiesForConstraint_Inverse;
	/**
	* The default constructor.
	**/
	public IfcConstraint(){}

	/**
	* Constructs a new IfcConstraint object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConstraintGrade DEMANDED parameter of type IfcConstraintEnum - may not be null.
	* @param ConstraintSource OPTIONAL parameter of type IfcLabel
	* @param CreatingActor OPTIONAL parameter of type IfcActorSelect
	* @param CreationTime OPTIONAL parameter of type IfcDateTime
	* @param UserDefinedGrade OPTIONAL parameter of type IfcLabel
	**/
	public IfcConstraint(IfcLabel Name, IfcText Description, IfcConstraintEnum ConstraintGrade, IfcLabel ConstraintSource, IfcActorSelect CreatingActor, IfcDateTime CreationTime, IfcLabel UserDefinedGrade)
	{
		this.Name = Name;
		this.Description = Description;
		this.ConstraintGrade = ConstraintGrade;
		this.ConstraintSource = ConstraintSource;
		this.CreatingActor = CreatingActor;
		this.CreationTime = CreationTime;
		this.UserDefinedGrade = UserDefinedGrade;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcConstraint object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConstraintGrade DEMANDED parameter of type IfcConstraintEnum - may not be null.
	* @param ConstraintSource OPTIONAL parameter of type IfcLabel
	* @param CreatingActor OPTIONAL parameter of type IfcActorSelect
	* @param CreationTime OPTIONAL parameter of type IfcDateTime
	* @param UserDefinedGrade OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcConstraintEnum ConstraintGrade, IfcLabel ConstraintSource, IfcActorSelect CreatingActor, IfcDateTime CreationTime, IfcLabel UserDefinedGrade)
	{
		this.Name = Name;
		this.Description = Description;
		this.ConstraintGrade = ConstraintGrade;
		this.ConstraintSource = ConstraintSource;
		this.CreatingActor = CreatingActor;
		this.CreationTime = CreationTime;
		this.UserDefinedGrade = UserDefinedGrade;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.ConstraintGrade = (IfcConstraintEnum) parameters.get(2);
		this.ConstraintSource = (IfcLabel) parameters.get(3);
		this.CreatingActor = (IfcActorSelect) parameters.get(4);
		this.CreationTime = (IfcDateTime) parameters.get(5);
		this.UserDefinedGrade = (IfcLabel) parameters.get(6);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		HasExternalReferences_Inverse = null;
		PropertiesForConstraint_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcConstraint.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCONSTRAINT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ConstraintGrade")) stepString = stepString.concat("*,");
		else{
		if(this.ConstraintGrade != null)		stepString = stepString.concat(((RootInterface)this.ConstraintGrade).getStepParameter(IfcConstraintEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ConstraintSource")) stepString = stepString.concat("*,");
		else{
		if(this.ConstraintSource != null)		stepString = stepString.concat(((RootInterface)this.ConstraintSource).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CreatingActor")) stepString = stepString.concat("*,");
		else{
		if(this.CreatingActor != null)		stepString = stepString.concat(((RootInterface)this.CreatingActor).getStepParameter(IfcActorSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CreationTime")) stepString = stepString.concat("*,");
		else{
		if(this.CreationTime != null)		stepString = stepString.concat(((RootInterface)this.CreationTime).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedGrade")) stepString = stepString.concat("*);");
		else{
		if(this.UserDefinedGrade != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedGrade).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method returns a copy of the set of the HasExternalReferences_Inverse attribute.
	*
	* @return a copy of the HasExternalReferences_Inverse set
	**/
	public SET<IfcExternalReferenceRelationship> getHasExternalReferences_Inverse()
	{
		if(this.HasExternalReferences_Inverse != null)
			return new SET<IfcExternalReferenceRelationship>(this.HasExternalReferences_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the PropertiesForConstraint_Inverse attribute.
	*
	* @return a copy of the PropertiesForConstraint_Inverse set
	**/
	public SET<IfcResourceConstraintRelationship> getPropertiesForConstraint_Inverse()
	{
		if(this.PropertiesForConstraint_Inverse != null)
			return new SET<IfcResourceConstraintRelationship>(this.PropertiesForConstraint_Inverse);
		return null;
	}

	/**
	* This method sets the Name attribute to the given value.
	*
	* @param Name OPTIONAL value to set
	**/
	public void setName(IfcLabel Name)
	{
		this.Name = Name;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Name attribute.
	*
	* @return the value of Name
	/**/
	public IfcLabel getName()
	{
		return this.Name;
	}

	/**
	* This method sets the Description attribute to the given value.
	*
	* @param Description DEMANDED value to set - may not be null
	**/
	public void setDescription(IfcText Description)
	{
		this.Description = Description;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Description attribute.
	*
	* @return the value of Description
	/**/
	public IfcText getDescription()
	{
		return this.Description;
	}

	/**
	* This method sets the ConstraintGrade attribute to the given value.
	*
	* @param ConstraintGrade OPTIONAL value to set
	**/
	public void setConstraintGrade(IfcConstraintEnum ConstraintGrade)
	{
		this.ConstraintGrade = ConstraintGrade;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ConstraintGrade attribute.
	*
	* @return the value of ConstraintGrade
	/**/
	public IfcConstraintEnum getConstraintGrade()
	{
		return this.ConstraintGrade;
	}

	/**
	* This method sets the ConstraintSource attribute to the given value.
	*
	* @param ConstraintSource DEMANDED value to set - may not be null
	**/
	public void setConstraintSource(IfcLabel ConstraintSource)
	{
		this.ConstraintSource = ConstraintSource;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ConstraintSource attribute.
	*
	* @return the value of ConstraintSource
	/**/
	public IfcLabel getConstraintSource()
	{
		return this.ConstraintSource;
	}

	/**
	* This method sets the CreatingActor attribute to the given value.
	*
	* @param CreatingActor DEMANDED value to set - may not be null
	**/
	public void setCreatingActor(IfcActorSelect CreatingActor)
	{
		this.CreatingActor = CreatingActor;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CreatingActor attribute.
	*
	* @return the value of CreatingActor
	/**/
	public IfcActorSelect getCreatingActor()
	{
		return this.CreatingActor;
	}

	/**
	* This method sets the CreationTime attribute to the given value.
	*
	* @param CreationTime DEMANDED value to set - may not be null
	**/
	public void setCreationTime(IfcDateTime CreationTime)
	{
		this.CreationTime = CreationTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CreationTime attribute.
	*
	* @return the value of CreationTime
	/**/
	public IfcDateTime getCreationTime()
	{
		return this.CreationTime;
	}

	/**
	* This method sets the UserDefinedGrade attribute to the given value.
	*
	* @param UserDefinedGrade DEMANDED value to set - may not be null
	**/
	public void setUserDefinedGrade(IfcLabel UserDefinedGrade)
	{
		this.UserDefinedGrade = UserDefinedGrade;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UserDefinedGrade attribute.
	*
	* @return the value of UserDefinedGrade
	/**/
	public IfcLabel getUserDefinedGrade()
	{
		return this.UserDefinedGrade;
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
