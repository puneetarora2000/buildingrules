/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcRelFlowControlElements<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelFlowControlElements extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","SET<IfcDistributionControlElement>","IfcDistributionFlowElement"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatedControlElements is an DEMANDED attribute - may not be null**/
	protected SET<IfcDistributionControlElement> RelatedControlElements;
	/** RelatingFlowElement is an DEMANDED attribute - may not be null**/
	protected IfcDistributionFlowElement RelatingFlowElement;
	/**
	* The default constructor.
	**/
	public IfcRelFlowControlElements(){}

	/**
	* Constructs a new IfcRelFlowControlElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedControlElements DEMANDED parameter of type SET<IfcDistributionControlElement> - may not be null.
	* @param RelatingFlowElement DEMANDED parameter of type IfcDistributionFlowElement - may not be null.
	**/
	public IfcRelFlowControlElements(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcDistributionControlElement> RelatedControlElements, IfcDistributionFlowElement RelatingFlowElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedControlElements = RelatedControlElements;
		this.RelatingFlowElement = RelatingFlowElement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelFlowControlElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedControlElements DEMANDED parameter of type SET<IfcDistributionControlElement> - may not be null.
	* @param RelatingFlowElement DEMANDED parameter of type IfcDistributionFlowElement - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcDistributionControlElement> RelatedControlElements, IfcDistributionFlowElement RelatingFlowElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedControlElements = RelatedControlElements;
		this.RelatingFlowElement = RelatingFlowElement;
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
		this.RelatedControlElements = (SET<IfcDistributionControlElement>) parameters.get(4);
		this.RelatingFlowElement = (IfcDistributionFlowElement) parameters.get(5);
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
		if(RelatedControlElements != null)
		{
			for(IfcDistributionControlElement RelatedControlElements$ : RelatedControlElements)
			{
				if(RelatedControlElements$.AssignedToFlowElement_Inverse == null)
				{
					RelatedControlElements$.AssignedToFlowElement_Inverse = new SET<IfcRelFlowControlElements>();
				}
				RelatedControlElements$.AssignedToFlowElement_Inverse.add(this);
			}
		}
		if(RelatingFlowElement != null)
		{
				if(RelatingFlowElement.HasControlElements_Inverse == null)
				{
					RelatingFlowElement.HasControlElements_Inverse = new SET<IfcRelFlowControlElements>();
				}
				RelatingFlowElement.HasControlElements_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelFlowControlElements.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELFLOWCONTROLELEMENTS(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatedControlElements")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedControlElements != null)		stepString = stepString.concat(((RootInterface)this.RelatedControlElements).getStepParameter(IfcDistributionControlElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingFlowElement")) stepString = stepString.concat("*);");
		else{
		if(this.RelatingFlowElement != null)		stepString = stepString.concat(((RootInterface)this.RelatingFlowElement).getStepParameter(IfcDistributionFlowElement.class.isInterface())+");");
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
	* This method sets the RelatedControlElements attribute to the given value.
	*
	* @param RelatedControlElements OPTIONAL value to set
	**/
	public void setRelatedControlElements(SET<IfcDistributionControlElement> RelatedControlElements)
	{
		synchronizeInversesRemoveRelatedControlElements(this.RelatedControlElements);
		this.RelatedControlElements = RelatedControlElements;
		synchronizeInversesAddRelatedControlElements(this.RelatedControlElements);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedControlElements attribute.
	*
	* @return a copy of the RelatedControlElements set
	**/
	public SET<IfcDistributionControlElement> getRelatedControlElements()
	{
		if(this.RelatedControlElements != null)
			return new SET<IfcDistributionControlElement>(this.RelatedControlElements);
		return null;
	}

	/**
	* This method adds an IfcDistributionControlElement object to the RelatedControlElements set.
	* @param RelatedControlElements element to be appended to this set.
	**/
	public void addRelatedControlElements(IfcDistributionControlElement RelatedControlElements)
	{
		if(this.RelatedControlElements == null)
			this.RelatedControlElements = new SET<IfcDistributionControlElement>();
		this.RelatedControlElements.add(RelatedControlElements);
		synchronizeInversesAddRelatedControlElements(RelatedControlElements);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcDistributionControlElement objects to the RelatedControlElements set.
	* @param RelatedControlElements collection containing elements to be added to this set.
	**/
	public void addAllRelatedControlElements(java.util.Collection<IfcDistributionControlElement> RelatedControlElements)
	{
		if(this.RelatedControlElements == null)
			this.RelatedControlElements = new SET<IfcDistributionControlElement>();
		this.RelatedControlElements.addAll(RelatedControlElements);
		synchronizeInversesAddRelatedControlElements(RelatedControlElements);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedControlElements set.
	**/
	public void clearRelatedControlElements()
	{
		if(this.RelatedControlElements != null)
		{
			synchronizeInversesRemoveRelatedControlElements(this.RelatedControlElements);
			this.RelatedControlElements.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcDistributionControlElement object from the RelatedControlElements set.
	* @param RelatedControlElements element to be removed from this set.
	**/
	public void removeRelatedControlElements(IfcDistributionControlElement RelatedControlElements)
	{
		if(this.RelatedControlElements != null)
		{
			this.RelatedControlElements.remove(RelatedControlElements);
			synchronizeInversesRemoveRelatedControlElements(RelatedControlElements);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcDistributionControlElement objects from the RelatedControlElements set.
	* @param RelatedControlElements collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedControlElements(java.util.Collection<IfcDistributionControlElement> RelatedControlElements)
	{
		if(this.RelatedControlElements != null)
		{
			this.RelatedControlElements.removeAll(RelatedControlElements);
			synchronizeInversesRemoveRelatedControlElements(RelatedControlElements);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedControlElements(IfcDistributionControlElement RelatedControlElements)
	{
		if(RelatedControlElements != null)
		{
				if(RelatedControlElements.AssignedToFlowElement_Inverse == null)
				{
					RelatedControlElements.AssignedToFlowElement_Inverse = new SET<IfcRelFlowControlElements>();
				}
				RelatedControlElements.AssignedToFlowElement_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedControlElements(java.util.Collection<IfcDistributionControlElement> RelatedControlElements)
	{
		if(RelatedControlElements != null)
		{
			for(IfcDistributionControlElement RelatedControlElements$ : RelatedControlElements)
			{
				synchronizeInversesAddRelatedControlElements(RelatedControlElements$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedControlElements(IfcDistributionControlElement RelatedControlElements)
	{
		if(RelatedControlElements != null)
		{
				if(RelatedControlElements.AssignedToFlowElement_Inverse != null)
				{
					RelatedControlElements.AssignedToFlowElement_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedControlElements(java.util.Collection<IfcDistributionControlElement> RelatedControlElements)
	{
		if(RelatedControlElements != null)
		{
			for(IfcDistributionControlElement RelatedControlElements$ : RelatedControlElements)
			{
				synchronizeInversesRemoveRelatedControlElements(RelatedControlElements$);
			}
		}
	}

	/**
	* This method sets the RelatingFlowElement attribute to the given value.
	*
	* @param RelatingFlowElement OPTIONAL value to set
	**/
	public void setRelatingFlowElement(IfcDistributionFlowElement RelatingFlowElement)
	{
		synchronizeInversesRemoveRelatingFlowElement(this.RelatingFlowElement);
		this.RelatingFlowElement = RelatingFlowElement;
		synchronizeInversesAddRelatingFlowElement(this.RelatingFlowElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingFlowElement attribute.
	*
	* @return the value of RelatingFlowElement
	/**/
	public IfcDistributionFlowElement getRelatingFlowElement()
	{
		return this.RelatingFlowElement;
	}

	private void synchronizeInversesAddRelatingFlowElement(IfcDistributionFlowElement RelatingFlowElement)
	{
		if(RelatingFlowElement != null)
		{
				if(RelatingFlowElement.HasControlElements_Inverse == null)
				{
					RelatingFlowElement.HasControlElements_Inverse = new SET<IfcRelFlowControlElements>();
				}
				RelatingFlowElement.HasControlElements_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingFlowElement(IfcDistributionFlowElement RelatingFlowElement)
	{
		if(RelatingFlowElement != null)
		{
				if(RelatingFlowElement.HasControlElements_Inverse != null)
				{
					RelatingFlowElement.HasControlElements_Inverse.remove(this);
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
		IfcRelFlowControlElements ifcRelFlowControlElements = new IfcRelFlowControlElements();
		if(this.GlobalId != null)
			ifcRelFlowControlElements.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelFlowControlElements.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelFlowControlElements.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelFlowControlElements.setDescription((IfcText)this.Description.clone());
		if(this.RelatedControlElements != null)
			ifcRelFlowControlElements.setRelatedControlElements((SET<IfcDistributionControlElement>)this.RelatedControlElements.clone());
		if(this.RelatingFlowElement != null)
			ifcRelFlowControlElements.setRelatingFlowElement((IfcDistributionFlowElement)this.RelatingFlowElement.clone());
		return ifcRelFlowControlElements;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelFlowControlElements ifcRelFlowControlElements = new IfcRelFlowControlElements();
		if(this.GlobalId != null)
			ifcRelFlowControlElements.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelFlowControlElements.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelFlowControlElements.setName(this.Name);
		if(this.Description != null)
			ifcRelFlowControlElements.setDescription(this.Description);
		if(this.RelatedControlElements != null)
			ifcRelFlowControlElements.setRelatedControlElements(this.RelatedControlElements);
		if(this.RelatingFlowElement != null)
			ifcRelFlowControlElements.setRelatingFlowElement(this.RelatingFlowElement);
		return ifcRelFlowControlElements;
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
