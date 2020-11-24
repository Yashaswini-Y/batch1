package com.insurance.quote.service;

import java.util.List;

public interface ReportGenerationService {
	public List<String> getQues(long accNum);
	public List<String> getAns(long accNum);
	public double getFinalPremium(long accNum);

}
