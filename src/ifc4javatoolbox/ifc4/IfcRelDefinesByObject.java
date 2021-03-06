/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcRelDefinesByObject<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelDefinesByObject extends IfcRelDefines implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","SET<IfcObject>","IfcObject"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatedObjects is an DEMANDED attribute - may not be null**/
	protected SET<IfcObject> RelatedObjects;
	/** RelatingObject is an DEMANDED attribute - may not be null**/
	protected IfcObject RelatingObject;
	/**
	* The default constructor.
	**/
	public IfcRelDefinesByObject(){}

	/**
	* Constructs a new IfcRelDefinesByObject object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedObjects DEMANDED parameter of type SET<IfcObject> - may not be null.
	* @param RelatingObject DEMANDED parameter of type IfcObject - may not be null.
	**/
	public IfcRelDefinesByObject(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcObject> RelatedObjects, IfcObject RelatingObject)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedObjects = RelatedObjects;
		this.RelatingObject = RelatingObject;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelDefinesByObject object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedObjects DEMANDED parameter of type SET<IfcObject> - may not be null.
	* @param RelatingObject DEMANDED parameter of type IfcObject - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcObject> RelatedObjects, IfcObject RelatingObject)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedObjects = RelatedObjects;
		this.RelatingObject = RelatingObject;
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
		this.RelatedObjects = (SET<IfcObject>) parameters.get(4);
		this.RelatingObject = (IfcObject) parameters.get(5);
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
		if(RelatedObjects != null)
		{
			for(IfcObject RelatedObjects$ : RelatedObjects)
			{
				if(RelatedObjects$.IsDeclaredBy_Inverse == null)
				{
					RelatedObjects$.IsDeclaredBy_Inverse = new SET<IfcRelDefinesByObject>();
				}
				RelatedObjects$.IsDeclaredBy_Inverse.add(this);
			}
		}
		if(RelatingObject != null)
		{
				if(RelatingObject.Declares_Inverse == null)
				{
					RelatingObject.Declares_Inverse = new SET<IfcRelDefinesByObject>();
				}
				RelatingObject.Declares_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelDefinesByObject.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELDEFINESBYOBJECT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatedObjects")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedObjects != null)		stepString = stepString.concat(((RootInterface)this.RelatedObjects).getStepParameter(IfcObject.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingObject")) stepString = stepString.concat("*);");
		else{
		if(this.RelatingObject != null)		stepString = stepString.concat(((RootInterface)this.RelatingObject).getStepParameter(IfcObject.class.isInterface())+");");
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
	* This method sets the RelatedObjects attribute to the given value.
	*
	* @param RelatedObjects OPTIONAL value to set
	**/
	public void setRelatedObjects(SET<IfcObject> RelatedObjects)
	{
		synchronizeInversesRemoveRelatedObjects(this.RelatedObjects);
		this.RelatedObjects = RelatedObjects;
		synchronizeInversesAddRelatedObjects(this.RelatedObjects);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedObjects attribute.
	*
	* @return a copy of the RelatedObjects set
	**/
	public SET<IfcObject> getRelatedObjects()
	{
		if(this.RelatedObjects != null)
			return new SET<IfcObject>(this.RelatedObjects);
		return null;
	}

	/**
	* This method adds an IfcObject object to the RelatedObjects set.
	* @param RelatedObjects element to be appended to this set.
	**/
	public void addRelatedObjects(IfcObject RelatedObjects)
	{
		if(this.RelatedObjects == null)
			this.RelatedObjects = new SET<IfcObject>();
		this.RelatedObjects.add(RelatedObjects);
		synchronizeInversesAddRelatedObjects(RelatedObjects);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcObject objects to the RelatedObjects set.
	* @param RelatedObjects collection containing elements to be added to this set.
	**/
	public void addAllRelatedObjects(java.util.Collection<IfcObject> RelatedObjects)
	{
		if(this.RelatedObjects == null)
			this.RelatedObjects = new SET<IfcObject>();
		this.RelatedObjects.addAll(RelatedObjects);
		synchronizeInversesAddRelatedObjects(RelatedObjects);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedObjects set.
	**/
	public void clearRelatedObjects()
	{
		if(this.RelatedObjects != null)
		{
			synchronizeInversesRemoveRelatedObjects(this.RelatedObjects);
			this.RelatedObjects.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcObject object from the RelatedObjects set.
	* @param RelatedObjects element to be removed from this set.
	**/
	public void removeRelatedObjects(IfcObject RelatedObjects)
	{
		if(this.RelatedObjects != null)
		{
			this.RelatedObjects.remove(RelatedObjects);
			synchronizeInversesRemoveRelatedObjects(RelatedObjects);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcObject objects from the RelatedObjects set.
	* @param RelatedObjects collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedObjects(java.util.Collection<IfcObject> RelatedObjects)
	{
		if(this.RelatedObjects != null)
		{
			this.RelatedObjects.removeAll(RelatedObjects);
			synchronizeInversesRemoveRelatedObjects(RelatedObjects);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedObjects(IfcObject RelatedObjects)
	{
		if(RelatedObjects != null)
		{
				if(RelatedObjects.IsDeclaredBy_Inverse == null)
				{
					RelatedObjects.IsDeclaredBy_Inverse = new SET<IfcRelDefinesByObject>();
				}
				RelatedObjects.IsDeclaredBy_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedObjects(java.util.Collection<IfcObject> RelatedObjects)
	{
		if(RelatedObjects != null)
		{
			for(IfcObject RelatedObjects$ : RelatedObjects)
			{
				synchronizeInversesAddRelatedObjects(RelatedObjects$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedObjects(IfcObject RelatedObjects)
	{
		if(RelatedObjects != null)
		{
				if(RelatedObjects.IsDeclaredBy_Inverse != null)
				{
					RelatedObjects.IsDeclaredBy_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedObjects(java.util.Collection<IfcObject> RelatedObjects)
	{
		if(RelatedObjects != null)
		{
			for(IfcObject RelatedObjects$ : RelatedObjects)
			{
				synchronizeInversesRemoveRelatedObjects(RelatedObjects$);
			}
		}
	}

	/**
	* This method sets the RelatingObject attribute to the given value.
	*
	* @param RelatingObject OPTIONAL value to set
	**/
	public void setRelatingObject(IfcObject RelatingObject)
	{
		synchronizeInversesRemoveRelatingObject(this.RelatingObject);
		this.RelatingObject = RelatingObject;
		synchronizeInversesAddRelatingObject(this.RelatingObject);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingObject attribute.
	*
	* @return the value of RelatingObject
	/**/
	public IfcObject getRelatingObject()
	{
		return this.RelatingObject;
	}

	private void synchronizeInversesAddRelatingObject(IfcObject RelatingObject)
	{
		if(RelatingObject != null)
		{
				if(RelatingObject.Declares_Inverse == null)
				{
					RelatingObject.Declares_Inverse = new SET<IfcRelDefinesByObject>();
				}
				RelatingObject.Declares_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingObject(IfcObject RelatingObject)
	{
		if(RelatingObject != null)
		{
				if(RelatingObject.Declares_Inverse != null)
				{
					RelatingObject.Declares_Inverse.remove(this);
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
		IfcRelDefinesByObject ifcRelDefinesByObject = new IfcRelDefinesByObject();
		if(this.GlobalId != null)
			ifcRelDefinesByObject.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelDefinesByObject.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelDefinesByObject.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelDefinesByObject.setDescription((IfcText)this.Description.clone());
		if(this.RelatedObjects != null)
			ifcRelDefinesByObject.setRelatedObjects((SET<IfcObject>)this.RelatedObjects.clone());
		if(this.RelatingObject != null)
			ifcRelDefinesByObject.setRelatingObject((IfcObject)this.RelatingObject.clone());
		return ifcRelDefinesByObject;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelDefinesByObject ifcRelDefinesByObject = new IfcRelDefinesByObject();
		if(this.GlobalId != null)
			ifcRelDefinesByObject.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelDefinesByObject.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelDefinesByObject.setName(this.Name);
		if(this.Description != null)
			ifcRelDefinesByObject.setDescription(this.Description);
		if(this.RelatedObjects != null)
			ifcRelDefinesByObject.setRelatedObjects(this.RelatedObjects);
		if(this.RelatingObject != null)
			ifcRelDefinesByObject.setRelatingObject(this.RelatingObject);
		return ifcRelDefinesByObject;
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
