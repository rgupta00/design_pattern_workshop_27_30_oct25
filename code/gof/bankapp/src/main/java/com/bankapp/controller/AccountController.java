package com.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.Account;
import com.bankapp.service.AccountService;

@RestController
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@GetMapping(path = "accounts")
	public List<Account>getAllAccounts(){
		return accountService.getAll();
	}
	
}
