/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcProjectedCRS<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcProjectedCRS extends IfcCoordinateReferenceSystem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcIdentifier","IfcIdentifier","IfcIdentifier","IfcIdentifier","IfcNamedUnit"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** MapProjection is an OPTIONAL attribute**/
	protected IfcIdentifier MapProjection;
	/** MapZone is an OPTIONAL attribute**/
	protected IfcIdentifier MapZone;
	/** MapUnit is an OPTIONAL attribute**/
	protected IfcNamedUnit MapUnit;
	/**
	* The default constructor.
	**/
	public IfcProjectedCRS(){}

	/**
	* Constructs a new IfcProjectedCRS object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param GeodeticDatum DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param VerticalDatum OPTIONAL parameter of type IfcIdentifier
	* @param MapProjection OPTIONAL parameter of type IfcIdentifier
	* @param MapZone OPTIONAL parameter of type IfcIdentifier
	* @param MapUnit OPTIONAL parameter of type IfcNamedUnit
	**/
	public IfcProjectedCRS(IfcLabel Name, IfcText Description, IfcIdentifier GeodeticDatum, IfcIdentifier VerticalDatum, IfcIdentifier MapProjection, IfcIdentifier MapZone, IfcNamedUnit MapUnit)
	{
		this.Name = Name;
		this.Description = Description;
		this.GeodeticDatum = GeodeticDatum;
		this.VerticalDatum = VerticalDatum;
		this.MapProjection = MapProjection;
		this.MapZone = MapZone;
		this.MapUnit = MapUnit;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcProjectedCRS object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param GeodeticDatum DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param VerticalDatum OPTIONAL parameter of type IfcIdentifier
	* @param MapProjection OPTIONAL parameter of type IfcIdentifier
	* @param MapZone OPTIONAL parameter of type IfcIdentifier
	* @param MapUnit OPTIONAL parameter of type IfcNamedUnit
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcIdentifier GeodeticDatum, IfcIdentifier VerticalDatum, IfcIdentifier MapProjection, IfcIdentifier MapZone, IfcNamedUnit MapUnit)
	{
		this.Name = Name;
		this.Description = Description;
		this.GeodeticDatum = GeodeticDatum;
		this.VerticalDatum = VerticalDatum;
		this.MapProjection = MapProjection;
		this.MapZone = MapZone;
		this.MapUnit = MapUnit;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.GeodeticDatum = (IfcIdentifier) parameters.get(2);
		this.VerticalDatum = (IfcIdentifier) parameters.get(3);
		this.MapProjection = (IfcIdentifier) parameters.get(4);
		this.MapZone = (IfcIdentifier) parameters.get(5);
		this.MapUnit = (IfcNamedUnit) parameters.get(6);
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
		return IfcProjectedCRS.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPROJECTEDCRS(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("GeodeticDatum")) stepString = stepString.concat("*,");
		else{
		if(this.GeodeticDatum != null)		stepString = stepString.concat(((RootInterface)this.GeodeticDatum).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VerticalDatum")) stepString = stepString.concat("*,");
		else{
		if(this.VerticalDatum != null)		stepString = stepString.concat(((RootInterface)this.VerticalDatum).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MapProjection")) stepString = stepString.concat("*,");
		else{
		if(this.MapProjection != null)		stepString = stepString.concat(((RootInterface)this.MapProjection).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MapZone")) stepString = stepString.concat("*,");
		else{
		if(this.MapZone != null)		stepString = stepString.concat(((RootInterface)this.MapZone).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MapUnit")) stepString = stepString.concat("*);");
		else{
		if(this.MapUnit != null)		stepString = stepString.concat(((RootInterface)this.MapUnit).getStepParameter(IfcNamedUnit.class.isInterface())+");");
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
	* This method sets the MapProjection attribute to the given value.
	*
	* @param MapProjection DEMANDED value to set - may not be null
	**/
	public void setMapProjection(IfcIdentifier MapProjection)
	{
		this.MapProjection = MapProjection;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MapProjection attribute.
	*
	* @return the value of MapProjection
	/**/
	public IfcIdentifier getMapProjection()
	{
		return this.MapProjection;
	}

	/**
	* This method sets the MapZone attribute to the given value.
	*
	* @param MapZone DEMANDED value to set - may not be null
	**/
	public void setMapZone(IfcIdentifier MapZone)
	{
		this.MapZone = MapZone;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MapZone attribute.
	*
	* @return the value of MapZone
	/**/
	public IfcIdentifier getMapZone()
	{
		return this.MapZone;
	}

	/**
	* This method sets the MapUnit attribute to the given value.
	*
	* @param MapUnit DEMANDED value to set - may not be null
	**/
	public void setMapUnit(IfcNamedUnit MapUnit)
	{
		this.MapUnit = MapUnit;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MapUnit attribute.
	*
	* @return the value of MapUnit
	/**/
	public IfcNamedUnit getMapUnit()
	{
		return this.MapUnit;
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
		IfcProjectedCRS ifcProjectedCRS = new IfcProjectedCRS();
		if(this.Name != null)
			ifcProjectedCRS.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcProjectedCRS.setDescription((IfcText)this.Description.clone());
		if(this.GeodeticDatum != null)
			ifcProjectedCRS.setGeodeticDatum((IfcIdentifier)this.GeodeticDatum.clone());
		if(this.VerticalDatum != null)
			ifcProjectedCRS.setVerticalDatum((IfcIdentifier)this.VerticalDatum.clone());
		if(this.MapProjection != null)
			ifcProjectedCRS.setMapProjection((IfcIdentifier)this.MapProjection.clone());
		if(this.MapZone != null)
			ifcProjectedCRS.setMapZone((IfcIdentifier)this.MapZone.clone());
		if(this.MapUnit != null)
			ifcProjectedCRS.setMapUnit((IfcNamedUnit)this.MapUnit.clone());
		return ifcProjectedCRS;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcProjectedCRS ifcProjectedCRS = new IfcProjectedCRS();
		if(this.Name != null)
			ifcProjectedCRS.setName(this.Name);
		if(this.Description != null)
			ifcProjectedCRS.setDescription(this.Description);
		if(this.GeodeticDatum != null)
			ifcProjectedCRS.setGeodeticDatum(this.GeodeticDatum);
		if(this.VerticalDatum != null)
			ifcProjectedCRS.setVerticalDatum(this.VerticalDatum);
		if(this.MapProjection != null)
			ifcProjectedCRS.setMapProjection(this.MapProjection);
		if(this.MapZone != null)
			ifcProjectedCRS.setMapZone(this.MapZone);
		if(this.MapUnit != null)
			ifcProjectedCRS.setMapUnit(this.MapUnit);
		return ifcProjectedCRS;
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
