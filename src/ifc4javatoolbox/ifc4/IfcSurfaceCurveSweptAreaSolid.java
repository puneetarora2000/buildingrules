/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcSurfaceCurveSweptAreaSolid<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileDef","IfcAxis2Placement3D","IfcCurve","IfcParameterValue","IfcParameterValue","IfcSurface"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Directrix is an DEMANDED attribute - may not be null**/
	protected IfcCurve Directrix;
	/** StartParam is an OPTIONAL attribute**/
	protected IfcParameterValue StartParam;
	/** EndParam is an OPTIONAL attribute**/
	protected IfcParameterValue EndParam;
	/** ReferenceSurface is an DEMANDED attribute - may not be null**/
	protected IfcSurface ReferenceSurface;
	/**
	* The default constructor.
	**/
	public IfcSurfaceCurveSweptAreaSolid(){}

	/**
	* Constructs a new IfcSurfaceCurveSweptAreaSolid object using the given parameters.
	*
	* @param SweptArea DEMANDED parameter of type IfcProfileDef - may not be null.
	* @param Position OPTIONAL parameter of type IfcAxis2Placement3D
	* @param Directrix DEMANDED parameter of type IfcCurve - may not be null.
	* @param StartParam OPTIONAL parameter of type IfcParameterValue
	* @param EndParam OPTIONAL parameter of type IfcParameterValue
	* @param ReferenceSurface DEMANDED parameter of type IfcSurface - may not be null.
	**/
	public IfcSurfaceCurveSweptAreaSolid(IfcProfileDef SweptArea, IfcAxis2Placement3D Position, IfcCurve Directrix, IfcParameterValue StartParam, IfcParameterValue EndParam, IfcSurface ReferenceSurface)
	{
		this.SweptArea = SweptArea;
		this.Position = Position;
		this.Directrix = Directrix;
		this.StartParam = StartParam;
		this.EndParam = EndParam;
		this.ReferenceSurface = ReferenceSurface;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSurfaceCurveSweptAreaSolid object using the given parameters.
	*
	* @param SweptArea DEMANDED parameter of type IfcProfileDef - may not be null.
	* @param Position OPTIONAL parameter of type IfcAxis2Placement3D
	* @param Directrix DEMANDED parameter of type IfcCurve - may not be null.
	* @param StartParam OPTIONAL parameter of type IfcParameterValue
	* @param EndParam OPTIONAL parameter of type IfcParameterValue
	* @param ReferenceSurface DEMANDED parameter of type IfcSurface - may not be null.
	**/
	public void setParameters(IfcProfileDef SweptArea, IfcAxis2Placement3D Position, IfcCurve Directrix, IfcParameterValue StartParam, IfcParameterValue EndParam, IfcSurface ReferenceSurface)
	{
		this.SweptArea = SweptArea;
		this.Position = Position;
		this.Directrix = Directrix;
		this.StartParam = StartParam;
		this.EndParam = EndParam;
		this.ReferenceSurface = ReferenceSurface;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.SweptArea = (IfcProfileDef) parameters.get(0);
		this.Position = (IfcAxis2Placement3D) parameters.get(1);
		this.Directrix = (IfcCurve) parameters.get(2);
		this.StartParam = (IfcParameterValue) parameters.get(3);
		this.EndParam = (IfcParameterValue) parameters.get(4);
		this.ReferenceSurface = (IfcSurface) parameters.get(5);
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
		return IfcSurfaceCurveSweptAreaSolid.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSURFACECURVESWEPTAREASOLID(");
		if(getRedefinedDerivedAttributeTypes().contains("SweptArea")) stepString = stepString.concat("*,");
		else{
		if(this.SweptArea != null)		stepString = stepString.concat(((RootInterface)this.SweptArea).getStepParameter(IfcProfileDef.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement3D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Directrix")) stepString = stepString.concat("*,");
		else{
		if(this.Directrix != null)		stepString = stepString.concat(((RootInterface)this.Directrix).getStepParameter(IfcCurve.class.isInterface())+",");
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
		if(getRedefinedDerivedAttributeTypes().contains("ReferenceSurface")) stepString = stepString.concat("*);");
		else{
		if(this.ReferenceSurface != null)		stepString = stepString.concat(((RootInterface)this.ReferenceSurface).getStepParameter(IfcSurface.class.isInterface())+");");
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
	* This method sets the Directrix attribute to the given value.
	*
	* @param Directrix OPTIONAL value to set
	**/
	public void setDirectrix(IfcCurve Directrix)
	{
		this.Directrix = Directrix;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Directrix attribute.
	*
	* @return the value of Directrix
	/**/
	public IfcCurve getDirectrix()
	{
		return this.Directrix;
	}

	/**
	* This method sets the StartParam attribute to the given value.
	*
	* @param StartParam DEMANDED value to set - may not be null
	**/
	public void setStartParam(IfcParameterValue StartParam)
	{
		this.StartParam = StartParam;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the StartParam attribute.
	*
	* @return the value of StartParam
	/**/
	public IfcParameterValue getStartParam()
	{
		return this.StartParam;
	}

	/**
	* This method sets the EndParam attribute to the given value.
	*
	* @param EndParam DEMANDED value to set - may not be null
	**/
	public void setEndParam(IfcParameterValue EndParam)
	{
		this.EndParam = EndParam;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the EndParam attribute.
	*
	* @return the value of EndParam
	/**/
	public IfcParameterValue getEndParam()
	{
		return this.EndParam;
	}

	/**
	* This method sets the ReferenceSurface attribute to the given value.
	*
	* @param ReferenceSurface OPTIONAL value to set
	**/
	public void setReferenceSurface(IfcSurface ReferenceSurface)
	{
		this.ReferenceSurface = ReferenceSurface;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ReferenceSurface attribute.
	*
	* @return the value of ReferenceSurface
	/**/
	public IfcSurface getReferenceSurface()
	{
		return this.ReferenceSurface;
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
		IfcSurfaceCurveSweptAreaSolid ifcSurfaceCurveSweptAreaSolid = new IfcSurfaceCurveSweptAreaSolid();
		if(this.SweptArea != null)
			ifcSurfaceCurveSweptAreaSolid.setSweptArea((IfcProfileDef)this.SweptArea.clone());
		if(this.Position != null)
			ifcSurfaceCurveSweptAreaSolid.setPosition((IfcAxis2Placement3D)this.Position.clone());
		if(this.Directrix != null)
			ifcSurfaceCurveSweptAreaSolid.setDirectrix((IfcCurve)this.Directrix.clone());
		if(this.StartParam != null)
			ifcSurfaceCurveSweptAreaSolid.setStartParam((IfcParameterValue)this.StartParam.clone());
		if(this.EndParam != null)
			ifcSurfaceCurveSweptAreaSolid.setEndParam((IfcParameterValue)this.EndParam.clone());
		if(this.ReferenceSurface != null)
			ifcSurfaceCurveSweptAreaSolid.setReferenceSurface((IfcSurface)this.ReferenceSurface.clone());
		return ifcSurfaceCurveSweptAreaSolid;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSurfaceCurveSweptAreaSolid ifcSurfaceCurveSweptAreaSolid = new IfcSurfaceCurveSweptAreaSolid();
		if(this.SweptArea != null)
			ifcSurfaceCurveSweptAreaSolid.setSweptArea(this.SweptArea);
		if(this.Position != null)
			ifcSurfaceCurveSweptAreaSolid.setPosition(this.Position);
		if(this.Directrix != null)
			ifcSurfaceCurveSweptAreaSolid.setDirectrix(this.Directrix);
		if(this.StartParam != null)
			ifcSurfaceCurveSweptAreaSolid.setStartParam(this.StartParam);
		if(this.EndParam != null)
			ifcSurfaceCurveSweptAreaSolid.setEndParam(this.EndParam);
		if(this.ReferenceSurface != null)
			ifcSurfaceCurveSweptAreaSolid.setReferenceSurface(this.ReferenceSurface);
		return ifcSurfaceCurveSweptAreaSolid;
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
