package com.nt.boot.examle3;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mx_regmtb")
public class MX_REGMTB {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "unique_id")
	private long uniqueId;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "pass_count")
	private int pass_Count;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "last_login_time")
	private Date lastLoginTime;
	
	@Column(name = "last_logout_time")
	private Date lastLogoutTime;
	
	@Column(name = "login_flag")
	private String loginFlag;

	public MX_REGMTB() {

	}

	public MX_REGMTB(long uniqueId, String userId, String password, int pass_Count, Date dob, Date lastLoginTime,
			Date lastLogoutTime, String loginFlag) {
		super();
		this.uniqueId = uniqueId;
		this.userId = userId;
		this.password = password;
		this.pass_Count = pass_Count;
		this.dob = dob;
		this.lastLoginTime = lastLoginTime;
		this.lastLogoutTime = lastLogoutTime;
		this.loginFlag = loginFlag;
	}

	public long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(long uniqueId) {
		this.uniqueId = uniqueId;
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

	public int getPass_Count() {
		return pass_Count;
	}

	public void setPass_Count(int pass_Count) {
		this.pass_Count = pass_Count;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLogoutTime() {
		return lastLogoutTime;
	}

	public void setLastLogoutTime(Date lastLogoutTime) {
		this.lastLogoutTime = lastLogoutTime;
	}

	public String getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	@Override
	public String toString() {
		return "MX_REGMTB [uniqueId=" + uniqueId + ", userId=" + userId + ", password=" + password + ", pass_Count="
				+ pass_Count + ", dob=" + dob + ", lastLoginTime=" + lastLoginTime + ", lastLogoutTime="
				+ lastLogoutTime + ", loginFlag=" + loginFlag + "]";
	}

	

}
