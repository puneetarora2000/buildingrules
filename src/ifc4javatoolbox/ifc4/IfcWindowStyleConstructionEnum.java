/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the enumeration type IfcWindowStyleConstructionEnum<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcWindowStyleConstructionEnum extends ENUM implements TypeInterface
{
	/**
 * The default constructor for the enumeration object IfcWindowStyleConstructionEnum.
**/
	public IfcWindowStyleConstructionEnum(){}

	/**
 * Constructs a new IfcWindowStyleConstructionEnum enumeration object using the given parameter.
	**/
	public IfcWindowStyleConstructionEnum(java.lang.String value)
	{
	this.value = IfcWindowStyleConstructionEnum_internal.valueOf(value);
	}
	/**
	* This method sets the value of this enumeration type.
	* The value has to be of type IfcWindowStyleConstructionEnum_internal.
	* @param value the value to set
	*/
	public void setValue(Object value)
	{
		this.value = (IfcWindowStyleConstructionEnum_internal)value;
	}
	/**
	* This method sets the value of this enumeration taken from a String.
	* The String must be one of: "ALUMINIUM", "HIGH_GRADE_STEEL", "STEEL", "WOOD", "ALUMINIUM_WOOD", "PLASTIC", "OTHER_CONSTRUCTION", "NOTDEFINED".
	*
	* @param value the value to set
	*/
	public void setValue(String value)
	{
		this.value = IfcWindowStyleConstructionEnum_internal.valueOf(value);
	}
	/**
	 * This method clones the enumeration object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{		IfcWindowStyleConstructionEnum fcWindowStyleConstructionEnum = new IfcWindowStyleConstructionEnum();
		fcWindowStyleConstructionEnum.setValue(this.value);
		return fcWindowStyleConstructionEnum;
	}

	public static enum IfcWindowStyleConstructionEnum_internal
	{
		ALUMINIUM,
		HIGH_GRADE_STEEL,
		STEEL,
		WOOD,
		ALUMINIUM_WOOD,
		PLASTIC,
		OTHER_CONSTRUCTION,
		NOTDEFINED
	}	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		if(isSelectType) return new String("IFCWINDOWSTYLECONSTRUCTIONENUM("+super.getStepParameter(false)+")");
		else return super.getStepParameter(false);
	}


}