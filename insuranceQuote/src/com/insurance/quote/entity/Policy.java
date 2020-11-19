package com.insurance.quote.entity;


public class Policy {
	
	private int Policy_Number;
	private int Policy_Premium;
	private long Account_Number;
	public Policy() {
		
	}
	public Policy(int policy_Number, int policy_Premium, long account_Number) {
		this.Policy_Number = policy_Number;
		this.Policy_Premium = policy_Premium;
		this.Account_Number = account_Number;
	}
	public int getPolicy_Number() {
		return Policy_Number;
	}
	public void setPolicy_Number(int policy_Number) {
		Policy_Number = policy_Number;
	}
	public int getPolicy_Premium() {
		return Policy_Premium;
	}
	public void setPolicy_Premium(int policy_Premium) {
		Policy_Premium = policy_Premium;
	}
	public long getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}

}
