package com.insurance.quote.entity;


public class User_Role {
	
	private String user_Name;
	private String password;
	private String role_Code;
public User_Role() {
	
}
public User_Role(String user_Name, String password, String role_Code)
{
	super();
	this.user_Name = user_Name;
	this.password = password;
	this.role_Code = role_Code;
}
public String getUser_Name() {
	return user_Name;
}
public void setUser_Name(String user_Name) {
	this.user_Name = user_Name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole_Code() {
	return role_Code;
}
public void setRole_Code(String role_Code) {
	this.role_Code = role_Code;
}

}
