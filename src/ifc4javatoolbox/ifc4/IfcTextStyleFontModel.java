/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcTextStyleFontModel<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTextStyleFontModel extends IfcPreDefinedTextFont implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","LIST<IfcTextFontName>","IfcFontStyle","IfcFontVariant","IfcFontWeight","IfcSizeSelect"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** FontFamily is an DEMANDED attribute - may not be null**/
	protected LIST<IfcTextFontName> FontFamily;
	/** FontStyle is an OPTIONAL attribute**/
	protected IfcFontStyle FontStyle;
	/** FontVariant is an OPTIONAL attribute**/
	protected IfcFontVariant FontVariant;
	/** FontWeight is an OPTIONAL attribute**/
	protected IfcFontWeight FontWeight;
	/** FontSize is an DEMANDED attribute - may not be null**/
	protected IfcSizeSelect FontSize;
	/**
	* The default constructor.
	**/
	public IfcTextStyleFontModel(){}

	/**
	* Constructs a new IfcTextStyleFontModel object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param FontFamily DEMANDED parameter of type LIST<IfcTextFontName> - may not be null.
	* @param FontStyle OPTIONAL parameter of type IfcFontStyle
	* @param FontVariant OPTIONAL parameter of type IfcFontVariant
	* @param FontWeight OPTIONAL parameter of type IfcFontWeight
	* @param FontSize DEMANDED parameter of type IfcSizeSelect - may not be null.
	**/
	public IfcTextStyleFontModel(IfcLabel Name, LIST<IfcTextFontName> FontFamily, IfcFontStyle FontStyle, IfcFontVariant FontVariant, IfcFontWeight FontWeight, IfcSizeSelect FontSize)
	{
		this.Name = Name;
		this.FontFamily = FontFamily;
		this.FontStyle = FontStyle;
		this.FontVariant = FontVariant;
		this.FontWeight = FontWeight;
		this.FontSize = FontSize;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTextStyleFontModel object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param FontFamily DEMANDED parameter of type LIST<IfcTextFontName> - may not be null.
	* @param FontStyle OPTIONAL parameter of type IfcFontStyle
	* @param FontVariant OPTIONAL parameter of type IfcFontVariant
	* @param FontWeight OPTIONAL parameter of type IfcFontWeight
	* @param FontSize DEMANDED parameter of type IfcSizeSelect - may not be null.
	**/
	public void setParameters(IfcLabel Name, LIST<IfcTextFontName> FontFamily, IfcFontStyle FontStyle, IfcFontVariant FontVariant, IfcFontWeight FontWeight, IfcSizeSelect FontSize)
	{
		this.Name = Name;
		this.FontFamily = FontFamily;
		this.FontStyle = FontStyle;
		this.FontVariant = FontVariant;
		this.FontWeight = FontWeight;
		this.FontSize = FontSize;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.FontFamily = (LIST<IfcTextFontName>) parameters.get(1);
		this.FontStyle = (IfcFontStyle) parameters.get(2);
		this.FontVariant = (IfcFontVariant) parameters.get(3);
		this.FontWeight = (IfcFontWeight) parameters.get(4);
		this.FontSize = (IfcSizeSelect) parameters.get(5);
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
		return IfcTextStyleFontModel.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTEXTSTYLEFONTMODEL(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FontFamily")) stepString = stepString.concat("*,");
		else{
		if(this.FontFamily != null)		stepString = stepString.concat(((RootInterface)this.FontFamily).getStepParameter(IfcTextFontName.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FontStyle")) stepString = stepString.concat("*,");
		else{
		if(this.FontStyle != null)		stepString = stepString.concat(((RootInterface)this.FontStyle).getStepParameter(IfcFontStyle.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FontVariant")) stepString = stepString.concat("*,");
		else{
		if(this.FontVariant != null)		stepString = stepString.concat(((RootInterface)this.FontVariant).getStepParameter(IfcFontVariant.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FontWeight")) stepString = stepString.concat("*,");
		else{
		if(this.FontWeight != null)		stepString = stepString.concat(((RootInterface)this.FontWeight).getStepParameter(IfcFontWeight.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FontSize")) stepString = stepString.concat("*);");
		else{
		if(this.FontSize != null)		stepString = stepString.concat(((RootInterface)this.FontSize).getStepParameter(IfcSizeSelect.class.isInterface())+");");
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
	* This method sets the FontFamily attribute to the given value.
	*
	* @param FontFamily OPTIONAL value to set
	**/
	public void setFontFamily(LIST<IfcTextFontName> FontFamily)
	{
		this.FontFamily = FontFamily;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the FontFamily attribute.
	*
	* @return a copy of the FontFamily list
	**/
	public LIST<IfcTextFontName> getFontFamily()
	{
		if(this.FontFamily != null)
			return new LIST<IfcTextFontName>(this.FontFamily);
		return null;
	}

	/**
	* This method adds an IfcTextFontName object to the FontFamily list.
	* @param FontFamily element to be appended to this list.
	**/
	public void addFontFamily(IfcTextFontName FontFamily)
	{
		if(this.FontFamily == null)
			this.FontFamily = new LIST<IfcTextFontName>();
		this.FontFamily.add(FontFamily);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcTextFontName objects to the FontFamily list.
	* @param FontFamily collection containing elements to be added to this list.
	**/
	public void addAllFontFamily(java.util.Collection<IfcTextFontName> FontFamily)
	{
		if(this.FontFamily == null)
			this.FontFamily = new LIST<IfcTextFontName>();
		this.FontFamily.addAll(FontFamily);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the FontFamily list.
	**/
	public void clearFontFamily()
	{
		if(this.FontFamily != null)
		{
			this.FontFamily.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcTextFontName object from the FontFamily list.
	* @param FontFamily element to be removed from this list.
	**/
	public void removeFontFamily(IfcTextFontName FontFamily)
	{
		if(this.FontFamily != null)
		{
			this.FontFamily.remove(FontFamily);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcTextFontName objects from the FontFamily list.
	* @param FontFamily collection containing elements to be removed from this list.
	**/
	public void removeAllFontFamily(java.util.Collection<IfcTextFontName> FontFamily)
	{
		if(this.FontFamily != null)
		{
			this.FontFamily.removeAll(FontFamily);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the FontStyle attribute to the given value.
	*
	* @param FontStyle DEMANDED value to set - may not be null
	**/
	public void setFontStyle(IfcFontStyle FontStyle)
	{
		this.FontStyle = FontStyle;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FontStyle attribute.
	*
	* @return the value of FontStyle
	/**/
	public IfcFontStyle getFontStyle()
	{
		return this.FontStyle;
	}

	/**
	* This method sets the FontVariant attribute to the given value.
	*
	* @param FontVariant DEMANDED value to set - may not be null
	**/
	public void setFontVariant(IfcFontVariant FontVariant)
	{
		this.FontVariant = FontVariant;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FontVariant attribute.
	*
	* @return the value of FontVariant
	/**/
	public IfcFontVariant getFontVariant()
	{
		return this.FontVariant;
	}

	/**
	* This method sets the FontWeight attribute to the given value.
	*
	* @param FontWeight DEMANDED value to set - may not be null
	**/
	public void setFontWeight(IfcFontWeight FontWeight)
	{
		this.FontWeight = FontWeight;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FontWeight attribute.
	*
	* @return the value of FontWeight
	/**/
	public IfcFontWeight getFontWeight()
	{
		return this.FontWeight;
	}

	/**
	* This method sets the FontSize attribute to the given value.
	*
	* @param FontSize OPTIONAL value to set
	**/
	public void setFontSize(IfcSizeSelect FontSize)
	{
		this.FontSize = FontSize;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FontSize attribute.
	*
	* @return the value of FontSize
	/**/
	public IfcSizeSelect getFontSize()
	{
		return this.FontSize;
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
		IfcTextStyleFontModel ifcTextStyleFontModel = new IfcTextStyleFontModel();
		if(this.Name != null)
			ifcTextStyleFontModel.setName((IfcLabel)this.Name.clone());
		if(this.FontFamily != null)
			ifcTextStyleFontModel.setFontFamily((LIST<IfcTextFontName>)this.FontFamily.clone());
		if(this.FontStyle != null)
			ifcTextStyleFontModel.setFontStyle((IfcFontStyle)this.FontStyle.clone());
		if(this.FontVariant != null)
			ifcTextStyleFontModel.setFontVariant((IfcFontVariant)this.FontVariant.clone());
		if(this.FontWeight != null)
			ifcTextStyleFontModel.setFontWeight((IfcFontWeight)this.FontWeight.clone());
		if(this.FontSize != null)
			ifcTextStyleFontModel.setFontSize((IfcSizeSelect)this.FontSize.clone());
		return ifcTextStyleFontModel;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTextStyleFontModel ifcTextStyleFontModel = new IfcTextStyleFontModel();
		if(this.Name != null)
			ifcTextStyleFontModel.setName(this.Name);
		if(this.FontFamily != null)
			ifcTextStyleFontModel.setFontFamily(this.FontFamily);
		if(this.FontStyle != null)
			ifcTextStyleFontModel.setFontStyle(this.FontStyle);
		if(this.FontVariant != null)
			ifcTextStyleFontModel.setFontVariant(this.FontVariant);
		if(this.FontWeight != null)
			ifcTextStyleFontModel.setFontWeight(this.FontWeight);
		if(this.FontSize != null)
			ifcTextStyleFontModel.setFontSize(this.FontSize);
		return ifcTextStyleFontModel;
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