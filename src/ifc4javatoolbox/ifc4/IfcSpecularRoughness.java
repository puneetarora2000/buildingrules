/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity IfcSpecularRoughness<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSpecularRoughness extends DOUBLE implements TypeInterface, IfcSpecularHighlightSelect
{
	/**
 * The default constructor for the type object IfcSpecularRoughness.
**/
	public IfcSpecularRoughness(){super();}

	/**
 * Constructs a new IfcSpecularRoughness type object using the given parameter.
	 * @param value the value
	**/
	public IfcSpecularRoughness(DOUBLE value)
	{
		this.setValue(value);
	}
	public IfcSpecularRoughness(double value)
	{
		this.setValue(value);
	}
/**
 * This method sets the value of this type object.

 * The value to set must an instance of DOUBLE
 * @param value the value to set
**/	public void setValue(Object value)
	{
	super.setValue((DOUBLE)value);
	}	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{		IfcSpecularRoughness fcSpecularRoughness = new IfcSpecularRoughness();
		fcSpecularRoughness.setValue(super.clone());
		return fcSpecularRoughness;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		if(isSelectType) return new String("IFCSPECULARROUGHNESS("+super.getStepParameter(false)+")");
		else return super.getStepParameter(false);
	}


}
