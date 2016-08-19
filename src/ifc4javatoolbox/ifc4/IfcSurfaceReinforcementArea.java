/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcSurfaceReinforcementArea<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSurfaceReinforcementArea extends IfcStructuralLoadOrResult implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","LIST<IfcLengthMeasure>","LIST<IfcLengthMeasure>","IfcRatioMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SurfaceReinforcement1 is an OPTIONAL attribute**/
	protected LIST<IfcLengthMeasure> SurfaceReinforcement1;
	/** SurfaceReinforcement2 is an OPTIONAL attribute**/
	protected LIST<IfcLengthMeasure> SurfaceReinforcement2;
	/** ShearReinforcement is an OPTIONAL attribute**/
	protected IfcRatioMeasure ShearReinforcement;
	/**
	* The default constructor.
	**/
	public IfcSurfaceReinforcementArea(){}

	/**
	* Constructs a new IfcSurfaceReinforcementArea object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param SurfaceReinforcement1 OPTIONAL parameter of type LIST<IfcLengthMeasure>
	* @param SurfaceReinforcement2 OPTIONAL parameter of type LIST<IfcLengthMeasure>
	* @param ShearReinforcement OPTIONAL parameter of type IfcRatioMeasure
	**/
	public IfcSurfaceReinforcementArea(IfcLabel Name, LIST<IfcLengthMeasure> SurfaceReinforcement1, LIST<IfcLengthMeasure> SurfaceReinforcement2, IfcRatioMeasure ShearReinforcement)
	{
		this.Name = Name;
		this.SurfaceReinforcement1 = SurfaceReinforcement1;
		this.SurfaceReinforcement2 = SurfaceReinforcement2;
		this.ShearReinforcement = ShearReinforcement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSurfaceReinforcementArea object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param SurfaceReinforcement1 OPTIONAL parameter of type LIST<IfcLengthMeasure>
	* @param SurfaceReinforcement2 OPTIONAL parameter of type LIST<IfcLengthMeasure>
	* @param ShearReinforcement OPTIONAL parameter of type IfcRatioMeasure
	**/
	public void setParameters(IfcLabel Name, LIST<IfcLengthMeasure> SurfaceReinforcement1, LIST<IfcLengthMeasure> SurfaceReinforcement2, IfcRatioMeasure ShearReinforcement)
	{
		this.Name = Name;
		this.SurfaceReinforcement1 = SurfaceReinforcement1;
		this.SurfaceReinforcement2 = SurfaceReinforcement2;
		this.ShearReinforcement = ShearReinforcement;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.SurfaceReinforcement1 = (LIST<IfcLengthMeasure>) parameters.get(1);
		this.SurfaceReinforcement2 = (LIST<IfcLengthMeasure>) parameters.get(2);
		this.ShearReinforcement = (IfcRatioMeasure) parameters.get(3);
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
		return IfcSurfaceReinforcementArea.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSURFACEREINFORCEMENTAREA(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SurfaceReinforcement1")) stepString = stepString.concat("*,");
		else{
		if(this.SurfaceReinforcement1 != null)		stepString = stepString.concat(((RootInterface)this.SurfaceReinforcement1).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SurfaceReinforcement2")) stepString = stepString.concat("*,");
		else{
		if(this.SurfaceReinforcement2 != null)		stepString = stepString.concat(((RootInterface)this.SurfaceReinforcement2).getStepParameter(IfcLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ShearReinforcement")) stepString = stepString.concat("*);");
		else{
		if(this.ShearReinforcement != null)		stepString = stepString.concat(((RootInterface)this.ShearReinforcement).getStepParameter(IfcRatioMeasure.class.isInterface())+");");
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
	* This method sets the SurfaceReinforcement1 attribute to the given value.
	*
	* @param SurfaceReinforcement1 DEMANDED value to set - may not be null
	**/
	public void setSurfaceReinforcement1(LIST<IfcLengthMeasure> SurfaceReinforcement1)
	{
		this.SurfaceReinforcement1 = SurfaceReinforcement1;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the SurfaceReinforcement1 attribute.
	*
	* @return a copy of the SurfaceReinforcement1 list
	**/
	public LIST<IfcLengthMeasure> getSurfaceReinforcement1()
	{
		if(this.SurfaceReinforcement1 != null)
			return new LIST<IfcLengthMeasure>(this.SurfaceReinforcement1);
		return null;
	}

	/**
	* This method adds an IfcLengthMeasure object to the SurfaceReinforcement1 list.
	* @param SurfaceReinforcement1 element to be appended to this list.
	**/
	public void addSurfaceReinforcement1(IfcLengthMeasure SurfaceReinforcement1)
	{
		if(this.SurfaceReinforcement1 == null)
			this.SurfaceReinforcement1 = new LIST<IfcLengthMeasure>();
		this.SurfaceReinforcement1.add(SurfaceReinforcement1);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcLengthMeasure objects to the SurfaceReinforcement1 list.
	* @param SurfaceReinforcement1 collection containing elements to be added to this list.
	**/
	public void addAllSurfaceReinforcement1(java.util.Collection<IfcLengthMeasure> SurfaceReinforcement1)
	{
		if(this.SurfaceReinforcement1 == null)
			this.SurfaceReinforcement1 = new LIST<IfcLengthMeasure>();
		this.SurfaceReinforcement1.addAll(SurfaceReinforcement1);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the SurfaceReinforcement1 list.
	**/
	public void clearSurfaceReinforcement1()
	{
		if(this.SurfaceReinforcement1 != null)
		{
			this.SurfaceReinforcement1.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcLengthMeasure object from the SurfaceReinforcement1 list.
	* @param SurfaceReinforcement1 element to be removed from this list.
	**/
	public void removeSurfaceReinforcement1(IfcLengthMeasure SurfaceReinforcement1)
	{
		if(this.SurfaceReinforcement1 != null)
		{
			this.SurfaceReinforcement1.remove(SurfaceReinforcement1);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcLengthMeasure objects from the SurfaceReinforcement1 list.
	* @param SurfaceReinforcement1 collection containing elements to be removed from this list.
	**/
	public void removeAllSurfaceReinforcement1(java.util.Collection<IfcLengthMeasure> SurfaceReinforcement1)
	{
		if(this.SurfaceReinforcement1 != null)
		{
			this.SurfaceReinforcement1.removeAll(SurfaceReinforcement1);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the SurfaceReinforcement2 attribute to the given value.
	*
	* @param SurfaceReinforcement2 DEMANDED value to set - may not be null
	**/
	public void setSurfaceReinforcement2(LIST<IfcLengthMeasure> SurfaceReinforcement2)
	{
		this.SurfaceReinforcement2 = SurfaceReinforcement2;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the SurfaceReinforcement2 attribute.
	*
	* @return a copy of the SurfaceReinforcement2 list
	**/
	public LIST<IfcLengthMeasure> getSurfaceReinforcement2()
	{
		if(this.SurfaceReinforcement2 != null)
			return new LIST<IfcLengthMeasure>(this.SurfaceReinforcement2);
		return null;
	}

	/**
	* This method adds an IfcLengthMeasure object to the SurfaceReinforcement2 list.
	* @param SurfaceReinforcement2 element to be appended to this list.
	**/
	public void addSurfaceReinforcement2(IfcLengthMeasure SurfaceReinforcement2)
	{
		if(this.SurfaceReinforcement2 == null)
			this.SurfaceReinforcement2 = new LIST<IfcLengthMeasure>();
		this.SurfaceReinforcement2.add(SurfaceReinforcement2);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcLengthMeasure objects to the SurfaceReinforcement2 list.
	* @param SurfaceReinforcement2 collection containing elements to be added to this list.
	**/
	public void addAllSurfaceReinforcement2(java.util.Collection<IfcLengthMeasure> SurfaceReinforcement2)
	{
		if(this.SurfaceReinforcement2 == null)
			this.SurfaceReinforcement2 = new LIST<IfcLengthMeasure>();
		this.SurfaceReinforcement2.addAll(SurfaceReinforcement2);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the SurfaceReinforcement2 list.
	**/
	public void clearSurfaceReinforcement2()
	{
		if(this.SurfaceReinforcement2 != null)
		{
			this.SurfaceReinforcement2.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcLengthMeasure object from the SurfaceReinforcement2 list.
	* @param SurfaceReinforcement2 element to be removed from this list.
	**/
	public void removeSurfaceReinforcement2(IfcLengthMeasure SurfaceReinforcement2)
	{
		if(this.SurfaceReinforcement2 != null)
		{
			this.SurfaceReinforcement2.remove(SurfaceReinforcement2);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcLengthMeasure objects from the SurfaceReinforcement2 list.
	* @param SurfaceReinforcement2 collection containing elements to be removed from this list.
	**/
	public void removeAllSurfaceReinforcement2(java.util.Collection<IfcLengthMeasure> SurfaceReinforcement2)
	{
		if(this.SurfaceReinforcement2 != null)
		{
			this.SurfaceReinforcement2.removeAll(SurfaceReinforcement2);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the ShearReinforcement attribute to the given value.
	*
	* @param ShearReinforcement DEMANDED value to set - may not be null
	**/
	public void setShearReinforcement(IfcRatioMeasure ShearReinforcement)
	{
		this.ShearReinforcement = ShearReinforcement;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ShearReinforcement attribute.
	*
	* @return the value of ShearReinforcement
	/**/
	public IfcRatioMeasure getShearReinforcement()
	{
		return this.ShearReinforcement;
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
		IfcSurfaceReinforcementArea ifcSurfaceReinforcementArea = new IfcSurfaceReinforcementArea();
		if(this.Name != null)
			ifcSurfaceReinforcementArea.setName((IfcLabel)this.Name.clone());
		if(this.SurfaceReinforcement1 != null)
			ifcSurfaceReinforcementArea.setSurfaceReinforcement1((LIST<IfcLengthMeasure>)this.SurfaceReinforcement1.clone());
		if(this.SurfaceReinforcement2 != null)
			ifcSurfaceReinforcementArea.setSurfaceReinforcement2((LIST<IfcLengthMeasure>)this.SurfaceReinforcement2.clone());
		if(this.ShearReinforcement != null)
			ifcSurfaceReinforcementArea.setShearReinforcement((IfcRatioMeasure)this.ShearReinforcement.clone());
		return ifcSurfaceReinforcementArea;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSurfaceReinforcementArea ifcSurfaceReinforcementArea = new IfcSurfaceReinforcementArea();
		if(this.Name != null)
			ifcSurfaceReinforcementArea.setName(this.Name);
		if(this.SurfaceReinforcement1 != null)
			ifcSurfaceReinforcementArea.setSurfaceReinforcement1(this.SurfaceReinforcement1);
		if(this.SurfaceReinforcement2 != null)
			ifcSurfaceReinforcementArea.setSurfaceReinforcement2(this.SurfaceReinforcement2);
		if(this.ShearReinforcement != null)
			ifcSurfaceReinforcementArea.setShearReinforcement(this.ShearReinforcement);
		return ifcSurfaceReinforcementArea;
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
