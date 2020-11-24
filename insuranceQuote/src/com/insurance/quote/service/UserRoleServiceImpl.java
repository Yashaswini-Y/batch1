package com.insurance.quote.service;

import com.insurance.quote.dao.UserRoleDao;
import com.insurance.quote.dao.UserRoleDaoImpl;
import com.insurance.quote.entity.User_Role;
import com.insurance.quote.exception.UserCreationException;

public class UserRoleServiceImpl implements UserRoleService{
	UserRoleDao dao=new UserRoleDaoImpl();
	@Override
	public int CreateProfile(User_Role profile) {
		int rows=dao.CreateProfile(profile);
		try {
		if(rows==0)
			throw new UserCreationException("Unable to create a Profile");
		}
		catch(UserCreationException ex) {
			System.out.println(ex.getMessage());
		}
		return rows;	
	}

}
