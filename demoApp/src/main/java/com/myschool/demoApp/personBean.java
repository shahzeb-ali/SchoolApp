package com.myschool.demoApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="dbs_tab_person")
public class personBean {
	/**
	 * @return the personID
	 */
	public int getPersonID() {
		return person_ID;
	}
	/**
	 * @param personID the personID to set
	 */
	
	public void setPersonID(int personID) {
		this.person_ID = personID;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return first_Name;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.first_Name = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return last_Name;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.last_Name = lastName;
	}
	/**
	 * @return the phoneNr
	 */
	public int getPhoneNr() {
		return phone_Nr;
	}
	/**
	 * @param phoneNr the phoneNr to set
	 */
	public void setPhoneNr(int phoneNr) {
		this.phone_Nr = phoneNr;
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
	
	@Id
	private int person_ID;
	private String first_Name;
	private String last_Name;
	private int phone_Nr;
	private String address;
	
}
