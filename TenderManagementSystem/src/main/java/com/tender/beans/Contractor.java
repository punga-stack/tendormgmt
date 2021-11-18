package com.tender.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="contractor")
public class Contractor {
	
	@Id
	private Integer conId;
	@NotEmpty(message="Name is mandatory")
	private String conName;
	@NotEmpty(message="Company Name is mandatory")
	private String companyName;
	@NotEmpty(message="Address is mandatory")
	private String address;
	@NotEmpty(message="Phone No is mandatory")
	private String conPhoneno;
	@NotEmpty(message="Email is mandatory")
	private String conEmail;
	@NotEmpty(message="UserName is mandatory")
	private String conUsername;
	@NotEmpty(message="Password is mandatory")
	private String conPassword;
	
	public Contractor() {
		// TODO Auto-generated constructor stub
	}

	public Integer getConId() {
		return conId;
	}

	public void setConId(Integer conId) {
		this.conId = conId;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getConPhoneno() {
		return conPhoneno;
	}

	public void setConPhoneno(String conPhoneno) {
		this.conPhoneno = conPhoneno;
	}

	public String getConEmail() {
		return conEmail;
	}

	public void setConEmail(String conEmail) {
		this.conEmail = conEmail;
	}

	public String getConUsername() {
		return conUsername;
	}

	public void setConUsername(String conUsername) {
		this.conUsername = conUsername;
	}

	public String getConPassword() {
		return conPassword;
	}

	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}

	public Contractor(Integer conId, String conName, String companyName, String address, String conPhoneno,
			String conEmail, String conUsername, String conPassword) {
		super();
		this.conId = conId;
		this.conName = conName;
		this.companyName = companyName;
		this.address = address;
		this.conPhoneno = conPhoneno;
		this.conEmail = conEmail;
		this.conUsername = conUsername;
		this.conPassword = conPassword;
	}

	@Override
	public String toString() {
		return "\nContractor Id : " + conId + "\n Contractor Name : " + conName + "\nCompanyName : " + companyName + "\nAddress : "
				+ address + "\nPhoneno : " + conPhoneno + "\nEmail : " + conEmail + "\nUsername : " + conUsername
				+ "\nPassword : " + conPassword ;
	}
	
	

}
