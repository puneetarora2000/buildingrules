/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcResourceConstraintRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcResourceConstraintRelationship extends IfcResourceLevelRelationship implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcConstraint","SET<IfcResourceObjectSelect>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingConstraint is an DEMANDED attribute - may not be null**/
	protected IfcConstraint RelatingConstraint;
	/** RelatedResourceObjects is an DEMANDED attribute - may not be null**/
	protected SET<IfcResourceObjectSelect> RelatedResourceObjects;
	/**
	* The default constructor.
	**/
	public IfcResourceConstraintRelationship(){}

	/**
	* Constructs a new IfcResourceConstraintRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingConstraint DEMANDED parameter of type IfcConstraint - may not be null.
	* @param RelatedResourceObjects DEMANDED parameter of type SET<IfcResourceObjectSelect> - may not be null.
	**/
	public IfcResourceConstraintRelationship(IfcLabel Name, IfcText Description, IfcConstraint RelatingConstraint, SET<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingConstraint = RelatingConstraint;
		this.RelatedResourceObjects = RelatedResourceObjects;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcResourceConstraintRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingConstraint DEMANDED parameter of type IfcConstraint - may not be null.
	* @param RelatedResourceObjects DEMANDED parameter of type SET<IfcResourceObjectSelect> - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcConstraint RelatingConstraint, SET<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingConstraint = RelatingConstraint;
		this.RelatedResourceObjects = RelatedResourceObjects;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.RelatingConstraint = (IfcConstraint) parameters.get(2);
		this.RelatedResourceObjects = (SET<IfcResourceObjectSelect>) parameters.get(3);
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
		if(RelatingConstraint != null)
		{
				if(RelatingConstraint.PropertiesForConstraint_Inverse == null)
				{
					RelatingConstraint.PropertiesForConstraint_Inverse = new SET<IfcResourceConstraintRelationship>();
				}
				RelatingConstraint.PropertiesForConstraint_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcResourceConstraintRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRESOURCECONSTRAINTRELATIONSHIP(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingConstraint")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingConstraint != null)		stepString = stepString.concat(((RootInterface)this.RelatingConstraint).getStepParameter(IfcConstraint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedResourceObjects")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedResourceObjects != null)		stepString = stepString.concat(((RootInterface)this.RelatedResourceObjects).getStepParameter(IfcResourceObjectSelect.class.isInterface())+");");
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
	* This method sets the RelatingConstraint attribute to the given value.
	*
	* @param RelatingConstraint OPTIONAL value to set
	**/
	public void setRelatingConstraint(IfcConstraint RelatingConstraint)
	{
		synchronizeInversesRemoveRelatingConstraint(this.RelatingConstraint);
		this.RelatingConstraint = RelatingConstraint;
		synchronizeInversesAddRelatingConstraint(this.RelatingConstraint);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingConstraint attribute.
	*
	* @return the value of RelatingConstraint
	/**/
	public IfcConstraint getRelatingConstraint()
	{
		return this.RelatingConstraint;
	}

	private void synchronizeInversesAddRelatingConstraint(IfcConstraint RelatingConstraint)
	{
		if(RelatingConstraint != null)
		{
				if(RelatingConstraint.PropertiesForConstraint_Inverse == null)
				{
					RelatingConstraint.PropertiesForConstraint_Inverse = new SET<IfcResourceConstraintRelationship>();
				}
				RelatingConstraint.PropertiesForConstraint_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingConstraint(IfcConstraint RelatingConstraint)
	{
		if(RelatingConstraint != null)
		{
				if(RelatingConstraint.PropertiesForConstraint_Inverse != null)
				{
					RelatingConstraint.PropertiesForConstraint_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedResourceObjects attribute to the given value.
	*
	* @param RelatedResourceObjects OPTIONAL value to set
	**/
	public void setRelatedResourceObjects(SET<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		this.RelatedResourceObjects = RelatedResourceObjects;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedResourceObjects attribute.
	*
	* @return a copy of the RelatedResourceObjects set
	**/
	public SET<IfcResourceObjectSelect> getRelatedResourceObjects()
	{
		if(this.RelatedResourceObjects != null)
			return new SET<IfcResourceObjectSelect>(this.RelatedResourceObjects);
		return null;
	}

	/**
	* This method adds an IfcResourceObjectSelect object to the RelatedResourceObjects set.
	* @param RelatedResourceObjects element to be appended to this set.
	**/
	public void addRelatedResourceObjects(IfcResourceObjectSelect RelatedResourceObjects)
	{
		if(this.RelatedResourceObjects == null)
			this.RelatedResourceObjects = new SET<IfcResourceObjectSelect>();
		this.RelatedResourceObjects.add(RelatedResourceObjects);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcResourceObjectSelect objects to the RelatedResourceObjects set.
	* @param RelatedResourceObjects collection containing elements to be added to this set.
	**/
	public void addAllRelatedResourceObjects(java.util.Collection<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		if(this.RelatedResourceObjects == null)
			this.RelatedResourceObjects = new SET<IfcResourceObjectSelect>();
		this.RelatedResourceObjects.addAll(RelatedResourceObjects);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedResourceObjects set.
	**/
	public void clearRelatedResourceObjects()
	{
		if(this.RelatedResourceObjects != null)
		{
			this.RelatedResourceObjects.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcResourceObjectSelect object from the RelatedResourceObjects set.
	* @param RelatedResourceObjects element to be removed from this set.
	**/
	public void removeRelatedResourceObjects(IfcResourceObjectSelect RelatedResourceObjects)
	{
		if(this.RelatedResourceObjects != null)
		{
			this.RelatedResourceObjects.remove(RelatedResourceObjects);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcResourceObjectSelect objects from the RelatedResourceObjects set.
	* @param RelatedResourceObjects collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedResourceObjects(java.util.Collection<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		if(this.RelatedResourceObjects != null)
		{
			this.RelatedResourceObjects.removeAll(RelatedResourceObjects);
			fireChangeEvent();
		}
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
		IfcResourceConstraintRelationship ifcResourceConstraintRelationship = new IfcResourceConstraintRelationship();
		if(this.Name != null)
			ifcResourceConstraintRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcResourceConstraintRelationship.setDescription((IfcText)this.Description.clone());
		if(this.RelatingConstraint != null)
			ifcResourceConstraintRelationship.setRelatingConstraint((IfcConstraint)this.RelatingConstraint.clone());
		if(this.RelatedResourceObjects != null)
			ifcResourceConstraintRelationship.setRelatedResourceObjects((SET<IfcResourceObjectSelect>)this.RelatedResourceObjects.clone());
		return ifcResourceConstraintRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcResourceConstraintRelationship ifcResourceConstraintRelationship = new IfcResourceConstraintRelationship();
		if(this.Name != null)
			ifcResourceConstraintRelationship.setName(this.Name);
		if(this.Description != null)
			ifcResourceConstraintRelationship.setDescription(this.Description);
		if(this.RelatingConstraint != null)
			ifcResourceConstraintRelationship.setRelatingConstraint(this.RelatingConstraint);
		if(this.RelatedResourceObjects != null)
			ifcResourceConstraintRelationship.setRelatedResourceObjects(this.RelatedResourceObjects);
		return ifcResourceConstraintRelationship;
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