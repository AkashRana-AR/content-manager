package com.example.demo.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank(message="User Name can not be empty !!")
	@Size(min=1, max=5, message="User Name size must be between 1 to 5 characters !!")
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", password=" + password + "]";
	}

	public LoginData(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

}
