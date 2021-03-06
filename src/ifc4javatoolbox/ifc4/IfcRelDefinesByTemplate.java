/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcRelDefinesByTemplate<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelDefinesByTemplate extends IfcRelDefines implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","SET<IfcPropertySetDefinition>","IfcPropertySetTemplate"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatedPropertySets is an DEMANDED attribute - may not be null**/
	protected SET<IfcPropertySetDefinition> RelatedPropertySets;
	/** RelatingTemplate is an DEMANDED attribute - may not be null**/
	protected IfcPropertySetTemplate RelatingTemplate;
	/**
	* The default constructor.
	**/
	public IfcRelDefinesByTemplate(){}

	/**
	* Constructs a new IfcRelDefinesByTemplate object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedPropertySets DEMANDED parameter of type SET<IfcPropertySetDefinition> - may not be null.
	* @param RelatingTemplate DEMANDED parameter of type IfcPropertySetTemplate - may not be null.
	**/
	public IfcRelDefinesByTemplate(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcPropertySetDefinition> RelatedPropertySets, IfcPropertySetTemplate RelatingTemplate)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedPropertySets = RelatedPropertySets;
		this.RelatingTemplate = RelatingTemplate;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelDefinesByTemplate object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatedPropertySets DEMANDED parameter of type SET<IfcPropertySetDefinition> - may not be null.
	* @param RelatingTemplate DEMANDED parameter of type IfcPropertySetTemplate - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, SET<IfcPropertySetDefinition> RelatedPropertySets, IfcPropertySetTemplate RelatingTemplate)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatedPropertySets = RelatedPropertySets;
		this.RelatingTemplate = RelatingTemplate;
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
		this.RelatedPropertySets = (SET<IfcPropertySetDefinition>) parameters.get(4);
		this.RelatingTemplate = (IfcPropertySetTemplate) parameters.get(5);
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
		if(RelatedPropertySets != null)
		{
			for(IfcPropertySetDefinition RelatedPropertySets$ : RelatedPropertySets)
			{
				if(RelatedPropertySets$.IsDefinedBy_Inverse == null)
				{
					RelatedPropertySets$.IsDefinedBy_Inverse = new SET<IfcRelDefinesByTemplate>();
				}
				RelatedPropertySets$.IsDefinedBy_Inverse.add(this);
			}
		}
		if(RelatingTemplate != null)
		{
				if(RelatingTemplate.Defines_Inverse == null)
				{
					RelatingTemplate.Defines_Inverse = new SET<IfcRelDefinesByTemplate>();
				}
				RelatingTemplate.Defines_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelDefinesByTemplate.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELDEFINESBYTEMPLATE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatedPropertySets")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedPropertySets != null)		stepString = stepString.concat(((RootInterface)this.RelatedPropertySets).getStepParameter(IfcPropertySetDefinition.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingTemplate")) stepString = stepString.concat("*);");
		else{
		if(this.RelatingTemplate != null)		stepString = stepString.concat(((RootInterface)this.RelatingTemplate).getStepParameter(IfcPropertySetTemplate.class.isInterface())+");");
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
	* This method sets the RelatedPropertySets attribute to the given value.
	*
	* @param RelatedPropertySets OPTIONAL value to set
	**/
	public void setRelatedPropertySets(SET<IfcPropertySetDefinition> RelatedPropertySets)
	{
		synchronizeInversesRemoveRelatedPropertySets(this.RelatedPropertySets);
		this.RelatedPropertySets = RelatedPropertySets;
		synchronizeInversesAddRelatedPropertySets(this.RelatedPropertySets);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedPropertySets attribute.
	*
	* @return a copy of the RelatedPropertySets set
	**/
	public SET<IfcPropertySetDefinition> getRelatedPropertySets()
	{
		if(this.RelatedPropertySets != null)
			return new SET<IfcPropertySetDefinition>(this.RelatedPropertySets);
		return null;
	}

	/**
	* This method adds an IfcPropertySetDefinition object to the RelatedPropertySets set.
	* @param RelatedPropertySets element to be appended to this set.
	**/
	public void addRelatedPropertySets(IfcPropertySetDefinition RelatedPropertySets)
	{
		if(this.RelatedPropertySets == null)
			this.RelatedPropertySets = new SET<IfcPropertySetDefinition>();
		this.RelatedPropertySets.add(RelatedPropertySets);
		synchronizeInversesAddRelatedPropertySets(RelatedPropertySets);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcPropertySetDefinition objects to the RelatedPropertySets set.
	* @param RelatedPropertySets collection containing elements to be added to this set.
	**/
	public void addAllRelatedPropertySets(java.util.Collection<IfcPropertySetDefinition> RelatedPropertySets)
	{
		if(this.RelatedPropertySets == null)
			this.RelatedPropertySets = new SET<IfcPropertySetDefinition>();
		this.RelatedPropertySets.addAll(RelatedPropertySets);
		synchronizeInversesAddRelatedPropertySets(RelatedPropertySets);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedPropertySets set.
	**/
	public void clearRelatedPropertySets()
	{
		if(this.RelatedPropertySets != null)
		{
			synchronizeInversesRemoveRelatedPropertySets(this.RelatedPropertySets);
			this.RelatedPropertySets.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcPropertySetDefinition object from the RelatedPropertySets set.
	* @param RelatedPropertySets element to be removed from this set.
	**/
	public void removeRelatedPropertySets(IfcPropertySetDefinition RelatedPropertySets)
	{
		if(this.RelatedPropertySets != null)
		{
			this.RelatedPropertySets.remove(RelatedPropertySets);
			synchronizeInversesRemoveRelatedPropertySets(RelatedPropertySets);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcPropertySetDefinition objects from the RelatedPropertySets set.
	* @param RelatedPropertySets collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedPropertySets(java.util.Collection<IfcPropertySetDefinition> RelatedPropertySets)
	{
		if(this.RelatedPropertySets != null)
		{
			this.RelatedPropertySets.removeAll(RelatedPropertySets);
			synchronizeInversesRemoveRelatedPropertySets(RelatedPropertySets);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedPropertySets(IfcPropertySetDefinition RelatedPropertySets)
	{
		if(RelatedPropertySets != null)
		{
				if(RelatedPropertySets.IsDefinedBy_Inverse == null)
				{
					RelatedPropertySets.IsDefinedBy_Inverse = new SET<IfcRelDefinesByTemplate>();
				}
				RelatedPropertySets.IsDefinedBy_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedPropertySets(java.util.Collection<IfcPropertySetDefinition> RelatedPropertySets)
	{
		if(RelatedPropertySets != null)
		{
			for(IfcPropertySetDefinition RelatedPropertySets$ : RelatedPropertySets)
			{
				synchronizeInversesAddRelatedPropertySets(RelatedPropertySets$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedPropertySets(IfcPropertySetDefinition RelatedPropertySets)
	{
		if(RelatedPropertySets != null)
		{
				if(RelatedPropertySets.IsDefinedBy_Inverse != null)
				{
					RelatedPropertySets.IsDefinedBy_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedPropertySets(java.util.Collection<IfcPropertySetDefinition> RelatedPropertySets)
	{
		if(RelatedPropertySets != null)
		{
			for(IfcPropertySetDefinition RelatedPropertySets$ : RelatedPropertySets)
			{
				synchronizeInversesRemoveRelatedPropertySets(RelatedPropertySets$);
			}
		}
	}

	/**
	* This method sets the RelatingTemplate attribute to the given value.
	*
	* @param RelatingTemplate OPTIONAL value to set
	**/
	public void setRelatingTemplate(IfcPropertySetTemplate RelatingTemplate)
	{
		synchronizeInversesRemoveRelatingTemplate(this.RelatingTemplate);
		this.RelatingTemplate = RelatingTemplate;
		synchronizeInversesAddRelatingTemplate(this.RelatingTemplate);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingTemplate attribute.
	*
	* @return the value of RelatingTemplate
	/**/
	public IfcPropertySetTemplate getRelatingTemplate()
	{
		return this.RelatingTemplate;
	}

	private void synchronizeInversesAddRelatingTemplate(IfcPropertySetTemplate RelatingTemplate)
	{
		if(RelatingTemplate != null)
		{
				if(RelatingTemplate.Defines_Inverse == null)
				{
					RelatingTemplate.Defines_Inverse = new SET<IfcRelDefinesByTemplate>();
				}
				RelatingTemplate.Defines_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingTemplate(IfcPropertySetTemplate RelatingTemplate)
	{
		if(RelatingTemplate != null)
		{
				if(RelatingTemplate.Defines_Inverse != null)
				{
					RelatingTemplate.Defines_Inverse.remove(this);
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
		IfcRelDefinesByTemplate ifcRelDefinesByTemplate = new IfcRelDefinesByTemplate();
		if(this.GlobalId != null)
			ifcRelDefinesByTemplate.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelDefinesByTemplate.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelDefinesByTemplate.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelDefinesByTemplate.setDescription((IfcText)this.Description.clone());
		if(this.RelatedPropertySets != null)
			ifcRelDefinesByTemplate.setRelatedPropertySets((SET<IfcPropertySetDefinition>)this.RelatedPropertySets.clone());
		if(this.RelatingTemplate != null)
			ifcRelDefinesByTemplate.setRelatingTemplate((IfcPropertySetTemplate)this.RelatingTemplate.clone());
		return ifcRelDefinesByTemplate;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelDefinesByTemplate ifcRelDefinesByTemplate = new IfcRelDefinesByTemplate();
		if(this.GlobalId != null)
			ifcRelDefinesByTemplate.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelDefinesByTemplate.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelDefinesByTemplate.setName(this.Name);
		if(this.Description != null)
			ifcRelDefinesByTemplate.setDescription(this.Description);
		if(this.RelatedPropertySets != null)
			ifcRelDefinesByTemplate.setRelatedPropertySets(this.RelatedPropertySets);
		if(this.RelatingTemplate != null)
			ifcRelDefinesByTemplate.setRelatingTemplate(this.RelatingTemplate);
		return ifcRelDefinesByTemplate;
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
