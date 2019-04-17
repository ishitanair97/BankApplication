package com.cg.BankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.BankApplication.model.BankApp;
import com.cg.BankApplication.service.BankAppService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private BankAppService bankAppService;

	int customerId;

	@PostMapping("/cust")
	public ModelAndView customerLogin(@RequestParam int id, @RequestParam String password) {
		ModelAndView modelandview;
		customerId = id;
		BankApp bank = bankAppService.findById(id);
		String pass = bank.getPassword();
		if (bank == null) {
			modelandview = new ModelAndView("AccountNotFound");
		} else if (password.equals(pass)) {
			modelandview = new ModelAndView("menu");
		} else {
			modelandview = new ModelAndView("InvalidCredentials");
		}

		return modelandview;
	}

	@PostMapping("/deposit")
	public ModelAndView deposit(@RequestParam int balance) {
		BankApp bank = bankAppService.findById(customerId);
		int currentBalance = bank.getAccountBalance();
		currentBalance = currentBalance + balance;
		bank.setAccountBalance(currentBalance);
		bankAppService.save(bank);
		ModelAndView modelAndView = new ModelAndView("DepositUpdated");
		modelAndView.addObject("customer", currentBalance);
		return modelAndView;

	}

	@PostMapping("/withdraw")
	public ModelAndView withdraw(@RequestParam int amount) {
		BankApp bank = bankAppService.findById(customerId);
		int currentBalance = bank.getAccountBalance();
		currentBalance = currentBalance - amount;
		bank.setAccountBalance(currentBalance);
		bankAppService.save(bank);
		ModelAndView modelAndView = new ModelAndView("withdrawUpdate");
		modelAndView.addObject("customer", currentBalance);
		return modelAndView;
	}

	@PostMapping("/fundTransfer")
	public ModelAndView fundTranfer(@RequestParam int RecieverId, @RequestParam int amount) {
		BankApp bank = bankAppService.findById(customerId);
		BankApp bankApp = bankAppService.findById(RecieverId);

		int senderBalance = bank.getAccountBalance();
		int recieverBalance = bank.getAccountBalance();

		if(senderBalance<amount) {
			ModelAndView modelAndView = new ModelAndView("InsufficientBalance");
			//modelAndView.addObject("sender", senderBalance);
			return modelAndView;
		}
		else {
		senderBalance = senderBalance - amount;
		recieverBalance = recieverBalance + amount;

		bank.setAccountBalance(senderBalance);
		bankApp.setAccountBalance(recieverBalance);

		bankAppService.save(bank);
		bankAppService.save(bankApp);

		ModelAndView modelAndView = new ModelAndView("SenderBalance");
		modelAndView.addObject("sender", senderBalance);
		return modelAndView;
	}}

	@GetMapping("/showBalance")
	public ModelAndView showBalance() {
		BankApp bank = bankAppService.findById(customerId);
		int balance = bank.getAccountBalance();
		ModelAndView modelAndView = new ModelAndView("ShowBalance");
		modelAndView.addObject("BALANCE", balance);
		return modelAndView;
	}
}
