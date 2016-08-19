/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcPcurve<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPcurve extends IfcCurve implements IfcCurveOnSurface, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcSurface","IfcCurve"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** BasisSurface is an DEMANDED attribute - may not be null**/
	protected IfcSurface BasisSurface;
	/** ReferenceCurve is an DEMANDED attribute - may not be null**/
	protected IfcCurve ReferenceCurve;
	/**
	* The default constructor.
	**/
	public IfcPcurve(){}

	/**
	* Constructs a new IfcPcurve object using the given parameters.
	*
	* @param BasisSurface DEMANDED parameter of type IfcSurface - may not be null.
	* @param ReferenceCurve DEMANDED parameter of type IfcCurve - may not be null.
	**/
	public IfcPcurve(IfcSurface BasisSurface, IfcCurve ReferenceCurve)
	{
		this.BasisSurface = BasisSurface;
		this.ReferenceCurve = ReferenceCurve;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPcurve object using the given parameters.
	*
	* @param BasisSurface DEMANDED parameter of type IfcSurface - may not be null.
	* @param ReferenceCurve DEMANDED parameter of type IfcCurve - may not be null.
	**/
	public void setParameters(IfcSurface BasisSurface, IfcCurve ReferenceCurve)
	{
		this.BasisSurface = BasisSurface;
		this.ReferenceCurve = ReferenceCurve;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.BasisSurface = (IfcSurface) parameters.get(0);
		this.ReferenceCurve = (IfcCurve) parameters.get(1);
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
		return IfcPcurve.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPCURVE(");
		if(getRedefinedDerivedAttributeTypes().contains("BasisSurface")) stepString = stepString.concat("*,");
		else{
		if(this.BasisSurface != null)		stepString = stepString.concat(((RootInterface)this.BasisSurface).getStepParameter(IfcSurface.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ReferenceCurve")) stepString = stepString.concat("*);");
		else{
		if(this.ReferenceCurve != null)		stepString = stepString.concat(((RootInterface)this.ReferenceCurve).getStepParameter(IfcCurve.class.isInterface())+");");
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
	* This method sets the BasisSurface attribute to the given value.
	*
	* @param BasisSurface OPTIONAL value to set
	**/
	public void setBasisSurface(IfcSurface BasisSurface)
	{
		this.BasisSurface = BasisSurface;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BasisSurface attribute.
	*
	* @return the value of BasisSurface
	/**/
	public IfcSurface getBasisSurface()
	{
		return this.BasisSurface;
	}

	/**
	* This method sets the ReferenceCurve attribute to the given value.
	*
	* @param ReferenceCurve OPTIONAL value to set
	**/
	public void setReferenceCurve(IfcCurve ReferenceCurve)
	{
		this.ReferenceCurve = ReferenceCurve;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ReferenceCurve attribute.
	*
	* @return the value of ReferenceCurve
	/**/
	public IfcCurve getReferenceCurve()
	{
		return this.ReferenceCurve;
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
		IfcPcurve ifcPcurve = new IfcPcurve();
		if(this.BasisSurface != null)
			ifcPcurve.setBasisSurface((IfcSurface)this.BasisSurface.clone());
		if(this.ReferenceCurve != null)
			ifcPcurve.setReferenceCurve((IfcCurve)this.ReferenceCurve.clone());
		return ifcPcurve;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPcurve ifcPcurve = new IfcPcurve();
		if(this.BasisSurface != null)
			ifcPcurve.setBasisSurface(this.BasisSurface);
		if(this.ReferenceCurve != null)
			ifcPcurve.setReferenceCurve(this.ReferenceCurve);
		return ifcPcurve;
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
