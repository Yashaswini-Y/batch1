package com.insurance.quote.service;

import java.util.List;

import com.insurance.quote.dao.ReportGenerationDao;
import com.insurance.quote.dao.ReportGenerationDaoImpl;

public class ReportGenerationServiceImpl implements ReportGenerationService{
	ReportGenerationDao dao=new ReportGenerationDaoImpl();
	@Override
	public List<String> getQues(long accNum) {
		return dao.getQues(accNum);
	}
	@Override
	public List<String> getAns(long accNum) {
		return dao.getAns(accNum);
	}
	@Override
	public double getFinalPremium(long accNum) {
		return dao.getFinalPremium(accNum);
	}
	

}
