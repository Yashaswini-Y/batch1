package com.insurance.quote.dao;

import java.util.List;

public interface ReportGenerationDao {
	public List<String> getQues(long accNum);
	public List<String> getAns(long accNum);
	public double getFinalPremium(long accNum);

}
