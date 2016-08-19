/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcSweptAreaSolid<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcSweptAreaSolid extends IfcSolidModel implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileDef","IfcAxis2Placement3D"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SweptArea is an DEMANDED attribute - may not be null**/
	protected IfcProfileDef SweptArea;
	/** Position is an OPTIONAL attribute**/
	protected IfcAxis2Placement3D Position;
	/**
	* The default constructor.
	**/
	public IfcSweptAreaSolid(){}

	/**
	* Constructs a new IfcSweptAreaSolid object using the given parameters.
	*
	* @param SweptArea DEMANDED parameter of type IfcProfileDef - may not be null.
	* @param Position OPTIONAL parameter of type IfcAxis2Placement3D
	**/
	public IfcSweptAreaSolid(IfcProfileDef SweptArea, IfcAxis2Placement3D Position)
	{
		this.SweptArea = SweptArea;
		this.Position = Position;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSweptAreaSolid object using the given parameters.
	*
	* @param SweptArea DEMANDED parameter of type IfcProfileDef - may not be null.
	* @param Position OPTIONAL parameter of type IfcAxis2Placement3D
	**/
	public void setParameters(IfcProfileDef SweptArea, IfcAxis2Placement3D Position)
	{
		this.SweptArea = SweptArea;
		this.Position = Position;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.SweptArea = (IfcProfileDef) parameters.get(0);
		this.Position = (IfcAxis2Placement3D) parameters.get(1);
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
		return IfcSweptAreaSolid.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSWEPTAREASOLID(");
		if(getRedefinedDerivedAttributeTypes().contains("SweptArea")) stepString = stepString.concat("*,");
		else{
		if(this.SweptArea != null)		stepString = stepString.concat(((RootInterface)this.SweptArea).getStepParameter(IfcProfileDef.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*);");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement3D.class.isInterface())+");");
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
	* This method sets the SweptArea attribute to the given value.
	*
	* @param SweptArea OPTIONAL value to set
	**/
	public void setSweptArea(IfcProfileDef SweptArea)
	{
		this.SweptArea = SweptArea;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SweptArea attribute.
	*
	* @return the value of SweptArea
	/**/
	public IfcProfileDef getSweptArea()
	{
		return this.SweptArea;
	}

	/**
	* This method sets the Position attribute to the given value.
	*
	* @param Position DEMANDED value to set - may not be null
	**/
	public void setPosition(IfcAxis2Placement3D Position)
	{
		this.Position = Position;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Position attribute.
	*
	* @return the value of Position
	/**/
	public IfcAxis2Placement3D getPosition()
	{
		return this.Position;
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
