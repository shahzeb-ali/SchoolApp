package com.myschool.demoApp;

public class PersonBean {
	/**
	 * @return the personID
	 */
	public int getPersonID() {
		return personID;
	}
	/**
	 * @param personID the personID to set
	 */
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phoneNr
	 */
	public Long getPhoneNr() {
		return phoneNr;
	}
	/**
	 * @param phoneNr the phoneNr to set
	 */
	public void setPhoneNr(Long phoneNr) {
		this.phoneNr = phoneNr;
	}
	private int personID;
	private String firstName;
	private String lastName;
	private Long phoneNr;
	
	
	
	
}
