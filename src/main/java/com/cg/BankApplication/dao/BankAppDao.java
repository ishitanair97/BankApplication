package com.cg.BankApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BankApplication.model.BankApp;

public interface BankAppDao extends JpaRepository<BankApp, Integer>{

}
