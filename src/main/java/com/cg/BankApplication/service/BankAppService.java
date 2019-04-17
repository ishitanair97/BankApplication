package com.cg.BankApplication.service;

import java.util.List;

import com.cg.BankApplication.model.BankApp;

public interface BankAppService {

	public void save(BankApp bankApp);

	public List<BankApp> findAll();
	
	public BankApp findById(int id);
	
}
