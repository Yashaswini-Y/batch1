package com.insurance.quote.service;

import com.insurance.quote.dao.InsuranceDao;
import com.insurance.quote.dao.InsuranceDaoImpl;
import com.insurance.quote.entity.User_Role;

public class InsuranceServiceImpl implements InsuranceService{
	InsuranceDao dao=new InsuranceDaoImpl();
	@Override
	public User_Role getUser(String userId) {
		return dao.getUser(userId);
	}
	@Override
	public long getAccountNumber(String userName) {
		return dao.getAccountNumber(userName);
	}

}
