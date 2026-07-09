package com.cognizant.account_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account_service.entity.copy.Account;
import com.cognizant.account_service.service.AccountService;

@RestController
public class AccountController {
	
	private AccountService accountService;
	public AccountController(AccountService accountService) {
		this.accountService =accountService;
	}
	
	@GetMapping("/account/{number}")
	public ResponseEntity<Account> getAccountByNumber(@PathVariable Long number){
		
		Account account = accountService.getAccountByNumber(number);
		
		return ResponseEntity.ok().body(account);
		
	}
}
