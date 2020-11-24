package com.insurance.quote.dao;

import com.insurance.quote.entity.User_Role;

public interface InsuranceDao {
	public User_Role getUser(String userId);
	public long getAccountNumber(String userName);	
}
