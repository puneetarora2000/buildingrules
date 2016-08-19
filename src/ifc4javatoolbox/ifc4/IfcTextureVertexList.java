/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTextureVertexList<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTextureVertexList extends IfcPresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<LIST<IfcParameterValue>>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** TexCoordsList is an DEMANDED attribute - may not be null**/
	protected LIST<LIST<IfcParameterValue>> TexCoordsList;
	/**
	* The default constructor.
	**/
	public IfcTextureVertexList(){}

	/**
	* Constructs a new IfcTextureVertexList object using the given parameters.
	*
	* @param TexCoordsList DEMANDED parameter of type LIST<LIST<IfcParameterValue>> - may not be null.
	**/
	public IfcTextureVertexList(LIST<LIST<IfcParameterValue>> TexCoordsList)
	{
		this.TexCoordsList = TexCoordsList;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTextureVertexList object using the given parameters.
	*
	* @param TexCoordsList DEMANDED parameter of type LIST<LIST<IfcParameterValue>> - may not be null.
	**/
	public void setParameters(LIST<LIST<IfcParameterValue>> TexCoordsList)
	{
		this.TexCoordsList = TexCoordsList;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.TexCoordsList = (LIST<LIST<IfcParameterValue>>) parameters.get(0);
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
		return IfcTextureVertexList.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTEXTUREVERTEXLIST(");
		if(getRedefinedDerivedAttributeTypes().contains("TexCoordsList")) stepString = stepString.concat("*);");
		else{
		if(this.TexCoordsList != null)		stepString = stepString.concat(((RootInterface)this.TexCoordsList).getStepParameter(LIST.class.isInterface())+");");
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
	* This method sets the TexCoordsList attribute to the given value.
	*
	* @param TexCoordsList OPTIONAL value to set
	**/
	public void setTexCoordsList(LIST<LIST<IfcParameterValue>> TexCoordsList)
	{
		this.TexCoordsList = TexCoordsList;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the TexCoordsList attribute.
	*
	* @return a copy of the TexCoordsList list
	**/
	public LIST<LIST<IfcParameterValue>> getTexCoordsList()
	{
		if(this.TexCoordsList != null)
			return new LIST<LIST<IfcParameterValue>>(this.TexCoordsList);
		return null;
	}

	/**
	* This method adds an LIST<IfcParameterValue> object to the TexCoordsList list.
	* @param TexCoordsList element to be appended to this list.
	**/
	public void addTexCoordsList(LIST<IfcParameterValue> TexCoordsList)
	{
		if(this.TexCoordsList == null)
			this.TexCoordsList = new LIST<LIST<IfcParameterValue>>();
		this.TexCoordsList.add(TexCoordsList);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of LIST<IfcParameterValue> objects to the TexCoordsList list.
	* @param TexCoordsList collection containing elements to be added to this list.
	**/
	public void addAllTexCoordsList(java.util.Collection<LIST<IfcParameterValue>> TexCoordsList)
	{
		if(this.TexCoordsList == null)
			this.TexCoordsList = new LIST<LIST<IfcParameterValue>>();
		this.TexCoordsList.addAll(TexCoordsList);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the TexCoordsList list.
	**/
	public void clearTexCoordsList()
	{
		if(this.TexCoordsList != null)
		{
			this.TexCoordsList.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an LIST<IfcParameterValue> object from the TexCoordsList list.
	* @param TexCoordsList element to be removed from this list.
	**/
	public void removeTexCoordsList(LIST<IfcParameterValue> TexCoordsList)
	{
		if(this.TexCoordsList != null)
		{
			this.TexCoordsList.remove(TexCoordsList);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of LIST<IfcParameterValue> objects from the TexCoordsList list.
	* @param TexCoordsList collection containing elements to be removed from this list.
	**/
	public void removeAllTexCoordsList(java.util.Collection<LIST<IfcParameterValue>> TexCoordsList)
	{
		if(this.TexCoordsList != null)
		{
			this.TexCoordsList.removeAll(TexCoordsList);
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
		IfcTextureVertexList ifcTextureVertexList = new IfcTextureVertexList();
		if(this.TexCoordsList != null)
			ifcTextureVertexList.setTexCoordsList((LIST<LIST<IfcParameterValue>>)this.TexCoordsList.clone());
		return ifcTextureVertexList;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTextureVertexList ifcTextureVertexList = new IfcTextureVertexList();
		if(this.TexCoordsList != null)
			ifcTextureVertexList.setTexCoordsList(this.TexCoordsList);
		return ifcTextureVertexList;
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
