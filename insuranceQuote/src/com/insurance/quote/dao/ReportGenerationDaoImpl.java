package com.insurance.quote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.insurance.quote.utils.DatabaseConnection;
import com.insurance.quote.utils.InsuranceDBQueries;

public class ReportGenerationDaoImpl implements ReportGenerationDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public List<String> getQues(long accNum) {
		conn=DatabaseConnection.getConnection();
		List<String> ques=new ArrayList<String>();
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.GETQUES);
			pst.setLong(1,accNum);
			rs=pst.executeQuery();
			while(rs.next()) {
				ques.add(rs.getString(1));
			} 
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return ques;
	}
	@Override
	public List<String> getAns(long accNum) {
		conn=DatabaseConnection.getConnection();
		List<String> ans=new ArrayList<String>();
	    try {
			pst=conn.prepareStatement(InsuranceDBQueries.GETANS);
			pst.setLong(1,accNum);
			rs=pst.executeQuery();
			while(rs.next()) {
				ans.add(rs.getString(1));
			} 
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return ans;
	}
	@Override
	public double getFinalPremium(long accNum) {
		conn=DatabaseConnection.getConnection();
		double premium=0;
	    try {
			pst=conn.prepareStatement(InsuranceDBQueries.GETPREMIUM);
			pst.setLong(1,accNum);
			rs=pst.executeQuery();
			while(rs.next()) {
				premium=rs.getInt(1);
			} 
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return premium;
	}
		

}
