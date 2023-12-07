package com.demo.microservices.model;

public class SampleUser {
	private String userId;
	private String userNm;
	private String addr;
	private String cellPhone;
	private String agreeInform;
	private String birthDt;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getAgreeInform() {
		return agreeInform;
	}

	public void setAgreeInform(String agreeInform) {
		this.agreeInform = agreeInform;
	}

	public String getBirthDt() {
		return birthDt;
	}

	public void setBirthDt(String birthDt) {
		this.birthDt = birthDt;
	}
}
