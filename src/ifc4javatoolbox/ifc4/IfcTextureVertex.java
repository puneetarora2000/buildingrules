/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTextureVertex<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTextureVertex extends IfcPresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<IfcParameterValue>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Coordinates is an DEMANDED attribute - may not be null**/
	protected LIST<IfcParameterValue> Coordinates;
	/**
	* The default constructor.
	**/
	public IfcTextureVertex(){}

	/**
	* Constructs a new IfcTextureVertex object using the given parameters.
	*
	* @param Coordinates DEMANDED parameter of type LIST<IfcParameterValue> - may not be null.
	**/
	public IfcTextureVertex(LIST<IfcParameterValue> Coordinates)
	{
		this.Coordinates = Coordinates;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTextureVertex object using the given parameters.
	*
	* @param Coordinates DEMANDED parameter of type LIST<IfcParameterValue> - may not be null.
	**/
	public void setParameters(LIST<IfcParameterValue> Coordinates)
	{
		this.Coordinates = Coordinates;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Coordinates = (LIST<IfcParameterValue>) parameters.get(0);
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
		return IfcTextureVertex.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTEXTUREVERTEX(");
		if(getRedefinedDerivedAttributeTypes().contains("Coordinates")) stepString = stepString.concat("*);");
		else{
		if(this.Coordinates != null)		stepString = stepString.concat(((RootInterface)this.Coordinates).getStepParameter(IfcParameterValue.class.isInterface())+");");
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
	* This method sets the Coordinates attribute to the given value.
	*
	* @param Coordinates OPTIONAL value to set
	**/
	public void setCoordinates(LIST<IfcParameterValue> Coordinates)
	{
		this.Coordinates = Coordinates;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Coordinates attribute.
	*
	* @return a copy of the Coordinates list
	**/
	public LIST<IfcParameterValue> getCoordinates()
	{
		if(this.Coordinates != null)
			return new LIST<IfcParameterValue>(this.Coordinates);
		return null;
	}

	/**
	* This method adds an IfcParameterValue object to the Coordinates list.
	* @param Coordinates element to be appended to this list.
	**/
	public void addCoordinates(IfcParameterValue Coordinates)
	{
		if(this.Coordinates == null)
			this.Coordinates = new LIST<IfcParameterValue>();
		this.Coordinates.add(Coordinates);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcParameterValue objects to the Coordinates list.
	* @param Coordinates collection containing elements to be added to this list.
	**/
	public void addAllCoordinates(java.util.Collection<IfcParameterValue> Coordinates)
	{
		if(this.Coordinates == null)
			this.Coordinates = new LIST<IfcParameterValue>();
		this.Coordinates.addAll(Coordinates);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Coordinates list.
	**/
	public void clearCoordinates()
	{
		if(this.Coordinates != null)
		{
			this.Coordinates.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcParameterValue object from the Coordinates list.
	* @param Coordinates element to be removed from this list.
	**/
	public void removeCoordinates(IfcParameterValue Coordinates)
	{
		if(this.Coordinates != null)
		{
			this.Coordinates.remove(Coordinates);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcParameterValue objects from the Coordinates list.
	* @param Coordinates collection containing elements to be removed from this list.
	**/
	public void removeAllCoordinates(java.util.Collection<IfcParameterValue> Coordinates)
	{
		if(this.Coordinates != null)
		{
			this.Coordinates.removeAll(Coordinates);
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
		IfcTextureVertex ifcTextureVertex = new IfcTextureVertex();
		if(this.Coordinates != null)
			ifcTextureVertex.setCoordinates((LIST<IfcParameterValue>)this.Coordinates.clone());
		return ifcTextureVertex;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTextureVertex ifcTextureVertex = new IfcTextureVertex();
		if(this.Coordinates != null)
			ifcTextureVertex.setCoordinates(this.Coordinates);
		return ifcTextureVertex;
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
