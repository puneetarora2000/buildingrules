/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcPropertyDependencyRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPropertyDependencyRelationship extends IfcResourceLevelRelationship implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcProperty","IfcProperty","IfcText"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** DependingProperty is an DEMANDED attribute - may not be null**/
	protected IfcProperty DependingProperty;
	/** DependantProperty is an DEMANDED attribute - may not be null**/
	protected IfcProperty DependantProperty;
	/** Expression is an OPTIONAL attribute**/
	protected IfcText Expression;
	/**
	* The default constructor.
	**/
	public IfcPropertyDependencyRelationship(){}

	/**
	* Constructs a new IfcPropertyDependencyRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param DependingProperty DEMANDED parameter of type IfcProperty - may not be null.
	* @param DependantProperty DEMANDED parameter of type IfcProperty - may not be null.
	* @param Expression OPTIONAL parameter of type IfcText
	**/
	public IfcPropertyDependencyRelationship(IfcLabel Name, IfcText Description, IfcProperty DependingProperty, IfcProperty DependantProperty, IfcText Expression)
	{
		this.Name = Name;
		this.Description = Description;
		this.DependingProperty = DependingProperty;
		this.DependantProperty = DependantProperty;
		this.Expression = Expression;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPropertyDependencyRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param DependingProperty DEMANDED parameter of type IfcProperty - may not be null.
	* @param DependantProperty DEMANDED parameter of type IfcProperty - may not be null.
	* @param Expression OPTIONAL parameter of type IfcText
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcProperty DependingProperty, IfcProperty DependantProperty, IfcText Expression)
	{
		this.Name = Name;
		this.Description = Description;
		this.DependingProperty = DependingProperty;
		this.DependantProperty = DependantProperty;
		this.Expression = Expression;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.DependingProperty = (IfcProperty) parameters.get(2);
		this.DependantProperty = (IfcProperty) parameters.get(3);
		this.Expression = (IfcText) parameters.get(4);
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
		if(DependingProperty != null)
		{
				if(DependingProperty.PropertyForDependance_Inverse == null)
				{
					DependingProperty.PropertyForDependance_Inverse = new SET<IfcPropertyDependencyRelationship>();
				}
				DependingProperty.PropertyForDependance_Inverse.add(this);
		}
		if(DependantProperty != null)
		{
				if(DependantProperty.PropertyDependsOn_Inverse == null)
				{
					DependantProperty.PropertyDependsOn_Inverse = new SET<IfcPropertyDependencyRelationship>();
				}
				DependantProperty.PropertyDependsOn_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcPropertyDependencyRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPROPERTYDEPENDENCYRELATIONSHIP(");
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
		if(getRedefinedDerivedAttributeTypes().contains("DependingProperty")) stepString = stepString.concat("*,");
		else{
		if(this.DependingProperty != null)		stepString = stepString.concat(((RootInterface)this.DependingProperty).getStepParameter(IfcProperty.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DependantProperty")) stepString = stepString.concat("*,");
		else{
		if(this.DependantProperty != null)		stepString = stepString.concat(((RootInterface)this.DependantProperty).getStepParameter(IfcProperty.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Expression")) stepString = stepString.concat("*);");
		else{
		if(this.Expression != null)		stepString = stepString.concat(((RootInterface)this.Expression).getStepParameter(IfcText.class.isInterface())+");");
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
	* This method sets the DependingProperty attribute to the given value.
	*
	* @param DependingProperty OPTIONAL value to set
	**/
	public void setDependingProperty(IfcProperty DependingProperty)
	{
		synchronizeInversesRemoveDependingProperty(this.DependingProperty);
		this.DependingProperty = DependingProperty;
		synchronizeInversesAddDependingProperty(this.DependingProperty);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DependingProperty attribute.
	*
	* @return the value of DependingProperty
	/**/
	public IfcProperty getDependingProperty()
	{
		return this.DependingProperty;
	}

	private void synchronizeInversesAddDependingProperty(IfcProperty DependingProperty)
	{
		if(DependingProperty != null)
		{
				if(DependingProperty.PropertyForDependance_Inverse == null)
				{
					DependingProperty.PropertyForDependance_Inverse = new SET<IfcPropertyDependencyRelationship>();
				}
				DependingProperty.PropertyForDependance_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveDependingProperty(IfcProperty DependingProperty)
	{
		if(DependingProperty != null)
		{
				if(DependingProperty.PropertyForDependance_Inverse != null)
				{
					DependingProperty.PropertyForDependance_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the DependantProperty attribute to the given value.
	*
	* @param DependantProperty OPTIONAL value to set
	**/
	public void setDependantProperty(IfcProperty DependantProperty)
	{
		synchronizeInversesRemoveDependantProperty(this.DependantProperty);
		this.DependantProperty = DependantProperty;
		synchronizeInversesAddDependantProperty(this.DependantProperty);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DependantProperty attribute.
	*
	* @return the value of DependantProperty
	/**/
	public IfcProperty getDependantProperty()
	{
		return this.DependantProperty;
	}

	private void synchronizeInversesAddDependantProperty(IfcProperty DependantProperty)
	{
		if(DependantProperty != null)
		{
				if(DependantProperty.PropertyDependsOn_Inverse == null)
				{
					DependantProperty.PropertyDependsOn_Inverse = new SET<IfcPropertyDependencyRelationship>();
				}
				DependantProperty.PropertyDependsOn_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveDependantProperty(IfcProperty DependantProperty)
	{
		if(DependantProperty != null)
		{
				if(DependantProperty.PropertyDependsOn_Inverse != null)
				{
					DependantProperty.PropertyDependsOn_Inverse.remove(this);
				}
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
		IfcPropertyDependencyRelationship ifcPropertyDependencyRelationship = new IfcPropertyDependencyRelationship();
		if(this.Name != null)
			ifcPropertyDependencyRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcPropertyDependencyRelationship.setDescription((IfcText)this.Description.clone());
		if(this.DependingProperty != null)
			ifcPropertyDependencyRelationship.setDependingProperty((IfcProperty)this.DependingProperty.clone());
		if(this.DependantProperty != null)
			ifcPropertyDependencyRelationship.setDependantProperty((IfcProperty)this.DependantProperty.clone());
		if(this.Expression != null)
			ifcPropertyDependencyRelationship.setExpression((IfcText)this.Expression.clone());
		return ifcPropertyDependencyRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPropertyDependencyRelationship ifcPropertyDependencyRelationship = new IfcPropertyDependencyRelationship();
		if(this.Name != null)
			ifcPropertyDependencyRelationship.setName(this.Name);
		if(this.Description != null)
			ifcPropertyDependencyRelationship.setDescription(this.Description);
		if(this.DependingProperty != null)
			ifcPropertyDependencyRelationship.setDependingProperty(this.DependingProperty);
		if(this.DependantProperty != null)
			ifcPropertyDependencyRelationship.setDependantProperty(this.DependantProperty);
		if(this.Expression != null)
			ifcPropertyDependencyRelationship.setExpression(this.Expression);
		return ifcPropertyDependencyRelationship;
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