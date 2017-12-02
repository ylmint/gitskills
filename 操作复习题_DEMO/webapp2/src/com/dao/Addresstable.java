package com.dao;

/**
 * Addresstable entity. @author MyEclipse Persistence Tools
 */

public class Addresstable implements java.io.Serializable {

	// Fields

	private Integer id;
	private String firstname;
	private String phone;
	private String email;

	// Constructors

	/** default constructor */
	public Addresstable() {
	}

	/** full constructor */
	public Addresstable(String firstname, String phone, String email) {
		this.firstname = firstname;
		this.phone = phone;
		this.email = email;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}