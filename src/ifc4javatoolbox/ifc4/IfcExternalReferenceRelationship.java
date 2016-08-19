/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcExternalReferenceRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcExternalReferenceRelationship extends IfcResourceLevelRelationship implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcExternalReference","SET<IfcResourceObjectSelect>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingReference is an DEMANDED attribute - may not be null**/
	protected IfcExternalReference RelatingReference;
	/** RelatedResourceObjects is an DEMANDED attribute - may not be null**/
	protected SET<IfcResourceObjectSelect> RelatedResourceObjects;
	/**
	* The default constructor.
	**/
	public IfcExternalReferenceRelationship(){}

	/**
	* Constructs a new IfcExternalReferenceRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingReference DEMANDED parameter of type IfcExternalReference - may not be null.
	* @param RelatedResourceObjects DEMANDED parameter of type SET<IfcResourceObjectSelect> - may not be null.
	**/
	public IfcExternalReferenceRelationship(IfcLabel Name, IfcText Description, IfcExternalReference RelatingReference, SET<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingReference = RelatingReference;
		this.RelatedResourceObjects = RelatedResourceObjects;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcExternalReferenceRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingReference DEMANDED parameter of type IfcExternalReference - may not be null.
	* @param RelatedResourceObjects DEMANDED parameter of type SET<IfcResourceObjectSelect> - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcExternalReference RelatingReference, SET<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingReference = RelatingReference;
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
		this.RelatingReference = (IfcExternalReference) parameters.get(2);
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
		if(RelatingReference != null)
		{
				if(RelatingReference.ExternalReferenceForResources_Inverse == null)
				{
					RelatingReference.ExternalReferenceForResources_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				RelatingReference.ExternalReferenceForResources_Inverse.add(this);
		}
		if(RelatedResourceObjects != null)
		{
			for(IfcResourceObjectSelect RelatedResourceObjects$ : RelatedResourceObjects)
			{
				if(RelatedResourceObjects$ instanceof IfcPhysicalQuantity)
				{
				if(((IfcPhysicalQuantity)RelatedResourceObjects$).HasExternalReferences_Inverse == null)
				{
					((IfcPhysicalQuantity)RelatedResourceObjects$).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcPhysicalQuantity)RelatedResourceObjects$).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects$ instanceof IfcMaterialDefinition)
				{
				if(((IfcMaterialDefinition)RelatedResourceObjects$).HasExternalReferences_Inverse == null)
				{
					((IfcMaterialDefinition)RelatedResourceObjects$).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcMaterialDefinition)RelatedResourceObjects$).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects$ instanceof IfcApproval)
				{
				if(((IfcApproval)RelatedResourceObjects$).HasExternalReferences_Inverse == null)
				{
					((IfcApproval)RelatedResourceObjects$).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcApproval)RelatedResourceObjects$).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects$ instanceof IfcConstraint)
				{
				if(((IfcConstraint)RelatedResourceObjects$).HasExternalReferences_Inverse == null)
				{
					((IfcConstraint)RelatedResourceObjects$).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcConstraint)RelatedResourceObjects$).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects$ instanceof IfcPropertyAbstraction)
				{
				if(((IfcPropertyAbstraction)RelatedResourceObjects$).HasExternalReferences_Inverse == null)
				{
					((IfcPropertyAbstraction)RelatedResourceObjects$).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcPropertyAbstraction)RelatedResourceObjects$).HasExternalReferences_Inverse.add(this);
				}
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcExternalReferenceRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCEXTERNALREFERENCERELATIONSHIP(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingReference")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingReference != null)		stepString = stepString.concat(((RootInterface)this.RelatingReference).getStepParameter(IfcExternalReference.class.isInterface())+",");
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
	* This method sets the RelatingReference attribute to the given value.
	*
	* @param RelatingReference OPTIONAL value to set
	**/
	public void setRelatingReference(IfcExternalReference RelatingReference)
	{
		synchronizeInversesRemoveRelatingReference(this.RelatingReference);
		this.RelatingReference = RelatingReference;
		synchronizeInversesAddRelatingReference(this.RelatingReference);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingReference attribute.
	*
	* @return the value of RelatingReference
	/**/
	public IfcExternalReference getRelatingReference()
	{
		return this.RelatingReference;
	}

	private void synchronizeInversesAddRelatingReference(IfcExternalReference RelatingReference)
	{
		if(RelatingReference != null)
		{
				if(RelatingReference.ExternalReferenceForResources_Inverse == null)
				{
					RelatingReference.ExternalReferenceForResources_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				RelatingReference.ExternalReferenceForResources_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingReference(IfcExternalReference RelatingReference)
	{
		if(RelatingReference != null)
		{
				if(RelatingReference.ExternalReferenceForResources_Inverse != null)
				{
					RelatingReference.ExternalReferenceForResources_Inverse.remove(this);
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
		synchronizeInversesRemoveRelatedResourceObjects(this.RelatedResourceObjects);
		this.RelatedResourceObjects = RelatedResourceObjects;
		synchronizeInversesAddRelatedResourceObjects(this.RelatedResourceObjects);
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
		synchronizeInversesAddRelatedResourceObjects(RelatedResourceObjects);
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
		synchronizeInversesAddRelatedResourceObjects(RelatedResourceObjects);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedResourceObjects set.
	**/
	public void clearRelatedResourceObjects()
	{
		if(this.RelatedResourceObjects != null)
		{
			synchronizeInversesRemoveRelatedResourceObjects(this.RelatedResourceObjects);
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
			synchronizeInversesRemoveRelatedResourceObjects(RelatedResourceObjects);
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
			synchronizeInversesRemoveRelatedResourceObjects(RelatedResourceObjects);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedResourceObjects(IfcResourceObjectSelect RelatedResourceObjects)
	{
		if(RelatedResourceObjects != null)
		{
				if(RelatedResourceObjects instanceof IfcPhysicalQuantity)
				{
				if(((IfcPhysicalQuantity)RelatedResourceObjects).HasExternalReferences_Inverse == null)
				{
					((IfcPhysicalQuantity)RelatedResourceObjects).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcPhysicalQuantity)RelatedResourceObjects).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects instanceof IfcMaterialDefinition)
				{
				if(((IfcMaterialDefinition)RelatedResourceObjects).HasExternalReferences_Inverse == null)
				{
					((IfcMaterialDefinition)RelatedResourceObjects).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcMaterialDefinition)RelatedResourceObjects).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects instanceof IfcApproval)
				{
				if(((IfcApproval)RelatedResourceObjects).HasExternalReferences_Inverse == null)
				{
					((IfcApproval)RelatedResourceObjects).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcApproval)RelatedResourceObjects).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects instanceof IfcConstraint)
				{
				if(((IfcConstraint)RelatedResourceObjects).HasExternalReferences_Inverse == null)
				{
					((IfcConstraint)RelatedResourceObjects).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcConstraint)RelatedResourceObjects).HasExternalReferences_Inverse.add(this);
				}
				else if(RelatedResourceObjects instanceof IfcPropertyAbstraction)
				{
				if(((IfcPropertyAbstraction)RelatedResourceObjects).HasExternalReferences_Inverse == null)
				{
					((IfcPropertyAbstraction)RelatedResourceObjects).HasExternalReferences_Inverse = new SET<IfcExternalReferenceRelationship>();
				}
				((IfcPropertyAbstraction)RelatedResourceObjects).HasExternalReferences_Inverse.add(this);
				}
		}
	}

	private void synchronizeInversesAddRelatedResourceObjects(java.util.Collection<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		if(RelatedResourceObjects != null)
		{
			for(IfcResourceObjectSelect RelatedResourceObjects$ : RelatedResourceObjects)
			{
				synchronizeInversesAddRelatedResourceObjects(RelatedResourceObjects$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedResourceObjects(IfcResourceObjectSelect RelatedResourceObjects)
	{
		if(RelatedResourceObjects != null)
		{
				if(RelatedResourceObjects instanceof IfcPhysicalQuantity)
				{
				if(((IfcPhysicalQuantity)RelatedResourceObjects).HasExternalReferences_Inverse != null)
				{
				((IfcPhysicalQuantity)RelatedResourceObjects).HasExternalReferences_Inverse.remove(this);
				}
				}
				else if(RelatedResourceObjects instanceof IfcMaterialDefinition)
				{
				if(((IfcMaterialDefinition)RelatedResourceObjects).HasExternalReferences_Inverse != null)
				{
				((IfcMaterialDefinition)RelatedResourceObjects).HasExternalReferences_Inverse.remove(this);
				}
				}
				else if(RelatedResourceObjects instanceof IfcApproval)
				{
				if(((IfcApproval)RelatedResourceObjects).HasExternalReferences_Inverse != null)
				{
				((IfcApproval)RelatedResourceObjects).HasExternalReferences_Inverse.remove(this);
				}
				}
				else if(RelatedResourceObjects instanceof IfcConstraint)
				{
				if(((IfcConstraint)RelatedResourceObjects).HasExternalReferences_Inverse != null)
				{
				((IfcConstraint)RelatedResourceObjects).HasExternalReferences_Inverse.remove(this);
				}
				}
				else if(RelatedResourceObjects instanceof IfcPropertyAbstraction)
				{
				if(((IfcPropertyAbstraction)RelatedResourceObjects).HasExternalReferences_Inverse != null)
				{
				((IfcPropertyAbstraction)RelatedResourceObjects).HasExternalReferences_Inverse.remove(this);
				}
				}
		}
	}

	private void synchronizeInversesRemoveRelatedResourceObjects(java.util.Collection<IfcResourceObjectSelect> RelatedResourceObjects)
	{
		if(RelatedResourceObjects != null)
		{
			for(IfcResourceObjectSelect RelatedResourceObjects$ : RelatedResourceObjects)
			{
				synchronizeInversesRemoveRelatedResourceObjects(RelatedResourceObjects$);
			}
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
		IfcExternalReferenceRelationship ifcExternalReferenceRelationship = new IfcExternalReferenceRelationship();
		if(this.Name != null)
			ifcExternalReferenceRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcExternalReferenceRelationship.setDescription((IfcText)this.Description.clone());
		if(this.RelatingReference != null)
			ifcExternalReferenceRelationship.setRelatingReference((IfcExternalReference)this.RelatingReference.clone());
		if(this.RelatedResourceObjects != null)
			ifcExternalReferenceRelationship.setRelatedResourceObjects((SET<IfcResourceObjectSelect>)this.RelatedResourceObjects.clone());
		return ifcExternalReferenceRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcExternalReferenceRelationship ifcExternalReferenceRelationship = new IfcExternalReferenceRelationship();
		if(this.Name != null)
			ifcExternalReferenceRelationship.setName(this.Name);
		if(this.Description != null)
			ifcExternalReferenceRelationship.setDescription(this.Description);
		if(this.RelatingReference != null)
			ifcExternalReferenceRelationship.setRelatingReference(this.RelatingReference);
		if(this.RelatedResourceObjects != null)
			ifcExternalReferenceRelationship.setRelatedResourceObjects(this.RelatedResourceObjects);
		return ifcExternalReferenceRelationship;
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