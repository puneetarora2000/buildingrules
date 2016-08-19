/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcBoxedHalfSpace<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcBoxedHalfSpace extends IfcHalfSpaceSolid implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcSurface","BOOLEAN","IfcBoundingBox"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Enclosure is an DEMANDED attribute - may not be null**/
	protected IfcBoundingBox Enclosure;
	/**
	* The default constructor.
	**/
	public IfcBoxedHalfSpace(){}

	/**
	* Constructs a new IfcBoxedHalfSpace object using the given parameters.
	*
	* @param BaseSurface DEMANDED parameter of type IfcSurface - may not be null.
	* @param AgreementFlag DEMANDED parameter of type BOOLEAN - may not be null.
	* @param Enclosure DEMANDED parameter of type IfcBoundingBox - may not be null.
	**/
	public IfcBoxedHalfSpace(IfcSurface BaseSurface, BOOLEAN AgreementFlag, IfcBoundingBox Enclosure)
	{
		this.BaseSurface = BaseSurface;
		this.AgreementFlag = AgreementFlag;
		this.Enclosure = Enclosure;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcBoxedHalfSpace object using the given parameters.
	*
	* @param BaseSurface DEMANDED parameter of type IfcSurface - may not be null.
	* @param AgreementFlag DEMANDED parameter of type BOOLEAN - may not be null.
	* @param Enclosure DEMANDED parameter of type IfcBoundingBox - may not be null.
	**/
	public void setParameters(IfcSurface BaseSurface, BOOLEAN AgreementFlag, IfcBoundingBox Enclosure)
	{
		this.BaseSurface = BaseSurface;
		this.AgreementFlag = AgreementFlag;
		this.Enclosure = Enclosure;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.BaseSurface = (IfcSurface) parameters.get(0);
		this.AgreementFlag = (BOOLEAN) parameters.get(1);
		this.Enclosure = (IfcBoundingBox) parameters.get(2);
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
		return IfcBoxedHalfSpace.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCBOXEDHALFSPACE(");
		if(getRedefinedDerivedAttributeTypes().contains("BaseSurface")) stepString = stepString.concat("*,");
		else{
		if(this.BaseSurface != null)		stepString = stepString.concat(((RootInterface)this.BaseSurface).getStepParameter(IfcSurface.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("AgreementFlag")) stepString = stepString.concat("*,");
		else{
		if(this.AgreementFlag != null)		stepString = stepString.concat(((RootInterface)this.AgreementFlag).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Enclosure")) stepString = stepString.concat("*);");
		else{
		if(this.Enclosure != null)		stepString = stepString.concat(((RootInterface)this.Enclosure).getStepParameter(IfcBoundingBox.class.isInterface())+");");
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
	* This method sets the Enclosure attribute to the given value.
	*
	* @param Enclosure OPTIONAL value to set
	**/
	public void setEnclosure(IfcBoundingBox Enclosure)
	{
		this.Enclosure = Enclosure;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Enclosure attribute.
	*
	* @return the value of Enclosure
	/**/
	public IfcBoundingBox getEnclosure()
	{
		return this.Enclosure;
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
		IfcBoxedHalfSpace ifcBoxedHalfSpace = new IfcBoxedHalfSpace();
		if(this.BaseSurface != null)
			ifcBoxedHalfSpace.setBaseSurface((IfcSurface)this.BaseSurface.clone());
		if(this.AgreementFlag != null)
			ifcBoxedHalfSpace.setAgreementFlag((BOOLEAN)this.AgreementFlag.clone());
		if(this.Enclosure != null)
			ifcBoxedHalfSpace.setEnclosure((IfcBoundingBox)this.Enclosure.clone());
		return ifcBoxedHalfSpace;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcBoxedHalfSpace ifcBoxedHalfSpace = new IfcBoxedHalfSpace();
		if(this.BaseSurface != null)
			ifcBoxedHalfSpace.setBaseSurface(this.BaseSurface);
		if(this.AgreementFlag != null)
			ifcBoxedHalfSpace.setAgreementFlag(this.AgreementFlag);
		if(this.Enclosure != null)
			ifcBoxedHalfSpace.setEnclosure(this.Enclosure);
		return ifcBoxedHalfSpace;
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
