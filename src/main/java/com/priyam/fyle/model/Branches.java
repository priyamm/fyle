/**
 * 
 */
package com.priyam.fyle.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author priyamgupta
 *
 */
@Entity
@Table(name = "branches")
public class Branches {
	@Id
	private String ifsc;
	private Long bank_id;
	private String branch;
	private String address;
	private String city;
	private String discrict;
	private String state;

	/**
	 * @return the ifsc
	 */
	public String getIfsc() {
		return ifsc;
	}
	/**
	 * @param ifsc the ifsc to set
	 */
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	/**
	 * @return the bank_id
	 */
	public Long getBank_id() {
		return bank_id;
	}
	/**
	 * @param bank_id the bank_id to set
	 */
	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the discrict
	 */
	public String getDiscrict() {
		return discrict;
	}
	/**
	 * @param discrict the discrict to set
	 */
	public void setDiscrict(String discrict) {
		this.discrict = discrict;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
}
