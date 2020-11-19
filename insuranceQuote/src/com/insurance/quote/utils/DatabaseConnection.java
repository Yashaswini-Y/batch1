package com.insurance.quote.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class DatabaseConnection {
private static Connection conn=null;
	public static Connection getConnection() {
		/*FileInputStream fis ;
		Properties props=new Properties();*/
		
/*try {
	fis= new FileInputStream("E:\\javaex\\EmployeeJdbc\\src\\com\\capgemini\\employees\\utils\\Database.properties");
	props.load(fis);
	String url=props.getProperty("url");
	String user=props.getProperty("username");
	String pass=props.getProperty("password");*/
	try {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="System";
		String pass="System";
		DriverManager.deregisterDriver(new OracleDriver());
		conn=DriverManager.getConnection(url,user,pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
/*} catch (SQLException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
return conn;
}
public static void closeConnection() {
	try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}