/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcClassificationReference<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcClassificationReference extends IfcExternalReference implements IfcClassificationReferenceSelect, ClassInterface, IfcClassificationSelect
{
	private static final String[] nonInverseAttributes = new String[]{"IfcURIReference","IfcIdentifier","IfcLabel","IfcClassificationReferenceSelect","IfcText","IfcIdentifier"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ReferencedSource is an OPTIONAL attribute**/
	protected IfcClassificationReferenceSelect ReferencedSource;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** Sort is an OPTIONAL attribute**/
	protected IfcIdentifier Sort;
	protected SET<IfcRelAssociatesClassification> ClassificationRefForObjects_Inverse;
	protected SET<IfcClassificationReference> HasReferences_Inverse;
	/**
	* The default constructor.
	**/
	public IfcClassificationReference(){}

	/**
	* Constructs a new IfcClassificationReference object using the given parameters.
	*
	* @param Location OPTIONAL parameter of type IfcURIReference
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param ReferencedSource OPTIONAL parameter of type IfcClassificationReferenceSelect
	* @param Description OPTIONAL parameter of type IfcText
	* @param Sort OPTIONAL parameter of type IfcIdentifier
	**/
	public IfcClassificationReference(IfcURIReference Location, IfcIdentifier Identification, IfcLabel Name, IfcClassificationReferenceSelect ReferencedSource, IfcText Description, IfcIdentifier Sort)
	{
		this.Location = Location;
		this.Identification = Identification;
		this.Name = Name;
		this.ReferencedSource = ReferencedSource;
		this.Description = Description;
		this.Sort = Sort;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcClassificationReference object using the given parameters.
	*
	* @param Location OPTIONAL parameter of type IfcURIReference
	* @param Identification OPTIONAL parameter of type IfcIdentifier
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param ReferencedSource OPTIONAL parameter of type IfcClassificationReferenceSelect
	* @param Description OPTIONAL parameter of type IfcText
	* @param Sort OPTIONAL parameter of type IfcIdentifier
	**/
	public void setParameters(IfcURIReference Location, IfcIdentifier Identification, IfcLabel Name, IfcClassificationReferenceSelect ReferencedSource, IfcText Description, IfcIdentifier Sort)
	{
		this.Location = Location;
		this.Identification = Identification;
		this.Name = Name;
		this.ReferencedSource = ReferencedSource;
		this.Description = Description;
		this.Sort = Sort;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Location = (IfcURIReference) parameters.get(0);
		this.Identification = (IfcIdentifier) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.ReferencedSource = (IfcClassificationReferenceSelect) parameters.get(3);
		this.Description = (IfcText) parameters.get(4);
		this.Sort = (IfcIdentifier) parameters.get(5);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		ClassificationRefForObjects_Inverse = null;
		HasReferences_Inverse = null;
	}

	private void resolveInverses()
	{
		if(ReferencedSource != null)
		{
				if(ReferencedSource instanceof IfcClassificationReference)
				{
				if(((IfcClassificationReference)ReferencedSource).HasReferences_Inverse == null)
				{
					((IfcClassificationReference)ReferencedSource).HasReferences_Inverse = new SET<IfcClassificationReference>();
				}
				((IfcClassificationReference)ReferencedSource).HasReferences_Inverse.add(this);
				}
				else if(ReferencedSource instanceof IfcClassification)
				{
				if(((IfcClassification)ReferencedSource).HasReferences_Inverse == null)
				{
					((IfcClassification)ReferencedSource).HasReferences_Inverse = new SET<IfcClassificationReference>();
				}
				((IfcClassification)ReferencedSource).HasReferences_Inverse.add(this);
				}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcClassificationReference.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCLASSIFICATIONREFERENCE(");
		if(getRedefinedDerivedAttributeTypes().contains("Location")) stepString = stepString.concat("*,");
		else{
		if(this.Location != null)		stepString = stepString.concat(((RootInterface)this.Location).getStepParameter(IfcURIReference.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Identification")) stepString = stepString.concat("*,");
		else{
		if(this.Identification != null)		stepString = stepString.concat(((RootInterface)this.Identification).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ReferencedSource")) stepString = stepString.concat("*,");
		else{
		if(this.ReferencedSource != null)		stepString = stepString.concat(((RootInterface)this.ReferencedSource).getStepParameter(IfcClassificationReferenceSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Sort")) stepString = stepString.concat("*);");
		else{
		if(this.Sort != null)		stepString = stepString.concat(((RootInterface)this.Sort).getStepParameter(IfcIdentifier.class.isInterface())+");");
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
	* This method returns a copy of the set of the ClassificationRefForObjects_Inverse attribute.
	*
	* @return a copy of the ClassificationRefForObjects_Inverse set
	**/
	public SET<IfcRelAssociatesClassification> getClassificationRefForObjects_Inverse()
	{
		if(this.ClassificationRefForObjects_Inverse != null)
			return new SET<IfcRelAssociatesClassification>(this.ClassificationRefForObjects_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasReferences_Inverse attribute.
	*
	* @return a copy of the HasReferences_Inverse set
	**/
	public SET<IfcClassificationReference> getHasReferences_Inverse()
	{
		if(this.HasReferences_Inverse != null)
			return new SET<IfcClassificationReference>(this.HasReferences_Inverse);
		return null;
	}

	/**
	* This method sets the ReferencedSource attribute to the given value.
	*
	* @param ReferencedSource DEMANDED value to set - may not be null
	**/
	public void setReferencedSource(IfcClassificationReferenceSelect ReferencedSource)
	{
		synchronizeInversesRemoveReferencedSource(this.ReferencedSource);
		this.ReferencedSource = ReferencedSource;
		synchronizeInversesAddReferencedSource(this.ReferencedSource);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ReferencedSource attribute.
	*
	* @return the value of ReferencedSource
	/**/
	public IfcClassificationReferenceSelect getReferencedSource()
	{
		return this.ReferencedSource;
	}

	private void synchronizeInversesAddReferencedSource(IfcClassificationReferenceSelect ReferencedSource)
	{
		if(ReferencedSource != null)
		{
				if(ReferencedSource instanceof IfcClassificationReference)
				{
				if(((IfcClassificationReference)ReferencedSource).HasReferences_Inverse == null)
				{
					((IfcClassificationReference)ReferencedSource).HasReferences_Inverse = new SET<IfcClassificationReference>();
				}
				((IfcClassificationReference)ReferencedSource).HasReferences_Inverse.add(this);
				}
				else if(ReferencedSource instanceof IfcClassification)
				{
				if(((IfcClassification)ReferencedSource).HasReferences_Inverse == null)
				{
					((IfcClassification)ReferencedSource).HasReferences_Inverse = new SET<IfcClassificationReference>();
				}
				((IfcClassification)ReferencedSource).HasReferences_Inverse.add(this);
				}
		}
	}

	private void synchronizeInversesRemoveReferencedSource(IfcClassificationReferenceSelect ReferencedSource)
	{
		if(ReferencedSource != null)
		{
				if(ReferencedSource instanceof IfcClassificationReference)
				{
				if(((IfcClassificationReference)ReferencedSource).HasReferences_Inverse != null)
				{
				((IfcClassificationReference)ReferencedSource).HasReferences_Inverse.remove(this);
				}
				}
				else if(ReferencedSource instanceof IfcClassification)
				{
				if(((IfcClassification)ReferencedSource).HasReferences_Inverse != null)
				{
				((IfcClassification)ReferencedSource).HasReferences_Inverse.remove(this);
				}
				}
		}
	}

	/**
	* This method sets the Description attribute to the given value.
	*
	* @param Description DEMANDED value to set - may not be null
	**/
	public void setDescription(IfcText Description)
	{
		this.Description = Description;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Description attribute.
	*
	* @return the value of Description
	/**/
	public IfcText getDescription()
	{
		return this.Description;
	}

	/**
	* This method sets the Sort attribute to the given value.
	*
	* @param Sort DEMANDED value to set - may not be null
	**/
	public void setSort(IfcIdentifier Sort)
	{
		this.Sort = Sort;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Sort attribute.
	*
	* @return the value of Sort
	/**/
	public IfcIdentifier getSort()
	{
		return this.Sort;
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
		IfcClassificationReference ifcClassificationReference = new IfcClassificationReference();
		if(this.Location != null)
			ifcClassificationReference.setLocation((IfcURIReference)this.Location.clone());
		if(this.Identification != null)
			ifcClassificationReference.setIdentification((IfcIdentifier)this.Identification.clone());
		if(this.Name != null)
			ifcClassificationReference.setName((IfcLabel)this.Name.clone());
		if(this.ReferencedSource != null)
			ifcClassificationReference.setReferencedSource((IfcClassificationReferenceSelect)this.ReferencedSource.clone());
		if(this.Description != null)
			ifcClassificationReference.setDescription((IfcText)this.Description.clone());
		if(this.Sort != null)
			ifcClassificationReference.setSort((IfcIdentifier)this.Sort.clone());
		return ifcClassificationReference;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcClassificationReference ifcClassificationReference = new IfcClassificationReference();
		if(this.Location != null)
			ifcClassificationReference.setLocation(this.Location);
		if(this.Identification != null)
			ifcClassificationReference.setIdentification(this.Identification);
		if(this.Name != null)
			ifcClassificationReference.setName(this.Name);
		if(this.ReferencedSource != null)
			ifcClassificationReference.setReferencedSource(this.ReferencedSource);
		if(this.Description != null)
			ifcClassificationReference.setDescription(this.Description);
		if(this.Sort != null)
			ifcClassificationReference.setSort(this.Sort);
		return ifcClassificationReference;
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
