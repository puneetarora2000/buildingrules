/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcPlanarBox<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPlanarBox extends IfcPlanarExtent implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLengthMeasure","IfcLengthMeasure","IfcAxis2Placement"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Placement is an DEMANDED attribute - may not be null**/
	protected IfcAxis2Placement Placement;
	/**
	* The default constructor.
	**/
	public IfcPlanarBox(){}

	/**
	* Constructs a new IfcPlanarBox object using the given parameters.
	*
	* @param SizeInX DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param SizeInY DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param Placement DEMANDED parameter of type IfcAxis2Placement - may not be null.
	**/
	public IfcPlanarBox(IfcLengthMeasure SizeInX, IfcLengthMeasure SizeInY, IfcAxis2Placement Placement)
	{
		this.SizeInX = SizeInX;
		this.SizeInY = SizeInY;
		this.Placement = Placement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPlanarBox object using the given parameters.
	*
	* @param SizeInX DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param SizeInY DEMANDED parameter of type IfcLengthMeasure - may not be null.
	* @param Placement DEMANDED parameter of type IfcAxis2Placement - may not be null.
	**/
	public void setParameters(IfcLengthMeasure SizeInX, IfcLengthMeasure SizeInY, IfcAxis2Placement Placement)
	{
		this.SizeInX = SizeInX;
		this.SizeInY = SizeInY;
		this.Placement = Placement;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.SizeInX = (IfcLengthMeasure) parameters.get(0);
		this.SizeInY = (IfcLengthMeasure) parameters.get(1);
		this.Placement = (IfcAxis2Placement) parameters.get(2);
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
		return IfcPlanarBox.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPLANARBOX(");
		if(getRedefinedDerivedAttributeTypes().contains("SizeInX")) stepString = stepString.concat("*,");
		else{
		if(this.SizeInX != null)		stepString = stepString.concat(((RootInterface)this.SizeInX).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SizeInY")) stepString = stepString.concat("*,");
		else{
		if(this.SizeInY != null)		stepString = stepString.concat(((RootInterface)this.SizeInY).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Placement")) stepString = stepString.concat("*);");
		else{
		if(this.Placement != null)		stepString = stepString.concat(((RootInterface)this.Placement).getStepParameter(IfcAxis2Placement.class.isInterface())+");");
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
	* This method sets the Placement attribute to the given value.
	*
	* @param Placement OPTIONAL value to set
	**/
	public void setPlacement(IfcAxis2Placement Placement)
	{
		this.Placement = Placement;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Placement attribute.
	*
	* @return the value of Placement
	/**/
	public IfcAxis2Placement getPlacement()
	{
		return this.Placement;
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
		IfcPlanarBox ifcPlanarBox = new IfcPlanarBox();
		if(this.SizeInX != null)
			ifcPlanarBox.setSizeInX((IfcLengthMeasure)this.SizeInX.clone());
		if(this.SizeInY != null)
			ifcPlanarBox.setSizeInY((IfcLengthMeasure)this.SizeInY.clone());
		if(this.Placement != null)
			ifcPlanarBox.setPlacement((IfcAxis2Placement)this.Placement.clone());
		return ifcPlanarBox;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPlanarBox ifcPlanarBox = new IfcPlanarBox();
		if(this.SizeInX != null)
			ifcPlanarBox.setSizeInX(this.SizeInX);
		if(this.SizeInY != null)
			ifcPlanarBox.setSizeInY(this.SizeInY);
		if(this.Placement != null)
			ifcPlanarBox.setPlacement(this.Placement);
		return ifcPlanarBox;
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
