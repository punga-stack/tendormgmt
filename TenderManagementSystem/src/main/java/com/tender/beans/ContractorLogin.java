package com.tender.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ContractorLogin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer loginId;
	@NotEmpty(message="Enter Valid username")
	private String username;
	@NotEmpty(message="Enter Valid  password")
	private String password;
	public Integer getLoginId() {
		return loginId;
	}
	
	public ContractorLogin() {
		// TODO Auto-generated constructor stub
	}
	
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ContractorLogin(Integer loginId, String username, String password) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "ContractorLogin [loginId=" + loginId + ", username=" + username + ", password=" + password + "]";
	}
	
}
