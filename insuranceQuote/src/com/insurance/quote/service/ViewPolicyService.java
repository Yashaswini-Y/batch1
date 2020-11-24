package com.insurance.quote.service;

import java.util.List;

import com.insurance.quote.entity.Policy;

public interface ViewPolicyService {
	public List<Policy> getPolicy(long accNum);

}
