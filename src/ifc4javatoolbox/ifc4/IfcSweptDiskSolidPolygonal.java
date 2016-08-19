/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcSweptDiskSolidPolygonal<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSweptDiskSolidPolygonal extends IfcSweptDiskSolid implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcCurve","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcParameterValue","IfcParameterValue","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** FilletRadius is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure FilletRadius;
	/**
	* The default constructor.
	**/
	public IfcSweptDiskSolidPolygonal(){}

	/**
	* Constructs a new IfcSweptDiskSolidPolygonal object using the given parameters.
	*
	* @param Directrix DEMANDED parameter of type IfcCurve - may not be null.
	* @param Radius DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param InnerRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param StartParam OPTIONAL parameter of type IfcParameterValue
	* @param EndParam OPTIONAL parameter of type IfcParameterValue
	* @param FilletRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public IfcSweptDiskSolidPolygonal(IfcCurve Directrix, IfcPositiveLengthMeasure Radius, IfcPositiveLengthMeasure InnerRadius, IfcParameterValue StartParam, IfcParameterValue EndParam, IfcPositiveLengthMeasure FilletRadius)
	{
		this.Directrix = Directrix;
		this.Radius = Radius;
		this.InnerRadius = InnerRadius;
		this.StartParam = StartParam;
		this.EndParam = EndParam;
		this.FilletRadius = FilletRadius;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSweptDiskSolidPolygonal object using the given parameters.
	*
	* @param Directrix DEMANDED parameter of type IfcCurve - may not be null.
	* @param Radius DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param InnerRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param StartParam OPTIONAL parameter of type IfcParameterValue
	* @param EndParam OPTIONAL parameter of type IfcParameterValue
	* @param FilletRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public void setParameters(IfcCurve Directrix, IfcPositiveLengthMeasure Radius, IfcPositiveLengthMeasure InnerRadius, IfcParameterValue StartParam, IfcParameterValue EndParam, IfcPositiveLengthMeasure FilletRadius)
	{
		this.Directrix = Directrix;
		this.Radius = Radius;
		this.InnerRadius = InnerRadius;
		this.StartParam = StartParam;
		this.EndParam = EndParam;
		this.FilletRadius = FilletRadius;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Directrix = (IfcCurve) parameters.get(0);
		this.Radius = (IfcPositiveLengthMeasure) parameters.get(1);
		this.InnerRadius = (IfcPositiveLengthMeasure) parameters.get(2);
		this.StartParam = (IfcParameterValue) parameters.get(3);
		this.EndParam = (IfcParameterValue) parameters.get(4);
		this.FilletRadius = (IfcPositiveLengthMeasure) parameters.get(5);
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
		return IfcSweptDiskSolidPolygonal.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSWEPTDISKSOLIDPOLYGONAL(");
		if(getRedefinedDerivedAttributeTypes().contains("Directrix")) stepString = stepString.concat("*,");
		else{
		if(this.Directrix != null)		stepString = stepString.concat(((RootInterface)this.Directrix).getStepParameter(IfcCurve.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Radius")) stepString = stepString.concat("*,");
		else{
		if(this.Radius != null)		stepString = stepString.concat(((RootInterface)this.Radius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("InnerRadius")) stepString = stepString.concat("*,");
		else{
		if(this.InnerRadius != null)		stepString = stepString.concat(((RootInterface)this.InnerRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("StartParam")) stepString = stepString.concat("*,");
		else{
		if(this.StartParam != null)		stepString = stepString.concat(((RootInterface)this.StartParam).getStepParameter(IfcParameterValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("EndParam")) stepString = stepString.concat("*,");
		else{
		if(this.EndParam != null)		stepString = stepString.concat(((RootInterface)this.EndParam).getStepParameter(IfcParameterValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FilletRadius")) stepString = stepString.concat("*);");
		else{
		if(this.FilletRadius != null)		stepString = stepString.concat(((RootInterface)this.FilletRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the FilletRadius attribute to the given value.
	*
	* @param FilletRadius DEMANDED value to set - may not be null
	**/
	public void setFilletRadius(IfcPositiveLengthMeasure FilletRadius)
	{
		this.FilletRadius = FilletRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FilletRadius attribute.
	*
	* @return the value of FilletRadius
	/**/
	public IfcPositiveLengthMeasure getFilletRadius()
	{
		return this.FilletRadius;
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
		IfcSweptDiskSolidPolygonal ifcSweptDiskSolidPolygonal = new IfcSweptDiskSolidPolygonal();
		if(this.Directrix != null)
			ifcSweptDiskSolidPolygonal.setDirectrix((IfcCurve)this.Directrix.clone());
		if(this.Radius != null)
			ifcSweptDiskSolidPolygonal.setRadius((IfcPositiveLengthMeasure)this.Radius.clone());
		if(this.InnerRadius != null)
			ifcSweptDiskSolidPolygonal.setInnerRadius((IfcPositiveLengthMeasure)this.InnerRadius.clone());
		if(this.StartParam != null)
			ifcSweptDiskSolidPolygonal.setStartParam((IfcParameterValue)this.StartParam.clone());
		if(this.EndParam != null)
			ifcSweptDiskSolidPolygonal.setEndParam((IfcParameterValue)this.EndParam.clone());
		if(this.FilletRadius != null)
			ifcSweptDiskSolidPolygonal.setFilletRadius((IfcPositiveLengthMeasure)this.FilletRadius.clone());
		return ifcSweptDiskSolidPolygonal;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSweptDiskSolidPolygonal ifcSweptDiskSolidPolygonal = new IfcSweptDiskSolidPolygonal();
		if(this.Directrix != null)
			ifcSweptDiskSolidPolygonal.setDirectrix(this.Directrix);
		if(this.Radius != null)
			ifcSweptDiskSolidPolygonal.setRadius(this.Radius);
		if(this.InnerRadius != null)
			ifcSweptDiskSolidPolygonal.setInnerRadius(this.InnerRadius);
		if(this.StartParam != null)
			ifcSweptDiskSolidPolygonal.setStartParam(this.StartParam);
		if(this.EndParam != null)
			ifcSweptDiskSolidPolygonal.setEndParam(this.EndParam);
		if(this.FilletRadius != null)
			ifcSweptDiskSolidPolygonal.setFilletRadius(this.FilletRadius);
		return ifcSweptDiskSolidPolygonal;
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
