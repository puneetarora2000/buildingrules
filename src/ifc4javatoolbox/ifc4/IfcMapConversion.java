/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcMapConversion<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcMapConversion extends IfcCoordinateOperation implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcCoordinateReferenceSystemSelect","IfcCoordinateReferenceSystem","IfcLengthMeasure","IfcLengthMeasure","IfcLengthMeasure","IfcReal","IfcReal","IfcReal"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Eastings is an DEMANDED attribute - may not be null**/
	protected IfcLengthMeasure Eastings;
	/** Northings is an DEMANDED attribute - may not be null**/
	protected IfcLengthMeasure Northings;
	/** OrthogonalHeight is an DEMANDED attribute - may not be null**/
	protected IfcLengthMeasure OrthogonalHeight;
	/** XAxisAbscissa is an OPTIONAL attribute**/
	protected IfcReal XAxisAbscissa;
	/** XAxisOrdinate is an OPTIONAL attribute**/
	protected IfcReal XAxisOrdinate;
	/** Scale is an OPTIONAL attribute**/
	protected IfcReal Scale;
	/**
	* The default constructor.
	**/
	public IfcMapConversion(){}

	/**
	* Constructs a new IfcMapConversion object using the given parameters.
	*
	* @param SourceCRS DEMANDED parameter of type IfcCoordinateReferenceSystemSelect - may not be null.
	* @param TargetCRS DEMANDED parameter of type IfcCoordinateReferenceSystem - may not be null.
	* @param Eastings DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param Northings DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param OrthogonalHeight DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param XAxisAbscissa OPTIONAL parameter of type IfcReal
	* @param XAxisOrdinate OPTIONAL parameter of type IfcReal
	* @param Scale OPTIONAL parameter of type IfcReal
	**/
	public IfcMapConversion(IfcCoordinateReferenceSystemSelect SourceCRS, IfcCoordinateReferenceSystem TargetCRS, IfcLengthMeasure Eastings, IfcLengthMeasure Northings, IfcLengthMeasure OrthogonalHeight, IfcReal XAxisAbscissa, IfcReal XAxisOrdinate, IfcReal Scale)
	{
		this.SourceCRS = SourceCRS;
		this.TargetCRS = TargetCRS;
		this.Eastings = Eastings;
		this.Northings = Northings;
		this.OrthogonalHeight = OrthogonalHeight;
		this.XAxisAbscissa = XAxisAbscissa;
		this.XAxisOrdinate = XAxisOrdinate;
		this.Scale = Scale;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcMapConversion object using the given parameters.
	*
	* @param SourceCRS DEMANDED parameter of type IfcCoordinateReferenceSystemSelect - may not be null.
	* @param TargetCRS DEMANDED parameter of type IfcCoordinateReferenceSystem - may not be null.
	* @param Eastings DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param Northings DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param OrthogonalHeight DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param XAxisAbscissa OPTIONAL parameter of type IfcReal
	* @param XAxisOrdinate OPTIONAL parameter of type IfcReal
	* @param Scale OPTIONAL parameter of type IfcReal
	**/
	public void setParameters(IfcCoordinateReferenceSystemSelect SourceCRS, IfcCoordinateReferenceSystem TargetCRS, IfcLengthMeasure Eastings, IfcLengthMeasure Northings, IfcLengthMeasure OrthogonalHeight, IfcReal XAxisAbscissa, IfcReal XAxisOrdinate, IfcReal Scale)
	{
		this.SourceCRS = SourceCRS;
		this.TargetCRS = TargetCRS;
		this.Eastings = Eastings;
		this.Northings = Northings;
		this.OrthogonalHeight = OrthogonalHeight;
		this.XAxisAbscissa = XAxisAbscissa;
		this.XAxisOrdinate = XAxisOrdinate;
		this.Scale = Scale;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.SourceCRS = (IfcCoordinateReferenceSystemSelect) parameters.get(0);
		this.TargetCRS = (IfcCoordinateReferenceSystem) parameters.get(1);
		this.Eastings = (IfcLengthMeasure) parameters.get(2);
		this.Northings = (IfcLengthMeasure) parameters.get(3);
		this.OrthogonalHeight = (IfcLengthMeasure) parameters.get(4);
		this.XAxisAbscissa = (IfcReal) parameters.get(5);
		this.XAxisOrdinate = (IfcReal) parameters.get(6);
		this.Scale = (IfcReal) parameters.get(7);
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
		return IfcMapConversion.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCMAPCONVERSION(");
		if(getRedefinedDerivedAttributeTypes().contains("SourceCRS")) stepString = stepString.concat("*,");
		else{
		if(this.SourceCRS != null)		stepString = stepString.concat(((RootInterface)this.SourceCRS).getStepParameter(IfcCoordinateReferenceSystemSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TargetCRS")) stepString = stepString.concat("*,");
		else{
		if(this.TargetCRS != null)		stepString = stepString.concat(((RootInterface)this.TargetCRS).getStepParameter(IfcCoordinateReferenceSystem.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Eastings")) stepString = stepString.concat("*,");
		else{
		if(this.Eastings != null)		stepString = stepString.concat(((RootInterface)this.Eastings).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Northings")) stepString = stepString.concat("*,");
		else{
		if(this.Northings != null)		stepString = stepString.concat(((RootInterface)this.Northings).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OrthogonalHeight")) stepString = stepString.concat("*,");
		else{
		if(this.OrthogonalHeight != null)		stepString = stepString.concat(((RootInterface)this.OrthogonalHeight).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("XAxisAbscissa")) stepString = stepString.concat("*,");
		else{
		if(this.XAxisAbscissa != null)		stepString = stepString.concat(((RootInterface)this.XAxisAbscissa).getStepParameter(IfcReal.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("XAxisOrdinate")) stepString = stepString.concat("*,");
		else{
		if(this.XAxisOrdinate != null)		stepString = stepString.concat(((RootInterface)this.XAxisOrdinate).getStepParameter(IfcReal.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Scale")) stepString = stepString.concat("*);");
		else{
		if(this.Scale != null)		stepString = stepString.concat(((RootInterface)this.Scale).getStepParameter(IfcReal.class.isInterface())+");");
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
	* This method sets the Eastings attribute to the given value.
	*
	* @param Eastings OPTIONAL value to set
	**/
	public void setEastings(IfcLengthMeasure Eastings)
	{
		this.Eastings = Eastings;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Eastings attribute.
	*
	* @return the value of Eastings
	/**/
	public IfcLengthMeasure getEastings()
	{
		return this.Eastings;
	}

	/**
	* This method sets the Northings attribute to the given value.
	*
	* @param Northings OPTIONAL value to set
	**/
	public void setNorthings(IfcLengthMeasure Northings)
	{
		this.Northings = Northings;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Northings attribute.
	*
	* @return the value of Northings
	/**/
	public IfcLengthMeasure getNorthings()
	{
		return this.Northings;
	}

	/**
	* This method sets the OrthogonalHeight attribute to the given value.
	*
	* @param OrthogonalHeight OPTIONAL value to set
	**/
	public void setOrthogonalHeight(IfcLengthMeasure OrthogonalHeight)
	{
		this.OrthogonalHeight = OrthogonalHeight;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the OrthogonalHeight attribute.
	*
	* @return the value of OrthogonalHeight
	/**/
	public IfcLengthMeasure getOrthogonalHeight()
	{
		return this.OrthogonalHeight;
	}

	/**
	* This method sets the XAxisAbscissa attribute to the given value.
	*
	* @param XAxisAbscissa DEMANDED value to set - may not be null
	**/
	public void setXAxisAbscissa(IfcReal XAxisAbscissa)
	{
		this.XAxisAbscissa = XAxisAbscissa;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the XAxisAbscissa attribute.
	*
	* @return the value of XAxisAbscissa
	/**/
	public IfcReal getXAxisAbscissa()
	{
		return this.XAxisAbscissa;
	}

	/**
	* This method sets the XAxisOrdinate attribute to the given value.
	*
	* @param XAxisOrdinate DEMANDED value to set - may not be null
	**/
	public void setXAxisOrdinate(IfcReal XAxisOrdinate)
	{
		this.XAxisOrdinate = XAxisOrdinate;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the XAxisOrdinate attribute.
	*
	* @return the value of XAxisOrdinate
	/**/
	public IfcReal getXAxisOrdinate()
	{
		return this.XAxisOrdinate;
	}

	/**
	* This method sets the Scale attribute to the given value.
	*
	* @param Scale DEMANDED value to set - may not be null
	**/
	public void setScale(IfcReal Scale)
	{
		this.Scale = Scale;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Scale attribute.
	*
	* @return the value of Scale
	/**/
	public IfcReal getScale()
	{
		return this.Scale;
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
		IfcMapConversion ifcMapConversion = new IfcMapConversion();
		if(this.SourceCRS != null)
			ifcMapConversion.setSourceCRS((IfcCoordinateReferenceSystemSelect)this.SourceCRS.clone());
		if(this.TargetCRS != null)
			ifcMapConversion.setTargetCRS((IfcCoordinateReferenceSystem)this.TargetCRS.clone());
		if(this.Eastings != null)
			ifcMapConversion.setEastings((IfcLengthMeasure)this.Eastings.clone());
		if(this.Northings != null)
			ifcMapConversion.setNorthings((IfcLengthMeasure)this.Northings.clone());
		if(this.OrthogonalHeight != null)
			ifcMapConversion.setOrthogonalHeight((IfcLengthMeasure)this.OrthogonalHeight.clone());
		if(this.XAxisAbscissa != null)
			ifcMapConversion.setXAxisAbscissa((IfcReal)this.XAxisAbscissa.clone());
		if(this.XAxisOrdinate != null)
			ifcMapConversion.setXAxisOrdinate((IfcReal)this.XAxisOrdinate.clone());
		if(this.Scale != null)
			ifcMapConversion.setScale((IfcReal)this.Scale.clone());
		return ifcMapConversion;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcMapConversion ifcMapConversion = new IfcMapConversion();
		if(this.SourceCRS != null)
			ifcMapConversion.setSourceCRS(this.SourceCRS);
		if(this.TargetCRS != null)
			ifcMapConversion.setTargetCRS(this.TargetCRS);
		if(this.Eastings != null)
			ifcMapConversion.setEastings(this.Eastings);
		if(this.Northings != null)
			ifcMapConversion.setNorthings(this.Northings);
		if(this.OrthogonalHeight != null)
			ifcMapConversion.setOrthogonalHeight(this.OrthogonalHeight);
		if(this.XAxisAbscissa != null)
			ifcMapConversion.setXAxisAbscissa(this.XAxisAbscissa);
		if(this.XAxisOrdinate != null)
			ifcMapConversion.setXAxisOrdinate(this.XAxisOrdinate);
		if(this.Scale != null)
			ifcMapConversion.setScale(this.Scale);
		return ifcMapConversion;
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
