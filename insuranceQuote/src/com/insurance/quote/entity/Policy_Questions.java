package com.insurance.quote.entity;


public class Policy_Questions {
	
	   private String Pol_Ques_Id;
	   private int Pol_Ques_Seg;
	   private String Bus_Seg_Id;
	   private String Pol_Ques_Desc;
	   private String Pol_Ques_Ans1;
	   private String Pol_Ques_Ans2;
	   private String Pol_Ques_Ans3;
	   private String Pol_Ques_Ans4;
	   private int Pol_Ques_Ans1_weightage;
	   private int Pol_Ques_Ans2_weightage;
	   private int Pol_Ques_Ans3_weightage;
	   private int Pol_Ques_Ans4_weightage;
	   public Policy_Questions() {
	   }
	public Policy_Questions(String pol_Ques_Id, int pol_Ques_Seg, String bus_Seg_Id, String pol_Ques_Desc, String pol_Ques_Ans_1,
			String pol_Ques_Ans_2, String pol_Ques_Ans_3, String pol_Ques_Ans_4, int pol_Ques_Ans1_weightage,
			int pol_Ques_Ans2_weightage, int pol_Ques_Ans3_weightage, int pol_Ques_Ans4_weightage) {
		super();
		this.Pol_Ques_Id = pol_Ques_Id;
		this.Pol_Ques_Seg = pol_Ques_Seg;
		this.Bus_Seg_Id = bus_Seg_Id;
		this.Pol_Ques_Desc = pol_Ques_Desc;
		this.Pol_Ques_Ans1 = pol_Ques_Ans_1;
		this.Pol_Ques_Ans2 = pol_Ques_Ans_2;
		this.Pol_Ques_Ans3 = pol_Ques_Ans_3;
		this.Pol_Ques_Ans4 = pol_Ques_Ans_4;
		this.Pol_Ques_Ans1_weightage = pol_Ques_Ans1_weightage;
		this.Pol_Ques_Ans2_weightage = pol_Ques_Ans2_weightage;
		this.Pol_Ques_Ans3_weightage = pol_Ques_Ans3_weightage;
		this.Pol_Ques_Ans4_weightage = pol_Ques_Ans4_weightage;
	}
	public String getPol_Ques_Id() {
		return Pol_Ques_Id;
	}
	public void setPol_Ques_Id(String pol_Ques_Id) {
		Pol_Ques_Id = pol_Ques_Id;
	}
	public int getPol_Ques_Seg() {
		return Pol_Ques_Seg;
	}
	public void setPol_Ques_Seg(int pol_Ques_Seg) {
		Pol_Ques_Seg = pol_Ques_Seg;
	}
	public String getBus_Seg_Id() {
		return Bus_Seg_Id;
	}
	public void setBus_Seg_Id(String bus_Seg_Id) {
		Bus_Seg_Id = bus_Seg_Id;
	}
	public String getPol_Ques_Desc() {
		return Pol_Ques_Desc;
	}
	public void setPol_Ques_Desc(String pol_Ques_Desc) {
		Pol_Ques_Desc = pol_Ques_Desc;
	}
	public String getPol_Ques_Ans1() {
		return Pol_Ques_Ans1;
	}
	public void setPol_Ques_Ans1(String pol_Ques_Ans_1) {
		Pol_Ques_Ans1 = pol_Ques_Ans_1;
	}
	public String getPol_Ques_Ans2() {
		return Pol_Ques_Ans2;
	}
	public void setPol_Ques_Ans2(String pol_Ques_Ans_2) {
		Pol_Ques_Ans2 = pol_Ques_Ans_2;
	}
	public String getPol_Ques_Ans3() {
		return Pol_Ques_Ans3;
	}
	public void setPol_Ques_Ans3(String pol_Ques_Ans_3) {
		Pol_Ques_Ans3 = pol_Ques_Ans_3;
	}
	public String getPol_Ques_Ans4() {
		return Pol_Ques_Ans4;
	}
	public void setPol_Ques_Ans4(String pol_Ques_Ans_4) {
		Pol_Ques_Ans4 = pol_Ques_Ans_4;
	}
	public int getPol_Ques_Ans1_weightage() {
		return Pol_Ques_Ans1_weightage;
	}
	public void setPol_Ques_Ans1_weightage(int pol_Ques_Ans1_weightage) {
		Pol_Ques_Ans1_weightage = pol_Ques_Ans1_weightage;
	}
	public int getPol_Ques_Ans2_weightage() {
		return Pol_Ques_Ans2_weightage;
	}
	public void setPol_Ques_Ans2_weightage(int pol_Ques_Ans2_weightage) {
		Pol_Ques_Ans2_weightage = pol_Ques_Ans2_weightage;
	}
	public int getPol_Ques_Ans3_weightage() {
		return Pol_Ques_Ans3_weightage;
	}
	public void setPol_Ques_Ans3_weightage(int pol_Ques_Ans3_weightage) {
		Pol_Ques_Ans3_weightage = pol_Ques_Ans3_weightage;
	}
	public int getPol_Ques_Ans4_weightage() {
		return Pol_Ques_Ans4_weightage;
	}
	public void setPol_Ques_Ans4_weightage(int pol_Ques_Ans4_weightage) {
		Pol_Ques_Ans4_weightage = pol_Ques_Ans4_weightage;
	}
	
	  
}
