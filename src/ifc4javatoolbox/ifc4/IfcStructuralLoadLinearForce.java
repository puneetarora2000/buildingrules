/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcStructuralLoadLinearForce<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcLinearForceMeasure","IfcLinearForceMeasure","IfcLinearForceMeasure","IfcLinearMomentMeasure","IfcLinearMomentMeasure","IfcLinearMomentMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** LinearForceX is an OPTIONAL attribute**/
	protected IfcLinearForceMeasure LinearForceX;
	/** LinearForceY is an OPTIONAL attribute**/
	protected IfcLinearForceMeasure LinearForceY;
	/** LinearForceZ is an OPTIONAL attribute**/
	protected IfcLinearForceMeasure LinearForceZ;
	/** LinearMomentX is an OPTIONAL attribute**/
	protected IfcLinearMomentMeasure LinearMomentX;
	/** LinearMomentY is an OPTIONAL attribute**/
	protected IfcLinearMomentMeasure LinearMomentY;
	/** LinearMomentZ is an OPTIONAL attribute**/
	protected IfcLinearMomentMeasure LinearMomentZ;
	/**
	* The default constructor.
	**/
	public IfcStructuralLoadLinearForce(){}

	/**
	* Constructs a new IfcStructuralLoadLinearForce object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param LinearForceX OPTIONAL parameter of type IfcLinearForceMeasure
	* @param LinearForceY OPTIONAL parameter of type IfcLinearForceMeasure
	* @param LinearForceZ OPTIONAL parameter of type IfcLinearForceMeasure
	* @param LinearMomentX OPTIONAL parameter of type IfcLinearMomentMeasure
	* @param LinearMomentY OPTIONAL parameter of type IfcLinearMomentMeasure
	* @param LinearMomentZ OPTIONAL parameter of type IfcLinearMomentMeasure
	**/
	public IfcStructuralLoadLinearForce(IfcLabel Name, IfcLinearForceMeasure LinearForceX, IfcLinearForceMeasure LinearForceY, IfcLinearForceMeasure LinearForceZ, IfcLinearMomentMeasure LinearMomentX, IfcLinearMomentMeasure LinearMomentY, IfcLinearMomentMeasure LinearMomentZ)
	{
		this.Name = Name;
		this.LinearForceX = LinearForceX;
		this.LinearForceY = LinearForceY;
		this.LinearForceZ = LinearForceZ;
		this.LinearMomentX = LinearMomentX;
		this.LinearMomentY = LinearMomentY;
		this.LinearMomentZ = LinearMomentZ;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcStructuralLoadLinearForce object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param LinearForceX OPTIONAL parameter of type IfcLinearForceMeasure
	* @param LinearForceY OPTIONAL parameter of type IfcLinearForceMeasure
	* @param LinearForceZ OPTIONAL parameter of type IfcLinearForceMeasure
	* @param LinearMomentX OPTIONAL parameter of type IfcLinearMomentMeasure
	* @param LinearMomentY OPTIONAL parameter of type IfcLinearMomentMeasure
	* @param LinearMomentZ OPTIONAL parameter of type IfcLinearMomentMeasure
	**/
	public void setParameters(IfcLabel Name, IfcLinearForceMeasure LinearForceX, IfcLinearForceMeasure LinearForceY, IfcLinearForceMeasure LinearForceZ, IfcLinearMomentMeasure LinearMomentX, IfcLinearMomentMeasure LinearMomentY, IfcLinearMomentMeasure LinearMomentZ)
	{
		this.Name = Name;
		this.LinearForceX = LinearForceX;
		this.LinearForceY = LinearForceY;
		this.LinearForceZ = LinearForceZ;
		this.LinearMomentX = LinearMomentX;
		this.LinearMomentY = LinearMomentY;
		this.LinearMomentZ = LinearMomentZ;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.LinearForceX = (IfcLinearForceMeasure) parameters.get(1);
		this.LinearForceY = (IfcLinearForceMeasure) parameters.get(2);
		this.LinearForceZ = (IfcLinearForceMeasure) parameters.get(3);
		this.LinearMomentX = (IfcLinearMomentMeasure) parameters.get(4);
		this.LinearMomentY = (IfcLinearMomentMeasure) parameters.get(5);
		this.LinearMomentZ = (IfcLinearMomentMeasure) parameters.get(6);
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
		return IfcStructuralLoadLinearForce.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSTRUCTURALLOADLINEARFORCE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearForceX")) stepString = stepString.concat("*,");
		else{
		if(this.LinearForceX != null)		stepString = stepString.concat(((RootInterface)this.LinearForceX).getStepParameter(IfcLinearForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearForceY")) stepString = stepString.concat("*,");
		else{
		if(this.LinearForceY != null)		stepString = stepString.concat(((RootInterface)this.LinearForceY).getStepParameter(IfcLinearForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearForceZ")) stepString = stepString.concat("*,");
		else{
		if(this.LinearForceZ != null)		stepString = stepString.concat(((RootInterface)this.LinearForceZ).getStepParameter(IfcLinearForceMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearMomentX")) stepString = stepString.concat("*,");
		else{
		if(this.LinearMomentX != null)		stepString = stepString.concat(((RootInterface)this.LinearMomentX).getStepParameter(IfcLinearMomentMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearMomentY")) stepString = stepString.concat("*,");
		else{
		if(this.LinearMomentY != null)		stepString = stepString.concat(((RootInterface)this.LinearMomentY).getStepParameter(IfcLinearMomentMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearMomentZ")) stepString = stepString.concat("*);");
		else{
		if(this.LinearMomentZ != null)		stepString = stepString.concat(((RootInterface)this.LinearMomentZ).getStepParameter(IfcLinearMomentMeasure.class.isInterface())+");");
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
	* This method sets the LinearForceX attribute to the given value.
	*
	* @param LinearForceX DEMANDED value to set - may not be null
	**/
	public void setLinearForceX(IfcLinearForceMeasure LinearForceX)
	{
		this.LinearForceX = LinearForceX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearForceX attribute.
	*
	* @return the value of LinearForceX
	/**/
	public IfcLinearForceMeasure getLinearForceX()
	{
		return this.LinearForceX;
	}

	/**
	* This method sets the LinearForceY attribute to the given value.
	*
	* @param LinearForceY DEMANDED value to set - may not be null
	**/
	public void setLinearForceY(IfcLinearForceMeasure LinearForceY)
	{
		this.LinearForceY = LinearForceY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearForceY attribute.
	*
	* @return the value of LinearForceY
	/**/
	public IfcLinearForceMeasure getLinearForceY()
	{
		return this.LinearForceY;
	}

	/**
	* This method sets the LinearForceZ attribute to the given value.
	*
	* @param LinearForceZ DEMANDED value to set - may not be null
	**/
	public void setLinearForceZ(IfcLinearForceMeasure LinearForceZ)
	{
		this.LinearForceZ = LinearForceZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearForceZ attribute.
	*
	* @return the value of LinearForceZ
	/**/
	public IfcLinearForceMeasure getLinearForceZ()
	{
		return this.LinearForceZ;
	}

	/**
	* This method sets the LinearMomentX attribute to the given value.
	*
	* @param LinearMomentX DEMANDED value to set - may not be null
	**/
	public void setLinearMomentX(IfcLinearMomentMeasure LinearMomentX)
	{
		this.LinearMomentX = LinearMomentX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearMomentX attribute.
	*
	* @return the value of LinearMomentX
	/**/
	public IfcLinearMomentMeasure getLinearMomentX()
	{
		return this.LinearMomentX;
	}

	/**
	* This method sets the LinearMomentY attribute to the given value.
	*
	* @param LinearMomentY DEMANDED value to set - may not be null
	**/
	public void setLinearMomentY(IfcLinearMomentMeasure LinearMomentY)
	{
		this.LinearMomentY = LinearMomentY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearMomentY attribute.
	*
	* @return the value of LinearMomentY
	/**/
	public IfcLinearMomentMeasure getLinearMomentY()
	{
		return this.LinearMomentY;
	}

	/**
	* This method sets the LinearMomentZ attribute to the given value.
	*
	* @param LinearMomentZ DEMANDED value to set - may not be null
	**/
	public void setLinearMomentZ(IfcLinearMomentMeasure LinearMomentZ)
	{
		this.LinearMomentZ = LinearMomentZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearMomentZ attribute.
	*
	* @return the value of LinearMomentZ
	/**/
	public IfcLinearMomentMeasure getLinearMomentZ()
	{
		return this.LinearMomentZ;
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
		IfcStructuralLoadLinearForce ifcStructuralLoadLinearForce = new IfcStructuralLoadLinearForce();
		if(this.Name != null)
			ifcStructuralLoadLinearForce.setName((IfcLabel)this.Name.clone());
		if(this.LinearForceX != null)
			ifcStructuralLoadLinearForce.setLinearForceX((IfcLinearForceMeasure)this.LinearForceX.clone());
		if(this.LinearForceY != null)
			ifcStructuralLoadLinearForce.setLinearForceY((IfcLinearForceMeasure)this.LinearForceY.clone());
		if(this.LinearForceZ != null)
			ifcStructuralLoadLinearForce.setLinearForceZ((IfcLinearForceMeasure)this.LinearForceZ.clone());
		if(this.LinearMomentX != null)
			ifcStructuralLoadLinearForce.setLinearMomentX((IfcLinearMomentMeasure)this.LinearMomentX.clone());
		if(this.LinearMomentY != null)
			ifcStructuralLoadLinearForce.setLinearMomentY((IfcLinearMomentMeasure)this.LinearMomentY.clone());
		if(this.LinearMomentZ != null)
			ifcStructuralLoadLinearForce.setLinearMomentZ((IfcLinearMomentMeasure)this.LinearMomentZ.clone());
		return ifcStructuralLoadLinearForce;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcStructuralLoadLinearForce ifcStructuralLoadLinearForce = new IfcStructuralLoadLinearForce();
		if(this.Name != null)
			ifcStructuralLoadLinearForce.setName(this.Name);
		if(this.LinearForceX != null)
			ifcStructuralLoadLinearForce.setLinearForceX(this.LinearForceX);
		if(this.LinearForceY != null)
			ifcStructuralLoadLinearForce.setLinearForceY(this.LinearForceY);
		if(this.LinearForceZ != null)
			ifcStructuralLoadLinearForce.setLinearForceZ(this.LinearForceZ);
		if(this.LinearMomentX != null)
			ifcStructuralLoadLinearForce.setLinearMomentX(this.LinearMomentX);
		if(this.LinearMomentY != null)
			ifcStructuralLoadLinearForce.setLinearMomentY(this.LinearMomentY);
		if(this.LinearMomentZ != null)
			ifcStructuralLoadLinearForce.setLinearMomentZ(this.LinearMomentZ);
		return ifcStructuralLoadLinearForce;
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
