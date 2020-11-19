package com.insurance.quote.entity;


public class Accounts {
	
	private int Account_Number;
	private String Insured_Name;
	private String Insured_Street;
	private String Insured_City;
	private String Insured_State;
	private int Insured_Zip;
	private String Business_Segment;
	private String User_Name;
public Accounts() {
	
}
public Accounts(int Account_Number, String Insured_Name, String Insured_Street, String Insured_City, String Insured_State,int Insured_Zip,String Business_Segment, String User_Name )
{
	super();
	this.Account_Number = Account_Number;
	this.Insured_Name = Insured_Name;
	this.Insured_Street = Insured_Street;
	this.Insured_City = Insured_City;
	this.Insured_State = Insured_State;
	this.Insured_Zip = Insured_Zip;
	this.Business_Segment = Business_Segment;
	this.User_Name = User_Name;
}
public int getAccount_Number() {
	return Account_Number;
}
public void setAccount_Number(int account_Number) {
	Account_Number = account_Number;
}
public String getInsured_Name() {
	return Insured_Name;
}
public void setInsured_Name(String insured_Name) {
	Insured_Name = insured_Name;
}
public String getInsured_Street() {
	return Insured_Street;
}
public void setInsured_Street(String insured_Street) {
	Insured_Street = insured_Street;
}
public String getInsured_City() {
	return Insured_City;
}
public void setInsured_City(String insured_City) {
	Insured_City = insured_City;
}
public String getInsured_State() {
	return Insured_State;
}
public void setInsured_State(String insured_State) {
	Insured_State = insured_State;
}
public int getInsured_Zip() {
	return Insured_Zip;
}
public void setInsured_Zip(int insured_Zip) {
	Insured_Zip = insured_Zip;
}
public String getBusiness_Segment() {
	return Business_Segment;
}
public void setBusiness_Segment(String business_Segment) {
	Business_Segment = business_Segment;
}
public String getUser_Name() {
	return User_Name;
}
public void setUser_Name(String user_Name) {
	User_Name = user_Name;
}

}