package com.insurance.quote.utils;

public class InsuranceDBQueries {
	public static final  String ADDACCOUNT="insert into Accounts values(?,?,?,?,?,?,?,?)";
	   public static final String  ADDPROFILE="insert into User_Role values(?,?,?)";
	   public static final String  GETPOLICY="select Pol_Ques_Desc,Pol_Ques_Ans1,Pol_Ques_Ans1_weightage,"
	   		+ "Pol_Ques_Ans2,Pol_Ques_Ans2_weightage,"
	   		+ "Pol_Ques_Ans3,Pol_Ques_Ans3_weightage,"
	   		+ "Pol_Ques_Ans4,Pol_Ques_Ans4_weightage from Policy_Questions where Bus_Seg_Id=?";
	   public static final String GETUSER="select user_name,password,role_code from User_Role where user_name=?";
	   public static final String  ADDPOLICY="insert into Policy values(?,?,?)";
	   public static final String  GETBUSID="select Bus_Seg_Id from Bussiness_Segment where Bus_Seg_Name=?";
	   public static final String  GETDETAILS="select Insured_Name,Insured_Street,Insured_City,Insured_State,"
	   		+ "Insured_Zip,Business_Segment from accounts where Account_Number=?";
	   

}
