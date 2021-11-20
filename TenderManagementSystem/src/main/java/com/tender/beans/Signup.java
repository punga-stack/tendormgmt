package com.tender.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Signup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sid;
	@NotEmpty(message="Name is mandatory")
	private String name;
	@NotEmpty(message="Jobrole is mandatory")
	private String jobrole;
	@NotEmpty(message="Gender is mandatory")
	private String gender;
	@NotNull(message="Age is mandatory")
	private Integer age;
	@NotEmpty(message="Email is mandatory")
	private String email;
	@NotEmpty(message="Phone No is mandatory")
	private String phoneno;
	@NotEmpty(message="Username is mandatory")
	private String susername;
	@NotEmpty(message="Password is mandatory")
	private String pwd;
	
	public Signup() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getSusername() {
		return susername;
	}

	public void setSusername(String susername) {
		this.susername = susername;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Signup(Integer sid, @NotEmpty(message = "Name is mandatory") String name,
			@NotEmpty(message = "Jobrole is mandatory") String jobrole,
			@NotEmpty(message = "Gender is mandatory") String gender,
			@NotNull(message = "Age is mandatory") Integer age, @NotEmpty(message = "Email is mandatory") String email,
			@NotEmpty(message = "Phone No is mandatory") String phoneno,
			@NotEmpty(message = "Username is mandatory") String susername,
			@NotEmpty(message = "Password is mandatory") String pwd) {
		super();
		this.sid = sid;
		this.name = name;
		this.jobrole = jobrole;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phoneno = phoneno;
		this.susername = susername;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Signup [sid=" + sid + ", name=" + name + ", jobrole=" + jobrole + ", gender=" + gender + ", age=" + age
				+ ", email=" + email + ", phoneno=" + phoneno + ", susername=" + susername + ", pwd=" + pwd + "]";
	}
	
	
	

}
