/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcPolyLoop<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPolyLoop extends IfcLoop implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<IfcCartesianPoint>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Polygon is an DEMANDED attribute - may not be null**/
	protected LIST<IfcCartesianPoint> Polygon;
	/**
	* The default constructor.
	**/
	public IfcPolyLoop(){}

	/**
	* Constructs a new IfcPolyLoop object using the given parameters.
	*
	* @param Polygon DEMANDED parameter of type LIST<IfcCartesianPoint> - may not be null.
	**/
	public IfcPolyLoop(LIST<IfcCartesianPoint> Polygon)
	{
		this.Polygon = Polygon;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPolyLoop object using the given parameters.
	*
	* @param Polygon DEMANDED parameter of type LIST<IfcCartesianPoint> - may not be null.
	**/
	public void setParameters(LIST<IfcCartesianPoint> Polygon)
	{
		this.Polygon = Polygon;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Polygon = (LIST<IfcCartesianPoint>) parameters.get(0);
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
		return IfcPolyLoop.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPOLYLOOP(");
		if(getRedefinedDerivedAttributeTypes().contains("Polygon")) stepString = stepString.concat("*);");
		else{
		if(this.Polygon != null)		stepString = stepString.concat(((RootInterface)this.Polygon).getStepParameter(IfcCartesianPoint.class.isInterface())+");");
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
	* This method sets the Polygon attribute to the given value.
	*
	* @param Polygon OPTIONAL value to set
	**/
	public void setPolygon(LIST<IfcCartesianPoint> Polygon)
	{
		this.Polygon = Polygon;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Polygon attribute.
	*
	* @return a copy of the Polygon list
	**/
	public LIST<IfcCartesianPoint> getPolygon()
	{
		if(this.Polygon != null)
			return new LIST<IfcCartesianPoint>(this.Polygon);
		return null;
	}

	/**
	* This method adds an IfcCartesianPoint object to the Polygon list.
	* @param Polygon element to be appended to this list.
	**/
	public void addPolygon(IfcCartesianPoint Polygon)
	{
		if(this.Polygon == null)
			this.Polygon = new LIST<IfcCartesianPoint>();
		this.Polygon.add(Polygon);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcCartesianPoint objects to the Polygon list.
	* @param Polygon collection containing elements to be added to this list.
	**/
	public void addAllPolygon(java.util.Collection<IfcCartesianPoint> Polygon)
	{
		if(this.Polygon == null)
			this.Polygon = new LIST<IfcCartesianPoint>();
		this.Polygon.addAll(Polygon);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Polygon list.
	**/
	public void clearPolygon()
	{
		if(this.Polygon != null)
		{
			this.Polygon.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcCartesianPoint object from the Polygon list.
	* @param Polygon element to be removed from this list.
	**/
	public void removePolygon(IfcCartesianPoint Polygon)
	{
		if(this.Polygon != null)
		{
			this.Polygon.remove(Polygon);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcCartesianPoint objects from the Polygon list.
	* @param Polygon collection containing elements to be removed from this list.
	**/
	public void removeAllPolygon(java.util.Collection<IfcCartesianPoint> Polygon)
	{
		if(this.Polygon != null)
		{
			this.Polygon.removeAll(Polygon);
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
		IfcPolyLoop ifcPolyLoop = new IfcPolyLoop();
		if(this.Polygon != null)
			ifcPolyLoop.setPolygon((LIST<IfcCartesianPoint>)this.Polygon.clone());
		return ifcPolyLoop;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPolyLoop ifcPolyLoop = new IfcPolyLoop();
		if(this.Polygon != null)
			ifcPolyLoop.setPolygon(this.Polygon);
		return ifcPolyLoop;
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
