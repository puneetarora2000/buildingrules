/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcIndexedColourMap<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcIndexedColourMap extends IfcPresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcTessellatedFaceSet","IfcSurfaceStyleShading","IfcColourRgbList","LIST<INTEGER>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** MappedTo is an DEMANDED attribute - may not be null**/
	protected IfcTessellatedFaceSet MappedTo;
	/** Overrides is an OPTIONAL attribute**/
	protected IfcSurfaceStyleShading Overrides;
	/** Colours is an DEMANDED attribute - may not be null**/
	protected IfcColourRgbList Colours;
	/** ColourIndex is an DEMANDED attribute - may not be null**/
	protected LIST<INTEGER> ColourIndex;
	/**
	* The default constructor.
	**/
	public IfcIndexedColourMap(){}

	/**
	* Constructs a new IfcIndexedColourMap object using the given parameters.
	*
	* @param MappedTo DEMANDED parameter of type IfcTessellatedFaceSet - may not be null.
	* @param Overrides OPTIONAL parameter of type IfcSurfaceStyleShading
	* @param Colours DEMANDED parameter of type IfcColourRgbList - may not be null.
	* @param ColourIndex DEMANDED parameter of type LIST<INTEGER> - may not be null.
	**/
	public IfcIndexedColourMap(IfcTessellatedFaceSet MappedTo, IfcSurfaceStyleShading Overrides, IfcColourRgbList Colours, LIST<INTEGER> ColourIndex)
	{
		this.MappedTo = MappedTo;
		this.Overrides = Overrides;
		this.Colours = Colours;
		this.ColourIndex = ColourIndex;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcIndexedColourMap object using the given parameters.
	*
	* @param MappedTo DEMANDED parameter of type IfcTessellatedFaceSet - may not be null.
	* @param Overrides OPTIONAL parameter of type IfcSurfaceStyleShading
	* @param Colours DEMANDED parameter of type IfcColourRgbList - may not be null.
	* @param ColourIndex DEMANDED parameter of type LIST<INTEGER> - may not be null.
	**/
	public void setParameters(IfcTessellatedFaceSet MappedTo, IfcSurfaceStyleShading Overrides, IfcColourRgbList Colours, LIST<INTEGER> ColourIndex)
	{
		this.MappedTo = MappedTo;
		this.Overrides = Overrides;
		this.Colours = Colours;
		this.ColourIndex = ColourIndex;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.MappedTo = (IfcTessellatedFaceSet) parameters.get(0);
		this.Overrides = (IfcSurfaceStyleShading) parameters.get(1);
		this.Colours = (IfcColourRgbList) parameters.get(2);
		this.ColourIndex = (LIST<INTEGER>) parameters.get(3);
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
		if(MappedTo != null)
		{
				if(MappedTo.HasColours_Inverse == null)
				{
					MappedTo.HasColours_Inverse = new SET<IfcIndexedColourMap>();
				}
				MappedTo.HasColours_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcIndexedColourMap.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCINDEXEDCOLOURMAP(");
		if(getRedefinedDerivedAttributeTypes().contains("MappedTo")) stepString = stepString.concat("*,");
		else{
		if(this.MappedTo != null)		stepString = stepString.concat(((RootInterface)this.MappedTo).getStepParameter(IfcTessellatedFaceSet.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Overrides")) stepString = stepString.concat("*,");
		else{
		if(this.Overrides != null)		stepString = stepString.concat(((RootInterface)this.Overrides).getStepParameter(IfcSurfaceStyleShading.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Colours")) stepString = stepString.concat("*,");
		else{
		if(this.Colours != null)		stepString = stepString.concat(((RootInterface)this.Colours).getStepParameter(IfcColourRgbList.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ColourIndex")) stepString = stepString.concat("*);");
		else{
		if(this.ColourIndex != null)		stepString = stepString.concat(((RootInterface)this.ColourIndex).getStepParameter(INTEGER.class.isInterface())+");");
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
	* This method sets the MappedTo attribute to the given value.
	*
	* @param MappedTo OPTIONAL value to set
	**/
	public void setMappedTo(IfcTessellatedFaceSet MappedTo)
	{
		synchronizeInversesRemoveMappedTo(this.MappedTo);
		this.MappedTo = MappedTo;
		synchronizeInversesAddMappedTo(this.MappedTo);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MappedTo attribute.
	*
	* @return the value of MappedTo
	/**/
	public IfcTessellatedFaceSet getMappedTo()
	{
		return this.MappedTo;
	}

	private void synchronizeInversesAddMappedTo(IfcTessellatedFaceSet MappedTo)
	{
		if(MappedTo != null)
		{
				if(MappedTo.HasColours_Inverse == null)
				{
					MappedTo.HasColours_Inverse = new SET<IfcIndexedColourMap>();
				}
				MappedTo.HasColours_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveMappedTo(IfcTessellatedFaceSet MappedTo)
	{
		if(MappedTo != null)
		{
				if(MappedTo.HasColours_Inverse != null)
				{
					MappedTo.HasColours_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the Overrides attribute to the given value.
	*
	* @param Overrides DEMANDED value to set - may not be null
	**/
	public void setOverrides(IfcSurfaceStyleShading Overrides)
	{
		this.Overrides = Overrides;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Overrides attribute.
	*
	* @return the value of Overrides
	/**/
	public IfcSurfaceStyleShading getOverrides()
	{
		return this.Overrides;
	}

	/**
	* This method sets the Colours attribute to the given value.
	*
	* @param Colours OPTIONAL value to set
	**/
	public void setColours(IfcColourRgbList Colours)
	{
		this.Colours = Colours;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Colours attribute.
	*
	* @return the value of Colours
	/**/
	public IfcColourRgbList getColours()
	{
		return this.Colours;
	}

	/**
	* This method sets the ColourIndex attribute to the given value.
	*
	* @param ColourIndex OPTIONAL value to set
	**/
	public void setColourIndex(LIST<INTEGER> ColourIndex)
	{
		this.ColourIndex = ColourIndex;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the ColourIndex attribute.
	*
	* @return a copy of the ColourIndex list
	**/
	public LIST<INTEGER> getColourIndex()
	{
		if(this.ColourIndex != null)
			return new LIST<INTEGER>(this.ColourIndex);
		return null;
	}

	/**
	* This method adds an INTEGER object to the ColourIndex list.
	* @param ColourIndex element to be appended to this list.
	**/
	public void addColourIndex(INTEGER ColourIndex)
	{
		if(this.ColourIndex == null)
			this.ColourIndex = new LIST<INTEGER>();
		this.ColourIndex.add(ColourIndex);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of INTEGER objects to the ColourIndex list.
	* @param ColourIndex collection containing elements to be added to this list.
	**/
	public void addAllColourIndex(java.util.Collection<INTEGER> ColourIndex)
	{
		if(this.ColourIndex == null)
			this.ColourIndex = new LIST<INTEGER>();
		this.ColourIndex.addAll(ColourIndex);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the ColourIndex list.
	**/
	public void clearColourIndex()
	{
		if(this.ColourIndex != null)
		{
			this.ColourIndex.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an INTEGER object from the ColourIndex list.
	* @param ColourIndex element to be removed from this list.
	**/
	public void removeColourIndex(INTEGER ColourIndex)
	{
		if(this.ColourIndex != null)
		{
			this.ColourIndex.remove(ColourIndex);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of INTEGER objects from the ColourIndex list.
	* @param ColourIndex collection containing elements to be removed from this list.
	**/
	public void removeAllColourIndex(java.util.Collection<INTEGER> ColourIndex)
	{
		if(this.ColourIndex != null)
		{
			this.ColourIndex.removeAll(ColourIndex);
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
		IfcIndexedColourMap ifcIndexedColourMap = new IfcIndexedColourMap();
		if(this.MappedTo != null)
			ifcIndexedColourMap.setMappedTo((IfcTessellatedFaceSet)this.MappedTo.clone());
		if(this.Overrides != null)
			ifcIndexedColourMap.setOverrides((IfcSurfaceStyleShading)this.Overrides.clone());
		if(this.Colours != null)
			ifcIndexedColourMap.setColours((IfcColourRgbList)this.Colours.clone());
		if(this.ColourIndex != null)
			ifcIndexedColourMap.setColourIndex((LIST<INTEGER>)this.ColourIndex.clone());
		return ifcIndexedColourMap;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcIndexedColourMap ifcIndexedColourMap = new IfcIndexedColourMap();
		if(this.MappedTo != null)
			ifcIndexedColourMap.setMappedTo(this.MappedTo);
		if(this.Overrides != null)
			ifcIndexedColourMap.setOverrides(this.Overrides);
		if(this.Colours != null)
			ifcIndexedColourMap.setColours(this.Colours);
		if(this.ColourIndex != null)
			ifcIndexedColourMap.setColourIndex(this.ColourIndex);
		return ifcIndexedColourMap;
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
