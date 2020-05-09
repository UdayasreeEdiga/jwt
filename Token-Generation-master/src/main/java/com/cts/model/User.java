package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="This is the User Model")
@Entity
@Table(name="User")
public class User {

	@ApiModelProperty(value="A unique key for each User")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="u_Id")
	private Integer userId;
	@ApiModelProperty(value="User firstName for UserDetails")
	@Column(name="firstName")
	private String firstName;
	@ApiModelProperty(value="User lastName for UserDetails")
	@Column(name="lastName")
	private String lastName;
	@ApiModelProperty(value="User email for UserDetails")
	@Column(name="email")
	private String email;
	@ApiModelProperty(value="User password for UserDetails")
	@Column(name="password")
	private String password;

	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
