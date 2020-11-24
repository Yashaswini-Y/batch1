package com.insurance.quote.entity;


public class Policy {
	
	private int policy_Number;
	private double policy_Premium;
	private long account_Number;
	public Policy() {
		
	}
	public Policy(double policy_Premium, long account_Number) {
		super();
		this.policy_Premium = policy_Premium;
		this.account_Number = account_Number;
	}
	public Policy(int policy_Number, double policy_Premium, long account_Number) {
		this.policy_Number = policy_Number;
		this.policy_Premium = policy_Premium;
		this.account_Number = account_Number;
	}
	public int getPolicy_Number() {
		return policy_Number;
	}
	public void setPolicy_Number(int policy_Number) {
		this.policy_Number = policy_Number;
	}
	public double getPolicy_Premium() {
		return policy_Premium;
	}
	public void setPolicy_Premium(double policy_Premium) {
		this.policy_Premium = policy_Premium;
	}
	public long getAccount_Number() {
		return account_Number;
	}
	public void setAccount_Number(long account_Number) {
		this.account_Number = account_Number;
	}

}
