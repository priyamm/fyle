/**
 * 
 */
package com.priyam.fyle.model;

/**
 * @author priyamgupta
 *
 */
public enum StatusCode {
	SERVER_ERROR(5000), RECORD_FETCHED(3000), INVALID_INPUT(3001);
	Integer value;

	StatusCode(Integer i) {
		this.value = i;
	}

	/**
	 * @return the i
	 */
	public Integer getValue() {
		return value;
	}

}
