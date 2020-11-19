package com.insurance.quote.entity;


public class Policy_Details {
	private int policy_Number;
	private String question_Id;
	private String answer;
	public Policy_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy_Details(int policy_Number, String question_Id, String answer) {
		super();
		this.policy_Number = policy_Number;
		this.question_Id = question_Id;
		this.answer = answer;
	}
	public int getPolicy_Number() {
		return policy_Number;
	}
	public void setPolicy_Number(int policy_Number) {
		this.policy_Number = policy_Number;
	}
	public String getQuestion_Id() {
		return question_Id;
	}
	public void setQuestion_Id(String question_Id) {
		this.question_Id = question_Id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
