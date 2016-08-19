/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcMaterialLayerSet<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcMaterialLayerSet extends IfcMaterialDefinition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"LIST<IfcMaterialLayer>","IfcLabel","IfcText"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** MaterialLayers is an DEMANDED attribute - may not be null**/
	protected LIST<IfcMaterialLayer> MaterialLayers;
	/** LayerSetName is an OPTIONAL attribute**/
	protected IfcLabel LayerSetName;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/**
	* The default constructor.
	**/
	public IfcMaterialLayerSet(){}

	/**
	* Constructs a new IfcMaterialLayerSet object using the given parameters.
	*
	* @param MaterialLayers DEMANDED parameter of type LIST<IfcMaterialLayer> - may not be null.
	* @param LayerSetName OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	**/
	public IfcMaterialLayerSet(LIST<IfcMaterialLayer> MaterialLayers, IfcLabel LayerSetName, IfcText Description)
	{
		this.MaterialLayers = MaterialLayers;
		this.LayerSetName = LayerSetName;
		this.Description = Description;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcMaterialLayerSet object using the given parameters.
	*
	* @param MaterialLayers DEMANDED parameter of type LIST<IfcMaterialLayer> - may not be null.
	* @param LayerSetName OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	**/
	public void setParameters(LIST<IfcMaterialLayer> MaterialLayers, IfcLabel LayerSetName, IfcText Description)
	{
		this.MaterialLayers = MaterialLayers;
		this.LayerSetName = LayerSetName;
		this.Description = Description;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.MaterialLayers = (LIST<IfcMaterialLayer>) parameters.get(0);
		this.LayerSetName = (IfcLabel) parameters.get(1);
		this.Description = (IfcText) parameters.get(2);
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
		if(MaterialLayers != null)
		{
			for(IfcMaterialLayer MaterialLayers$ : MaterialLayers)
			{
				MaterialLayers$.ToMaterialLayerSet_Inverse = this;
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcMaterialLayerSet.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCMATERIALLAYERSET(");
		if(getRedefinedDerivedAttributeTypes().contains("MaterialLayers")) stepString = stepString.concat("*,");
		else{
		if(this.MaterialLayers != null)		stepString = stepString.concat(((RootInterface)this.MaterialLayers).getStepParameter(IfcMaterialLayer.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LayerSetName")) stepString = stepString.concat("*,");
		else{
		if(this.LayerSetName != null)		stepString = stepString.concat(((RootInterface)this.LayerSetName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*);");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+");");
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
	* This method sets the MaterialLayers attribute to the given value.
	*
	* @param MaterialLayers OPTIONAL value to set
	**/
	public void setMaterialLayers(LIST<IfcMaterialLayer> MaterialLayers)
	{
		synchronizeInversesRemoveMaterialLayers(this.MaterialLayers);
		this.MaterialLayers = MaterialLayers;
		synchronizeInversesAddMaterialLayers(this.MaterialLayers);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the MaterialLayers attribute.
	*
	* @return a copy of the MaterialLayers list
	**/
	public LIST<IfcMaterialLayer> getMaterialLayers()
	{
		if(this.MaterialLayers != null)
			return new LIST<IfcMaterialLayer>(this.MaterialLayers);
		return null;
	}

	/**
	* This method adds an IfcMaterialLayer object to the MaterialLayers list.
	* @param MaterialLayers element to be appended to this list.
	**/
	public void addMaterialLayers(IfcMaterialLayer MaterialLayers)
	{
		if(this.MaterialLayers == null)
			this.MaterialLayers = new LIST<IfcMaterialLayer>();
		this.MaterialLayers.add(MaterialLayers);
		synchronizeInversesAddMaterialLayers(MaterialLayers);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcMaterialLayer objects to the MaterialLayers list.
	* @param MaterialLayers collection containing elements to be added to this list.
	**/
	public void addAllMaterialLayers(java.util.Collection<IfcMaterialLayer> MaterialLayers)
	{
		if(this.MaterialLayers == null)
			this.MaterialLayers = new LIST<IfcMaterialLayer>();
		this.MaterialLayers.addAll(MaterialLayers);
		synchronizeInversesAddMaterialLayers(MaterialLayers);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the MaterialLayers list.
	**/
	public void clearMaterialLayers()
	{
		if(this.MaterialLayers != null)
		{
			synchronizeInversesRemoveMaterialLayers(this.MaterialLayers);
			this.MaterialLayers.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcMaterialLayer object from the MaterialLayers list.
	* @param MaterialLayers element to be removed from this list.
	**/
	public void removeMaterialLayers(IfcMaterialLayer MaterialLayers)
	{
		if(this.MaterialLayers != null)
		{
			this.MaterialLayers.remove(MaterialLayers);
			synchronizeInversesRemoveMaterialLayers(MaterialLayers);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcMaterialLayer objects from the MaterialLayers list.
	* @param MaterialLayers collection containing elements to be removed from this list.
	**/
	public void removeAllMaterialLayers(java.util.Collection<IfcMaterialLayer> MaterialLayers)
	{
		if(this.MaterialLayers != null)
		{
			this.MaterialLayers.removeAll(MaterialLayers);
			synchronizeInversesRemoveMaterialLayers(MaterialLayers);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddMaterialLayers(IfcMaterialLayer MaterialLayers)
	{
		if(MaterialLayers != null)
		{
				MaterialLayers.ToMaterialLayerSet_Inverse = this;
		}
	}

	private void synchronizeInversesAddMaterialLayers(java.util.Collection<IfcMaterialLayer> MaterialLayers)
	{
		if(MaterialLayers != null)
		{
			for(IfcMaterialLayer MaterialLayers$ : MaterialLayers)
			{
				synchronizeInversesAddMaterialLayers(MaterialLayers$);
			}
		}
	}

	private void synchronizeInversesRemoveMaterialLayers(IfcMaterialLayer MaterialLayers)
	{
		if(MaterialLayers != null)
		{
				MaterialLayers.ToMaterialLayerSet_Inverse = null;
		}
	}

	private void synchronizeInversesRemoveMaterialLayers(java.util.Collection<IfcMaterialLayer> MaterialLayers)
	{
		if(MaterialLayers != null)
		{
			for(IfcMaterialLayer MaterialLayers$ : MaterialLayers)
			{
				synchronizeInversesRemoveMaterialLayers(MaterialLayers$);
			}
		}
	}

	/**
	* This method sets the LayerSetName attribute to the given value.
	*
	* @param LayerSetName DEMANDED value to set - may not be null
	**/
	public void setLayerSetName(IfcLabel LayerSetName)
	{
		this.LayerSetName = LayerSetName;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LayerSetName attribute.
	*
	* @return the value of LayerSetName
	/**/
	public IfcLabel getLayerSetName()
	{
		return this.LayerSetName;
	}

	/**
	* This method sets the Description attribute to the given value.
	*
	* @param Description DEMANDED value to set - may not be null
	**/
	public void setDescription(IfcText Description)
	{
		this.Description = Description;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Description attribute.
	*
	* @return the value of Description
	/**/
	public IfcText getDescription()
	{
		return this.Description;
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
		IfcMaterialLayerSet ifcMaterialLayerSet = new IfcMaterialLayerSet();
		if(this.MaterialLayers != null)
			ifcMaterialLayerSet.setMaterialLayers((LIST<IfcMaterialLayer>)this.MaterialLayers.clone());
		if(this.LayerSetName != null)
			ifcMaterialLayerSet.setLayerSetName((IfcLabel)this.LayerSetName.clone());
		if(this.Description != null)
			ifcMaterialLayerSet.setDescription((IfcText)this.Description.clone());
		return ifcMaterialLayerSet;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcMaterialLayerSet ifcMaterialLayerSet = new IfcMaterialLayerSet();
		if(this.MaterialLayers != null)
			ifcMaterialLayerSet.setMaterialLayers(this.MaterialLayers);
		if(this.LayerSetName != null)
			ifcMaterialLayerSet.setLayerSetName(this.LayerSetName);
		if(this.Description != null)
			ifcMaterialLayerSet.setDescription(this.Description);
		return ifcMaterialLayerSet;
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
