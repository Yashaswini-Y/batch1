package com.insurance.quote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.insurance.quote.entity.User_Role;
import com.insurance.quote.utils.DatabaseConnection;
import com.insurance.quote.utils.InsuranceDBQueries;

public class UserRoleDaoImpl implements UserRoleDao{
	private Connection conn;
	private PreparedStatement pst;
	@Override
	public int CreateProfile(User_Role profile) {
		conn=DatabaseConnection.getConnection();
		int rows=0;
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.ADDPROFILE);
			pst.setString(1,profile.getUser_Name());
			pst.setString(2,profile.getPassword());
			pst.setString(3,profile.getRole_Code());
			rows=pst.executeUpdate();
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		 return rows;
	}

}
