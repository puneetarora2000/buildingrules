/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcGrid<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcGrid extends IfcProduct implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcObjectPlacement","IfcProductRepresentation","LIST<IfcGridAxis>","LIST<IfcGridAxis>","LIST<IfcGridAxis>","IfcGridTypeEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** UAxes is an DEMANDED attribute - may not be null**/
	protected LIST<IfcGridAxis> UAxes;
	/** VAxes is an DEMANDED attribute - may not be null**/
	protected LIST<IfcGridAxis> VAxes;
	/** WAxes is an OPTIONAL attribute**/
	protected LIST<IfcGridAxis> WAxes;
	/** PredefinedType is an OPTIONAL attribute**/
	protected IfcGridTypeEnum PredefinedType;
	protected SET<IfcRelContainedInSpatialStructure> ContainedInStructure_Inverse;
	/**
	* The default constructor.
	**/
	public IfcGrid(){}

	/**
	* Constructs a new IfcGrid object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param UAxes DEMANDED parameter of type LIST<IfcGridAxis> - may not be null.
	* @param VAxes DEMANDED parameter of type LIST<IfcGridAxis> - may not be null.
	* @param WAxes OPTIONAL parameter of type LIST<IfcGridAxis>
	* @param PredefinedType OPTIONAL parameter of type IfcGridTypeEnum
	**/
	public IfcGrid(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, LIST<IfcGridAxis> UAxes, LIST<IfcGridAxis> VAxes, LIST<IfcGridAxis> WAxes, IfcGridTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.UAxes = UAxes;
		this.VAxes = VAxes;
		this.WAxes = WAxes;
		this.PredefinedType = PredefinedType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcGrid object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param UAxes DEMANDED parameter of type LIST<IfcGridAxis> - may not be null.
	* @param VAxes DEMANDED parameter of type LIST<IfcGridAxis> - may not be null.
	* @param WAxes OPTIONAL parameter of type LIST<IfcGridAxis>
	* @param PredefinedType OPTIONAL parameter of type IfcGridTypeEnum
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, LIST<IfcGridAxis> UAxes, LIST<IfcGridAxis> VAxes, LIST<IfcGridAxis> WAxes, IfcGridTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.UAxes = UAxes;
		this.VAxes = VAxes;
		this.WAxes = WAxes;
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
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.ObjectPlacement = (IfcObjectPlacement) parameters.get(5);
		this.Representation = (IfcProductRepresentation) parameters.get(6);
		this.UAxes = (LIST<IfcGridAxis>) parameters.get(7);
		this.VAxes = (LIST<IfcGridAxis>) parameters.get(8);
		this.WAxes = (LIST<IfcGridAxis>) parameters.get(9);
		this.PredefinedType = (IfcGridTypeEnum) parameters.get(10);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		ContainedInStructure_Inverse = null;
	}

	private void resolveInverses()
	{
		if(ObjectPlacement != null)
		{
				if(ObjectPlacement.PlacesObject_Inverse == null)
				{
					ObjectPlacement.PlacesObject_Inverse = new SET<IfcProduct>();
				}
				ObjectPlacement.PlacesObject_Inverse.add(this);
		}
		if(Representation != null)
		{
				if(Representation instanceof IfcProductDefinitionShape)
				{
				if(((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse == null)
				{
					((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse = new SET<IfcProduct>();
				}
				((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse.add(this);
				}
		}
		if(UAxes != null)
		{
			for(IfcGridAxis UAxes$ : UAxes)
			{
				if(UAxes$.PartOfU_Inverse == null)
				{
					UAxes$.PartOfU_Inverse = new SET<IfcGrid>();
				}
				UAxes$.PartOfU_Inverse.add(this);
			}
		}
		if(VAxes != null)
		{
			for(IfcGridAxis VAxes$ : VAxes)
			{
				if(VAxes$.PartOfV_Inverse == null)
				{
					VAxes$.PartOfV_Inverse = new SET<IfcGrid>();
				}
				VAxes$.PartOfV_Inverse.add(this);
			}
		}
		if(WAxes != null)
		{
			for(IfcGridAxis WAxes$ : WAxes)
			{
				if(WAxes$.PartOfW_Inverse == null)
				{
					WAxes$.PartOfW_Inverse = new SET<IfcGrid>();
				}
				WAxes$.PartOfW_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcGrid.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCGRID(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ObjectType")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectType != null)		stepString = stepString.concat(((RootInterface)this.ObjectType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ObjectPlacement")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectPlacement != null)		stepString = stepString.concat(((RootInterface)this.ObjectPlacement).getStepParameter(IfcObjectPlacement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Representation")) stepString = stepString.concat("*,");
		else{
		if(this.Representation != null)		stepString = stepString.concat(((RootInterface)this.Representation).getStepParameter(IfcProductRepresentation.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UAxes")) stepString = stepString.concat("*,");
		else{
		if(this.UAxes != null)		stepString = stepString.concat(((RootInterface)this.UAxes).getStepParameter(IfcGridAxis.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VAxes")) stepString = stepString.concat("*,");
		else{
		if(this.VAxes != null)		stepString = stepString.concat(((RootInterface)this.VAxes).getStepParameter(IfcGridAxis.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WAxes")) stepString = stepString.concat("*,");
		else{
		if(this.WAxes != null)		stepString = stepString.concat(((RootInterface)this.WAxes).getStepParameter(IfcGridAxis.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*);");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcGridTypeEnum.class.isInterface())+");");
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
	* This method returns a copy of the set of the ContainedInStructure_Inverse attribute.
	*
	* @return a copy of the ContainedInStructure_Inverse set
	**/
	public SET<IfcRelContainedInSpatialStructure> getContainedInStructure_Inverse()
	{
		if(this.ContainedInStructure_Inverse != null)
			return new SET<IfcRelContainedInSpatialStructure>(this.ContainedInStructure_Inverse);
		return null;
	}

	/**
	* This method sets the UAxes attribute to the given value.
	*
	* @param UAxes OPTIONAL value to set
	**/
	public void setUAxes(LIST<IfcGridAxis> UAxes)
	{
		synchronizeInversesRemoveUAxes(this.UAxes);
		this.UAxes = UAxes;
		synchronizeInversesAddUAxes(this.UAxes);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the UAxes attribute.
	*
	* @return a copy of the UAxes list
	**/
	public LIST<IfcGridAxis> getUAxes()
	{
		if(this.UAxes != null)
			return new LIST<IfcGridAxis>(this.UAxes);
		return null;
	}

	/**
	* This method adds an IfcGridAxis object to the UAxes list.
	* @param UAxes element to be appended to this list.
	**/
	public void addUAxes(IfcGridAxis UAxes)
	{
		if(this.UAxes == null)
			this.UAxes = new LIST<IfcGridAxis>();
		this.UAxes.add(UAxes);
		synchronizeInversesAddUAxes(UAxes);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcGridAxis objects to the UAxes list.
	* @param UAxes collection containing elements to be added to this list.
	**/
	public void addAllUAxes(java.util.Collection<IfcGridAxis> UAxes)
	{
		if(this.UAxes == null)
			this.UAxes = new LIST<IfcGridAxis>();
		this.UAxes.addAll(UAxes);
		synchronizeInversesAddUAxes(UAxes);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the UAxes list.
	**/
	public void clearUAxes()
	{
		if(this.UAxes != null)
		{
			synchronizeInversesRemoveUAxes(this.UAxes);
			this.UAxes.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcGridAxis object from the UAxes list.
	* @param UAxes element to be removed from this list.
	**/
	public void removeUAxes(IfcGridAxis UAxes)
	{
		if(this.UAxes != null)
		{
			this.UAxes.remove(UAxes);
			synchronizeInversesRemoveUAxes(UAxes);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcGridAxis objects from the UAxes list.
	* @param UAxes collection containing elements to be removed from this list.
	**/
	public void removeAllUAxes(java.util.Collection<IfcGridAxis> UAxes)
	{
		if(this.UAxes != null)
		{
			this.UAxes.removeAll(UAxes);
			synchronizeInversesRemoveUAxes(UAxes);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddUAxes(IfcGridAxis UAxes)
	{
		if(UAxes != null)
		{
				if(UAxes.PartOfU_Inverse == null)
				{
					UAxes.PartOfU_Inverse = new SET<IfcGrid>();
				}
				UAxes.PartOfU_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddUAxes(java.util.Collection<IfcGridAxis> UAxes)
	{
		if(UAxes != null)
		{
			for(IfcGridAxis UAxes$ : UAxes)
			{
				synchronizeInversesAddUAxes(UAxes$);
			}
		}
	}

	private void synchronizeInversesRemoveUAxes(IfcGridAxis UAxes)
	{
		if(UAxes != null)
		{
				if(UAxes.PartOfU_Inverse != null)
				{
					UAxes.PartOfU_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveUAxes(java.util.Collection<IfcGridAxis> UAxes)
	{
		if(UAxes != null)
		{
			for(IfcGridAxis UAxes$ : UAxes)
			{
				synchronizeInversesRemoveUAxes(UAxes$);
			}
		}
	}

	/**
	* This method sets the VAxes attribute to the given value.
	*
	* @param VAxes OPTIONAL value to set
	**/
	public void setVAxes(LIST<IfcGridAxis> VAxes)
	{
		synchronizeInversesRemoveVAxes(this.VAxes);
		this.VAxes = VAxes;
		synchronizeInversesAddVAxes(this.VAxes);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the VAxes attribute.
	*
	* @return a copy of the VAxes list
	**/
	public LIST<IfcGridAxis> getVAxes()
	{
		if(this.VAxes != null)
			return new LIST<IfcGridAxis>(this.VAxes);
		return null;
	}

	/**
	* This method adds an IfcGridAxis object to the VAxes list.
	* @param VAxes element to be appended to this list.
	**/
	public void addVAxes(IfcGridAxis VAxes)
	{
		if(this.VAxes == null)
			this.VAxes = new LIST<IfcGridAxis>();
		this.VAxes.add(VAxes);
		synchronizeInversesAddVAxes(VAxes);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcGridAxis objects to the VAxes list.
	* @param VAxes collection containing elements to be added to this list.
	**/
	public void addAllVAxes(java.util.Collection<IfcGridAxis> VAxes)
	{
		if(this.VAxes == null)
			this.VAxes = new LIST<IfcGridAxis>();
		this.VAxes.addAll(VAxes);
		synchronizeInversesAddVAxes(VAxes);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the VAxes list.
	**/
	public void clearVAxes()
	{
		if(this.VAxes != null)
		{
			synchronizeInversesRemoveVAxes(this.VAxes);
			this.VAxes.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcGridAxis object from the VAxes list.
	* @param VAxes element to be removed from this list.
	**/
	public void removeVAxes(IfcGridAxis VAxes)
	{
		if(this.VAxes != null)
		{
			this.VAxes.remove(VAxes);
			synchronizeInversesRemoveVAxes(VAxes);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcGridAxis objects from the VAxes list.
	* @param VAxes collection containing elements to be removed from this list.
	**/
	public void removeAllVAxes(java.util.Collection<IfcGridAxis> VAxes)
	{
		if(this.VAxes != null)
		{
			this.VAxes.removeAll(VAxes);
			synchronizeInversesRemoveVAxes(VAxes);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddVAxes(IfcGridAxis VAxes)
	{
		if(VAxes != null)
		{
				if(VAxes.PartOfV_Inverse == null)
				{
					VAxes.PartOfV_Inverse = new SET<IfcGrid>();
				}
				VAxes.PartOfV_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddVAxes(java.util.Collection<IfcGridAxis> VAxes)
	{
		if(VAxes != null)
		{
			for(IfcGridAxis VAxes$ : VAxes)
			{
				synchronizeInversesAddVAxes(VAxes$);
			}
		}
	}

	private void synchronizeInversesRemoveVAxes(IfcGridAxis VAxes)
	{
		if(VAxes != null)
		{
				if(VAxes.PartOfV_Inverse != null)
				{
					VAxes.PartOfV_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveVAxes(java.util.Collection<IfcGridAxis> VAxes)
	{
		if(VAxes != null)
		{
			for(IfcGridAxis VAxes$ : VAxes)
			{
				synchronizeInversesRemoveVAxes(VAxes$);
			}
		}
	}

	/**
	* This method sets the WAxes attribute to the given value.
	*
	* @param WAxes DEMANDED value to set - may not be null
	**/
	public void setWAxes(LIST<IfcGridAxis> WAxes)
	{
		synchronizeInversesRemoveWAxes(this.WAxes);
		this.WAxes = WAxes;
		synchronizeInversesAddWAxes(this.WAxes);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the WAxes attribute.
	*
	* @return a copy of the WAxes list
	**/
	public LIST<IfcGridAxis> getWAxes()
	{
		if(this.WAxes != null)
			return new LIST<IfcGridAxis>(this.WAxes);
		return null;
	}

	/**
	* This method adds an IfcGridAxis object to the WAxes list.
	* @param WAxes element to be appended to this list.
	**/
	public void addWAxes(IfcGridAxis WAxes)
	{
		if(this.WAxes == null)
			this.WAxes = new LIST<IfcGridAxis>();
		this.WAxes.add(WAxes);
		synchronizeInversesAddWAxes(WAxes);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcGridAxis objects to the WAxes list.
	* @param WAxes collection containing elements to be added to this list.
	**/
	public void addAllWAxes(java.util.Collection<IfcGridAxis> WAxes)
	{
		if(this.WAxes == null)
			this.WAxes = new LIST<IfcGridAxis>();
		this.WAxes.addAll(WAxes);
		synchronizeInversesAddWAxes(WAxes);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the WAxes list.
	**/
	public void clearWAxes()
	{
		if(this.WAxes != null)
		{
			synchronizeInversesRemoveWAxes(this.WAxes);
			this.WAxes.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcGridAxis object from the WAxes list.
	* @param WAxes element to be removed from this list.
	**/
	public void removeWAxes(IfcGridAxis WAxes)
	{
		if(this.WAxes != null)
		{
			this.WAxes.remove(WAxes);
			synchronizeInversesRemoveWAxes(WAxes);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcGridAxis objects from the WAxes list.
	* @param WAxes collection containing elements to be removed from this list.
	**/
	public void removeAllWAxes(java.util.Collection<IfcGridAxis> WAxes)
	{
		if(this.WAxes != null)
		{
			this.WAxes.removeAll(WAxes);
			synchronizeInversesRemoveWAxes(WAxes);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddWAxes(IfcGridAxis WAxes)
	{
		if(WAxes != null)
		{
				if(WAxes.PartOfW_Inverse == null)
				{
					WAxes.PartOfW_Inverse = new SET<IfcGrid>();
				}
				WAxes.PartOfW_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddWAxes(java.util.Collection<IfcGridAxis> WAxes)
	{
		if(WAxes != null)
		{
			for(IfcGridAxis WAxes$ : WAxes)
			{
				synchronizeInversesAddWAxes(WAxes$);
			}
		}
	}

	private void synchronizeInversesRemoveWAxes(IfcGridAxis WAxes)
	{
		if(WAxes != null)
		{
				if(WAxes.PartOfW_Inverse != null)
				{
					WAxes.PartOfW_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveWAxes(java.util.Collection<IfcGridAxis> WAxes)
	{
		if(WAxes != null)
		{
			for(IfcGridAxis WAxes$ : WAxes)
			{
				synchronizeInversesRemoveWAxes(WAxes$);
			}
		}
	}

	/**
	* This method sets the PredefinedType attribute to the given value.
	*
	* @param PredefinedType DEMANDED value to set - may not be null
	**/
	public void setPredefinedType(IfcGridTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcGridTypeEnum getPredefinedType()
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
		IfcGrid ifcGrid = new IfcGrid();
		if(this.GlobalId != null)
			ifcGrid.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcGrid.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcGrid.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcGrid.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcGrid.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.ObjectPlacement != null)
			ifcGrid.setObjectPlacement((IfcObjectPlacement)this.ObjectPlacement.clone());
		if(this.Representation != null)
			ifcGrid.setRepresentation((IfcProductRepresentation)this.Representation.clone());
		if(this.UAxes != null)
			ifcGrid.setUAxes((LIST<IfcGridAxis>)this.UAxes.clone());
		if(this.VAxes != null)
			ifcGrid.setVAxes((LIST<IfcGridAxis>)this.VAxes.clone());
		if(this.WAxes != null)
			ifcGrid.setWAxes((LIST<IfcGridAxis>)this.WAxes.clone());
		if(this.PredefinedType != null)
			ifcGrid.setPredefinedType((IfcGridTypeEnum)this.PredefinedType.clone());
		return ifcGrid;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcGrid ifcGrid = new IfcGrid();
		if(this.GlobalId != null)
			ifcGrid.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcGrid.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcGrid.setName(this.Name);
		if(this.Description != null)
			ifcGrid.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcGrid.setObjectType(this.ObjectType);
		if(this.ObjectPlacement != null)
			ifcGrid.setObjectPlacement(this.ObjectPlacement);
		if(this.Representation != null)
			ifcGrid.setRepresentation(this.Representation);
		if(this.UAxes != null)
			ifcGrid.setUAxes(this.UAxes);
		if(this.VAxes != null)
			ifcGrid.setVAxes(this.VAxes);
		if(this.WAxes != null)
			ifcGrid.setWAxes(this.WAxes);
		if(this.PredefinedType != null)
			ifcGrid.setPredefinedType(this.PredefinedType);
		return ifcGrid;
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
