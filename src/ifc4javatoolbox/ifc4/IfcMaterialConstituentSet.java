/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcMaterialConstituentSet<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcMaterialConstituentSet extends IfcMaterialDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","SET<IfcMaterialConstituent>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Name is an OPTIONAL attribute**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** MaterialConstituents is an OPTIONAL attribute**/
	protected SET<IfcMaterialConstituent> MaterialConstituents;
	/**
	* The default constructor.
	**/
	public IfcMaterialConstituentSet(){}

	/**
	* Constructs a new IfcMaterialConstituentSet object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param MaterialConstituents OPTIONAL parameter of type SET<IfcMaterialConstituent>
	**/
	public IfcMaterialConstituentSet(IfcLabel Name, IfcText Description, SET<IfcMaterialConstituent> MaterialConstituents)
	{
		this.Name = Name;
		this.Description = Description;
		this.MaterialConstituents = MaterialConstituents;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcMaterialConstituentSet object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param MaterialConstituents OPTIONAL parameter of type SET<IfcMaterialConstituent>
	**/
	public void setParameters(IfcLabel Name, IfcText Description, SET<IfcMaterialConstituent> MaterialConstituents)
	{
		this.Name = Name;
		this.Description = Description;
		this.MaterialConstituents = MaterialConstituents;
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
		this.MaterialConstituents = (SET<IfcMaterialConstituent>) parameters.get(2);
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
		if(MaterialConstituents != null)
		{
			for(IfcMaterialConstituent MaterialConstituents$ : MaterialConstituents)
			{
				MaterialConstituents$.ToMaterialConstituentSet_Inverse = this;
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcMaterialConstituentSet.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCMATERIALCONSTITUENTSET(");
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
		if(getRedefinedDerivedAttributeTypes().contains("MaterialConstituents")) stepString = stepString.concat("*);");
		else{
		if(this.MaterialConstituents != null)		stepString = stepString.concat(((RootInterface)this.MaterialConstituents).getStepParameter(IfcMaterialConstituent.class.isInterface())+");");
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
	* This method sets the Name attribute to the given value.
	*
	* @param Name DEMANDED value to set - may not be null
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
	* This method sets the MaterialConstituents attribute to the given value.
	*
	* @param MaterialConstituents DEMANDED value to set - may not be null
	**/
	public void setMaterialConstituents(SET<IfcMaterialConstituent> MaterialConstituents)
	{
		synchronizeInversesRemoveMaterialConstituents(this.MaterialConstituents);
		this.MaterialConstituents = MaterialConstituents;
		synchronizeInversesAddMaterialConstituents(this.MaterialConstituents);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the MaterialConstituents attribute.
	*
	* @return a copy of the MaterialConstituents set
	**/
	public SET<IfcMaterialConstituent> getMaterialConstituents()
	{
		if(this.MaterialConstituents != null)
			return new SET<IfcMaterialConstituent>(this.MaterialConstituents);
		return null;
	}

	/**
	* This method adds an IfcMaterialConstituent object to the MaterialConstituents set.
	* @param MaterialConstituents element to be appended to this set.
	**/
	public void addMaterialConstituents(IfcMaterialConstituent MaterialConstituents)
	{
		if(this.MaterialConstituents == null)
			this.MaterialConstituents = new SET<IfcMaterialConstituent>();
		this.MaterialConstituents.add(MaterialConstituents);
		synchronizeInversesAddMaterialConstituents(MaterialConstituents);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcMaterialConstituent objects to the MaterialConstituents set.
	* @param MaterialConstituents collection containing elements to be added to this set.
	**/
	public void addAllMaterialConstituents(java.util.Collection<IfcMaterialConstituent> MaterialConstituents)
	{
		if(this.MaterialConstituents == null)
			this.MaterialConstituents = new SET<IfcMaterialConstituent>();
		this.MaterialConstituents.addAll(MaterialConstituents);
		synchronizeInversesAddMaterialConstituents(MaterialConstituents);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the MaterialConstituents set.
	**/
	public void clearMaterialConstituents()
	{
		if(this.MaterialConstituents != null)
		{
			synchronizeInversesRemoveMaterialConstituents(this.MaterialConstituents);
			this.MaterialConstituents.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcMaterialConstituent object from the MaterialConstituents set.
	* @param MaterialConstituents element to be removed from this set.
	**/
	public void removeMaterialConstituents(IfcMaterialConstituent MaterialConstituents)
	{
		if(this.MaterialConstituents != null)
		{
			this.MaterialConstituents.remove(MaterialConstituents);
			synchronizeInversesRemoveMaterialConstituents(MaterialConstituents);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcMaterialConstituent objects from the MaterialConstituents set.
	* @param MaterialConstituents collection containing elements to be removed from this set.
	**/
	public void removeAllMaterialConstituents(java.util.Collection<IfcMaterialConstituent> MaterialConstituents)
	{
		if(this.MaterialConstituents != null)
		{
			this.MaterialConstituents.removeAll(MaterialConstituents);
			synchronizeInversesRemoveMaterialConstituents(MaterialConstituents);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddMaterialConstituents(IfcMaterialConstituent MaterialConstituents)
	{
		if(MaterialConstituents != null)
		{
				MaterialConstituents.ToMaterialConstituentSet_Inverse = this;
		}
	}

	private void synchronizeInversesAddMaterialConstituents(java.util.Collection<IfcMaterialConstituent> MaterialConstituents)
	{
		if(MaterialConstituents != null)
		{
			for(IfcMaterialConstituent MaterialConstituents$ : MaterialConstituents)
			{
				synchronizeInversesAddMaterialConstituents(MaterialConstituents$);
			}
		}
	}

	private void synchronizeInversesRemoveMaterialConstituents(IfcMaterialConstituent MaterialConstituents)
	{
		if(MaterialConstituents != null)
		{
				MaterialConstituents.ToMaterialConstituentSet_Inverse = null;
		}
	}

	private void synchronizeInversesRemoveMaterialConstituents(java.util.Collection<IfcMaterialConstituent> MaterialConstituents)
	{
		if(MaterialConstituents != null)
		{
			for(IfcMaterialConstituent MaterialConstituents$ : MaterialConstituents)
			{
				synchronizeInversesRemoveMaterialConstituents(MaterialConstituents$);
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
		IfcMaterialConstituentSet ifcMaterialConstituentSet = new IfcMaterialConstituentSet();
		if(this.Name != null)
			ifcMaterialConstituentSet.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcMaterialConstituentSet.setDescription((IfcText)this.Description.clone());
		if(this.MaterialConstituents != null)
			ifcMaterialConstituentSet.setMaterialConstituents((SET<IfcMaterialConstituent>)this.MaterialConstituents.clone());
		return ifcMaterialConstituentSet;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcMaterialConstituentSet ifcMaterialConstituentSet = new IfcMaterialConstituentSet();
		if(this.Name != null)
			ifcMaterialConstituentSet.setName(this.Name);
		if(this.Description != null)
			ifcMaterialConstituentSet.setDescription(this.Description);
		if(this.MaterialConstituents != null)
			ifcMaterialConstituentSet.setMaterialConstituents(this.MaterialConstituents);
		return ifcMaterialConstituentSet;
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
