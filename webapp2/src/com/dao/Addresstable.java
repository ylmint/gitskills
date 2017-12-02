package com.dao;

/**
 * Addresstable entity. @author MyEclipse Persistence Tools
 */
public class Addresstable extends AbstractAddresstable implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Addresstable() {
	}

	/** full constructor */
	public Addresstable(String firstname, String phone, String email) {
		super(firstname, phone, email);
	}

}
