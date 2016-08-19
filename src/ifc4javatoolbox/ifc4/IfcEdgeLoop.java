/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcEdgeLoop<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcEdgeLoop extends IfcLoop implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<IfcOrientedEdge>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** EdgeList is an DEMANDED attribute - may not be null**/
	protected LIST<IfcOrientedEdge> EdgeList;
	/**
	* The default constructor.
	**/
	public IfcEdgeLoop(){}

	/**
	* Constructs a new IfcEdgeLoop object using the given parameters.
	*
	* @param EdgeList DEMANDED parameter of type LIST<IfcOrientedEdge> - may not be null.
	**/
	public IfcEdgeLoop(LIST<IfcOrientedEdge> EdgeList)
	{
		this.EdgeList = EdgeList;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcEdgeLoop object using the given parameters.
	*
	* @param EdgeList DEMANDED parameter of type LIST<IfcOrientedEdge> - may not be null.
	**/
	public void setParameters(LIST<IfcOrientedEdge> EdgeList)
	{
		this.EdgeList = EdgeList;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.EdgeList = (LIST<IfcOrientedEdge>) parameters.get(0);
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
		return IfcEdgeLoop.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCEDGELOOP(");
		if(getRedefinedDerivedAttributeTypes().contains("EdgeList")) stepString = stepString.concat("*);");
		else{
		if(this.EdgeList != null)		stepString = stepString.concat(((RootInterface)this.EdgeList).getStepParameter(IfcOrientedEdge.class.isInterface())+");");
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
	* This method sets the EdgeList attribute to the given value.
	*
	* @param EdgeList OPTIONAL value to set
	**/
	public void setEdgeList(LIST<IfcOrientedEdge> EdgeList)
	{
		this.EdgeList = EdgeList;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the EdgeList attribute.
	*
	* @return a copy of the EdgeList list
	**/
	public LIST<IfcOrientedEdge> getEdgeList()
	{
		if(this.EdgeList != null)
			return new LIST<IfcOrientedEdge>(this.EdgeList);
		return null;
	}

	/**
	* This method adds an IfcOrientedEdge object to the EdgeList list.
	* @param EdgeList element to be appended to this list.
	**/
	public void addEdgeList(IfcOrientedEdge EdgeList)
	{
		if(this.EdgeList == null)
			this.EdgeList = new LIST<IfcOrientedEdge>();
		this.EdgeList.add(EdgeList);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcOrientedEdge objects to the EdgeList list.
	* @param EdgeList collection containing elements to be added to this list.
	**/
	public void addAllEdgeList(java.util.Collection<IfcOrientedEdge> EdgeList)
	{
		if(this.EdgeList == null)
			this.EdgeList = new LIST<IfcOrientedEdge>();
		this.EdgeList.addAll(EdgeList);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the EdgeList list.
	**/
	public void clearEdgeList()
	{
		if(this.EdgeList != null)
		{
			this.EdgeList.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcOrientedEdge object from the EdgeList list.
	* @param EdgeList element to be removed from this list.
	**/
	public void removeEdgeList(IfcOrientedEdge EdgeList)
	{
		if(this.EdgeList != null)
		{
			this.EdgeList.remove(EdgeList);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcOrientedEdge objects from the EdgeList list.
	* @param EdgeList collection containing elements to be removed from this list.
	**/
	public void removeAllEdgeList(java.util.Collection<IfcOrientedEdge> EdgeList)
	{
		if(this.EdgeList != null)
		{
			this.EdgeList.removeAll(EdgeList);
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
		IfcEdgeLoop ifcEdgeLoop = new IfcEdgeLoop();
		if(this.EdgeList != null)
			ifcEdgeLoop.setEdgeList((LIST<IfcOrientedEdge>)this.EdgeList.clone());
		return ifcEdgeLoop;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcEdgeLoop ifcEdgeLoop = new IfcEdgeLoop();
		if(this.EdgeList != null)
			ifcEdgeLoop.setEdgeList(this.EdgeList);
		return ifcEdgeLoop;
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
