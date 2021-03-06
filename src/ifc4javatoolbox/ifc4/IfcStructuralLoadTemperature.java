/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcStructuralLoadTemperature<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcStructuralLoadTemperature extends IfcStructuralLoadStatic implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcThermodynamicTemperatureMeasure","IfcThermodynamicTemperatureMeasure","IfcThermodynamicTemperatureMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** DeltaTConstant is an OPTIONAL attribute**/
	protected IfcThermodynamicTemperatureMeasure DeltaTConstant;
	/** DeltaTY is an OPTIONAL attribute**/
	protected IfcThermodynamicTemperatureMeasure DeltaTY;
	/** DeltaTZ is an OPTIONAL attribute**/
	protected IfcThermodynamicTemperatureMeasure DeltaTZ;
	/**
	* The default constructor.
	**/
	public IfcStructuralLoadTemperature(){}

	/**
	* Constructs a new IfcStructuralLoadTemperature object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param DeltaTConstant OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param DeltaTY OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param DeltaTZ OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	**/
	public IfcStructuralLoadTemperature(IfcLabel Name, IfcThermodynamicTemperatureMeasure DeltaTConstant, IfcThermodynamicTemperatureMeasure DeltaTY, IfcThermodynamicTemperatureMeasure DeltaTZ)
	{
		this.Name = Name;
		this.DeltaTConstant = DeltaTConstant;
		this.DeltaTY = DeltaTY;
		this.DeltaTZ = DeltaTZ;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcStructuralLoadTemperature object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param DeltaTConstant OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param DeltaTY OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param DeltaTZ OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	**/
	public void setParameters(IfcLabel Name, IfcThermodynamicTemperatureMeasure DeltaTConstant, IfcThermodynamicTemperatureMeasure DeltaTY, IfcThermodynamicTemperatureMeasure DeltaTZ)
	{
		this.Name = Name;
		this.DeltaTConstant = DeltaTConstant;
		this.DeltaTY = DeltaTY;
		this.DeltaTZ = DeltaTZ;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.DeltaTConstant = (IfcThermodynamicTemperatureMeasure) parameters.get(1);
		this.DeltaTY = (IfcThermodynamicTemperatureMeasure) parameters.get(2);
		this.DeltaTZ = (IfcThermodynamicTemperatureMeasure) parameters.get(3);
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
		return IfcStructuralLoadTemperature.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSTRUCTURALLOADTEMPERATURE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DeltaTConstant")) stepString = stepString.concat("*,");
		else{
		if(this.DeltaTConstant != null)		stepString = stepString.concat(((RootInterface)this.DeltaTConstant).getStepParameter(IfcThermodynamicTemperatureMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DeltaTY")) stepString = stepString.concat("*,");
		else{
		if(this.DeltaTY != null)		stepString = stepString.concat(((RootInterface)this.DeltaTY).getStepParameter(IfcThermodynamicTemperatureMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DeltaTZ")) stepString = stepString.concat("*);");
		else{
		if(this.DeltaTZ != null)		stepString = stepString.concat(((RootInterface)this.DeltaTZ).getStepParameter(IfcThermodynamicTemperatureMeasure.class.isInterface())+");");
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
	* This method sets the DeltaTConstant attribute to the given value.
	*
	* @param DeltaTConstant DEMANDED value to set - may not be null
	**/
	public void setDeltaTConstant(IfcThermodynamicTemperatureMeasure DeltaTConstant)
	{
		this.DeltaTConstant = DeltaTConstant;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DeltaTConstant attribute.
	*
	* @return the value of DeltaTConstant
	/**/
	public IfcThermodynamicTemperatureMeasure getDeltaTConstant()
	{
		return this.DeltaTConstant;
	}

	/**
	* This method sets the DeltaTY attribute to the given value.
	*
	* @param DeltaTY DEMANDED value to set - may not be null
	**/
	public void setDeltaTY(IfcThermodynamicTemperatureMeasure DeltaTY)
	{
		this.DeltaTY = DeltaTY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DeltaTY attribute.
	*
	* @return the value of DeltaTY
	/**/
	public IfcThermodynamicTemperatureMeasure getDeltaTY()
	{
		return this.DeltaTY;
	}

	/**
	* This method sets the DeltaTZ attribute to the given value.
	*
	* @param DeltaTZ DEMANDED value to set - may not be null
	**/
	public void setDeltaTZ(IfcThermodynamicTemperatureMeasure DeltaTZ)
	{
		this.DeltaTZ = DeltaTZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DeltaTZ attribute.
	*
	* @return the value of DeltaTZ
	/**/
	public IfcThermodynamicTemperatureMeasure getDeltaTZ()
	{
		return this.DeltaTZ;
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
	public Object clone()
	{
		IfcStructuralLoadTemperature ifcStructuralLoadTemperature = new IfcStructuralLoadTemperature();
		if(this.Name != null)
			ifcStructuralLoadTemperature.setName((IfcLabel)this.Name.clone());
		if(this.DeltaTConstant != null)
			ifcStructuralLoadTemperature.setDeltaTConstant((IfcThermodynamicTemperatureMeasure)this.DeltaTConstant.clone());
		if(this.DeltaTY != null)
			ifcStructuralLoadTemperature.setDeltaTY((IfcThermodynamicTemperatureMeasure)this.DeltaTY.clone());
		if(this.DeltaTZ != null)
			ifcStructuralLoadTemperature.setDeltaTZ((IfcThermodynamicTemperatureMeasure)this.DeltaTZ.clone());
		return ifcStructuralLoadTemperature;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcStructuralLoadTemperature ifcStructuralLoadTemperature = new IfcStructuralLoadTemperature();
		if(this.Name != null)
			ifcStructuralLoadTemperature.setName(this.Name);
		if(this.DeltaTConstant != null)
			ifcStructuralLoadTemperature.setDeltaTConstant(this.DeltaTConstant);
		if(this.DeltaTY != null)
			ifcStructuralLoadTemperature.setDeltaTY(this.DeltaTY);
		if(this.DeltaTZ != null)
			ifcStructuralLoadTemperature.setDeltaTZ(this.DeltaTZ);
		return ifcStructuralLoadTemperature;
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
