/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcProductDefinitionShape<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcProductDefinitionShape extends IfcProductRepresentation implements IfcProductRepresentationSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","LIST<IfcRepresentation>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	protected SET<IfcProduct> ShapeOfProduct_Inverse;
	protected SET<IfcShapeAspect> HasShapeAspects_Inverse;
	/**
	* The default constructor.
	**/
	public IfcProductDefinitionShape(){}

	/**
	* Constructs a new IfcProductDefinitionShape object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param Representations DEMANDED parameter of type LIST<IfcRepresentation> - may not be null.
	**/
	public IfcProductDefinitionShape(IfcLabel Name, IfcText Description, LIST<IfcRepresentation> Representations)
	{
		this.Name = Name;
		this.Description = Description;
		this.Representations = Representations;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.Representations = (LIST<IfcRepresentation>) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		ShapeOfProduct_Inverse = null;
		HasShapeAspects_Inverse = null;
	}

	private void resolveInverses()
	{
		if(Representations != null)
		{
			for(IfcRepresentation Representations$ : Representations)
			{
				if(Representations$.OfProductRepresentation_Inverse == null)
				{
					Representations$.OfProductRepresentation_Inverse = new SET<IfcProductRepresentation>();
				}
				Representations$.OfProductRepresentation_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcProductDefinitionShape.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPRODUCTDEFINITIONSHAPE(");
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
		if(getRedefinedDerivedAttributeTypes().contains("Representations")) stepString = stepString.concat("*);");
		else{
		if(this.Representations != null)		stepString = stepString.concat(((RootInterface)this.Representations).getStepParameter(IfcRepresentation.class.isInterface())+");");
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
	* This method returns a copy of the set of the ShapeOfProduct_Inverse attribute.
	*
	* @return a copy of the ShapeOfProduct_Inverse set
	**/
	public SET<IfcProduct> getShapeOfProduct_Inverse()
	{
		if(this.ShapeOfProduct_Inverse != null)
			return new SET<IfcProduct>(this.ShapeOfProduct_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasShapeAspects_Inverse attribute.
	*
	* @return a copy of the HasShapeAspects_Inverse set
	**/
	public SET<IfcShapeAspect> getHasShapeAspects_Inverse()
	{
		if(this.HasShapeAspects_Inverse != null)
			return new SET<IfcShapeAspect>(this.HasShapeAspects_Inverse);
		return null;
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
		IfcProductDefinitionShape ifcProductDefinitionShape = new IfcProductDefinitionShape();
		if(this.Name != null)
			ifcProductDefinitionShape.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcProductDefinitionShape.setDescription((IfcText)this.Description.clone());
		if(this.Representations != null)
			ifcProductDefinitionShape.setRepresentations((LIST<IfcRepresentation>)this.Representations.clone());
		return ifcProductDefinitionShape;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcProductDefinitionShape ifcProductDefinitionShape = new IfcProductDefinitionShape();
		if(this.Name != null)
			ifcProductDefinitionShape.setName(this.Name);
		if(this.Description != null)
			ifcProductDefinitionShape.setDescription(this.Description);
		if(this.Representations != null)
			ifcProductDefinitionShape.setRepresentations(this.Representations);
		return ifcProductDefinitionShape;
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
