package com.insurance.quote.service;

import java.util.List;

import com.insurance.quote.dao.ViewPolicyDao;
import com.insurance.quote.dao.ViewPolicyDaoImpl;
import com.insurance.quote.entity.Policy;

public class ViewPolicyServiceImpl implements ViewPolicyService{
	ViewPolicyDao dao=new ViewPolicyDaoImpl();
	@Override
	public List<Policy> getPolicy(long accNum) {
		return dao.getPolicy(accNum);
	}

}
