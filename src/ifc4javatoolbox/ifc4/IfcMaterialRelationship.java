/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcMaterialRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcMaterialRelationship extends IfcResourceLevelRelationship implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcMaterial","SET<IfcMaterial>","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingMaterial is an DEMANDED attribute - may not be null**/
	protected IfcMaterial RelatingMaterial;
	/** RelatedMaterials is an DEMANDED attribute - may not be null**/
	protected SET<IfcMaterial> RelatedMaterials;
	/** Expression is an OPTIONAL attribute**/
	protected IfcLabel Expression;
	/**
	* The default constructor.
	**/
	public IfcMaterialRelationship(){}

	/**
	* Constructs a new IfcMaterialRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingMaterial DEMANDED parameter of type IfcMaterial - may not be null.
	* @param RelatedMaterials DEMANDED parameter of type SET<IfcMaterial> - may not be null.
	* @param Expression OPTIONAL parameter of type IfcLabel
	**/
	public IfcMaterialRelationship(IfcLabel Name, IfcText Description, IfcMaterial RelatingMaterial, SET<IfcMaterial> RelatedMaterials, IfcLabel Expression)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingMaterial = RelatingMaterial;
		this.RelatedMaterials = RelatedMaterials;
		this.Expression = Expression;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcMaterialRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingMaterial DEMANDED parameter of type IfcMaterial - may not be null.
	* @param RelatedMaterials DEMANDED parameter of type SET<IfcMaterial> - may not be null.
	* @param Expression OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcMaterial RelatingMaterial, SET<IfcMaterial> RelatedMaterials, IfcLabel Expression)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingMaterial = RelatingMaterial;
		this.RelatedMaterials = RelatedMaterials;
		this.Expression = Expression;
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
		this.RelatingMaterial = (IfcMaterial) parameters.get(2);
		this.RelatedMaterials = (SET<IfcMaterial>) parameters.get(3);
		this.Expression = (IfcLabel) parameters.get(4);
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
		if(RelatingMaterial != null)
		{
				if(RelatingMaterial.RelatesTo_Inverse == null)
				{
					RelatingMaterial.RelatesTo_Inverse = new SET<IfcMaterialRelationship>();
				}
				RelatingMaterial.RelatesTo_Inverse.add(this);
		}
		if(RelatedMaterials != null)
		{
			for(IfcMaterial RelatedMaterials$ : RelatedMaterials)
			{
				if(RelatedMaterials$.IsRelatedWith_Inverse == null)
				{
					RelatedMaterials$.IsRelatedWith_Inverse = new SET<IfcMaterialRelationship>();
				}
				RelatedMaterials$.IsRelatedWith_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcMaterialRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCMATERIALRELATIONSHIP(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingMaterial")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingMaterial != null)		stepString = stepString.concat(((RootInterface)this.RelatingMaterial).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedMaterials")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedMaterials != null)		stepString = stepString.concat(((RootInterface)this.RelatedMaterials).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Expression")) stepString = stepString.concat("*);");
		else{
		if(this.Expression != null)		stepString = stepString.concat(((RootInterface)this.Expression).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method sets the RelatingMaterial attribute to the given value.
	*
	* @param RelatingMaterial OPTIONAL value to set
	**/
	public void setRelatingMaterial(IfcMaterial RelatingMaterial)
	{
		synchronizeInversesRemoveRelatingMaterial(this.RelatingMaterial);
		this.RelatingMaterial = RelatingMaterial;
		synchronizeInversesAddRelatingMaterial(this.RelatingMaterial);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingMaterial attribute.
	*
	* @return the value of RelatingMaterial
	/**/
	public IfcMaterial getRelatingMaterial()
	{
		return this.RelatingMaterial;
	}

	private void synchronizeInversesAddRelatingMaterial(IfcMaterial RelatingMaterial)
	{
		if(RelatingMaterial != null)
		{
				if(RelatingMaterial.RelatesTo_Inverse == null)
				{
					RelatingMaterial.RelatesTo_Inverse = new SET<IfcMaterialRelationship>();
				}
				RelatingMaterial.RelatesTo_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingMaterial(IfcMaterial RelatingMaterial)
	{
		if(RelatingMaterial != null)
		{
				if(RelatingMaterial.RelatesTo_Inverse != null)
				{
					RelatingMaterial.RelatesTo_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedMaterials attribute to the given value.
	*
	* @param RelatedMaterials OPTIONAL value to set
	**/
	public void setRelatedMaterials(SET<IfcMaterial> RelatedMaterials)
	{
		synchronizeInversesRemoveRelatedMaterials(this.RelatedMaterials);
		this.RelatedMaterials = RelatedMaterials;
		synchronizeInversesAddRelatedMaterials(this.RelatedMaterials);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedMaterials attribute.
	*
	* @return a copy of the RelatedMaterials set
	**/
	public SET<IfcMaterial> getRelatedMaterials()
	{
		if(this.RelatedMaterials != null)
			return new SET<IfcMaterial>(this.RelatedMaterials);
		return null;
	}

	/**
	* This method adds an IfcMaterial object to the RelatedMaterials set.
	* @param RelatedMaterials element to be appended to this set.
	**/
	public void addRelatedMaterials(IfcMaterial RelatedMaterials)
	{
		if(this.RelatedMaterials == null)
			this.RelatedMaterials = new SET<IfcMaterial>();
		this.RelatedMaterials.add(RelatedMaterials);
		synchronizeInversesAddRelatedMaterials(RelatedMaterials);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcMaterial objects to the RelatedMaterials set.
	* @param RelatedMaterials collection containing elements to be added to this set.
	**/
	public void addAllRelatedMaterials(java.util.Collection<IfcMaterial> RelatedMaterials)
	{
		if(this.RelatedMaterials == null)
			this.RelatedMaterials = new SET<IfcMaterial>();
		this.RelatedMaterials.addAll(RelatedMaterials);
		synchronizeInversesAddRelatedMaterials(RelatedMaterials);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedMaterials set.
	**/
	public void clearRelatedMaterials()
	{
		if(this.RelatedMaterials != null)
		{
			synchronizeInversesRemoveRelatedMaterials(this.RelatedMaterials);
			this.RelatedMaterials.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcMaterial object from the RelatedMaterials set.
	* @param RelatedMaterials element to be removed from this set.
	**/
	public void removeRelatedMaterials(IfcMaterial RelatedMaterials)
	{
		if(this.RelatedMaterials != null)
		{
			this.RelatedMaterials.remove(RelatedMaterials);
			synchronizeInversesRemoveRelatedMaterials(RelatedMaterials);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcMaterial objects from the RelatedMaterials set.
	* @param RelatedMaterials collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedMaterials(java.util.Collection<IfcMaterial> RelatedMaterials)
	{
		if(this.RelatedMaterials != null)
		{
			this.RelatedMaterials.removeAll(RelatedMaterials);
			synchronizeInversesRemoveRelatedMaterials(RelatedMaterials);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedMaterials(IfcMaterial RelatedMaterials)
	{
		if(RelatedMaterials != null)
		{
				if(RelatedMaterials.IsRelatedWith_Inverse == null)
				{
					RelatedMaterials.IsRelatedWith_Inverse = new SET<IfcMaterialRelationship>();
				}
				RelatedMaterials.IsRelatedWith_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedMaterials(java.util.Collection<IfcMaterial> RelatedMaterials)
	{
		if(RelatedMaterials != null)
		{
			for(IfcMaterial RelatedMaterials$ : RelatedMaterials)
			{
				synchronizeInversesAddRelatedMaterials(RelatedMaterials$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedMaterials(IfcMaterial RelatedMaterials)
	{
		if(RelatedMaterials != null)
		{
				if(RelatedMaterials.IsRelatedWith_Inverse != null)
				{
					RelatedMaterials.IsRelatedWith_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedMaterials(java.util.Collection<IfcMaterial> RelatedMaterials)
	{
		if(RelatedMaterials != null)
		{
			for(IfcMaterial RelatedMaterials$ : RelatedMaterials)
			{
				synchronizeInversesRemoveRelatedMaterials(RelatedMaterials$);
			}
		}
	}

	/**
	* This method sets the Expression attribute to the given value.
	*
	* @param Expression DEMANDED value to set - may not be null
	**/
	public void setExpression(IfcLabel Expression)
	{
		this.Expression = Expression;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Expression attribute.
	*
	* @return the value of Expression
	/**/
	public IfcLabel getExpression()
	{
		return this.Expression;
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
		IfcMaterialRelationship ifcMaterialRelationship = new IfcMaterialRelationship();
		if(this.Name != null)
			ifcMaterialRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcMaterialRelationship.setDescription((IfcText)this.Description.clone());
		if(this.RelatingMaterial != null)
			ifcMaterialRelationship.setRelatingMaterial((IfcMaterial)this.RelatingMaterial.clone());
		if(this.RelatedMaterials != null)
			ifcMaterialRelationship.setRelatedMaterials((SET<IfcMaterial>)this.RelatedMaterials.clone());
		if(this.Expression != null)
			ifcMaterialRelationship.setExpression((IfcLabel)this.Expression.clone());
		return ifcMaterialRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcMaterialRelationship ifcMaterialRelationship = new IfcMaterialRelationship();
		if(this.Name != null)
			ifcMaterialRelationship.setName(this.Name);
		if(this.Description != null)
			ifcMaterialRelationship.setDescription(this.Description);
		if(this.RelatingMaterial != null)
			ifcMaterialRelationship.setRelatingMaterial(this.RelatingMaterial);
		if(this.RelatedMaterials != null)
			ifcMaterialRelationship.setRelatedMaterials(this.RelatedMaterials);
		if(this.Expression != null)
			ifcMaterialRelationship.setExpression(this.Expression);
		return ifcMaterialRelationship;
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
