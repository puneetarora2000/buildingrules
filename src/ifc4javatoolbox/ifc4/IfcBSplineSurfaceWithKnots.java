/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcBSplineSurfaceWithKnots<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcBSplineSurfaceWithKnots extends IfcBSplineSurface implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"INTEGER","INTEGER","LIST<LIST<IfcCartesianPoint>>","IfcBSplineSurfaceForm","LOGICAL","LOGICAL","LOGICAL","LIST<INTEGER>","LIST<INTEGER>","LIST<IfcParameterValue>","LIST<IfcParameterValue>","IfcKnotType"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** UMultiplicities is an DEMANDED attribute - may not be null**/
	protected LIST<INTEGER> UMultiplicities;
	/** VMultiplicities is an DEMANDED attribute - may not be null**/
	protected LIST<INTEGER> VMultiplicities;
	/** UKnots is an DEMANDED attribute - may not be null**/
	protected LIST<IfcParameterValue> UKnots;
	/** VKnots is an DEMANDED attribute - may not be null**/
	protected LIST<IfcParameterValue> VKnots;
	/** KnotSpec is an DEMANDED attribute - may not be null**/
	protected IfcKnotType KnotSpec;
	/**
	* The default constructor.
	**/
	public IfcBSplineSurfaceWithKnots(){}

	/**
	* Constructs a new IfcBSplineSurfaceWithKnots object using the given parameters.
	*
	* @param UDegree DEMANDED parameter of type INTEGER - may not be null.
	* @param VDegree DEMANDED parameter of type INTEGER - may not be null.
	* @param ControlPointsList DEMANDED parameter of type LIST<LIST<IfcCartesianPoint>> - may not be null.
	* @param SurfaceForm DEMANDED parameter of type IfcBSplineSurfaceForm - may not be null.
	* @param UClosed DEMANDED parameter of type LOGICAL - may not be null.
	* @param VClosed DEMANDED parameter of type LOGICAL - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	* @param UMultiplicities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param VMultiplicities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param UKnots DEMANDED parameter of type LIST<IfcParameterValue> - may not be null.
	* @param VKnots DEMANDED parameter of type LIST<IfcParameterValue> - may not be null.
	* @param KnotSpec DEMANDED parameter of type IfcKnotType - may not be null.
	**/
	public IfcBSplineSurfaceWithKnots(INTEGER UDegree, INTEGER VDegree, LIST<LIST<IfcCartesianPoint>> ControlPointsList, IfcBSplineSurfaceForm SurfaceForm, LOGICAL UClosed, LOGICAL VClosed, LOGICAL SelfIntersect, LIST<INTEGER> UMultiplicities, LIST<INTEGER> VMultiplicities, LIST<IfcParameterValue> UKnots, LIST<IfcParameterValue> VKnots, IfcKnotType KnotSpec)
	{
		this.UDegree = UDegree;
		this.VDegree = VDegree;
		this.ControlPointsList = ControlPointsList;
		this.SurfaceForm = SurfaceForm;
		this.UClosed = UClosed;
		this.VClosed = VClosed;
		this.SelfIntersect = SelfIntersect;
		this.UMultiplicities = UMultiplicities;
		this.VMultiplicities = VMultiplicities;
		this.UKnots = UKnots;
		this.VKnots = VKnots;
		this.KnotSpec = KnotSpec;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcBSplineSurfaceWithKnots object using the given parameters.
	*
	* @param UDegree DEMANDED parameter of type INTEGER - may not be null.
	* @param VDegree DEMANDED parameter of type INTEGER - may not be null.
	* @param ControlPointsList DEMANDED parameter of type LIST<LIST<IfcCartesianPoint>> - may not be null.
	* @param SurfaceForm DEMANDED parameter of type IfcBSplineSurfaceForm - may not be null.
	* @param UClosed DEMANDED parameter of type LOGICAL - may not be null.
	* @param VClosed DEMANDED parameter of type LOGICAL - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	* @param UMultiplicities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param VMultiplicities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param UKnots DEMANDED parameter of type LIST<IfcParameterValue> - may not be null.
	* @param VKnots DEMANDED parameter of type LIST<IfcParameterValue> - may not be null.
	* @param KnotSpec DEMANDED parameter of type IfcKnotType - may not be null.
	**/
	public void setParameters(INTEGER UDegree, INTEGER VDegree, LIST<LIST<IfcCartesianPoint>> ControlPointsList, IfcBSplineSurfaceForm SurfaceForm, LOGICAL UClosed, LOGICAL VClosed, LOGICAL SelfIntersect, LIST<INTEGER> UMultiplicities, LIST<INTEGER> VMultiplicities, LIST<IfcParameterValue> UKnots, LIST<IfcParameterValue> VKnots, IfcKnotType KnotSpec)
	{
		this.UDegree = UDegree;
		this.VDegree = VDegree;
		this.ControlPointsList = ControlPointsList;
		this.SurfaceForm = SurfaceForm;
		this.UClosed = UClosed;
		this.VClosed = VClosed;
		this.SelfIntersect = SelfIntersect;
		this.UMultiplicities = UMultiplicities;
		this.VMultiplicities = VMultiplicities;
		this.UKnots = UKnots;
		this.VKnots = VKnots;
		this.KnotSpec = KnotSpec;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.UDegree = (INTEGER) parameters.get(0);
		this.VDegree = (INTEGER) parameters.get(1);
		this.ControlPointsList = (LIST<LIST<IfcCartesianPoint>>) parameters.get(2);
		this.SurfaceForm = (IfcBSplineSurfaceForm) parameters.get(3);
		this.UClosed = (LOGICAL) parameters.get(4);
		this.VClosed = (LOGICAL) parameters.get(5);
		this.SelfIntersect = (LOGICAL) parameters.get(6);
		this.UMultiplicities = (LIST<INTEGER>) parameters.get(7);
		this.VMultiplicities = (LIST<INTEGER>) parameters.get(8);
		this.UKnots = (LIST<IfcParameterValue>) parameters.get(9);
		this.VKnots = (LIST<IfcParameterValue>) parameters.get(10);
		this.KnotSpec = (IfcKnotType) parameters.get(11);
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
		return IfcBSplineSurfaceWithKnots.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCBSPLINESURFACEWITHKNOTS(");
		if(getRedefinedDerivedAttributeTypes().contains("UDegree")) stepString = stepString.concat("*,");
		else{
		if(this.UDegree != null)		stepString = stepString.concat(((RootInterface)this.UDegree).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VDegree")) stepString = stepString.concat("*,");
		else{
		if(this.VDegree != null)		stepString = stepString.concat(((RootInterface)this.VDegree).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ControlPointsList")) stepString = stepString.concat("*,");
		else{
		if(this.ControlPointsList != null)		stepString = stepString.concat(((RootInterface)this.ControlPointsList).getStepParameter(LIST.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SurfaceForm")) stepString = stepString.concat("*,");
		else{
		if(this.SurfaceForm != null)		stepString = stepString.concat(((RootInterface)this.SurfaceForm).getStepParameter(IfcBSplineSurfaceForm.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UClosed")) stepString = stepString.concat("*,");
		else{
		if(this.UClosed != null)		stepString = stepString.concat(((RootInterface)this.UClosed).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VClosed")) stepString = stepString.concat("*,");
		else{
		if(this.VClosed != null)		stepString = stepString.concat(((RootInterface)this.VClosed).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SelfIntersect")) stepString = stepString.concat("*,");
		else{
		if(this.SelfIntersect != null)		stepString = stepString.concat(((RootInterface)this.SelfIntersect).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UMultiplicities")) stepString = stepString.concat("*,");
		else{
		if(this.UMultiplicities != null)		stepString = stepString.concat(((RootInterface)this.UMultiplicities).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VMultiplicities")) stepString = stepString.concat("*,");
		else{
		if(this.VMultiplicities != null)		stepString = stepString.concat(((RootInterface)this.VMultiplicities).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UKnots")) stepString = stepString.concat("*,");
		else{
		if(this.UKnots != null)		stepString = stepString.concat(((RootInterface)this.UKnots).getStepParameter(IfcParameterValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VKnots")) stepString = stepString.concat("*,");
		else{
		if(this.VKnots != null)		stepString = stepString.concat(((RootInterface)this.VKnots).getStepParameter(IfcParameterValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("KnotSpec")) stepString = stepString.concat("*);");
		else{
		if(this.KnotSpec != null)		stepString = stepString.concat(((RootInterface)this.KnotSpec).getStepParameter(IfcKnotType.class.isInterface())+");");
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
	* This method sets the UMultiplicities attribute to the given value.
	*
	* @param UMultiplicities OPTIONAL value to set
	**/
	public void setUMultiplicities(LIST<INTEGER> UMultiplicities)
	{
		this.UMultiplicities = UMultiplicities;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the UMultiplicities attribute.
	*
	* @return a copy of the UMultiplicities list
	**/
	public LIST<INTEGER> getUMultiplicities()
	{
		if(this.UMultiplicities != null)
			return new LIST<INTEGER>(this.UMultiplicities);
		return null;
	}

	/**
	* This method adds an INTEGER object to the UMultiplicities list.
	* @param UMultiplicities element to be appended to this list.
	**/
	public void addUMultiplicities(INTEGER UMultiplicities)
	{
		if(this.UMultiplicities == null)
			this.UMultiplicities = new LIST<INTEGER>();
		this.UMultiplicities.add(UMultiplicities);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of INTEGER objects to the UMultiplicities list.
	* @param UMultiplicities collection containing elements to be added to this list.
	**/
	public void addAllUMultiplicities(java.util.Collection<INTEGER> UMultiplicities)
	{
		if(this.UMultiplicities == null)
			this.UMultiplicities = new LIST<INTEGER>();
		this.UMultiplicities.addAll(UMultiplicities);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the UMultiplicities list.
	**/
	public void clearUMultiplicities()
	{
		if(this.UMultiplicities != null)
		{
			this.UMultiplicities.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an INTEGER object from the UMultiplicities list.
	* @param UMultiplicities element to be removed from this list.
	**/
	public void removeUMultiplicities(INTEGER UMultiplicities)
	{
		if(this.UMultiplicities != null)
		{
			this.UMultiplicities.remove(UMultiplicities);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of INTEGER objects from the UMultiplicities list.
	* @param UMultiplicities collection containing elements to be removed from this list.
	**/
	public void removeAllUMultiplicities(java.util.Collection<INTEGER> UMultiplicities)
	{
		if(this.UMultiplicities != null)
		{
			this.UMultiplicities.removeAll(UMultiplicities);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the VMultiplicities attribute to the given value.
	*
	* @param VMultiplicities OPTIONAL value to set
	**/
	public void setVMultiplicities(LIST<INTEGER> VMultiplicities)
	{
		this.VMultiplicities = VMultiplicities;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the VMultiplicities attribute.
	*
	* @return a copy of the VMultiplicities list
	**/
	public LIST<INTEGER> getVMultiplicities()
	{
		if(this.VMultiplicities != null)
			return new LIST<INTEGER>(this.VMultiplicities);
		return null;
	}

	/**
	* This method adds an INTEGER object to the VMultiplicities list.
	* @param VMultiplicities element to be appended to this list.
	**/
	public void addVMultiplicities(INTEGER VMultiplicities)
	{
		if(this.VMultiplicities == null)
			this.VMultiplicities = new LIST<INTEGER>();
		this.VMultiplicities.add(VMultiplicities);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of INTEGER objects to the VMultiplicities list.
	* @param VMultiplicities collection containing elements to be added to this list.
	**/
	public void addAllVMultiplicities(java.util.Collection<INTEGER> VMultiplicities)
	{
		if(this.VMultiplicities == null)
			this.VMultiplicities = new LIST<INTEGER>();
		this.VMultiplicities.addAll(VMultiplicities);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the VMultiplicities list.
	**/
	public void clearVMultiplicities()
	{
		if(this.VMultiplicities != null)
		{
			this.VMultiplicities.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an INTEGER object from the VMultiplicities list.
	* @param VMultiplicities element to be removed from this list.
	**/
	public void removeVMultiplicities(INTEGER VMultiplicities)
	{
		if(this.VMultiplicities != null)
		{
			this.VMultiplicities.remove(VMultiplicities);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of INTEGER objects from the VMultiplicities list.
	* @param VMultiplicities collection containing elements to be removed from this list.
	**/
	public void removeAllVMultiplicities(java.util.Collection<INTEGER> VMultiplicities)
	{
		if(this.VMultiplicities != null)
		{
			this.VMultiplicities.removeAll(VMultiplicities);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the UKnots attribute to the given value.
	*
	* @param UKnots OPTIONAL value to set
	**/
	public void setUKnots(LIST<IfcParameterValue> UKnots)
	{
		this.UKnots = UKnots;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the UKnots attribute.
	*
	* @return a copy of the UKnots list
	**/
	public LIST<IfcParameterValue> getUKnots()
	{
		if(this.UKnots != null)
			return new LIST<IfcParameterValue>(this.UKnots);
		return null;
	}

	/**
	* This method adds an IfcParameterValue object to the UKnots list.
	* @param UKnots element to be appended to this list.
	**/
	public void addUKnots(IfcParameterValue UKnots)
	{
		if(this.UKnots == null)
			this.UKnots = new LIST<IfcParameterValue>();
		this.UKnots.add(UKnots);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcParameterValue objects to the UKnots list.
	* @param UKnots collection containing elements to be added to this list.
	**/
	public void addAllUKnots(java.util.Collection<IfcParameterValue> UKnots)
	{
		if(this.UKnots == null)
			this.UKnots = new LIST<IfcParameterValue>();
		this.UKnots.addAll(UKnots);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the UKnots list.
	**/
	public void clearUKnots()
	{
		if(this.UKnots != null)
		{
			this.UKnots.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcParameterValue object from the UKnots list.
	* @param UKnots element to be removed from this list.
	**/
	public void removeUKnots(IfcParameterValue UKnots)
	{
		if(this.UKnots != null)
		{
			this.UKnots.remove(UKnots);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcParameterValue objects from the UKnots list.
	* @param UKnots collection containing elements to be removed from this list.
	**/
	public void removeAllUKnots(java.util.Collection<IfcParameterValue> UKnots)
	{
		if(this.UKnots != null)
		{
			this.UKnots.removeAll(UKnots);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the VKnots attribute to the given value.
	*
	* @param VKnots OPTIONAL value to set
	**/
	public void setVKnots(LIST<IfcParameterValue> VKnots)
	{
		this.VKnots = VKnots;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the VKnots attribute.
	*
	* @return a copy of the VKnots list
	**/
	public LIST<IfcParameterValue> getVKnots()
	{
		if(this.VKnots != null)
			return new LIST<IfcParameterValue>(this.VKnots);
		return null;
	}

	/**
	* This method adds an IfcParameterValue object to the VKnots list.
	* @param VKnots element to be appended to this list.
	**/
	public void addVKnots(IfcParameterValue VKnots)
	{
		if(this.VKnots == null)
			this.VKnots = new LIST<IfcParameterValue>();
		this.VKnots.add(VKnots);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcParameterValue objects to the VKnots list.
	* @param VKnots collection containing elements to be added to this list.
	**/
	public void addAllVKnots(java.util.Collection<IfcParameterValue> VKnots)
	{
		if(this.VKnots == null)
			this.VKnots = new LIST<IfcParameterValue>();
		this.VKnots.addAll(VKnots);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the VKnots list.
	**/
	public void clearVKnots()
	{
		if(this.VKnots != null)
		{
			this.VKnots.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcParameterValue object from the VKnots list.
	* @param VKnots element to be removed from this list.
	**/
	public void removeVKnots(IfcParameterValue VKnots)
	{
		if(this.VKnots != null)
		{
			this.VKnots.remove(VKnots);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcParameterValue objects from the VKnots list.
	* @param VKnots collection containing elements to be removed from this list.
	**/
	public void removeAllVKnots(java.util.Collection<IfcParameterValue> VKnots)
	{
		if(this.VKnots != null)
		{
			this.VKnots.removeAll(VKnots);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the KnotSpec attribute to the given value.
	*
	* @param KnotSpec OPTIONAL value to set
	**/
	public void setKnotSpec(IfcKnotType KnotSpec)
	{
		this.KnotSpec = KnotSpec;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the KnotSpec attribute.
	*
	* @return the value of KnotSpec
	/**/
	public IfcKnotType getKnotSpec()
	{
		return this.KnotSpec;
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
		IfcBSplineSurfaceWithKnots ifcBSplineSurfaceWithKnots = new IfcBSplineSurfaceWithKnots();
		if(this.UDegree != null)
			ifcBSplineSurfaceWithKnots.setUDegree((INTEGER)this.UDegree.clone());
		if(this.VDegree != null)
			ifcBSplineSurfaceWithKnots.setVDegree((INTEGER)this.VDegree.clone());
		if(this.ControlPointsList != null)
			ifcBSplineSurfaceWithKnots.setControlPointsList((LIST<LIST<IfcCartesianPoint>>)this.ControlPointsList.clone());
		if(this.SurfaceForm != null)
			ifcBSplineSurfaceWithKnots.setSurfaceForm((IfcBSplineSurfaceForm)this.SurfaceForm.clone());
		if(this.UClosed != null)
			ifcBSplineSurfaceWithKnots.setUClosed((LOGICAL)this.UClosed.clone());
		if(this.VClosed != null)
			ifcBSplineSurfaceWithKnots.setVClosed((LOGICAL)this.VClosed.clone());
		if(this.SelfIntersect != null)
			ifcBSplineSurfaceWithKnots.setSelfIntersect((LOGICAL)this.SelfIntersect.clone());
		if(this.UMultiplicities != null)
			ifcBSplineSurfaceWithKnots.setUMultiplicities((LIST<INTEGER>)this.UMultiplicities.clone());
		if(this.VMultiplicities != null)
			ifcBSplineSurfaceWithKnots.setVMultiplicities((LIST<INTEGER>)this.VMultiplicities.clone());
		if(this.UKnots != null)
			ifcBSplineSurfaceWithKnots.setUKnots((LIST<IfcParameterValue>)this.UKnots.clone());
		if(this.VKnots != null)
			ifcBSplineSurfaceWithKnots.setVKnots((LIST<IfcParameterValue>)this.VKnots.clone());
		if(this.KnotSpec != null)
			ifcBSplineSurfaceWithKnots.setKnotSpec((IfcKnotType)this.KnotSpec.clone());
		return ifcBSplineSurfaceWithKnots;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcBSplineSurfaceWithKnots ifcBSplineSurfaceWithKnots = new IfcBSplineSurfaceWithKnots();
		if(this.UDegree != null)
			ifcBSplineSurfaceWithKnots.setUDegree(this.UDegree);
		if(this.VDegree != null)
			ifcBSplineSurfaceWithKnots.setVDegree(this.VDegree);
		if(this.ControlPointsList != null)
			ifcBSplineSurfaceWithKnots.setControlPointsList(this.ControlPointsList);
		if(this.SurfaceForm != null)
			ifcBSplineSurfaceWithKnots.setSurfaceForm(this.SurfaceForm);
		if(this.UClosed != null)
			ifcBSplineSurfaceWithKnots.setUClosed(this.UClosed);
		if(this.VClosed != null)
			ifcBSplineSurfaceWithKnots.setVClosed(this.VClosed);
		if(this.SelfIntersect != null)
			ifcBSplineSurfaceWithKnots.setSelfIntersect(this.SelfIntersect);
		if(this.UMultiplicities != null)
			ifcBSplineSurfaceWithKnots.setUMultiplicities(this.UMultiplicities);
		if(this.VMultiplicities != null)
			ifcBSplineSurfaceWithKnots.setVMultiplicities(this.VMultiplicities);
		if(this.UKnots != null)
			ifcBSplineSurfaceWithKnots.setUKnots(this.UKnots);
		if(this.VKnots != null)
			ifcBSplineSurfaceWithKnots.setVKnots(this.VKnots);
		if(this.KnotSpec != null)
			ifcBSplineSurfaceWithKnots.setKnotSpec(this.KnotSpec);
		return ifcBSplineSurfaceWithKnots;
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
