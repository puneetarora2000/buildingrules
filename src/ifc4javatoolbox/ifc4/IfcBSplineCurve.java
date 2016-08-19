/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcBSplineCurve<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcBSplineCurve extends IfcBoundedCurve implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"INTEGER","LIST<IfcCartesianPoint>","IfcBSplineCurveForm","LOGICAL","LOGICAL"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Degree is an DEMANDED attribute - may not be null**/
	protected INTEGER Degree;
	/** ControlPointsList is an DEMANDED attribute - may not be null**/
	protected LIST<IfcCartesianPoint> ControlPointsList;
	/** CurveForm is an DEMANDED attribute - may not be null**/
	protected IfcBSplineCurveForm CurveForm;
	/** ClosedCurve is an DEMANDED attribute - may not be null**/
	protected LOGICAL ClosedCurve;
	/** SelfIntersect is an DEMANDED attribute - may not be null**/
	protected LOGICAL SelfIntersect;
	/**
	* The default constructor.
	**/
	public IfcBSplineCurve(){}

	/**
	* Constructs a new IfcBSplineCurve object using the given parameters.
	*
	* @param Degree DEMANDED parameter of type INTEGER - may not be null.
	* @param ControlPointsList DEMANDED parameter of type LIST<IfcCartesianPoint> - may not be null.
	* @param CurveForm DEMANDED parameter of type IfcBSplineCurveForm - may not be null.
	* @param ClosedCurve DEMANDED parameter of type LOGICAL - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	**/
	public IfcBSplineCurve(INTEGER Degree, LIST<IfcCartesianPoint> ControlPointsList, IfcBSplineCurveForm CurveForm, LOGICAL ClosedCurve, LOGICAL SelfIntersect)
	{
		this.Degree = Degree;
		this.ControlPointsList = ControlPointsList;
		this.CurveForm = CurveForm;
		this.ClosedCurve = ClosedCurve;
		this.SelfIntersect = SelfIntersect;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcBSplineCurve object using the given parameters.
	*
	* @param Degree DEMANDED parameter of type INTEGER - may not be null.
	* @param ControlPointsList DEMANDED parameter of type LIST<IfcCartesianPoint> - may not be null.
	* @param CurveForm DEMANDED parameter of type IfcBSplineCurveForm - may not be null.
	* @param ClosedCurve DEMANDED parameter of type LOGICAL - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	**/
	public void setParameters(INTEGER Degree, LIST<IfcCartesianPoint> ControlPointsList, IfcBSplineCurveForm CurveForm, LOGICAL ClosedCurve, LOGICAL SelfIntersect)
	{
		this.Degree = Degree;
		this.ControlPointsList = ControlPointsList;
		this.CurveForm = CurveForm;
		this.ClosedCurve = ClosedCurve;
		this.SelfIntersect = SelfIntersect;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Degree = (INTEGER) parameters.get(0);
		this.ControlPointsList = (LIST<IfcCartesianPoint>) parameters.get(1);
		this.CurveForm = (IfcBSplineCurveForm) parameters.get(2);
		this.ClosedCurve = (LOGICAL) parameters.get(3);
		this.SelfIntersect = (LOGICAL) parameters.get(4);
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
		return IfcBSplineCurve.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCBSPLINECURVE(");
		if(getRedefinedDerivedAttributeTypes().contains("Degree")) stepString = stepString.concat("*,");
		else{
		if(this.Degree != null)		stepString = stepString.concat(((RootInterface)this.Degree).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ControlPointsList")) stepString = stepString.concat("*,");
		else{
		if(this.ControlPointsList != null)		stepString = stepString.concat(((RootInterface)this.ControlPointsList).getStepParameter(IfcCartesianPoint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CurveForm")) stepString = stepString.concat("*,");
		else{
		if(this.CurveForm != null)		stepString = stepString.concat(((RootInterface)this.CurveForm).getStepParameter(IfcBSplineCurveForm.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ClosedCurve")) stepString = stepString.concat("*,");
		else{
		if(this.ClosedCurve != null)		stepString = stepString.concat(((RootInterface)this.ClosedCurve).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SelfIntersect")) stepString = stepString.concat("*);");
		else{
		if(this.SelfIntersect != null)		stepString = stepString.concat(((RootInterface)this.SelfIntersect).getStepParameter(LOGICAL.class.isInterface())+");");
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
	* This method sets the Degree attribute to the given value.
	*
	* @param Degree OPTIONAL value to set
	**/
	public void setDegree(INTEGER Degree)
	{
		this.Degree = Degree;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Degree attribute.
	*
	* @return the value of Degree
	/**/
	public INTEGER getDegree()
	{
		return this.Degree;
	}

	/**
	* This method sets the ControlPointsList attribute to the given value.
	*
	* @param ControlPointsList OPTIONAL value to set
	**/
	public void setControlPointsList(LIST<IfcCartesianPoint> ControlPointsList)
	{
		this.ControlPointsList = ControlPointsList;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the ControlPointsList attribute.
	*
	* @return a copy of the ControlPointsList list
	**/
	public LIST<IfcCartesianPoint> getControlPointsList()
	{
		if(this.ControlPointsList != null)
			return new LIST<IfcCartesianPoint>(this.ControlPointsList);
		return null;
	}

	/**
	* This method adds an IfcCartesianPoint object to the ControlPointsList list.
	* @param ControlPointsList element to be appended to this list.
	**/
	public void addControlPointsList(IfcCartesianPoint ControlPointsList)
	{
		if(this.ControlPointsList == null)
			this.ControlPointsList = new LIST<IfcCartesianPoint>();
		this.ControlPointsList.add(ControlPointsList);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcCartesianPoint objects to the ControlPointsList list.
	* @param ControlPointsList collection containing elements to be added to this list.
	**/
	public void addAllControlPointsList(java.util.Collection<IfcCartesianPoint> ControlPointsList)
	{
		if(this.ControlPointsList == null)
			this.ControlPointsList = new LIST<IfcCartesianPoint>();
		this.ControlPointsList.addAll(ControlPointsList);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the ControlPointsList list.
	**/
	public void clearControlPointsList()
	{
		if(this.ControlPointsList != null)
		{
			this.ControlPointsList.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcCartesianPoint object from the ControlPointsList list.
	* @param ControlPointsList element to be removed from this list.
	**/
	public void removeControlPointsList(IfcCartesianPoint ControlPointsList)
	{
		if(this.ControlPointsList != null)
		{
			this.ControlPointsList.remove(ControlPointsList);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcCartesianPoint objects from the ControlPointsList list.
	* @param ControlPointsList collection containing elements to be removed from this list.
	**/
	public void removeAllControlPointsList(java.util.Collection<IfcCartesianPoint> ControlPointsList)
	{
		if(this.ControlPointsList != null)
		{
			this.ControlPointsList.removeAll(ControlPointsList);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the CurveForm attribute to the given value.
	*
	* @param CurveForm OPTIONAL value to set
	**/
	public void setCurveForm(IfcBSplineCurveForm CurveForm)
	{
		this.CurveForm = CurveForm;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CurveForm attribute.
	*
	* @return the value of CurveForm
	/**/
	public IfcBSplineCurveForm getCurveForm()
	{
		return this.CurveForm;
	}

	/**
	* This method sets the ClosedCurve attribute to the given value.
	*
	* @param ClosedCurve OPTIONAL value to set
	**/
	public void setClosedCurve(LOGICAL ClosedCurve)
	{
		this.ClosedCurve = ClosedCurve;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ClosedCurve attribute.
	*
	* @return the value of ClosedCurve
	/**/
	public LOGICAL getClosedCurve()
	{
		return this.ClosedCurve;
	}

	/**
	* This method sets the SelfIntersect attribute to the given value.
	*
	* @param SelfIntersect OPTIONAL value to set
	**/
	public void setSelfIntersect(LOGICAL SelfIntersect)
	{
		this.SelfIntersect = SelfIntersect;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SelfIntersect attribute.
	*
	* @return the value of SelfIntersect
	/**/
	public LOGICAL getSelfIntersect()
	{
		return this.SelfIntersect;
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
	public abstract Object clone();

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public abstract Object shallowCopy();

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