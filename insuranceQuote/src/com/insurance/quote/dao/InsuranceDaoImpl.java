package com.insurance.quote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.insurance.quote.entity.User_Role;
import com.insurance.quote.utils.DatabaseConnection;
import com.insurance.quote.utils.InsuranceDBQueries;

public class InsuranceDaoImpl implements InsuranceDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public User_Role getUser(String userId) {
		User_Role user=new User_Role();
		conn=DatabaseConnection.getConnection();
    try {
    	pst=conn.prepareStatement(InsuranceDBQueries.GETUSER);
		pst.setString(1,userId);
		rs=pst.executeQuery();
		while(rs.next()) {
			user.setUser_Name(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setRole_Code(rs.getString(3));
		} 
    }catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.closeConnection();
		}
		return user;
	}
	@Override
	public long getAccountNumber(String userName) {
		conn=DatabaseConnection.getConnection();
		long accNum=0;
	    try {
			pst=conn.prepareStatement(InsuranceDBQueries.GETACCNUM);
			pst.setString(1,userName);
			rs=pst.executeQuery();
			while(rs.next()) {
				accNum=rs.getLong(1);
			} 
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return accNum;
	}
	
}