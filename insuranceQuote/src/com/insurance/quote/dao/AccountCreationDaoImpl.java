package com.insurance.quote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.utils.DatabaseConnection;
import com.insurance.quote.utils.InsuranceDBQueries;

public class AccountCreationDaoImpl implements AccountCreationDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int CreateAccount(Accounts account) {
		conn=DatabaseConnection.getConnection();
		int rows=0;
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.ADDACCOUNT);
			pst.setString(1,account.getInsured_Name());
			pst.setString(2,account.getInsured_Street());
			pst.setString(3,account.getInsured_City());
			pst.setString(4,account.getInsured_State());
			pst.setInt(5,account.getInsured_Zip());
			pst.setString(6,account.getBusiness_Segment());
			pst.setString(7,account.getUser_Name());
			rows=pst.executeUpdate();
			pst=conn.prepareStatement(InsuranceDBQueries.ACCVAL);
			rs=pst.executeQuery();
			long acc=0;
			while(rs.next()) {
			acc=rs.getLong(1);
			}
			account.setAccount_Number(acc);
		
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return rows;
	}

}
