/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcCompositeProfileDef<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCompositeProfileDef extends IfcProfileDef implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileTypeEnum","IfcLabel","SET<IfcProfileDef>","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Profiles is an DEMANDED attribute - may not be null**/
	protected SET<IfcProfileDef> Profiles;
	/** Label is an OPTIONAL attribute**/
	protected IfcLabel Label;
	/**
	* The default constructor.
	**/
	public IfcCompositeProfileDef(){}

	/**
	* Constructs a new IfcCompositeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Profiles DEMANDED parameter of type SET<IfcProfileDef> - may not be null.
	* @param Label OPTIONAL parameter of type IfcLabel
	**/
	public IfcCompositeProfileDef(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, SET<IfcProfileDef> Profiles, IfcLabel Label)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Profiles = Profiles;
		this.Label = Label;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCompositeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Profiles DEMANDED parameter of type SET<IfcProfileDef> - may not be null.
	* @param Label OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, SET<IfcProfileDef> Profiles, IfcLabel Label)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Profiles = Profiles;
		this.Label = Label;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ProfileType = (IfcProfileTypeEnum) parameters.get(0);
		this.ProfileName = (IfcLabel) parameters.get(1);
		this.Profiles = (SET<IfcProfileDef>) parameters.get(2);
		this.Label = (IfcLabel) parameters.get(3);
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
		return IfcCompositeProfileDef.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCOMPOSITEPROFILEDEF(");
		if(getRedefinedDerivedAttributeTypes().contains("ProfileType")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileType != null)		stepString = stepString.concat(((RootInterface)this.ProfileType).getStepParameter(IfcProfileTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProfileName")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileName != null)		stepString = stepString.concat(((RootInterface)this.ProfileName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Profiles")) stepString = stepString.concat("*,");
		else{
		if(this.Profiles != null)		stepString = stepString.concat(((RootInterface)this.Profiles).getStepParameter(IfcProfileDef.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Label")) stepString = stepString.concat("*);");
		else{
		if(this.Label != null)		stepString = stepString.concat(((RootInterface)this.Label).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method sets the Profiles attribute to the given value.
	*
	* @param Profiles OPTIONAL value to set
	**/
	public void setProfiles(SET<IfcProfileDef> Profiles)
	{
		this.Profiles = Profiles;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Profiles attribute.
	*
	* @return a copy of the Profiles set
	**/
	public SET<IfcProfileDef> getProfiles()
	{
		if(this.Profiles != null)
			return new SET<IfcProfileDef>(this.Profiles);
		return null;
	}

	/**
	* This method adds an IfcProfileDef object to the Profiles set.
	* @param Profiles element to be appended to this set.
	**/
	public void addProfiles(IfcProfileDef Profiles)
	{
		if(this.Profiles == null)
			this.Profiles = new SET<IfcProfileDef>();
		this.Profiles.add(Profiles);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcProfileDef objects to the Profiles set.
	* @param Profiles collection containing elements to be added to this set.
	**/
	public void addAllProfiles(java.util.Collection<IfcProfileDef> Profiles)
	{
		if(this.Profiles == null)
			this.Profiles = new SET<IfcProfileDef>();
		this.Profiles.addAll(Profiles);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Profiles set.
	**/
	public void clearProfiles()
	{
		if(this.Profiles != null)
		{
			this.Profiles.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcProfileDef object from the Profiles set.
	* @param Profiles element to be removed from this set.
	**/
	public void removeProfiles(IfcProfileDef Profiles)
	{
		if(this.Profiles != null)
		{
			this.Profiles.remove(Profiles);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcProfileDef objects from the Profiles set.
	* @param Profiles collection containing elements to be removed from this set.
	**/
	public void removeAllProfiles(java.util.Collection<IfcProfileDef> Profiles)
	{
		if(this.Profiles != null)
		{
			this.Profiles.removeAll(Profiles);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Label attribute to the given value.
	*
	* @param Label DEMANDED value to set - may not be null
	**/
	public void setLabel(IfcLabel Label)
	{
		this.Label = Label;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Label attribute.
	*
	* @return the value of Label
	/**/
	public IfcLabel getLabel()
	{
		return this.Label;
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
		IfcCompositeProfileDef ifcCompositeProfileDef = new IfcCompositeProfileDef();
		if(this.ProfileType != null)
			ifcCompositeProfileDef.setProfileType((IfcProfileTypeEnum)this.ProfileType.clone());
		if(this.ProfileName != null)
			ifcCompositeProfileDef.setProfileName((IfcLabel)this.ProfileName.clone());
		if(this.Profiles != null)
			ifcCompositeProfileDef.setProfiles((SET<IfcProfileDef>)this.Profiles.clone());
		if(this.Label != null)
			ifcCompositeProfileDef.setLabel((IfcLabel)this.Label.clone());
		return ifcCompositeProfileDef;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCompositeProfileDef ifcCompositeProfileDef = new IfcCompositeProfileDef();
		if(this.ProfileType != null)
			ifcCompositeProfileDef.setProfileType(this.ProfileType);
		if(this.ProfileName != null)
			ifcCompositeProfileDef.setProfileName(this.ProfileName);
		if(this.Profiles != null)
			ifcCompositeProfileDef.setProfiles(this.Profiles);
		if(this.Label != null)
			ifcCompositeProfileDef.setLabel(this.Label);
		return ifcCompositeProfileDef;
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
