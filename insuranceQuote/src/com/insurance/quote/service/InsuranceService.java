package com.insurance.quote.service;

import com.insurance.quote.entity.User_Role;

public interface InsuranceService {
	public User_Role getUser(String userId);
	public long getAccountNumber(String userName);
}