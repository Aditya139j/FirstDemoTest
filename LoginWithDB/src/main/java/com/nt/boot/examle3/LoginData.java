package com.nt.boot.examle3;

public class LoginData {

	
	private String userId;
	private String password;
	public LoginData(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "InputData [userId=" + userId + ", password=" + password + "]";
	}
	
	
}
