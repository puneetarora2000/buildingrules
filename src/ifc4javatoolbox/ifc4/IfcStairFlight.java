/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcStairFlight<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcStairFlight extends IfcBuildingElement implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcObjectPlacement","IfcProductRepresentation","IfcIdentifier","INTEGER","INTEGER","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcStairFlightTypeEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** NumberOfRiser is an OPTIONAL attribute**/
	protected INTEGER NumberOfRiser;
	/** NumberOfTreads is an OPTIONAL attribute**/
	protected INTEGER NumberOfTreads;
	/** RiserHeight is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure RiserHeight;
	/** TreadLength is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure TreadLength;
	/** PredefinedType is an OPTIONAL attribute**/
	protected IfcStairFlightTypeEnum PredefinedType;
	/**
	* The default constructor.
	**/
	public IfcStairFlight(){}

	/**
	* Constructs a new IfcStairFlight object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param Tag OPTIONAL parameter of type IfcIdentifier
	* @param NumberOfRiser OPTIONAL parameter of type INTEGER
	* @param NumberOfTreads OPTIONAL parameter of type INTEGER
	* @param RiserHeight OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param TreadLength OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param PredefinedType OPTIONAL parameter of type IfcStairFlightTypeEnum
	**/
	public IfcStairFlight(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcIdentifier Tag, INTEGER NumberOfRiser, INTEGER NumberOfTreads, IfcPositiveLengthMeasure RiserHeight, IfcPositiveLengthMeasure TreadLength, IfcStairFlightTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.Tag = Tag;
		this.NumberOfRiser = NumberOfRiser;
		this.NumberOfTreads = NumberOfTreads;
		this.RiserHeight = RiserHeight;
		this.TreadLength = TreadLength;
		this.PredefinedType = PredefinedType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcStairFlight object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory OPTIONAL parameter of type IfcOwnerHistory
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param Tag OPTIONAL parameter of type IfcIdentifier
	* @param NumberOfRiser OPTIONAL parameter of type INTEGER
	* @param NumberOfTreads OPTIONAL parameter of type INTEGER
	* @param RiserHeight OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param TreadLength OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param PredefinedType OPTIONAL parameter of type IfcStairFlightTypeEnum
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcIdentifier Tag, INTEGER NumberOfRiser, INTEGER NumberOfTreads, IfcPositiveLengthMeasure RiserHeight, IfcPositiveLengthMeasure TreadLength, IfcStairFlightTypeEnum PredefinedType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.Tag = Tag;
		this.NumberOfRiser = NumberOfRiser;
		this.NumberOfTreads = NumberOfTreads;
		this.RiserHeight = RiserHeight;
		this.TreadLength = TreadLength;
		this.PredefinedType = PredefinedType;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.ObjectPlacement = (IfcObjectPlacement) parameters.get(5);
		this.Representation = (IfcProductRepresentation) parameters.get(6);
		this.Tag = (IfcIdentifier) parameters.get(7);
		this.NumberOfRiser = (INTEGER) parameters.get(8);
		this.NumberOfTreads = (INTEGER) parameters.get(9);
		this.RiserHeight = (IfcPositiveLengthMeasure) parameters.get(10);
		this.TreadLength = (IfcPositiveLengthMeasure) parameters.get(11);
		this.PredefinedType = (IfcStairFlightTypeEnum) parameters.get(12);
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
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcStairFlight.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSTAIRFLIGHT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("Tag")) stepString = stepString.concat("*,");
		else{
		if(this.Tag != null)		stepString = stepString.concat(((RootInterface)this.Tag).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("NumberOfRiser")) stepString = stepString.concat("*,");
		else{
		if(this.NumberOfRiser != null)		stepString = stepString.concat(((RootInterface)this.NumberOfRiser).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("NumberOfTreads")) stepString = stepString.concat("*,");
		else{
		if(this.NumberOfTreads != null)		stepString = stepString.concat(((RootInterface)this.NumberOfTreads).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RiserHeight")) stepString = stepString.concat("*,");
		else{
		if(this.RiserHeight != null)		stepString = stepString.concat(((RootInterface)this.RiserHeight).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TreadLength")) stepString = stepString.concat("*,");
		else{
		if(this.TreadLength != null)		stepString = stepString.concat(((RootInterface)this.TreadLength).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PredefinedType")) stepString = stepString.concat("*);");
		else{
		if(this.PredefinedType != null)		stepString = stepString.concat(((RootInterface)this.PredefinedType).getStepParameter(IfcStairFlightTypeEnum.class.isInterface())+");");
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
	* This method sets the NumberOfRiser attribute to the given value.
	*
	* @param NumberOfRiser DEMANDED value to set - may not be null
	**/
	public void setNumberOfRiser(INTEGER NumberOfRiser)
	{
		this.NumberOfRiser = NumberOfRiser;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the NumberOfRiser attribute.
	*
	* @return the value of NumberOfRiser
	/**/
	public INTEGER getNumberOfRiser()
	{
		return this.NumberOfRiser;
	}

	/**
	* This method sets the NumberOfTreads attribute to the given value.
	*
	* @param NumberOfTreads DEMANDED value to set - may not be null
	**/
	public void setNumberOfTreads(INTEGER NumberOfTreads)
	{
		this.NumberOfTreads = NumberOfTreads;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the NumberOfTreads attribute.
	*
	* @return the value of NumberOfTreads
	/**/
	public INTEGER getNumberOfTreads()
	{
		return this.NumberOfTreads;
	}

	/**
	* This method sets the RiserHeight attribute to the given value.
	*
	* @param RiserHeight DEMANDED value to set - may not be null
	**/
	public void setRiserHeight(IfcPositiveLengthMeasure RiserHeight)
	{
		this.RiserHeight = RiserHeight;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RiserHeight attribute.
	*
	* @return the value of RiserHeight
	/**/
	public IfcPositiveLengthMeasure getRiserHeight()
	{
		return this.RiserHeight;
	}

	/**
	* This method sets the TreadLength attribute to the given value.
	*
	* @param TreadLength DEMANDED value to set - may not be null
	**/
	public void setTreadLength(IfcPositiveLengthMeasure TreadLength)
	{
		this.TreadLength = TreadLength;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TreadLength attribute.
	*
	* @return the value of TreadLength
	/**/
	public IfcPositiveLengthMeasure getTreadLength()
	{
		return this.TreadLength;
	}

	/**
	* This method sets the PredefinedType attribute to the given value.
	*
	* @param PredefinedType DEMANDED value to set - may not be null
	**/
	public void setPredefinedType(IfcStairFlightTypeEnum PredefinedType)
	{
		this.PredefinedType = PredefinedType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PredefinedType attribute.
	*
	* @return the value of PredefinedType
	/**/
	public IfcStairFlightTypeEnum getPredefinedType()
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
	public Object clone()
	{
		IfcStairFlight ifcStairFlight = new IfcStairFlight();
		if(this.GlobalId != null)
			ifcStairFlight.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcStairFlight.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcStairFlight.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcStairFlight.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcStairFlight.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.ObjectPlacement != null)
			ifcStairFlight.setObjectPlacement((IfcObjectPlacement)this.ObjectPlacement.clone());
		if(this.Representation != null)
			ifcStairFlight.setRepresentation((IfcProductRepresentation)this.Representation.clone());
		if(this.Tag != null)
			ifcStairFlight.setTag((IfcIdentifier)this.Tag.clone());
		if(this.NumberOfRiser != null)
			ifcStairFlight.setNumberOfRiser((INTEGER)this.NumberOfRiser.clone());
		if(this.NumberOfTreads != null)
			ifcStairFlight.setNumberOfTreads((INTEGER)this.NumberOfTreads.clone());
		if(this.RiserHeight != null)
			ifcStairFlight.setRiserHeight((IfcPositiveLengthMeasure)this.RiserHeight.clone());
		if(this.TreadLength != null)
			ifcStairFlight.setTreadLength((IfcPositiveLengthMeasure)this.TreadLength.clone());
		if(this.PredefinedType != null)
			ifcStairFlight.setPredefinedType((IfcStairFlightTypeEnum)this.PredefinedType.clone());
		return ifcStairFlight;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcStairFlight ifcStairFlight = new IfcStairFlight();
		if(this.GlobalId != null)
			ifcStairFlight.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcStairFlight.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcStairFlight.setName(this.Name);
		if(this.Description != null)
			ifcStairFlight.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcStairFlight.setObjectType(this.ObjectType);
		if(this.ObjectPlacement != null)
			ifcStairFlight.setObjectPlacement(this.ObjectPlacement);
		if(this.Representation != null)
			ifcStairFlight.setRepresentation(this.Representation);
		if(this.Tag != null)
			ifcStairFlight.setTag(this.Tag);
		if(this.NumberOfRiser != null)
			ifcStairFlight.setNumberOfRiser(this.NumberOfRiser);
		if(this.NumberOfTreads != null)
			ifcStairFlight.setNumberOfTreads(this.NumberOfTreads);
		if(this.RiserHeight != null)
			ifcStairFlight.setRiserHeight(this.RiserHeight);
		if(this.TreadLength != null)
			ifcStairFlight.setTreadLength(this.TreadLength);
		if(this.PredefinedType != null)
			ifcStairFlight.setPredefinedType(this.PredefinedType);
		return ifcStairFlight;
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
