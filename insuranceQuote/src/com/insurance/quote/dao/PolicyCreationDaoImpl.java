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
import com.insurance.quote.entity.Policy_Details;
import com.insurance.quote.entity.Policy_Questions;
import com.insurance.quote.utils.DatabaseConnection;
import com.insurance.quote.utils.InsuranceDBQueries;

public class PolicyCreationDaoImpl implements PolicyCreationDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public List<Accounts> getDetails(long accNum) {
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
				acc.setAccount_Number(rs.getLong(7));
				lis.add(acc);
			} 
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return lis;
	}
	@Override
	public List<Policy_Questions> getPolicy_Questions(String Bus_Seg_Name) {
		Bussiness_Segment user=new Bussiness_Segment();
		List<Policy_Questions> lis=new ArrayList<Policy_Questions>();
		conn=DatabaseConnection.getConnection();
    try {
    	pst=conn.prepareStatement(InsuranceDBQueries.GETBUSID);
		pst.setString(1,Bus_Seg_Name);
		rs=pst.executeQuery();
		while(rs.next()) {
			user.setBus_Seg_Id(rs.getString(1));
		} 
    	String busId=user.getBus_Seg_Id();
    	pst=conn.prepareStatement(InsuranceDBQueries.GETPOLICYDETAILS);
    	pst.setString(1,busId);
		rs=pst.executeQuery();
		while(rs.next()) {
			Policy_Questions pol=new Policy_Questions();
			pol.setPol_Ques_Id(rs.getString(1));
			pol.setPol_Ques_Desc(rs.getString(2));
			pol.setPol_Ques_Ans1(rs.getString(3));
			pol.setPol_Ques_Ans1_weightage(rs.getInt(4));
			pol.setPol_Ques_Ans2(rs.getString(5));
			pol.setPol_Ques_Ans2_weightage(rs.getInt(6));
			pol.setPol_Ques_Ans3(rs.getString(7));
			pol.setPol_Ques_Ans3_weightage(rs.getInt(8));
			pol.setPol_Ques_Ans4(rs.getString(9));
			pol.setPol_Ques_Ans4_weightage(rs.getInt(10));
			pol.setBus_Seg_Id(busId);
			lis.add(pol);
		} 
		
        }catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseConnection.closeConnection();
		}
		return lis;
	}
	@Override
	public double getPremium(String busSegName,String[] answer) {
		List<Policy_Questions> list=getPolicy_Questions(busSegName);
		double result=0;
		for(int j=0;j<answer.length;j++) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPol_Ques_Ans1().equals(answer[j]))
				result+=list.get(i).getPol_Ques_Ans1_weightage();
			if(list.get(i).getPol_Ques_Ans2().equals(answer[j]))
				result+=list.get(i).getPol_Ques_Ans2_weightage();
			if(list.get(i).getPol_Ques_Ans3().equals(answer[j]))
				result+=list.get(i).getPol_Ques_Ans3_weightage();
			if(list.get(i).getPol_Ques_Ans4().equals(answer[j]))
				result+=list.get(i).getPol_Ques_Ans4_weightage();
		}
		}
		return result;
	}
	@Override
	public int CreatePolicy(Policy policy) {
		conn=DatabaseConnection.getConnection();
		int rows=0;
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.ADDPOLICY);
			pst.setDouble(1,policy.getPolicy_Premium());
			pst.setLong(2, policy.getAccount_Number());
			rows=pst.executeUpdate();
			pst=conn.prepareStatement(InsuranceDBQueries.POLVAL);
			rs=pst.executeQuery();
			int pol_num=0;
			while(rs.next()) {
			pol_num=rs.getInt(1);
			}
			policy.setPolicy_Number(pol_num);
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return rows;
	}
	@Override
	public int CreatePolicyDetails(Policy_Details policyDetails) {
		conn=DatabaseConnection.getConnection();
		int rows=0;
	    try {
	    	pst=conn.prepareStatement(InsuranceDBQueries.ADDPOLICYDETAILS);
			pst.setInt(1,policyDetails.getPolicy_Number());
			pst.setString(2, policyDetails.getQuestion_Id());
			pst.setString(3, policyDetails.getAnswer());
			rows=pst.executeUpdate();
	    }catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DatabaseConnection.closeConnection();
			}
		return rows;
	}

}
