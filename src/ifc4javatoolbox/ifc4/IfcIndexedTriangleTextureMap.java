/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcIndexedTriangleTextureMap<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcIndexedTriangleTextureMap extends IfcIndexedTextureMap implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<IfcSurfaceTexture>","IfcTessellatedFaceSet","IfcTextureVertexList","LIST<LIST<INTEGER>>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** TexCoordIndex is an OPTIONAL attribute**/
	protected LIST<LIST<INTEGER>> TexCoordIndex;
	/**
	* The default constructor.
	**/
	public IfcIndexedTriangleTextureMap(){}

	/**
	* Constructs a new IfcIndexedTriangleTextureMap object using the given parameters.
	*
	* @param Maps DEMANDED parameter of type LIST<IfcSurfaceTexture> - may not be null.
	* @param MappedTo DEMANDED parameter of type IfcTessellatedFaceSet - may not be null.
	* @param TexCoords DEMANDED parameter of type IfcTextureVertexList - may not be null.
	* @param TexCoordIndex OPTIONAL parameter of type LIST<LIST<INTEGER>>
	**/
	public IfcIndexedTriangleTextureMap(LIST<IfcSurfaceTexture> Maps, IfcTessellatedFaceSet MappedTo, IfcTextureVertexList TexCoords, LIST<LIST<INTEGER>> TexCoordIndex)
	{
		this.Maps = Maps;
		this.MappedTo = MappedTo;
		this.TexCoords = TexCoords;
		this.TexCoordIndex = TexCoordIndex;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcIndexedTriangleTextureMap object using the given parameters.
	*
	* @param Maps DEMANDED parameter of type LIST<IfcSurfaceTexture> - may not be null.
	* @param MappedTo DEMANDED parameter of type IfcTessellatedFaceSet - may not be null.
	* @param TexCoords DEMANDED parameter of type IfcTextureVertexList - may not be null.
	* @param TexCoordIndex OPTIONAL parameter of type LIST<LIST<INTEGER>>
	**/
	public void setParameters(LIST<IfcSurfaceTexture> Maps, IfcTessellatedFaceSet MappedTo, IfcTextureVertexList TexCoords, LIST<LIST<INTEGER>> TexCoordIndex)
	{
		this.Maps = Maps;
		this.MappedTo = MappedTo;
		this.TexCoords = TexCoords;
		this.TexCoordIndex = TexCoordIndex;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Maps = (LIST<IfcSurfaceTexture>) parameters.get(0);
		this.MappedTo = (IfcTessellatedFaceSet) parameters.get(1);
		this.TexCoords = (IfcTextureVertexList) parameters.get(2);
		this.TexCoordIndex = (LIST<LIST<INTEGER>>) parameters.get(3);
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
		if(Maps != null)
		{
			for(IfcSurfaceTexture Maps$ : Maps)
			{
				if(Maps$.IsMappedBy_Inverse == null)
				{
					Maps$.IsMappedBy_Inverse = new SET<IfcTextureCoordinate>();
				}
				Maps$.IsMappedBy_Inverse.add(this);
			}
		}
		if(MappedTo != null)
		{
				if(MappedTo.HasTextures_Inverse == null)
				{
					MappedTo.HasTextures_Inverse = new SET<IfcIndexedTextureMap>();
				}
				MappedTo.HasTextures_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcIndexedTriangleTextureMap.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCINDEXEDTRIANGLETEXTUREMAP(");
		if(getRedefinedDerivedAttributeTypes().contains("Maps")) stepString = stepString.concat("*,");
		else{
		if(this.Maps != null)		stepString = stepString.concat(((RootInterface)this.Maps).getStepParameter(IfcSurfaceTexture.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MappedTo")) stepString = stepString.concat("*,");
		else{
		if(this.MappedTo != null)		stepString = stepString.concat(((RootInterface)this.MappedTo).getStepParameter(IfcTessellatedFaceSet.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TexCoords")) stepString = stepString.concat("*,");
		else{
		if(this.TexCoords != null)		stepString = stepString.concat(((RootInterface)this.TexCoords).getStepParameter(IfcTextureVertexList.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TexCoordIndex")) stepString = stepString.concat("*);");
		else{
		if(this.TexCoordIndex != null)		stepString = stepString.concat(((RootInterface)this.TexCoordIndex).getStepParameter(LIST.class.isInterface())+");");
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
	* This method sets the TexCoordIndex attribute to the given value.
	*
	* @param TexCoordIndex DEMANDED value to set - may not be null
	**/
	public void setTexCoordIndex(LIST<LIST<INTEGER>> TexCoordIndex)
	{
		this.TexCoordIndex = TexCoordIndex;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the TexCoordIndex attribute.
	*
	* @return a copy of the TexCoordIndex list
	**/
	public LIST<LIST<INTEGER>> getTexCoordIndex()
	{
		if(this.TexCoordIndex != null)
			return new LIST<LIST<INTEGER>>(this.TexCoordIndex);
		return null;
	}

	/**
	* This method adds an LIST<INTEGER> object to the TexCoordIndex list.
	* @param TexCoordIndex element to be appended to this list.
	**/
	public void addTexCoordIndex(LIST<INTEGER> TexCoordIndex)
	{
		if(this.TexCoordIndex == null)
			this.TexCoordIndex = new LIST<LIST<INTEGER>>();
		this.TexCoordIndex.add(TexCoordIndex);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of LIST<INTEGER> objects to the TexCoordIndex list.
	* @param TexCoordIndex collection containing elements to be added to this list.
	**/
	public void addAllTexCoordIndex(java.util.Collection<LIST<INTEGER>> TexCoordIndex)
	{
		if(this.TexCoordIndex == null)
			this.TexCoordIndex = new LIST<LIST<INTEGER>>();
		this.TexCoordIndex.addAll(TexCoordIndex);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the TexCoordIndex list.
	**/
	public void clearTexCoordIndex()
	{
		if(this.TexCoordIndex != null)
		{
			this.TexCoordIndex.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an LIST<INTEGER> object from the TexCoordIndex list.
	* @param TexCoordIndex element to be removed from this list.
	**/
	public void removeTexCoordIndex(LIST<INTEGER> TexCoordIndex)
	{
		if(this.TexCoordIndex != null)
		{
			this.TexCoordIndex.remove(TexCoordIndex);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of LIST<INTEGER> objects from the TexCoordIndex list.
	* @param TexCoordIndex collection containing elements to be removed from this list.
	**/
	public void removeAllTexCoordIndex(java.util.Collection<LIST<INTEGER>> TexCoordIndex)
	{
		if(this.TexCoordIndex != null)
		{
			this.TexCoordIndex.removeAll(TexCoordIndex);
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
		IfcIndexedTriangleTextureMap ifcIndexedTriangleTextureMap = new IfcIndexedTriangleTextureMap();
		if(this.Maps != null)
			ifcIndexedTriangleTextureMap.setMaps((LIST<IfcSurfaceTexture>)this.Maps.clone());
		if(this.MappedTo != null)
			ifcIndexedTriangleTextureMap.setMappedTo((IfcTessellatedFaceSet)this.MappedTo.clone());
		if(this.TexCoords != null)
			ifcIndexedTriangleTextureMap.setTexCoords((IfcTextureVertexList)this.TexCoords.clone());
		if(this.TexCoordIndex != null)
			ifcIndexedTriangleTextureMap.setTexCoordIndex((LIST<LIST<INTEGER>>)this.TexCoordIndex.clone());
		return ifcIndexedTriangleTextureMap;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcIndexedTriangleTextureMap ifcIndexedTriangleTextureMap = new IfcIndexedTriangleTextureMap();
		if(this.Maps != null)
			ifcIndexedTriangleTextureMap.setMaps(this.Maps);
		if(this.MappedTo != null)
			ifcIndexedTriangleTextureMap.setMappedTo(this.MappedTo);
		if(this.TexCoords != null)
			ifcIndexedTriangleTextureMap.setTexCoords(this.TexCoords);
		if(this.TexCoordIndex != null)
			ifcIndexedTriangleTextureMap.setTexCoordIndex(this.TexCoordIndex);
		return ifcIndexedTriangleTextureMap;
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
