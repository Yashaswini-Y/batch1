package com.insurance.quote.testcases;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.Policy_Details;
import com.insurance.quote.entity.Policy_Questions;
import com.insurance.quote.entity.User_Role;
import com.insurance.quote.service.AccountCreationServiceImpl;
import com.insurance.quote.service.InsuranceServiceImpl;
import com.insurance.quote.service.PolicyCreationServiceImpl;
import com.insurance.quote.service.ReportGenerationServiceImpl;
import com.insurance.quote.service.UserRoleServiceImpl;
import com.insurance.quote.service.ViewPolicyServiceImpl;

public class InsuranceQuoteTestCase {
	@Test
	public void testGetUser() {
		InsuranceServiceImpl service=new InsuranceServiceImpl();
		User_Role user=service.getUser("User");
		assertNotNull(user);
	}
	@Test
	public void testGetAccountNumber() {
		InsuranceServiceImpl service=new InsuranceServiceImpl();
		long accNum=service.getAccountNumber("User");
		assertEquals(1234567802,accNum);
	}
	@Test
	public void testCreateProfile() {
		UserRoleServiceImpl service=new UserRoleServiceImpl();
		User_Role user=new User_Role("Agent02","Agent@2","Agent");
		assertEquals(1,service.CreateProfile(user));
	}
	@Test
	public void testCreateAccount() {
		AccountCreationServiceImpl service=new AccountCreationServiceImpl();
		Accounts account=new Accounts(1235l,"Sanjana","Madhapur","Hyd","TS",50141,"Restaurant","Admin");
		assertEquals(1,service.CreateAccount(account));
	}
	@Test
	public void testGetDetails() {
		PolicyCreationServiceImpl service=new PolicyCreationServiceImpl();
		List<Accounts> account=service.getDetails(1234567808);
		assertNotEquals(0,account.size());
	}
	@Test
	public void testGetPolicyQuestions() {
		PolicyCreationServiceImpl service=new PolicyCreationServiceImpl();
		 List<Policy_Questions> questions=service.getPolicy_Questions("Appartment");
		 assertNotEquals(0,questions.size());
	}
	@Test
	public void testCreatePolicy() {
		PolicyCreationServiceImpl service=new PolicyCreationServiceImpl();
		Policy policy=new Policy(1111,4000,1234567802);
		assertEquals(1,service.CreatePolicy(policy));
	}
	@Test
	public void testCreatePolicyDetails() {
		PolicyCreationServiceImpl service=new PolicyCreationServiceImpl();
		Policy_Details policyDetails=new Policy_Details(1022,"25","General Store");
		assertEquals(1,service.CreatePolicyDetails(policyDetails));
	}
	@Test
	public void testGetPolicy() {
		ViewPolicyServiceImpl service=new ViewPolicyServiceImpl();
		List<Policy> policy=service.getPolicy(1234567808);
		assertNotEquals(0,policy.size());
	}
	@Test
	public void testGetQues() {
		ReportGenerationServiceImpl service=new ReportGenerationServiceImpl();
		List<String> ques=service.getQues(1234567808);
		assertNotEquals(0,ques.size());
		
	}
	@Test
	public void testGetAns() {
		ReportGenerationServiceImpl service=new ReportGenerationServiceImpl();
		List<String> ans=service.getAns(1234567808);
		assertNotEquals(0,ans.size());
		
	}
	@Test
	public void testGetFinalPremium() {
		ReportGenerationServiceImpl service=new ReportGenerationServiceImpl();
		double premium=service.getFinalPremium(1234567808);
		assertNotEquals(0.0,premium);
	}
	

}
