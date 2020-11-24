package com.insurance.quote.service;

import com.insurance.quote.dao.AccountCreationDao;
import com.insurance.quote.dao.AccountCreationDaoImpl;
import com.insurance.quote.entity.Accounts;
import com.insurance.quote.exception.AccountCreationException;

public class AccountCreationServiceImpl implements AccountCreationService{
	AccountCreationDao dao=new AccountCreationDaoImpl();
	@Override
	public int CreateAccount(Accounts account) {
		int result= dao.CreateAccount(account);
		try {
			if(result==0)
				throw new AccountCreationException("Unable to create an Account");
		}
		catch(AccountCreationException ex) {
		System.out.println(ex.getMessage());
		}
		return result;
	}

}
