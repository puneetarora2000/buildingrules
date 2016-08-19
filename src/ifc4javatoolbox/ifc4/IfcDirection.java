/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcDirection<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcDirection extends IfcGeometricRepresentationItem implements IfcGridPlacementDirectionSelect, IfcVectorOrDirection, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<DOUBLE>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** DirectionRatios is an DEMANDED attribute - may not be null**/
	protected LIST<DOUBLE> DirectionRatios;
	/**
	* The default constructor.
	**/
	public IfcDirection(){}

	/**
	* Constructs a new IfcDirection object using the given parameters.
	*
	* @param DirectionRatios DEMANDED parameter of type LIST<DOUBLE> - may not be null.
	**/
	public IfcDirection(LIST<DOUBLE> DirectionRatios)
	{
		this.DirectionRatios = DirectionRatios;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcDirection object using the given parameters.
	*
	* @param DirectionRatios DEMANDED parameter of type LIST<DOUBLE> - may not be null.
	**/
	public void setParameters(LIST<DOUBLE> DirectionRatios)
	{
		this.DirectionRatios = DirectionRatios;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.DirectionRatios = (LIST<DOUBLE>) parameters.get(0);
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
		return IfcDirection.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCDIRECTION(");
		if(getRedefinedDerivedAttributeTypes().contains("DirectionRatios")) stepString = stepString.concat("*);");
		else{
		if(this.DirectionRatios != null)		stepString = stepString.concat(((RootInterface)this.DirectionRatios).getStepParameter(DOUBLE.class.isInterface())+");");
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
	* This method sets the DirectionRatios attribute to the given value.
	*
	* @param DirectionRatios OPTIONAL value to set
	**/
	public void setDirectionRatios(LIST<DOUBLE> DirectionRatios)
	{
		this.DirectionRatios = DirectionRatios;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the DirectionRatios attribute.
	*
	* @return a copy of the DirectionRatios list
	**/
	public LIST<DOUBLE> getDirectionRatios()
	{
		if(this.DirectionRatios != null)
			return new LIST<DOUBLE>(this.DirectionRatios);
		return null;
	}

	/**
	* This method adds an DOUBLE object to the DirectionRatios list.
	* @param DirectionRatios element to be appended to this list.
	**/
	public void addDirectionRatios(DOUBLE DirectionRatios)
	{
		if(this.DirectionRatios == null)
			this.DirectionRatios = new LIST<DOUBLE>();
		this.DirectionRatios.add(DirectionRatios);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of DOUBLE objects to the DirectionRatios list.
	* @param DirectionRatios collection containing elements to be added to this list.
	**/
	public void addAllDirectionRatios(java.util.Collection<DOUBLE> DirectionRatios)
	{
		if(this.DirectionRatios == null)
			this.DirectionRatios = new LIST<DOUBLE>();
		this.DirectionRatios.addAll(DirectionRatios);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the DirectionRatios list.
	**/
	public void clearDirectionRatios()
	{
		if(this.DirectionRatios != null)
		{
			this.DirectionRatios.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an DOUBLE object from the DirectionRatios list.
	* @param DirectionRatios element to be removed from this list.
	**/
	public void removeDirectionRatios(DOUBLE DirectionRatios)
	{
		if(this.DirectionRatios != null)
		{
			this.DirectionRatios.remove(DirectionRatios);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of DOUBLE objects from the DirectionRatios list.
	* @param DirectionRatios collection containing elements to be removed from this list.
	**/
	public void removeAllDirectionRatios(java.util.Collection<DOUBLE> DirectionRatios)
	{
		if(this.DirectionRatios != null)
		{
			this.DirectionRatios.removeAll(DirectionRatios);
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
		IfcDirection ifcDirection = new IfcDirection();
		if(this.DirectionRatios != null)
			ifcDirection.setDirectionRatios((LIST<DOUBLE>)this.DirectionRatios.clone());
		return ifcDirection;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcDirection ifcDirection = new IfcDirection();
		if(this.DirectionRatios != null)
			ifcDirection.setDirectionRatios(this.DirectionRatios);
		return ifcDirection;
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
