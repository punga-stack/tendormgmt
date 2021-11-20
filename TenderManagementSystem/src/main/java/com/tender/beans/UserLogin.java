package com.tender.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserLogin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	private String username;
	private String pwd;
	
	public UserLogin() {
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public UserLogin(Integer userId, String username, String pwd) {
		super();
		this.userId = userId;
		this.username = username;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", username=" + username + ", pwd=" + pwd + "]";
	}
	
	

}
