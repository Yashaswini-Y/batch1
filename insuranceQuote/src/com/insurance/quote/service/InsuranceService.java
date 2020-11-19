package com.insurance.quote.service;

import java.util.List;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Bussiness_Segment;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.Policy_Questions;
import com.insurance.quote.entity.User_Role;

public interface InsuranceService {
	public int CreateProfile(User_Role profile);
	public int CreateAccount(Accounts account);
	public int CreatePolicy(Policy policy);
	public User_Role getUser(String userId);
	public List<Accounts> getDetails(long accNum);
	public List<Policy_Questions> getPolicyQuestions(Bussiness_Segment business);

}
