/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcSurfaceStyle<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSurfaceStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcSurfaceSide","SET<IfcSurfaceStyleElementSelect>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Side is an DEMANDED attribute - may not be null**/
	protected IfcSurfaceSide Side;
	/** Styles is an DEMANDED attribute - may not be null**/
	protected SET<IfcSurfaceStyleElementSelect> Styles;
	/**
	* The default constructor.
	**/
	public IfcSurfaceStyle(){}

	/**
	* Constructs a new IfcSurfaceStyle object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Side DEMANDED parameter of type IfcSurfaceSide - may not be null.
	* @param Styles DEMANDED parameter of type SET<IfcSurfaceStyleElementSelect> - may not be null.
	**/
	public IfcSurfaceStyle(IfcLabel Name, IfcSurfaceSide Side, SET<IfcSurfaceStyleElementSelect> Styles)
	{
		this.Name = Name;
		this.Side = Side;
		this.Styles = Styles;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSurfaceStyle object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Side DEMANDED parameter of type IfcSurfaceSide - may not be null.
	* @param Styles DEMANDED parameter of type SET<IfcSurfaceStyleElementSelect> - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcSurfaceSide Side, SET<IfcSurfaceStyleElementSelect> Styles)
	{
		this.Name = Name;
		this.Side = Side;
		this.Styles = Styles;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Side = (IfcSurfaceSide) parameters.get(1);
		this.Styles = (SET<IfcSurfaceStyleElementSelect>) parameters.get(2);
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
		return IfcSurfaceStyle.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSURFACESTYLE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Side")) stepString = stepString.concat("*,");
		else{
		if(this.Side != null)		stepString = stepString.concat(((RootInterface)this.Side).getStepParameter(IfcSurfaceSide.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Styles")) stepString = stepString.concat("*);");
		else{
		if(this.Styles != null)		stepString = stepString.concat(((RootInterface)this.Styles).getStepParameter(IfcSurfaceStyleElementSelect.class.isInterface())+");");
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
	* This method sets the Side attribute to the given value.
	*
	* @param Side OPTIONAL value to set
	**/
	public void setSide(IfcSurfaceSide Side)
	{
		this.Side = Side;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Side attribute.
	*
	* @return the value of Side
	/**/
	public IfcSurfaceSide getSide()
	{
		return this.Side;
	}

	/**
	* This method sets the Styles attribute to the given value.
	*
	* @param Styles OPTIONAL value to set
	**/
	public void setStyles(SET<IfcSurfaceStyleElementSelect> Styles)
	{
		this.Styles = Styles;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Styles attribute.
	*
	* @return a copy of the Styles set
	**/
	public SET<IfcSurfaceStyleElementSelect> getStyles()
	{
		if(this.Styles != null)
			return new SET<IfcSurfaceStyleElementSelect>(this.Styles);
		return null;
	}

	/**
	* This method adds an IfcSurfaceStyleElementSelect object to the Styles set.
	* @param Styles element to be appended to this set.
	**/
	public void addStyles(IfcSurfaceStyleElementSelect Styles)
	{
		if(this.Styles == null)
			this.Styles = new SET<IfcSurfaceStyleElementSelect>();
		this.Styles.add(Styles);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcSurfaceStyleElementSelect objects to the Styles set.
	* @param Styles collection containing elements to be added to this set.
	**/
	public void addAllStyles(java.util.Collection<IfcSurfaceStyleElementSelect> Styles)
	{
		if(this.Styles == null)
			this.Styles = new SET<IfcSurfaceStyleElementSelect>();
		this.Styles.addAll(Styles);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Styles set.
	**/
	public void clearStyles()
	{
		if(this.Styles != null)
		{
			this.Styles.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcSurfaceStyleElementSelect object from the Styles set.
	* @param Styles element to be removed from this set.
	**/
	public void removeStyles(IfcSurfaceStyleElementSelect Styles)
	{
		if(this.Styles != null)
		{
			this.Styles.remove(Styles);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcSurfaceStyleElementSelect objects from the Styles set.
	* @param Styles collection containing elements to be removed from this set.
	**/
	public void removeAllStyles(java.util.Collection<IfcSurfaceStyleElementSelect> Styles)
	{
		if(this.Styles != null)
		{
			this.Styles.removeAll(Styles);
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
		IfcSurfaceStyle ifcSurfaceStyle = new IfcSurfaceStyle();
		if(this.Name != null)
			ifcSurfaceStyle.setName((IfcLabel)this.Name.clone());
		if(this.Side != null)
			ifcSurfaceStyle.setSide((IfcSurfaceSide)this.Side.clone());
		if(this.Styles != null)
			ifcSurfaceStyle.setStyles((SET<IfcSurfaceStyleElementSelect>)this.Styles.clone());
		return ifcSurfaceStyle;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSurfaceStyle ifcSurfaceStyle = new IfcSurfaceStyle();
		if(this.Name != null)
			ifcSurfaceStyle.setName(this.Name);
		if(this.Side != null)
			ifcSurfaceStyle.setSide(this.Side);
		if(this.Styles != null)
			ifcSurfaceStyle.setStyles(this.Styles);
		return ifcSurfaceStyle;
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
