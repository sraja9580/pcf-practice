package com.fmcd.pcf.demo.limits.limits;


public class Limits {
	private String lower;	
	private String upper;
	private String messageFrom;
	private String lowerLimitEnv;
	private String middleLimitEnv;
	
	
	
	public Limits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Limits(String lower, String upper,String messageFrom) {
		super();
		this.lower = lower;		
		this.upper = upper;
		this.messageFrom = messageFrom;
	}

	public Limits(String lower,  String upper, String messageFrom,String lowerLimitEnv, String middleLimitEnv) {
		super();
		this.lower = lower;		
		this.upper = upper;
		this.messageFrom = messageFrom;
		this.lowerLimitEnv = lowerLimitEnv;
		this.middleLimitEnv = middleLimitEnv;
	}
	
	public String getLower() {
		return lower;
	}
	public void setLower(String lower) {
		this.lower = lower;
	}
	public String getMiddle() {
		return  messageFrom;
	}
	public void setMiddle(String messageFrom) {
		this.messageFrom = messageFrom;
	}
	public String getUpper() {
		return upper;
	}
	public void setUpper(String upper) {
		this.upper = upper;
	}
	public String getLowerLimitEnv() {
		return lowerLimitEnv;
	}
	public void setLowerLimitEnv(String lowerLimitEnv) {
		this.lowerLimitEnv = lowerLimitEnv;
	}
	public String getMiddleLimitEnv() {
		return middleLimitEnv;
	}
	public void setMiddleLimitEnv(String middleLimitEnv) {
		this.middleLimitEnv = middleLimitEnv;
	}
	
	
}
