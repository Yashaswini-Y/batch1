package com.insurance.quote.dao;

import java.util.List;

import com.insurance.quote.entity.Policy;

public interface ViewPolicyDao {
	public List<Policy> getPolicy(long accNum);

}
