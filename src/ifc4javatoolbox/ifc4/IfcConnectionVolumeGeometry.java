/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcConnectionVolumeGeometry<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcConnectionVolumeGeometry extends IfcConnectionGeometry implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcSolidOrShell","IfcSolidOrShell"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** VolumeOnRelatingElement is an DEMANDED attribute - may not be null**/
	protected IfcSolidOrShell VolumeOnRelatingElement;
	/** VolumeOnRelatedElement is an OPTIONAL attribute**/
	protected IfcSolidOrShell VolumeOnRelatedElement;
	/**
	* The default constructor.
	**/
	public IfcConnectionVolumeGeometry(){}

	/**
	* Constructs a new IfcConnectionVolumeGeometry object using the given parameters.
	*
	* @param VolumeOnRelatingElement DEMANDED parameter of type IfcSolidOrShell - may not be null.
	* @param VolumeOnRelatedElement OPTIONAL parameter of type IfcSolidOrShell
	**/
	public IfcConnectionVolumeGeometry(IfcSolidOrShell VolumeOnRelatingElement, IfcSolidOrShell VolumeOnRelatedElement)
	{
		this.VolumeOnRelatingElement = VolumeOnRelatingElement;
		this.VolumeOnRelatedElement = VolumeOnRelatedElement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcConnectionVolumeGeometry object using the given parameters.
	*
	* @param VolumeOnRelatingElement DEMANDED parameter of type IfcSolidOrShell - may not be null.
	* @param VolumeOnRelatedElement OPTIONAL parameter of type IfcSolidOrShell
	**/
	public void setParameters(IfcSolidOrShell VolumeOnRelatingElement, IfcSolidOrShell VolumeOnRelatedElement)
	{
		this.VolumeOnRelatingElement = VolumeOnRelatingElement;
		this.VolumeOnRelatedElement = VolumeOnRelatedElement;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.VolumeOnRelatingElement = (IfcSolidOrShell) parameters.get(0);
		this.VolumeOnRelatedElement = (IfcSolidOrShell) parameters.get(1);
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
		return IfcConnectionVolumeGeometry.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCONNECTIONVOLUMEGEOMETRY(");
		if(getRedefinedDerivedAttributeTypes().contains("VolumeOnRelatingElement")) stepString = stepString.concat("*,");
		else{
		if(this.VolumeOnRelatingElement != null)		stepString = stepString.concat(((RootInterface)this.VolumeOnRelatingElement).getStepParameter(IfcSolidOrShell.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("VolumeOnRelatedElement")) stepString = stepString.concat("*);");
		else{
		if(this.VolumeOnRelatedElement != null)		stepString = stepString.concat(((RootInterface)this.VolumeOnRelatedElement).getStepParameter(IfcSolidOrShell.class.isInterface())+");");
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
	* This method sets the VolumeOnRelatingElement attribute to the given value.
	*
	* @param VolumeOnRelatingElement OPTIONAL value to set
	**/
	public void setVolumeOnRelatingElement(IfcSolidOrShell VolumeOnRelatingElement)
	{
		this.VolumeOnRelatingElement = VolumeOnRelatingElement;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the VolumeOnRelatingElement attribute.
	*
	* @return the value of VolumeOnRelatingElement
	/**/
	public IfcSolidOrShell getVolumeOnRelatingElement()
	{
		return this.VolumeOnRelatingElement;
	}

	/**
	* This method sets the VolumeOnRelatedElement attribute to the given value.
	*
	* @param VolumeOnRelatedElement DEMANDED value to set - may not be null
	**/
	public void setVolumeOnRelatedElement(IfcSolidOrShell VolumeOnRelatedElement)
	{
		this.VolumeOnRelatedElement = VolumeOnRelatedElement;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the VolumeOnRelatedElement attribute.
	*
	* @return the value of VolumeOnRelatedElement
	/**/
	public IfcSolidOrShell getVolumeOnRelatedElement()
	{
		return this.VolumeOnRelatedElement;
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
		IfcConnectionVolumeGeometry ifcConnectionVolumeGeometry = new IfcConnectionVolumeGeometry();
		if(this.VolumeOnRelatingElement != null)
			ifcConnectionVolumeGeometry.setVolumeOnRelatingElement((IfcSolidOrShell)this.VolumeOnRelatingElement.clone());
		if(this.VolumeOnRelatedElement != null)
			ifcConnectionVolumeGeometry.setVolumeOnRelatedElement((IfcSolidOrShell)this.VolumeOnRelatedElement.clone());
		return ifcConnectionVolumeGeometry;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcConnectionVolumeGeometry ifcConnectionVolumeGeometry = new IfcConnectionVolumeGeometry();
		if(this.VolumeOnRelatingElement != null)
			ifcConnectionVolumeGeometry.setVolumeOnRelatingElement(this.VolumeOnRelatingElement);
		if(this.VolumeOnRelatedElement != null)
			ifcConnectionVolumeGeometry.setVolumeOnRelatedElement(this.VolumeOnRelatedElement);
		return ifcConnectionVolumeGeometry;
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
