package com.insurance.quote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Bussiness_Segment;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.Policy_Questions;
import com.insurance.quote.entity.User_Role;
import com.insurance.quote.utils.DatabaseConnection;
import com.insurance.quote.utils.InsuranceDBQueries;

public class InsuranceDaoImpl implements InsuranceDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int CreateProfile(User_Role profile) {
		// TODO Auto-generated method stub
		conn=DatabaseConnection.getConnection();
		int rows=0;
	    try {
	    	System.out.println(profile.getUser_Name()+" "+profile.getRole_Code());
	    	pst=conn.prepareStatement(InsuranceDBQueries.ADDPROFILE);
			pst.setString(1,profile.getUser_Name());
			pst.setString(2,profile.getPassword());
			pst.setString(3,profile.getRole_Code());
			rows=pst.executeUpdate();
	    }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		 return rows;
	
	}

	@Override
	public int CreateAccount(Accounts account) {
		// TODO Auto-generated method stub
		conn=DatabaseConnection.getConnection();
		int rows=0;
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.ADDACCOUNT);
			pst.setInt(1,account.getAccount_Number());
			pst.setString(2,account.getInsured_Name());
			pst.setString(3,account.getInsured_Street());
			pst.setString(4,account.getInsured_City());
			pst.setString(5,account.getInsured_State());
			pst.setInt(6,account.getInsured_Zip());
			pst.setString(7,account.getBusiness_Segment());
			pst.setString(8,account.getUser_Name());
			rows=pst.executeUpdate();
		
	    }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return rows;
	}

	@Override
	public int CreatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		conn=DatabaseConnection.getConnection();
		int rows=0;
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.ADDPOLICY);
			pst.setInt(1,policy.getPolicy_Number());
			pst.setInt(2,policy.getPolicy_Premium());
			pst.setLong(3,policy.getAccount_Number());
			rows=pst.executeUpdate();
			
	    }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return rows;
	}

	@Override
	public User_Role getUser(String userId) {
		// TODO Auto-generated method stub
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DatabaseConnection.closeConnection();
		}
		return user;
	}

	@Override
	public List<Policy_Questions> getPolicy_Questions(Bussiness_Segment Bus_Seg_Id) {
		// TODO Auto-generated method stub
		
		List<Policy_Questions> lis=new ArrayList<Policy_Questions>();
		conn=DatabaseConnection.getConnection();
    try {
    	PreparedStatement bus=conn.prepareStatement(InsuranceDBQueries.GETBUSID);
    	bus.setString(1, Bus_Seg_Id.getBus_Seg_Id());
    	pst=conn.prepareStatement(InsuranceDBQueries.GETPOLICY);
    	pst.setString(1,Bus_Seg_Id.getBus_Seg_Name() );
		rs=pst.executeQuery();
		while(rs.next()) {
			Policy_Questions pol=new Policy_Questions();
			pol.setPol_Ques_Desc(rs.getString(1));
			pol.setPol_Ques_Ans1(rs.getString(2));
			pol.setPol_Ques_Ans1_weightage(rs.getInt(3));
			pol.setPol_Ques_Ans2(rs.getString(4));
			pol.setPol_Ques_Ans2_weightage(rs.getInt(5));
			pol.setPol_Ques_Ans3(rs.getString(6));
			pol.setPol_Ques_Ans3_weightage(rs.getInt(7));
			pol.setPol_Ques_Ans4(rs.getString(8));
			pol.setPol_Ques_Ans4_weightage(rs.getInt(9));
			lis.add(pol);
			
		} 
    }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DatabaseConnection.closeConnection();
		}
		return lis;
	}

	@Override
	public List<Accounts> getDetails(long accNum) {
		// TODO Auto-generated method stub
		List<Accounts> lis=new ArrayList<Accounts>();
		
		conn=DatabaseConnection.getConnection();
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.GETDETAILS);
			pst.setLong(1,accNum);
			rs=pst.executeQuery();
			while(rs.next()) {
				Accounts acc=new Accounts();
				acc.setInsured_Name(rs.getString(1));
				acc.setInsured_Street(rs.getString(2));
				acc.setInsured_City(rs.getString(3));
				acc.setInsured_State(rs.getString(4));
				acc.setInsured_Zip(rs.getInt(5));
				acc.setBusiness_Segment(rs.getString(6));
				lis.add(acc);
				
			} 
	    }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		
		return lis;
	}

	


}