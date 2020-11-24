package com.insurance.quote.dao;

import java.util.List;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.Policy_Details;
import com.insurance.quote.entity.Policy_Questions;

public interface PolicyCreationDao {
	public List<Accounts> getDetails(long accNum);
	public List<Policy_Questions> getPolicy_Questions(String Bus_Seg_Name);
	public double getPremium(String busId,String[] answer);
	public int CreatePolicy(Policy policy);
	public int CreatePolicyDetails(Policy_Details policyDetails);

}
