/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcChimneyType<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcChimneyType extends IfcBuildingElementType implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcIdentifier","SET<IfcPropertySetDefinition>","LIST<IfcRepresentationMap>","IfcLabel","IfcLabel","IfcChimneyTypeEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** PredefinedType is an DEMANDED attribute - may not be null**/
	protected IfcChimneyTypeEnum PredefinedType;
	/**
	* The default constructor.
	**/
	public IfcChimneyType(){}

	/**
	* Constructs a new IfcChimneyType object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableOccurrence OPTIONAL parameter of type IfcIdentifier
	* @param HasPropertySets OPTIONAL parameter of type SET<IfcPropertySetDefinition>
	* @param RepresentationMaps OPTIONAL parameter of type LIST<IfcRepresentationMap>
	* @param Tag OPTIONAL parameter of type IfcLabel
	* @param ElementType OPTIONAL parameter of type IfcLabel
	* @param PredefinedType DEMANDED parameter of type IfcChimneyTypeEnum - may not be null.
	**/
	public IfcChimneyType(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcIdentifier ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, LIST<IfcRepresentationMap> RepresentationMaps, IfcLabel Tag, IfcLabel ElementType, IfcChimneyTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableOccurrence = ApplicableOccurrence;
		this.HasPropertySets = HasPropertySets;
		this.RepresentationMaps = RepresentationMaps;
		this.Tag = Tag;
		this.ElementType = ElementType;
		this.PredefinedType = PredefinedType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcChimneyType object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableOccurrence OPTIONAL parameter of type IfcIdentifier
	* @param HasPropertySets OPTIONAL parameter of type SET<IfcPropertySetDefinition>
	* @param RepresentationMaps OPTIONAL parameter of type LIST<IfcRepresentationMap>
	* @param Tag OPTIONAL parameter of type IfcLabel
	* @param ElementType OPTIONAL parameter of type IfcLabel
	* @param PredefinedType DEMANDED parameter of type IfcChimneyTypeEnum - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcIdentifier ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, LIST<IfcRepresentationMap> RepresentationMaps, IfcLabel Tag, IfcLabel ElementType, IfcChimneyTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableOccurrence = ApplicableOccurrence;
		this.HasPropertySets = HasPropertySets;
		this.RepresentationMaps = RepresentationMaps;
		this.Tag = Tag;
		this.ElementType = ElementType;
		this.PredefinedType = PredefinedType;
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
		this.ApplicableOccurrence = (IfcIdentifier) parameters.get(4);
		this.HasPropertySets = (SET<IfcPropertySetDefinition>) parameters.get(5);
		this.RepresentationMaps = (LIST<IfcRepresentationMap>) parameters.get(6);
		this.Tag = (IfcLabel) parameters.get(7);
		this.ElementType = (IfcLabel) parameters.get(8);
		this.PredefinedType = (IfcChimneyTypeEnum) parameters.get(9);
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
		if(HasPropertySets != null)
		{
			for(IfcPropertySetDefinition HasPropertySets$ : HasPropertySets)
			{
				if(HasPropertySets$.DefinesType_Inverse == null)
				{
					HasPropertySets$.DefinesType_Inverse = new SET<IfcTypeObject>();
				}
				HasPropertySets$.DefinesType_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcChimneyType.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCHIMNEYTYPE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ApplicableOccurrence")) stepString = stepString.concat("*,");
		else{
		if(this.ApplicableOccurrence != null)		stepString = stepString.concat(((RootInterface)this.ApplicableOccurrence).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("HasPropertySets")) stepString = stepString.concat("*,");
		else{
		if(this.HasPropertySets != null)		stepString = stepString.concat(((RootInterface)this.HasPropertySets).getStepParameter(IfcPropertySetDefinition.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RepresentationMaps")) stepString = stepString.concat("*,");
		else{
		if(this.RepresentationMaps != null)		stepString = stepString.concat(((RootInterface)this.RepresentationMaps).getStepParameter(IfcRepresentationMap.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Tag")) stepString = stepString.concat("*,");
		else{
		if(this.Tag != null)		stepString = stepString.concat(((RootInterface)this.Tag).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ElementType")) stepString = stepString.concat("*,");
		else{
		if(this.ElementType != null)		stepString = stepString.concat(((RootInterface)this.ElementType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*);");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcChimneyTypeEnum.class.isInterface())+");");
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
	* This method sets the PredefinedType attribute to the given value.
	*
	* @param PredefinedType OPTIONAL value to set
	**/
	public void setPredefinedType(IfcChimneyTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcChimneyTypeEnum getPredefinedType()
	{
		return this.PredefinedType;
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
		IfcChimneyType ifcChimneyType = new IfcChimneyType();
		if(this.GlobalId != null)
			ifcChimneyType.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcChimneyType.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcChimneyType.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcChimneyType.setDescription((IfcText)this.Description.clone());
		if(this.ApplicableOccurrence != null)
			ifcChimneyType.setApplicableOccurrence((IfcIdentifier)this.ApplicableOccurrence.clone());
		if(this.HasPropertySets != null)
			ifcChimneyType.setHasPropertySets((SET<IfcPropertySetDefinition>)this.HasPropertySets.clone());
		if(this.RepresentationMaps != null)
			ifcChimneyType.setRepresentationMaps((LIST<IfcRepresentationMap>)this.RepresentationMaps.clone());
		if(this.Tag != null)
			ifcChimneyType.setTag((IfcLabel)this.Tag.clone());
		if(this.ElementType != null)
			ifcChimneyType.setElementType((IfcLabel)this.ElementType.clone());
		if(this.PredefinedType != null)
			ifcChimneyType.setPredefinedType((IfcChimneyTypeEnum)this.PredefinedType.clone());
		return ifcChimneyType;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcChimneyType ifcChimneyType = new IfcChimneyType();
		if(this.GlobalId != null)
			ifcChimneyType.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcChimneyType.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcChimneyType.setName(this.Name);
		if(this.Description != null)
			ifcChimneyType.setDescription(this.Description);
		if(this.ApplicableOccurrence != null)
			ifcChimneyType.setApplicableOccurrence(this.ApplicableOccurrence);
		if(this.HasPropertySets != null)
			ifcChimneyType.setHasPropertySets(this.HasPropertySets);
		if(this.RepresentationMaps != null)
			ifcChimneyType.setRepresentationMaps(this.RepresentationMaps);
		if(this.Tag != null)
			ifcChimneyType.setTag(this.Tag);
		if(this.ElementType != null)
			ifcChimneyType.setElementType(this.ElementType);
		if(this.PredefinedType != null)
			ifcChimneyType.setPredefinedType(this.PredefinedType);
		return ifcChimneyType;
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
