/**
 * 
 */
package com.priyam.fyle.helpers;

import com.priyam.fyle.model.StatusCode;

/**
 * @author priyamgupta
 *
 */
public class ResponseCode {
	private Object data;
	private Boolean success;
	private Integer status;
	private String message;

	/**
	 * 
	 */
	public ResponseCode() {
		this.success = Boolean.FALSE;
		this.status = StatusCode.SERVER_ERROR.getValue();
		this.message = "Oops, something went wrong!";
	}

	public ResponseCode(Object data, Integer status, Boolean success, String message) {
		this.data = data;
		this.status = status;
		this.success = success;
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}
