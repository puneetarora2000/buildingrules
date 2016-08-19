/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.ifc4;
/**
 * This is a default implementation of the entity SchemaName<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class SchemaName extends STRING implements TypeInterface
{
	/**
 * The default constructor for the type object SchemaName.
**/
	public SchemaName(){super();}

	/**
 * Constructs a new SchemaName type object using the given parameter.
	 * @param value the value
	**/
	public SchemaName(STRING value)
	{
		this.setValue(value);
	}
	/**
  * Constructs a new SchemaName object using the given value. The value
	 * will be either decoded or not decoded depending on the second boolean parameter isDecoded.
	 *
	 * @param value the value
	 * @param isDecoded set to true, if the given value is already decoded like "T�r"
	 *            set to false, if the given value has to be decoded according to ISO-10303-21
	 *            (�6.3.3.1-�6.3.3.3) like "T\S\|r"
	**/
	public SchemaName(String value, boolean isDecoded)
	{
		super(value, isDecoded);
	}
/**
 * This method sets the value of this type object.

 * The value to set must an instance of STRING
 * @param value the value to set
**/	public void setValue(Object value)
	{
	super.setValue((STRING)value);
	}	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{		SchemaName chemaName = new SchemaName();
		chemaName.setValue(super.clone());
		return chemaName;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		if(isSelectType) return new String("SCHEMANAME("+super.getStepParameter(false)+")");
		else return super.getStepParameter(false);
	}


}
