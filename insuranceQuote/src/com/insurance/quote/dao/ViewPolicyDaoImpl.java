package com.insurance.quote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.insurance.quote.entity.Policy;
import com.insurance.quote.utils.DatabaseConnection;
import com.insurance.quote.utils.InsuranceDBQueries;

public class ViewPolicyDaoImpl implements ViewPolicyDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public List<Policy> getPolicy(long accNum) {
		conn=DatabaseConnection.getConnection();
		List<Policy> policy=new ArrayList<Policy>();
		Policy pol=new Policy();
	    try {
			pst=conn.prepareStatement(InsuranceDBQueries.GETPOLICY);
			pst.setLong(1,accNum);
			rs=pst.executeQuery();
			while(rs.next()) {
				pol.setPolicy_Number(rs.getInt(1));
				pol.setPolicy_Premium(rs.getInt(2));
				pol.setAccount_Number(rs.getLong(3));
				policy.add(pol);
			} 
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return policy;
	}

}
