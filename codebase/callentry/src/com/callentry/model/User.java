package com.callentry.model;

import com.callentry.util.GUIDGenerator;

public class User {

	private String userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private int userType;

	public User() {
		userId = GUIDGenerator.generateNewId();
	}

	public User(String userName, String firstName, String lastName,
			String password, int userType) {
		this();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		String userString = userId + ":" + userName + ":" + firstName + ":"
				+ lastName + ":" + userType;
		return userString;
	}
}
