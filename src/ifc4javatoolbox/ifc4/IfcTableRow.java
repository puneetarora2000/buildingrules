/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTableRow<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTableRow extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<IfcValue>","BOOLEAN"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RowCells is an OPTIONAL attribute**/
	protected LIST<IfcValue> RowCells;
	/** IsHeading is an OPTIONAL attribute**/
	protected BOOLEAN IsHeading;
	protected IfcTable OfTable_Inverse;
	/**
	* The default constructor.
	**/
	public IfcTableRow(){}

	/**
	* Constructs a new IfcTableRow object using the given parameters.
	*
	* @param RowCells OPTIONAL parameter of type LIST<IfcValue>
	* @param IsHeading OPTIONAL parameter of type BOOLEAN
	**/
	public IfcTableRow(LIST<IfcValue> RowCells, BOOLEAN IsHeading)
	{
		this.RowCells = RowCells;
		this.IsHeading = IsHeading;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTableRow object using the given parameters.
	*
	* @param RowCells OPTIONAL parameter of type LIST<IfcValue>
	* @param IsHeading OPTIONAL parameter of type BOOLEAN
	**/
	public void setParameters(LIST<IfcValue> RowCells, BOOLEAN IsHeading)
	{
		this.RowCells = RowCells;
		this.IsHeading = IsHeading;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.RowCells = (LIST<IfcValue>) parameters.get(0);
		this.IsHeading = (BOOLEAN) parameters.get(1);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		OfTable_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcTableRow.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTABLEROW(");
		if(getRedefinedDerivedAttributeTypes().contains("RowCells")) stepString = stepString.concat("*,");
		else{
		if(this.RowCells != null)		stepString = stepString.concat(((RootInterface)this.RowCells).getStepParameter(IfcValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("IsHeading")) stepString = stepString.concat("*);");
		else{
		if(this.IsHeading != null)		stepString = stepString.concat(((RootInterface)this.IsHeading).getStepParameter(BOOLEAN.class.isInterface())+");");
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
	* This method returns the value of the OfTable_Inverse attribute.
	*
	* @return the value of OfTable_Inverse
	/**/
	public IfcTable getOfTable_Inverse()
	{
		return this.OfTable_Inverse;
	}

	/**
	* This method sets the RowCells attribute to the given value.
	*
	* @param RowCells DEMANDED value to set - may not be null
	**/
	public void setRowCells(LIST<IfcValue> RowCells)
	{
		this.RowCells = RowCells;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the RowCells attribute.
	*
	* @return a copy of the RowCells list
	**/
	public LIST<IfcValue> getRowCells()
	{
		if(this.RowCells != null)
			return new LIST<IfcValue>(this.RowCells);
		return null;
	}

	/**
	* This method adds an IfcValue object to the RowCells list.
	* @param RowCells element to be appended to this list.
	**/
	public void addRowCells(IfcValue RowCells)
	{
		if(this.RowCells == null)
			this.RowCells = new LIST<IfcValue>();
		this.RowCells.add(RowCells);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcValue objects to the RowCells list.
	* @param RowCells collection containing elements to be added to this list.
	**/
	public void addAllRowCells(java.util.Collection<IfcValue> RowCells)
	{
		if(this.RowCells == null)
			this.RowCells = new LIST<IfcValue>();
		this.RowCells.addAll(RowCells);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RowCells list.
	**/
	public void clearRowCells()
	{
		if(this.RowCells != null)
		{
			this.RowCells.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcValue object from the RowCells list.
	* @param RowCells element to be removed from this list.
	**/
	public void removeRowCells(IfcValue RowCells)
	{
		if(this.RowCells != null)
		{
			this.RowCells.remove(RowCells);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcValue objects from the RowCells list.
	* @param RowCells collection containing elements to be removed from this list.
	**/
	public void removeAllRowCells(java.util.Collection<IfcValue> RowCells)
	{
		if(this.RowCells != null)
		{
			this.RowCells.removeAll(RowCells);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the IsHeading attribute to the given value.
	*
	* @param IsHeading DEMANDED value to set - may not be null
	**/
	public void setIsHeading(BOOLEAN IsHeading)
	{
		this.IsHeading = IsHeading;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the IsHeading attribute.
	*
	* @return the value of IsHeading
	/**/
	public BOOLEAN getIsHeading()
	{
		return this.IsHeading;
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
		IfcTableRow ifcTableRow = new IfcTableRow();
		if(this.RowCells != null)
			ifcTableRow.setRowCells((LIST<IfcValue>)this.RowCells.clone());
		if(this.IsHeading != null)
			ifcTableRow.setIsHeading((BOOLEAN)this.IsHeading.clone());
		return ifcTableRow;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTableRow ifcTableRow = new IfcTableRow();
		if(this.RowCells != null)
			ifcTableRow.setRowCells(this.RowCells);
		if(this.IsHeading != null)
			ifcTableRow.setIsHeading(this.IsHeading);
		return ifcTableRow;
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
