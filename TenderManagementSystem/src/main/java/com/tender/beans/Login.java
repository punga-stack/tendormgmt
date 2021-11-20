package com.tender.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer loginId;
	@NotEmpty(message="Enter Valid username")
	private String username;
	@NotEmpty(message="Enter Valid  password")
	private String password;
	@NotEmpty(message = "Must select the details")
	private String loginAs;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Integer getLoginId() {
		return loginId;
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

	public String getLoginAs() {
		return loginAs;
	}

	public void setLoginAs(String loginAs) {
		this.loginAs = loginAs;
	}

	public Login(Integer loginId, @NotEmpty(message = "Enter Valid username") String username,
			@NotEmpty(message = "Enter Valid  password") String password,
			@NotEmpty(message = "Must select the details") String loginAs) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.loginAs = loginAs;
	}

	@Override
	public String toString() {
		return "AdminLogin [loginId=" + loginId + ", username=" + username + ", password=" + password + ", loginAs="
				+ loginAs + "]";
	}

	
}