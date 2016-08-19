/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTessellatedFaceSet<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcTessellatedFaceSet extends IfcTessellatedItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcCartesianPointList3D","LIST<LIST<IfcParameterValue>>","BOOLEAN"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Coordinates is an DEMANDED attribute - may not be null**/
	protected IfcCartesianPointList3D Coordinates;
	/** Normals is an OPTIONAL attribute**/
	protected LIST<LIST<IfcParameterValue>> Normals;
	/** Closed is an OPTIONAL attribute**/
	protected BOOLEAN Closed;
	protected SET<IfcIndexedColourMap> HasColours_Inverse;
	protected SET<IfcIndexedTextureMap> HasTextures_Inverse;
	/**
	* The default constructor.
	**/
	public IfcTessellatedFaceSet(){}

	/**
	* Constructs a new IfcTessellatedFaceSet object using the given parameters.
	*
	* @param Coordinates DEMANDED parameter of type IfcCartesianPointList3D - may not be null.
	* @param Normals OPTIONAL parameter of type LIST<LIST<IfcParameterValue>>
	* @param Closed OPTIONAL parameter of type BOOLEAN
	**/
	public IfcTessellatedFaceSet(IfcCartesianPointList3D Coordinates, LIST<LIST<IfcParameterValue>> Normals, BOOLEAN Closed)
	{
		this.Coordinates = Coordinates;
		this.Normals = Normals;
		this.Closed = Closed;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTessellatedFaceSet object using the given parameters.
	*
	* @param Coordinates DEMANDED parameter of type IfcCartesianPointList3D - may not be null.
	* @param Normals OPTIONAL parameter of type LIST<LIST<IfcParameterValue>>
	* @param Closed OPTIONAL parameter of type BOOLEAN
	**/
	public void setParameters(IfcCartesianPointList3D Coordinates, LIST<LIST<IfcParameterValue>> Normals, BOOLEAN Closed)
	{
		this.Coordinates = Coordinates;
		this.Normals = Normals;
		this.Closed = Closed;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Coordinates = (IfcCartesianPointList3D) parameters.get(0);
		this.Normals = (LIST<LIST<IfcParameterValue>>) parameters.get(1);
		this.Closed = (BOOLEAN) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		HasColours_Inverse = null;
		HasTextures_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcTessellatedFaceSet.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTESSELLATEDFACESET(");
		if(getRedefinedDerivedAttributeTypes().contains("Coordinates")) stepString = stepString.concat("*,");
		else{
		if(this.Coordinates != null)		stepString = stepString.concat(((RootInterface)this.Coordinates).getStepParameter(IfcCartesianPointList3D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Normals")) stepString = stepString.concat("*,");
		else{
		if(this.Normals != null)		stepString = stepString.concat(((RootInterface)this.Normals).getStepParameter(LIST.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Closed")) stepString = stepString.concat("*);");
		else{
		if(this.Closed != null)		stepString = stepString.concat(((RootInterface)this.Closed).getStepParameter(BOOLEAN.class.isInterface())+");");
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
	* This method returns a copy of the set of the HasColours_Inverse attribute.
	*
	* @return a copy of the HasColours_Inverse set
	**/
	public SET<IfcIndexedColourMap> getHasColours_Inverse()
	{
		if(this.HasColours_Inverse != null)
			return new SET<IfcIndexedColourMap>(this.HasColours_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasTextures_Inverse attribute.
	*
	* @return a copy of the HasTextures_Inverse set
	**/
	public SET<IfcIndexedTextureMap> getHasTextures_Inverse()
	{
		if(this.HasTextures_Inverse != null)
			return new SET<IfcIndexedTextureMap>(this.HasTextures_Inverse);
		return null;
	}

	/**
	* This method sets the Coordinates attribute to the given value.
	*
	* @param Coordinates OPTIONAL value to set
	**/
	public void setCoordinates(IfcCartesianPointList3D Coordinates)
	{
		this.Coordinates = Coordinates;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Coordinates attribute.
	*
	* @return the value of Coordinates
	/**/
	public IfcCartesianPointList3D getCoordinates()
	{
		return this.Coordinates;
	}

	/**
	* This method sets the Normals attribute to the given value.
	*
	* @param Normals DEMANDED value to set - may not be null
	**/
	public void setNormals(LIST<LIST<IfcParameterValue>> Normals)
	{
		this.Normals = Normals;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Normals attribute.
	*
	* @return a copy of the Normals list
	**/
	public LIST<LIST<IfcParameterValue>> getNormals()
	{
		if(this.Normals != null)
			return new LIST<LIST<IfcParameterValue>>(this.Normals);
		return null;
	}

	/**
	* This method adds an LIST<IfcParameterValue> object to the Normals list.
	* @param Normals element to be appended to this list.
	**/
	public void addNormals(LIST<IfcParameterValue> Normals)
	{
		if(this.Normals == null)
			this.Normals = new LIST<LIST<IfcParameterValue>>();
		this.Normals.add(Normals);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of LIST<IfcParameterValue> objects to the Normals list.
	* @param Normals collection containing elements to be added to this list.
	**/
	public void addAllNormals(java.util.Collection<LIST<IfcParameterValue>> Normals)
	{
		if(this.Normals == null)
			this.Normals = new LIST<LIST<IfcParameterValue>>();
		this.Normals.addAll(Normals);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Normals list.
	**/
	public void clearNormals()
	{
		if(this.Normals != null)
		{
			this.Normals.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an LIST<IfcParameterValue> object from the Normals list.
	* @param Normals element to be removed from this list.
	**/
	public void removeNormals(LIST<IfcParameterValue> Normals)
	{
		if(this.Normals != null)
		{
			this.Normals.remove(Normals);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of LIST<IfcParameterValue> objects from the Normals list.
	* @param Normals collection containing elements to be removed from this list.
	**/
	public void removeAllNormals(java.util.Collection<LIST<IfcParameterValue>> Normals)
	{
		if(this.Normals != null)
		{
			this.Normals.removeAll(Normals);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Closed attribute to the given value.
	*
	* @param Closed DEMANDED value to set - may not be null
	**/
	public void setClosed(BOOLEAN Closed)
	{
		this.Closed = Closed;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Closed attribute.
	*
	* @return the value of Closed
	/**/
	public BOOLEAN getClosed()
	{
		return this.Closed;
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
