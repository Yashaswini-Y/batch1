package com.insurance.quote.entity;


public class Accounts {
	
	private long account_Number;
	private String insured_Name;
	private String insured_Street;
	private String insured_City;
	private String insured_State;
	private int insured_Zip;
	private String business_Segment;
	private String user_Name;
public Accounts() {
	
}
public Accounts(long account_Number, String insured_Name, String insured_Street, String insured_City, String insured_State,int insured_Zip,String business_Segment, String user_Name )
{
	super();
	this.account_Number = account_Number;
	this.insured_Name = insured_Name;
	this.insured_Street = insured_Street;
	this.insured_City = insured_City;
	this.insured_State = insured_State;
	this.insured_Zip = insured_Zip;
	this.business_Segment = business_Segment;
	this.user_Name = user_Name;
}
public long getAccount_Number() {
	return account_Number;
}
public void setAccount_Number(long account_Number) {
	this.account_Number = account_Number;
}
public String getInsured_Name() {
	return insured_Name;
}
public void setInsured_Name(String insured_Name) {
	this.insured_Name = insured_Name;
}
public String getInsured_Street() {
	return insured_Street;
}
public void setInsured_Street(String insured_Street) {
	this.insured_Street = insured_Street;
}
public String getInsured_City() {
	return insured_City;
}
public void setInsured_City(String insured_City) {
	this.insured_City = insured_City;
}
public String getInsured_State() {
	return insured_State;
}
public void setInsured_State(String insured_State) {
	this.insured_State = insured_State;
}
public int getInsured_Zip() {
	return insured_Zip;
}
public void setInsured_Zip(int insured_Zip) {
	this.insured_Zip = insured_Zip;
}
public String getBusiness_Segment() {
	return business_Segment;
}
public void setBusiness_Segment(String business_Segment) {
	this.business_Segment = business_Segment;
}
public String getUser_Name() {
	return user_Name;
}
public void setUser_Name(String user_Name) {
	this.user_Name = user_Name;
}

}