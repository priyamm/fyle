/**
 * 
 */
package com.priyam.fyle.helpers;

/**
 * @author priyamgupta
 *
 */
public class FieldValidation {
	
	public static Boolean isValidInteger(Integer i) {
		if(i != null && i >= 0)
			return Boolean.TRUE;
		return Boolean.FALSE;
	}
	
	public static Boolean isValidString(String i) {
		if(i != null && !i.isEmpty())
			return Boolean.TRUE;
		return Boolean.FALSE;
	}
}
