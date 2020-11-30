package com.bean;

public class User {
private String username,password,secQn,secAn;
	

	public User(String username, String password, String secQn, String secAn) {
		super();
		this.username = username;
		this.password = password;
		this.secQn = secQn;
		this.secAn = secAn;
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

	public String getSecQn() {
		return secQn;
	}

	public void setSecQn(String secQn) {
		this.secQn = secQn;
	}

	public String getSecAn() {
		return secAn;
	}

	public void setSecAn(String secAn) {
		this.secAn = secAn;
	}
	
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", secQn=" + secQn + ", secAn=" + secAn + "]";
	}
}


