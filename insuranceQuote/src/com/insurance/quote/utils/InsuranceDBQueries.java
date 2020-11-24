package com.insurance.quote.utils;


public class InsuranceDBQueries {
	public static final  String ADDACCOUNT="insert into Accounts values(acc_seq.nextval,?,?,?,?,?,?,?)";
	   public static final String  ADDPROFILE="insert into User_Role values(?,?,?)";
	   public static final String  ADDPOLICY="insert into Policy values(pol_num_seq.nextval,?,?)";
	   public static final String ADDPOLICYDETAILS="insert into Policy_Details values(?,?,?)";
	   public static final String  GETPOLICYDETAILS="select Pol_Ques_Id,Pol_Ques_Desc,Pol_Ques_Ans1,Pol_Ques_Ans1_weightage,"
	   		+ "Pol_Ques_Ans2,Pol_Ques_Ans2_weightage,"
	   		+ "Pol_Ques_Ans3,Pol_Ques_Ans3_weightage,"
	   		+ "Pol_Ques_Ans4,Pol_Ques_Ans4_weightage from Policy_Questions where Bus_Seg_Id=?";
	   public static final String GETUSER="select user_name,password,role_code from User_Role where user_name=?";
	   public static final String  GETBUSID="select Bus_Seg_Id from Business_Segment where Bus_Seg_Name=?";
	   public static final String  GETDETAILS="select Insured_Name,Insured_Street,Insured_City,Insured_State,"
	   		+ "Insured_Zip,Business_Segment,Account_Number from accounts where Account_Number=?";
	   public static final String GETQUES="select pol_ques_desc from policy_questions where pol_ques_id in" 
	   			 +	"(select question_id from policy_details where policy_number in"
	   		     + "(select policy_number from policy where account_number=?))";
	   public static final String GETANS="select answer from policy_details where policy_number in"
	   		           + "(select policy_number from policy where account_number=?)";
	   public static final String GETPREMIUM="select policy_premium from policy where account_number=?";
	   public static final String GETPOLICY="select policy_number,policy_premium,account_number from policy where account_number=?";
	   public static final String GETACCNUM="select account_number from Accounts where user_name=?";
	   public static final String ACCVAL="select acc_seq.currval from dual";
	   public static final String POLVAL="select pol_num_seq.currval from dual";
	   
	   

}
