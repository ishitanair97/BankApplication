package com.cg.BankApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BankApplication.dao.BankAppDao;
import com.cg.BankApplication.model.BankApp;

@Service
public class BankAppServiceImpl implements BankAppService {

	@Autowired 
	BankAppDao bankAppDao;

	@Override
	public void save(BankApp bankApp) {
		bankAppDao.save(bankApp);	
	}

	@Override
	public List<BankApp> findAll() {
		return bankAppDao.findAll();
	}

	@Override
	public BankApp findById(int id) {
	 BankApp bank=bankAppDao.findById(id).get();
		return bank;
	}
	
	
}
