/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcReinforcingBarType<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcReinforcingBarType extends IfcReinforcingElementType implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcIdentifier","SET<IfcPropertySetDefinition>","LIST<IfcRepresentationMap>","IfcLabel","IfcLabel","IfcReinforcingBarTypeEnum","IfcPositiveLengthMeasure","IfcAreaMeasure","IfcPositiveLengthMeasure","IfcReinforcingBarSurfaceEnum","IfcLabel","LIST<IfcBendingParameterSelect>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** PredefinedType is an DEMANDED attribute - may not be null**/
	protected IfcReinforcingBarTypeEnum PredefinedType;
	/** NominalDiameter is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure NominalDiameter;
	/** CrossSectionArea is an OPTIONAL attribute**/
	protected IfcAreaMeasure CrossSectionArea;
	/** BarLength is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure BarLength;
	/** BarSurface is an OPTIONAL attribute**/
	protected IfcReinforcingBarSurfaceEnum BarSurface;
	/** BendingShapeCode is an OPTIONAL attribute**/
	protected IfcLabel BendingShapeCode;
	/** BendingParameters is an OPTIONAL attribute**/
	protected LIST<IfcBendingParameterSelect> BendingParameters;
	/**
	* The default constructor.
	**/
	public IfcReinforcingBarType(){}

	/**
	* Constructs a new IfcReinforcingBarType object using the given parameters.
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
	* @param PredefinedType DEMANDED parameter of type IfcReinforcingBarTypeEnum - may not be null.
	* @param NominalDiameter OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param CrossSectionArea OPTIONAL parameter of type IfcAreaMeasure
	* @param BarLength OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param BarSurface OPTIONAL parameter of type IfcReinforcingBarSurfaceEnum
	* @param BendingShapeCode OPTIONAL parameter of type IfcLabel
	* @param BendingParameters OPTIONAL parameter of type LIST<IfcBendingParameterSelect>
	**/
	public IfcReinforcingBarType(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcIdentifier ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, LIST<IfcRepresentationMap> RepresentationMaps, IfcLabel Tag, IfcLabel ElementType, IfcReinforcingBarTypeEnum PredefinedType, IfcPositiveLengthMeasure NominalDiameter, IfcAreaMeasure CrossSectionArea, IfcPositiveLengthMeasure BarLength, IfcReinforcingBarSurfaceEnum BarSurface, IfcLabel BendingShapeCode, LIST<IfcBendingParameterSelect> BendingParameters)
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
		this.NominalDiameter = NominalDiameter;
		this.CrossSectionArea = CrossSectionArea;
		this.BarLength = BarLength;
		this.BarSurface = BarSurface;
		this.BendingShapeCode = BendingShapeCode;
		this.BendingParameters = BendingParameters;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcReinforcingBarType object using the given parameters.
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
	* @param PredefinedType DEMANDED parameter of type IfcReinforcingBarTypeEnum - may not be null.
	* @param NominalDiameter OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param CrossSectionArea OPTIONAL parameter of type IfcAreaMeasure
	* @param BarLength OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param BarSurface OPTIONAL parameter of type IfcReinforcingBarSurfaceEnum
	* @param BendingShapeCode OPTIONAL parameter of type IfcLabel
	* @param BendingParameters OPTIONAL parameter of type LIST<IfcBendingParameterSelect>
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcIdentifier ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, LIST<IfcRepresentationMap> RepresentationMaps, IfcLabel Tag, IfcLabel ElementType, IfcReinforcingBarTypeEnum PredefinedType, IfcPositiveLengthMeasure NominalDiameter, IfcAreaMeasure CrossSectionArea, IfcPositiveLengthMeasure BarLength, IfcReinforcingBarSurfaceEnum BarSurface, IfcLabel BendingShapeCode, LIST<IfcBendingParameterSelect> BendingParameters)
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
		this.NominalDiameter = NominalDiameter;
		this.CrossSectionArea = CrossSectionArea;
		this.BarLength = BarLength;
		this.BarSurface = BarSurface;
		this.BendingShapeCode = BendingShapeCode;
		this.BendingParameters = BendingParameters;
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
		this.PredefinedType = (IfcReinforcingBarTypeEnum) parameters.get(9);
		this.NominalDiameter = (IfcPositiveLengthMeasure) parameters.get(10);
		this.CrossSectionArea = (IfcAreaMeasure) parameters.get(11);
		this.BarLength = (IfcPositiveLengthMeasure) parameters.get(12);
		this.BarSurface = (IfcReinforcingBarSurfaceEnum) parameters.get(13);
		this.BendingShapeCode = (IfcLabel) parameters.get(14);
		this.BendingParameters = (LIST<IfcBendingParameterSelect>) parameters.get(15);
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
		return IfcReinforcingBarType.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCREINFORCINGBARTYPE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*,");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcReinforcingBarTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("NominalDiameter")) stepString = stepString.concat("*,");
		else{
		if(this.NominalDiameter != null)		stepString = stepString.concat(((RootInterface)this.NominalDiameter).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CrossSectionArea")) stepString = stepString.concat("*,");
		else{
		if(this.CrossSectionArea != null)		stepString = stepString.concat(((RootInterface)this.CrossSectionArea).getStepParameter(IfcAreaMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BarLength")) stepString = stepString.concat("*,");
		else{
		if(this.BarLength != null)		stepString = stepString.concat(((RootInterface)this.BarLength).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BarSurface")) stepString = stepString.concat("*,");
		else{
		if(this.BarSurface != null)		stepString = stepString.concat(((RootInterface)this.BarSurface).getStepParameter(IfcReinforcingBarSurfaceEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BendingShapeCode")) stepString = stepString.concat("*,");
		else{
		if(this.BendingShapeCode != null)		stepString = stepString.concat(((RootInterface)this.BendingShapeCode).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BendingParameters")) stepString = stepString.concat("*);");
		else{
		if(this.BendingParameters != null)		stepString = stepString.concat(((RootInterface)this.BendingParameters).getStepParameter(IfcBendingParameterSelect.class.isInterface())+");");
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
	public void setPredefinedType(IfcReinforcingBarTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcReinforcingBarTypeEnum getPredefinedType()
	{
		return this.PredefinedType;
	}

	/**
	* This method sets the NominalDiameter attribute to the given value.
	*
	* @param NominalDiameter DEMANDED value to set - may not be null
	**/
	public void setNominalDiameter(IfcPositiveLengthMeasure NominalDiameter)
	{
		this.NominalDiameter = NominalDiameter;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the NominalDiameter attribute.
	*
	* @return the value of NominalDiameter
	/**/
	public IfcPositiveLengthMeasure getNominalDiameter()
	{
		return this.NominalDiameter;
	}

	/**
	* This method sets the CrossSectionArea attribute to the given value.
	*
	* @param CrossSectionArea DEMANDED value to set - may not be null
	**/
	public void setCrossSectionArea(IfcAreaMeasure CrossSectionArea)
	{
		this.CrossSectionArea = CrossSectionArea;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CrossSectionArea attribute.
	*
	* @return the value of CrossSectionArea
	/**/
	public IfcAreaMeasure getCrossSectionArea()
	{
		return this.CrossSectionArea;
	}

	/**
	* This method sets the BarLength attribute to the given value.
	*
	* @param BarLength DEMANDED value to set - may not be null
	**/
	public void setBarLength(IfcPositiveLengthMeasure BarLength)
	{
		this.BarLength = BarLength;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BarLength attribute.
	*
	* @return the value of BarLength
	/**/
	public IfcPositiveLengthMeasure getBarLength()
	{
		return this.BarLength;
	}

	/**
	* This method sets the BarSurface attribute to the given value.
	*
	* @param BarSurface DEMANDED value to set - may not be null
	**/
	public void setBarSurface(IfcReinforcingBarSurfaceEnum BarSurface)
	{
		this.BarSurface = BarSurface;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BarSurface attribute.
	*
	* @return the value of BarSurface
	/**/
	public IfcReinforcingBarSurfaceEnum getBarSurface()
	{
		return this.BarSurface;
	}

	/**
	* This method sets the BendingShapeCode attribute to the given value.
	*
	* @param BendingShapeCode DEMANDED value to set - may not be null
	**/
	public void setBendingShapeCode(IfcLabel BendingShapeCode)
	{
		this.BendingShapeCode = BendingShapeCode;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BendingShapeCode attribute.
	*
	* @return the value of BendingShapeCode
	/**/
	public IfcLabel getBendingShapeCode()
	{
		return this.BendingShapeCode;
	}

	/**
	* This method sets the BendingParameters attribute to the given value.
	*
	* @param BendingParameters DEMANDED value to set - may not be null
	**/
	public void setBendingParameters(LIST<IfcBendingParameterSelect> BendingParameters)
	{
		this.BendingParameters = BendingParameters;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the BendingParameters attribute.
	*
	* @return a copy of the BendingParameters list
	**/
	public LIST<IfcBendingParameterSelect> getBendingParameters()
	{
		if(this.BendingParameters != null)
			return new LIST<IfcBendingParameterSelect>(this.BendingParameters);
		return null;
	}

	/**
	* This method adds an IfcBendingParameterSelect object to the BendingParameters list.
	* @param BendingParameters element to be appended to this list.
	**/
	public void addBendingParameters(IfcBendingParameterSelect BendingParameters)
	{
		if(this.BendingParameters == null)
			this.BendingParameters = new LIST<IfcBendingParameterSelect>();
		this.BendingParameters.add(BendingParameters);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcBendingParameterSelect objects to the BendingParameters list.
	* @param BendingParameters collection containing elements to be added to this list.
	**/
	public void addAllBendingParameters(java.util.Collection<IfcBendingParameterSelect> BendingParameters)
	{
		if(this.BendingParameters == null)
			this.BendingParameters = new LIST<IfcBendingParameterSelect>();
		this.BendingParameters.addAll(BendingParameters);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the BendingParameters list.
	**/
	public void clearBendingParameters()
	{
		if(this.BendingParameters != null)
		{
			this.BendingParameters.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcBendingParameterSelect object from the BendingParameters list.
	* @param BendingParameters element to be removed from this list.
	**/
	public void removeBendingParameters(IfcBendingParameterSelect BendingParameters)
	{
		if(this.BendingParameters != null)
		{
			this.BendingParameters.remove(BendingParameters);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcBendingParameterSelect objects from the BendingParameters list.
	* @param BendingParameters collection containing elements to be removed from this list.
	**/
	public void removeAllBendingParameters(java.util.Collection<IfcBendingParameterSelect> BendingParameters)
	{
		if(this.BendingParameters != null)
		{
			this.BendingParameters.removeAll(BendingParameters);
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
		IfcReinforcingBarType ifcReinforcingBarType = new IfcReinforcingBarType();
		if(this.GlobalId != null)
			ifcReinforcingBarType.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcReinforcingBarType.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcReinforcingBarType.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcReinforcingBarType.setDescription((IfcText)this.Description.clone());
		if(this.ApplicableOccurrence != null)
			ifcReinforcingBarType.setApplicableOccurrence((IfcIdentifier)this.ApplicableOccurrence.clone());
		if(this.HasPropertySets != null)
			ifcReinforcingBarType.setHasPropertySets((SET<IfcPropertySetDefinition>)this.HasPropertySets.clone());
		if(this.RepresentationMaps != null)
			ifcReinforcingBarType.setRepresentationMaps((LIST<IfcRepresentationMap>)this.RepresentationMaps.clone());
		if(this.Tag != null)
			ifcReinforcingBarType.setTag((IfcLabel)this.Tag.clone());
		if(this.ElementType != null)
			ifcReinforcingBarType.setElementType((IfcLabel)this.ElementType.clone());
		if(this.PredefinedType != null)
			ifcReinforcingBarType.setPredefinedType((IfcReinforcingBarTypeEnum)this.PredefinedType.clone());
		if(this.NominalDiameter != null)
			ifcReinforcingBarType.setNominalDiameter((IfcPositiveLengthMeasure)this.NominalDiameter.clone());
		if(this.CrossSectionArea != null)
			ifcReinforcingBarType.setCrossSectionArea((IfcAreaMeasure)this.CrossSectionArea.clone());
		if(this.BarLength != null)
			ifcReinforcingBarType.setBarLength((IfcPositiveLengthMeasure)this.BarLength.clone());
		if(this.BarSurface != null)
			ifcReinforcingBarType.setBarSurface((IfcReinforcingBarSurfaceEnum)this.BarSurface.clone());
		if(this.BendingShapeCode != null)
			ifcReinforcingBarType.setBendingShapeCode((IfcLabel)this.BendingShapeCode.clone());
		if(this.BendingParameters != null)
			ifcReinforcingBarType.setBendingParameters((LIST<IfcBendingParameterSelect>)this.BendingParameters.clone());
		return ifcReinforcingBarType;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcReinforcingBarType ifcReinforcingBarType = new IfcReinforcingBarType();
		if(this.GlobalId != null)
			ifcReinforcingBarType.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcReinforcingBarType.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcReinforcingBarType.setName(this.Name);
		if(this.Description != null)
			ifcReinforcingBarType.setDescription(this.Description);
		if(this.ApplicableOccurrence != null)
			ifcReinforcingBarType.setApplicableOccurrence(this.ApplicableOccurrence);
		if(this.HasPropertySets != null)
			ifcReinforcingBarType.setHasPropertySets(this.HasPropertySets);
		if(this.RepresentationMaps != null)
			ifcReinforcingBarType.setRepresentationMaps(this.RepresentationMaps);
		if(this.Tag != null)
			ifcReinforcingBarType.setTag(this.Tag);
		if(this.ElementType != null)
			ifcReinforcingBarType.setElementType(this.ElementType);
		if(this.PredefinedType != null)
			ifcReinforcingBarType.setPredefinedType(this.PredefinedType);
		if(this.NominalDiameter != null)
			ifcReinforcingBarType.setNominalDiameter(this.NominalDiameter);
		if(this.CrossSectionArea != null)
			ifcReinforcingBarType.setCrossSectionArea(this.CrossSectionArea);
		if(this.BarLength != null)
			ifcReinforcingBarType.setBarLength(this.BarLength);
		if(this.BarSurface != null)
			ifcReinforcingBarType.setBarSurface(this.BarSurface);
		if(this.BendingShapeCode != null)
			ifcReinforcingBarType.setBendingShapeCode(this.BendingShapeCode);
		if(this.BendingParameters != null)
			ifcReinforcingBarType.setBendingParameters(this.BendingParameters);
		return ifcReinforcingBarType;
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
