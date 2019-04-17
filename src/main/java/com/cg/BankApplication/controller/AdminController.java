package com.cg.BankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.BankApplication.model.BankApp;
import com.cg.BankApplication.service.BankAppService;

@Controller
@RequestMapping("/account")
public class AdminController {

	@Autowired
	private BankAppService bankAppService;

	@PostMapping("/admin")
	public ModelAndView adminLogin(@RequestParam String user, @RequestParam String password) {
		ModelAndView modelandview;
		if (user.equals("admin") && (password.equals("admin"))) {
			modelandview = new ModelAndView("newAccount");
		} else {
			modelandview = new ModelAndView("admin");
		}
		return modelandview;

	}

	@PostMapping("/newAccount")
	public ModelAndView createAccount(@RequestParam String accountHolderName, @RequestParam String emailId,
			@RequestParam int accountBalance, @RequestParam String username, @RequestParam String password) {
		BankApp bankApp = new BankApp();
		bankApp.setAccountHolderName(accountHolderName);
		bankApp.setEmailId(emailId);
		bankApp.setAccountBalance(accountBalance);
		bankApp.setUsername(username);
		bankApp.setPassword(password);
		bankAppService.save(bankApp);
		List<BankApp> customerList = bankAppService.findAll();
		ModelAndView modelAndView = new ModelAndView("CustomerDetail");
		modelAndView.addObject("CUSTOMERLIST", customerList);
		return modelAndView;
	}

}
