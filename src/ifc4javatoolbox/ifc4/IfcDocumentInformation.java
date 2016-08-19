/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcDocumentInformation<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcDocumentInformation extends IfcExternalInformation implements ClassInterface, IfcDocumentSelect
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcLabel","IfcText","IfcURIReference","IfcText","IfcText","IfcText","IfcLabel","IfcActorSelect","SET<IfcActorSelect>","IfcDateTime","IfcDateTime","IfcIdentifier","IfcDate","IfcDate","IfcDocumentConfidentialityEnum","IfcDocumentStatusEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Identification is an DEMANDED attribute - may not be null**/
	protected IfcIdentifier Identification;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** Location is an OPTIONAL attribute**/
	protected IfcURIReference Location;
	/** Purpose is an OPTIONAL attribute**/
	protected IfcText Purpose;
	/** IntendedUse is an OPTIONAL attribute**/
	protected IfcText IntendedUse;
	/** Scope is an OPTIONAL attribute**/
	protected IfcText Scope;
	/** Revision is an OPTIONAL attribute**/
	protected IfcLabel Revision;
	/** DocumentOwner is an OPTIONAL attribute**/
	protected IfcActorSelect DocumentOwner;
	/** Editors is an OPTIONAL attribute**/
	protected SET<IfcActorSelect> Editors;
	/** CreationTime is an OPTIONAL attribute**/
	protected IfcDateTime CreationTime;
	/** LastRevisionTime is an OPTIONAL attribute**/
	protected IfcDateTime LastRevisionTime;
	/** ElectronicFormat is an OPTIONAL attribute**/
	protected IfcIdentifier ElectronicFormat;
	/** ValidFrom is an OPTIONAL attribute**/
	protected IfcDate ValidFrom;
	/** ValidUntil is an OPTIONAL attribute**/
	protected IfcDate ValidUntil;
	/** Confidentiality is an OPTIONAL attribute**/
	protected IfcDocumentConfidentialityEnum Confidentiality;
	/** Status is an OPTIONAL attribute**/
	protected IfcDocumentStatusEnum Status;
	protected SET<IfcRelAssociatesDocument> DocumentInfoForObjects_Inverse;
	protected SET<IfcDocumentReference> HasDocumentReferences_Inverse;
	protected SET<IfcDocumentInformationRelationship> IsPointedTo_Inverse;
	protected SET<IfcDocumentInformationRelationship> IsPointer_Inverse;
	/**
	* The default constructor.
	**/
	public IfcDocumentInformation(){}

	/**
	* Constructs a new IfcDocumentInformation object using the given parameters.
	*
	* @param Identification DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Location OPTIONAL parameter of type IfcURIReference
	* @param Purpose OPTIONAL parameter of type IfcText
	* @param IntendedUse OPTIONAL parameter of type IfcText
	* @param Scope OPTIONAL parameter of type IfcText
	* @param Revision OPTIONAL parameter of type IfcLabel
	* @param DocumentOwner OPTIONAL parameter of type IfcActorSelect
	* @param Editors OPTIONAL parameter of type SET<IfcActorSelect>
	* @param CreationTime OPTIONAL parameter of type IfcDateTime
	* @param LastRevisionTime OPTIONAL parameter of type IfcDateTime
	* @param ElectronicFormat OPTIONAL parameter of type IfcIdentifier
	* @param ValidFrom OPTIONAL parameter of type IfcDate
	* @param ValidUntil OPTIONAL parameter of type IfcDate
	* @param Confidentiality OPTIONAL parameter of type IfcDocumentConfidentialityEnum
	* @param Status OPTIONAL parameter of type IfcDocumentStatusEnum
	**/
	public IfcDocumentInformation(IfcIdentifier Identification, IfcLabel Name, IfcText Description, IfcURIReference Location, IfcText Purpose, IfcText IntendedUse, IfcText Scope, IfcLabel Revision, IfcActorSelect DocumentOwner, SET<IfcActorSelect> Editors, IfcDateTime CreationTime, IfcDateTime LastRevisionTime, IfcIdentifier ElectronicFormat, IfcDate ValidFrom, IfcDate ValidUntil, IfcDocumentConfidentialityEnum Confidentiality, IfcDocumentStatusEnum Status)
	{
		this.Identification = Identification;
		this.Name = Name;
		this.Description = Description;
		this.Location = Location;
		this.Purpose = Purpose;
		this.IntendedUse = IntendedUse;
		this.Scope = Scope;
		this.Revision = Revision;
		this.DocumentOwner = DocumentOwner;
		this.Editors = Editors;
		this.CreationTime = CreationTime;
		this.LastRevisionTime = LastRevisionTime;
		this.ElectronicFormat = ElectronicFormat;
		this.ValidFrom = ValidFrom;
		this.ValidUntil = ValidUntil;
		this.Confidentiality = Confidentiality;
		this.Status = Status;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcDocumentInformation object using the given parameters.
	*
	* @param Identification DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Location OPTIONAL parameter of type IfcURIReference
	* @param Purpose OPTIONAL parameter of type IfcText
	* @param IntendedUse OPTIONAL parameter of type IfcText
	* @param Scope OPTIONAL parameter of type IfcText
	* @param Revision OPTIONAL parameter of type IfcLabel
	* @param DocumentOwner OPTIONAL parameter of type IfcActorSelect
	* @param Editors OPTIONAL parameter of type SET<IfcActorSelect>
	* @param CreationTime OPTIONAL parameter of type IfcDateTime
	* @param LastRevisionTime OPTIONAL parameter of type IfcDateTime
	* @param ElectronicFormat OPTIONAL parameter of type IfcIdentifier
	* @param ValidFrom OPTIONAL parameter of type IfcDate
	* @param ValidUntil OPTIONAL parameter of type IfcDate
	* @param Confidentiality OPTIONAL parameter of type IfcDocumentConfidentialityEnum
	* @param Status OPTIONAL parameter of type IfcDocumentStatusEnum
	**/
	public void setParameters(IfcIdentifier Identification, IfcLabel Name, IfcText Description, IfcURIReference Location, IfcText Purpose, IfcText IntendedUse, IfcText Scope, IfcLabel Revision, IfcActorSelect DocumentOwner, SET<IfcActorSelect> Editors, IfcDateTime CreationTime, IfcDateTime LastRevisionTime, IfcIdentifier ElectronicFormat, IfcDate ValidFrom, IfcDate ValidUntil, IfcDocumentConfidentialityEnum Confidentiality, IfcDocumentStatusEnum Status)
	{
		this.Identification = Identification;
		this.Name = Name;
		this.Description = Description;
		this.Location = Location;
		this.Purpose = Purpose;
		this.IntendedUse = IntendedUse;
		this.Scope = Scope;
		this.Revision = Revision;
		this.DocumentOwner = DocumentOwner;
		this.Editors = Editors;
		this.CreationTime = CreationTime;
		this.LastRevisionTime = LastRevisionTime;
		this.ElectronicFormat = ElectronicFormat;
		this.ValidFrom = ValidFrom;
		this.ValidUntil = ValidUntil;
		this.Confidentiality = Confidentiality;
		this.Status = Status;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Identification = (IfcIdentifier) parameters.get(0);
		this.Name = (IfcLabel) parameters.get(1);
		this.Description = (IfcText) parameters.get(2);
		this.Location = (IfcURIReference) parameters.get(3);
		this.Purpose = (IfcText) parameters.get(4);
		this.IntendedUse = (IfcText) parameters.get(5);
		this.Scope = (IfcText) parameters.get(6);
		this.Revision = (IfcLabel) parameters.get(7);
		this.DocumentOwner = (IfcActorSelect) parameters.get(8);
		this.Editors = (SET<IfcActorSelect>) parameters.get(9);
		this.CreationTime = (IfcDateTime) parameters.get(10);
		this.LastRevisionTime = (IfcDateTime) parameters.get(11);
		this.ElectronicFormat = (IfcIdentifier) parameters.get(12);
		this.ValidFrom = (IfcDate) parameters.get(13);
		this.ValidUntil = (IfcDate) parameters.get(14);
		this.Confidentiality = (IfcDocumentConfidentialityEnum) parameters.get(15);
		this.Status = (IfcDocumentStatusEnum) parameters.get(16);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		DocumentInfoForObjects_Inverse = null;
		HasDocumentReferences_Inverse = null;
		IsPointedTo_Inverse = null;
		IsPointer_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcDocumentInformation.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCDOCUMENTINFORMATION(");
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
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Location")) stepString = stepString.concat("*,");
		else{
		if(this.Location != null)		stepString = stepString.concat(((RootInterface)this.Location).getStepParameter(IfcURIReference.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Purpose")) stepString = stepString.concat("*,");
		else{
		if(this.Purpose != null)		stepString = stepString.concat(((RootInterface)this.Purpose).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("IntendedUse")) stepString = stepString.concat("*,");
		else{
		if(this.IntendedUse != null)		stepString = stepString.concat(((RootInterface)this.IntendedUse).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Scope")) stepString = stepString.concat("*,");
		else{
		if(this.Scope != null)		stepString = stepString.concat(((RootInterface)this.Scope).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Revision")) stepString = stepString.concat("*,");
		else{
		if(this.Revision != null)		stepString = stepString.concat(((RootInterface)this.Revision).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DocumentOwner")) stepString = stepString.concat("*,");
		else{
		if(this.DocumentOwner != null)		stepString = stepString.concat(((RootInterface)this.DocumentOwner).getStepParameter(IfcActorSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Editors")) stepString = stepString.concat("*,");
		else{
		if(this.Editors != null)		stepString = stepString.concat(((RootInterface)this.Editors).getStepParameter(IfcActorSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CreationTime")) stepString = stepString.concat("*,");
		else{
		if(this.CreationTime != null)		stepString = stepString.concat(((RootInterface)this.CreationTime).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LastRevisionTime")) stepString = stepString.concat("*,");
		else{
		if(this.LastRevisionTime != null)		stepString = stepString.concat(((RootInterface)this.LastRevisionTime).getStepParameter(IfcDateTime.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ElectronicFormat")) stepString = stepString.concat("*,");
		else{
		if(this.ElectronicFormat != null)		stepString = stepString.concat(((RootInterface)this.ElectronicFormat).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ValidFrom")) stepString = stepString.concat("*,");
		else{
		if(this.ValidFrom != null)		stepString = stepString.concat(((RootInterface)this.ValidFrom).getStepParameter(IfcDate.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ValidUntil")) stepString = stepString.concat("*,");
		else{
		if(this.ValidUntil != null)		stepString = stepString.concat(((RootInterface)this.ValidUntil).getStepParameter(IfcDate.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Confidentiality")) stepString = stepString.concat("*,");
		else{
		if(this.Confidentiality != null)		stepString = stepString.concat(((RootInterface)this.Confidentiality).getStepParameter(IfcDocumentConfidentialityEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Status")) stepString = stepString.concat("*);");
		else{
		if(this.Status != null)		stepString = stepString.concat(((RootInterface)this.Status).getStepParameter(IfcDocumentStatusEnum.class.isInterface())+");");
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
	* This method returns a copy of the set of the DocumentInfoForObjects_Inverse attribute.
	*
	* @return a copy of the DocumentInfoForObjects_Inverse set
	**/
	public SET<IfcRelAssociatesDocument> getDocumentInfoForObjects_Inverse()
	{
		if(this.DocumentInfoForObjects_Inverse != null)
			return new SET<IfcRelAssociatesDocument>(this.DocumentInfoForObjects_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the HasDocumentReferences_Inverse attribute.
	*
	* @return a copy of the HasDocumentReferences_Inverse set
	**/
	public SET<IfcDocumentReference> getHasDocumentReferences_Inverse()
	{
		if(this.HasDocumentReferences_Inverse != null)
			return new SET<IfcDocumentReference>(this.HasDocumentReferences_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the IsPointedTo_Inverse attribute.
	*
	* @return a copy of the IsPointedTo_Inverse set
	**/
	public SET<IfcDocumentInformationRelationship> getIsPointedTo_Inverse()
	{
		if(this.IsPointedTo_Inverse != null)
			return new SET<IfcDocumentInformationRelationship>(this.IsPointedTo_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the IsPointer_Inverse attribute.
	*
	* @return a copy of the IsPointer_Inverse set
	**/
	public SET<IfcDocumentInformationRelationship> getIsPointer_Inverse()
	{
		if(this.IsPointer_Inverse != null)
			return new SET<IfcDocumentInformationRelationship>(this.IsPointer_Inverse);
		return null;
	}

	/**
	* This method sets the Identification attribute to the given value.
	*
	* @param Identification OPTIONAL value to set
	**/
	public void setIdentification(IfcIdentifier Identification)
	{
		this.Identification = Identification;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Identification attribute.
	*
	* @return the value of Identification
	/**/
	public IfcIdentifier getIdentification()
	{
		return this.Identification;
	}

	/**
	* This method sets the Name attribute to the given value.
	*
	* @param Name OPTIONAL value to set
	**/
	public void setName(IfcLabel Name)
	{
		this.Name = Name;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Name attribute.
	*
	* @return the value of Name
	/**/
	public IfcLabel getName()
	{
		return this.Name;
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
	* This method sets the Location attribute to the given value.
	*
	* @param Location DEMANDED value to set - may not be null
	**/
	public void setLocation(IfcURIReference Location)
	{
		this.Location = Location;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Location attribute.
	*
	* @return the value of Location
	/**/
	public IfcURIReference getLocation()
	{
		return this.Location;
	}

	/**
	* This method sets the Purpose attribute to the given value.
	*
	* @param Purpose DEMANDED value to set - may not be null
	**/
	public void setPurpose(IfcText Purpose)
	{
		this.Purpose = Purpose;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Purpose attribute.
	*
	* @return the value of Purpose
	/**/
	public IfcText getPurpose()
	{
		return this.Purpose;
	}

	/**
	* This method sets the IntendedUse attribute to the given value.
	*
	* @param IntendedUse DEMANDED value to set - may not be null
	**/
	public void setIntendedUse(IfcText IntendedUse)
	{
		this.IntendedUse = IntendedUse;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the IntendedUse attribute.
	*
	* @return the value of IntendedUse
	/**/
	public IfcText getIntendedUse()
	{
		return this.IntendedUse;
	}

	/**
	* This method sets the Scope attribute to the given value.
	*
	* @param Scope DEMANDED value to set - may not be null
	**/
	public void setScope(IfcText Scope)
	{
		this.Scope = Scope;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Scope attribute.
	*
	* @return the value of Scope
	/**/
	public IfcText getScope()
	{
		return this.Scope;
	}

	/**
	* This method sets the Revision attribute to the given value.
	*
	* @param Revision DEMANDED value to set - may not be null
	**/
	public void setRevision(IfcLabel Revision)
	{
		this.Revision = Revision;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Revision attribute.
	*
	* @return the value of Revision
	/**/
	public IfcLabel getRevision()
	{
		return this.Revision;
	}

	/**
	* This method sets the DocumentOwner attribute to the given value.
	*
	* @param DocumentOwner DEMANDED value to set - may not be null
	**/
	public void setDocumentOwner(IfcActorSelect DocumentOwner)
	{
		this.DocumentOwner = DocumentOwner;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DocumentOwner attribute.
	*
	* @return the value of DocumentOwner
	/**/
	public IfcActorSelect getDocumentOwner()
	{
		return this.DocumentOwner;
	}

	/**
	* This method sets the Editors attribute to the given value.
	*
	* @param Editors DEMANDED value to set - may not be null
	**/
	public void setEditors(SET<IfcActorSelect> Editors)
	{
		this.Editors = Editors;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Editors attribute.
	*
	* @return a copy of the Editors set
	**/
	public SET<IfcActorSelect> getEditors()
	{
		if(this.Editors != null)
			return new SET<IfcActorSelect>(this.Editors);
		return null;
	}

	/**
	* This method adds an IfcActorSelect object to the Editors set.
	* @param Editors element to be appended to this set.
	**/
	public void addEditors(IfcActorSelect Editors)
	{
		if(this.Editors == null)
			this.Editors = new SET<IfcActorSelect>();
		this.Editors.add(Editors);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcActorSelect objects to the Editors set.
	* @param Editors collection containing elements to be added to this set.
	**/
	public void addAllEditors(java.util.Collection<IfcActorSelect> Editors)
	{
		if(this.Editors == null)
			this.Editors = new SET<IfcActorSelect>();
		this.Editors.addAll(Editors);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Editors set.
	**/
	public void clearEditors()
	{
		if(this.Editors != null)
		{
			this.Editors.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcActorSelect object from the Editors set.
	* @param Editors element to be removed from this set.
	**/
	public void removeEditors(IfcActorSelect Editors)
	{
		if(this.Editors != null)
		{
			this.Editors.remove(Editors);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcActorSelect objects from the Editors set.
	* @param Editors collection containing elements to be removed from this set.
	**/
	public void removeAllEditors(java.util.Collection<IfcActorSelect> Editors)
	{
		if(this.Editors != null)
		{
			this.Editors.removeAll(Editors);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the CreationTime attribute to the given value.
	*
	* @param CreationTime DEMANDED value to set - may not be null
	**/
	public void setCreationTime(IfcDateTime CreationTime)
	{
		this.CreationTime = CreationTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CreationTime attribute.
	*
	* @return the value of CreationTime
	/**/
	public IfcDateTime getCreationTime()
	{
		return this.CreationTime;
	}

	/**
	* This method sets the LastRevisionTime attribute to the given value.
	*
	* @param LastRevisionTime DEMANDED value to set - may not be null
	**/
	public void setLastRevisionTime(IfcDateTime LastRevisionTime)
	{
		this.LastRevisionTime = LastRevisionTime;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LastRevisionTime attribute.
	*
	* @return the value of LastRevisionTime
	/**/
	public IfcDateTime getLastRevisionTime()
	{
		return this.LastRevisionTime;
	}

	/**
	* This method sets the ElectronicFormat attribute to the given value.
	*
	* @param ElectronicFormat DEMANDED value to set - may not be null
	**/
	public void setElectronicFormat(IfcIdentifier ElectronicFormat)
	{
		this.ElectronicFormat = ElectronicFormat;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ElectronicFormat attribute.
	*
	* @return the value of ElectronicFormat
	/**/
	public IfcIdentifier getElectronicFormat()
	{
		return this.ElectronicFormat;
	}

	/**
	* This method sets the ValidFrom attribute to the given value.
	*
	* @param ValidFrom DEMANDED value to set - may not be null
	**/
	public void setValidFrom(IfcDate ValidFrom)
	{
		this.ValidFrom = ValidFrom;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ValidFrom attribute.
	*
	* @return the value of ValidFrom
	/**/
	public IfcDate getValidFrom()
	{
		return this.ValidFrom;
	}

	/**
	* This method sets the ValidUntil attribute to the given value.
	*
	* @param ValidUntil DEMANDED value to set - may not be null
	**/
	public void setValidUntil(IfcDate ValidUntil)
	{
		this.ValidUntil = ValidUntil;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ValidUntil attribute.
	*
	* @return the value of ValidUntil
	/**/
	public IfcDate getValidUntil()
	{
		return this.ValidUntil;
	}

	/**
	* This method sets the Confidentiality attribute to the given value.
	*
	* @param Confidentiality DEMANDED value to set - may not be null
	**/
	public void setConfidentiality(IfcDocumentConfidentialityEnum Confidentiality)
	{
		this.Confidentiality = Confidentiality;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Confidentiality attribute.
	*
	* @return the value of Confidentiality
	/**/
	public IfcDocumentConfidentialityEnum getConfidentiality()
	{
		return this.Confidentiality;
	}

	/**
	* This method sets the Status attribute to the given value.
	*
	* @param Status DEMANDED value to set - may not be null
	**/
	public void setStatus(IfcDocumentStatusEnum Status)
	{
		this.Status = Status;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Status attribute.
	*
	* @return the value of Status
	/**/
	public IfcDocumentStatusEnum getStatus()
	{
		return this.Status;
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
		IfcDocumentInformation ifcDocumentInformation = new IfcDocumentInformation();
		if(this.Identification != null)
			ifcDocumentInformation.setIdentification((IfcIdentifier)this.Identification.clone());
		if(this.Name != null)
			ifcDocumentInformation.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcDocumentInformation.setDescription((IfcText)this.Description.clone());
		if(this.Location != null)
			ifcDocumentInformation.setLocation((IfcURIReference)this.Location.clone());
		if(this.Purpose != null)
			ifcDocumentInformation.setPurpose((IfcText)this.Purpose.clone());
		if(this.IntendedUse != null)
			ifcDocumentInformation.setIntendedUse((IfcText)this.IntendedUse.clone());
		if(this.Scope != null)
			ifcDocumentInformation.setScope((IfcText)this.Scope.clone());
		if(this.Revision != null)
			ifcDocumentInformation.setRevision((IfcLabel)this.Revision.clone());
		if(this.DocumentOwner != null)
			ifcDocumentInformation.setDocumentOwner((IfcActorSelect)this.DocumentOwner.clone());
		if(this.Editors != null)
			ifcDocumentInformation.setEditors((SET<IfcActorSelect>)this.Editors.clone());
		if(this.CreationTime != null)
			ifcDocumentInformation.setCreationTime((IfcDateTime)this.CreationTime.clone());
		if(this.LastRevisionTime != null)
			ifcDocumentInformation.setLastRevisionTime((IfcDateTime)this.LastRevisionTime.clone());
		if(this.ElectronicFormat != null)
			ifcDocumentInformation.setElectronicFormat((IfcIdentifier)this.ElectronicFormat.clone());
		if(this.ValidFrom != null)
			ifcDocumentInformation.setValidFrom((IfcDate)this.ValidFrom.clone());
		if(this.ValidUntil != null)
			ifcDocumentInformation.setValidUntil((IfcDate)this.ValidUntil.clone());
		if(this.Confidentiality != null)
			ifcDocumentInformation.setConfidentiality((IfcDocumentConfidentialityEnum)this.Confidentiality.clone());
		if(this.Status != null)
			ifcDocumentInformation.setStatus((IfcDocumentStatusEnum)this.Status.clone());
		return ifcDocumentInformation;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcDocumentInformation ifcDocumentInformation = new IfcDocumentInformation();
		if(this.Identification != null)
			ifcDocumentInformation.setIdentification(this.Identification);
		if(this.Name != null)
			ifcDocumentInformation.setName(this.Name);
		if(this.Description != null)
			ifcDocumentInformation.setDescription(this.Description);
		if(this.Location != null)
			ifcDocumentInformation.setLocation(this.Location);
		if(this.Purpose != null)
			ifcDocumentInformation.setPurpose(this.Purpose);
		if(this.IntendedUse != null)
			ifcDocumentInformation.setIntendedUse(this.IntendedUse);
		if(this.Scope != null)
			ifcDocumentInformation.setScope(this.Scope);
		if(this.Revision != null)
			ifcDocumentInformation.setRevision(this.Revision);
		if(this.DocumentOwner != null)
			ifcDocumentInformation.setDocumentOwner(this.DocumentOwner);
		if(this.Editors != null)
			ifcDocumentInformation.setEditors(this.Editors);
		if(this.CreationTime != null)
			ifcDocumentInformation.setCreationTime(this.CreationTime);
		if(this.LastRevisionTime != null)
			ifcDocumentInformation.setLastRevisionTime(this.LastRevisionTime);
		if(this.ElectronicFormat != null)
			ifcDocumentInformation.setElectronicFormat(this.ElectronicFormat);
		if(this.ValidFrom != null)
			ifcDocumentInformation.setValidFrom(this.ValidFrom);
		if(this.ValidUntil != null)
			ifcDocumentInformation.setValidUntil(this.ValidUntil);
		if(this.Confidentiality != null)
			ifcDocumentInformation.setConfidentiality(this.Confidentiality);
		if(this.Status != null)
			ifcDocumentInformation.setStatus(this.Status);
		return ifcDocumentInformation;
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
