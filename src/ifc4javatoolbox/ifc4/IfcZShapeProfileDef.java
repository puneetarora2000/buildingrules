/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcZShapeProfileDef<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcZShapeProfileDef extends IfcParameterizedProfileDef implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileTypeEnum","IfcLabel","IfcAxis2Placement2D","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcNonNegativeLengthMeasure","IfcNonNegativeLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Depth is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure Depth;
	/** FlangeWidth is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure FlangeWidth;
	/** WebThickness is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure WebThickness;
	/** FlangeThickness is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure FlangeThickness;
	/** FilletRadius is an OPTIONAL attribute**/
	protected IfcNonNegativeLengthMeasure FilletRadius;
	/** EdgeRadius is an OPTIONAL attribute**/
	protected IfcNonNegativeLengthMeasure EdgeRadius;
	/**
	* The default constructor.
	**/
	public IfcZShapeProfileDef(){}

	/**
	* Constructs a new IfcZShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position OPTIONAL parameter of type IfcAxis2Placement2D
	* @param Depth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FlangeWidth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param WebThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FlangeThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FilletRadius OPTIONAL parameter of type IfcNonNegativeLengthMeasure
	* @param EdgeRadius OPTIONAL parameter of type IfcNonNegativeLengthMeasure
	**/
	public IfcZShapeProfileDef(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure Depth, IfcPositiveLengthMeasure FlangeWidth, IfcPositiveLengthMeasure WebThickness, IfcPositiveLengthMeasure FlangeThickness, IfcNonNegativeLengthMeasure FilletRadius, IfcNonNegativeLengthMeasure EdgeRadius)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.Depth = Depth;
		this.FlangeWidth = FlangeWidth;
		this.WebThickness = WebThickness;
		this.FlangeThickness = FlangeThickness;
		this.FilletRadius = FilletRadius;
		this.EdgeRadius = EdgeRadius;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcZShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position OPTIONAL parameter of type IfcAxis2Placement2D
	* @param Depth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FlangeWidth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param WebThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FlangeThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FilletRadius OPTIONAL parameter of type IfcNonNegativeLengthMeasure
	* @param EdgeRadius OPTIONAL parameter of type IfcNonNegativeLengthMeasure
	**/
	public void setParameters(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure Depth, IfcPositiveLengthMeasure FlangeWidth, IfcPositiveLengthMeasure WebThickness, IfcPositiveLengthMeasure FlangeThickness, IfcNonNegativeLengthMeasure FilletRadius, IfcNonNegativeLengthMeasure EdgeRadius)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.Depth = Depth;
		this.FlangeWidth = FlangeWidth;
		this.WebThickness = WebThickness;
		this.FlangeThickness = FlangeThickness;
		this.FilletRadius = FilletRadius;
		this.EdgeRadius = EdgeRadius;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ProfileType = (IfcProfileTypeEnum) parameters.get(0);
		this.ProfileName = (IfcLabel) parameters.get(1);
		this.Position = (IfcAxis2Placement2D) parameters.get(2);
		this.Depth = (IfcPositiveLengthMeasure) parameters.get(3);
		this.FlangeWidth = (IfcPositiveLengthMeasure) parameters.get(4);
		this.WebThickness = (IfcPositiveLengthMeasure) parameters.get(5);
		this.FlangeThickness = (IfcPositiveLengthMeasure) parameters.get(6);
		this.FilletRadius = (IfcNonNegativeLengthMeasure) parameters.get(7);
		this.EdgeRadius = (IfcNonNegativeLengthMeasure) parameters.get(8);
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
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcZShapeProfileDef.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCZSHAPEPROFILEDEF(");
		if(getRedefinedDerivedAttributeTypes().contains("ProfileType")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileType != null)		stepString = stepString.concat(((RootInterface)this.ProfileType).getStepParameter(IfcProfileTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProfileName")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileName != null)		stepString = stepString.concat(((RootInterface)this.ProfileName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement2D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Depth")) stepString = stepString.concat("*,");
		else{
		if(this.Depth != null)		stepString = stepString.concat(((RootInterface)this.Depth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FlangeWidth")) stepString = stepString.concat("*,");
		else{
		if(this.FlangeWidth != null)		stepString = stepString.concat(((RootInterface)this.FlangeWidth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WebThickness")) stepString = stepString.concat("*,");
		else{
		if(this.WebThickness != null)		stepString = stepString.concat(((RootInterface)this.WebThickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FlangeThickness")) stepString = stepString.concat("*,");
		else{
		if(this.FlangeThickness != null)		stepString = stepString.concat(((RootInterface)this.FlangeThickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FilletRadius")) stepString = stepString.concat("*,");
		else{
		if(this.FilletRadius != null)		stepString = stepString.concat(((RootInterface)this.FilletRadius).getStepParameter(IfcNonNegativeLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("EdgeRadius")) stepString = stepString.concat("*);");
		else{
		if(this.EdgeRadius != null)		stepString = stepString.concat(((RootInterface)this.EdgeRadius).getStepParameter(IfcNonNegativeLengthMeasure.class.isInterface())+");");
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
	* This method sets the Depth attribute to the given value.
	*
	* @param Depth OPTIONAL value to set
	**/
	public void setDepth(IfcPositiveLengthMeasure Depth)
	{
		this.Depth = Depth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Depth attribute.
	*
	* @return the value of Depth
	/**/
	public IfcPositiveLengthMeasure getDepth()
	{
		return this.Depth;
	}

	/**
	* This method sets the FlangeWidth attribute to the given value.
	*
	* @param FlangeWidth OPTIONAL value to set
	**/
	public void setFlangeWidth(IfcPositiveLengthMeasure FlangeWidth)
	{
		this.FlangeWidth = FlangeWidth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FlangeWidth attribute.
	*
	* @return the value of FlangeWidth
	/**/
	public IfcPositiveLengthMeasure getFlangeWidth()
	{
		return this.FlangeWidth;
	}

	/**
	* This method sets the WebThickness attribute to the given value.
	*
	* @param WebThickness OPTIONAL value to set
	**/
	public void setWebThickness(IfcPositiveLengthMeasure WebThickness)
	{
		this.WebThickness = WebThickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the WebThickness attribute.
	*
	* @return the value of WebThickness
	/**/
	public IfcPositiveLengthMeasure getWebThickness()
	{
		return this.WebThickness;
	}

	/**
	* This method sets the FlangeThickness attribute to the given value.
	*
	* @param FlangeThickness OPTIONAL value to set
	**/
	public void setFlangeThickness(IfcPositiveLengthMeasure FlangeThickness)
	{
		this.FlangeThickness = FlangeThickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FlangeThickness attribute.
	*
	* @return the value of FlangeThickness
	/**/
	public IfcPositiveLengthMeasure getFlangeThickness()
	{
		return this.FlangeThickness;
	}

	/**
	* This method sets the FilletRadius attribute to the given value.
	*
	* @param FilletRadius DEMANDED value to set - may not be null
	**/
	public void setFilletRadius(IfcNonNegativeLengthMeasure FilletRadius)
	{
		this.FilletRadius = FilletRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FilletRadius attribute.
	*
	* @return the value of FilletRadius
	/**/
	public IfcNonNegativeLengthMeasure getFilletRadius()
	{
		return this.FilletRadius;
	}

	/**
	* This method sets the EdgeRadius attribute to the given value.
	*
	* @param EdgeRadius DEMANDED value to set - may not be null
	**/
	public void setEdgeRadius(IfcNonNegativeLengthMeasure EdgeRadius)
	{
		this.EdgeRadius = EdgeRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the EdgeRadius attribute.
	*
	* @return the value of EdgeRadius
	/**/
	public IfcNonNegativeLengthMeasure getEdgeRadius()
	{
		return this.EdgeRadius;
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
		IfcZShapeProfileDef ifcZShapeProfileDef = new IfcZShapeProfileDef();
		if(this.ProfileType != null)
			ifcZShapeProfileDef.setProfileType((IfcProfileTypeEnum)this.ProfileType.clone());
		if(this.ProfileName != null)
			ifcZShapeProfileDef.setProfileName((IfcLabel)this.ProfileName.clone());
		if(this.Position != null)
			ifcZShapeProfileDef.setPosition((IfcAxis2Placement2D)this.Position.clone());
		if(this.Depth != null)
			ifcZShapeProfileDef.setDepth((IfcPositiveLengthMeasure)this.Depth.clone());
		if(this.FlangeWidth != null)
			ifcZShapeProfileDef.setFlangeWidth((IfcPositiveLengthMeasure)this.FlangeWidth.clone());
		if(this.WebThickness != null)
			ifcZShapeProfileDef.setWebThickness((IfcPositiveLengthMeasure)this.WebThickness.clone());
		if(this.FlangeThickness != null)
			ifcZShapeProfileDef.setFlangeThickness((IfcPositiveLengthMeasure)this.FlangeThickness.clone());
		if(this.FilletRadius != null)
			ifcZShapeProfileDef.setFilletRadius((IfcNonNegativeLengthMeasure)this.FilletRadius.clone());
		if(this.EdgeRadius != null)
			ifcZShapeProfileDef.setEdgeRadius((IfcNonNegativeLengthMeasure)this.EdgeRadius.clone());
		return ifcZShapeProfileDef;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcZShapeProfileDef ifcZShapeProfileDef = new IfcZShapeProfileDef();
		if(this.ProfileType != null)
			ifcZShapeProfileDef.setProfileType(this.ProfileType);
		if(this.ProfileName != null)
			ifcZShapeProfileDef.setProfileName(this.ProfileName);
		if(this.Position != null)
			ifcZShapeProfileDef.setPosition(this.Position);
		if(this.Depth != null)
			ifcZShapeProfileDef.setDepth(this.Depth);
		if(this.FlangeWidth != null)
			ifcZShapeProfileDef.setFlangeWidth(this.FlangeWidth);
		if(this.WebThickness != null)
			ifcZShapeProfileDef.setWebThickness(this.WebThickness);
		if(this.FlangeThickness != null)
			ifcZShapeProfileDef.setFlangeThickness(this.FlangeThickness);
		if(this.FilletRadius != null)
			ifcZShapeProfileDef.setFilletRadius(this.FilletRadius);
		if(this.EdgeRadius != null)
			ifcZShapeProfileDef.setEdgeRadius(this.EdgeRadius);
		return ifcZShapeProfileDef;
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
