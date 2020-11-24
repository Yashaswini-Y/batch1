package com.insurance.quote.service;

import java.util.List;

import com.insurance.quote.dao.PolicyCreationDao;
import com.insurance.quote.dao.PolicyCreationDaoImpl;
import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.Policy_Details;
import com.insurance.quote.entity.Policy_Questions;
import com.insurance.quote.exception.AccountNotFoundException;
import com.insurance.quote.exception.CreatePolicyException;
import com.insurance.quote.exception.PolicyDetailsException;

public class PolicyCreationServiceImpl implements PolicyCreationService{
	PolicyCreationDao dao=new PolicyCreationDaoImpl();
	@Override
	public List<Accounts> getDetails(long accNum) {
		List<Accounts> acc= dao.getDetails(accNum);
		try {
			if(acc.isEmpty())
				throw new AccountNotFoundException("Account Not Found");
		}
		catch(AccountNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return acc;
	}
	@Override
	public List<Policy_Questions> getPolicy_Questions(String bus_seg_Name) {
		return dao.getPolicy_Questions(bus_seg_Name);
	}
	@Override
	public double getPremium(String busId, String[] answer) {
		return dao.getPremium(busId, answer);
	}
	@Override
	public int CreatePolicy(Policy policy) {
		int result=dao.CreatePolicy(policy);
		try {
			if(result==0)
				throw new CreatePolicyException("Unable to create a Policy");
		}
		catch(CreatePolicyException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}
	@Override
	public int CreatePolicyDetails(Policy_Details policyDetails) {
		int result=dao.CreatePolicyDetails(policyDetails);
		try {
			if(result==0)
				throw new PolicyDetailsException("Unable to add Policy Details");
		}
		catch(PolicyDetailsException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

}
