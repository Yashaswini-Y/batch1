package com.insurance.quote.entity;


public class User_Role {
	
	private String User_Name;
	private String Password;
	private String Role_Code;
public User_Role() {
	
}
public User_Role(String User_Name, String Password, String Role_Code)
{
	super();
	this.User_Name = User_Name;
	this.Password = Password;
	this.Role_Code = Role_Code;
}
public String getUser_Name() {
	return User_Name;
}
public void setUser_Name(String user_Name) {
	User_Name = user_Name;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getRole_Code() {
	return Role_Code;
}
public void setRole_Code(String role_Code) {
	Role_Code = role_Code;
}

}
