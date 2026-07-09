package com.cognizant.account_service.service;

import org.springframework.stereotype.Service;

import com.cognizant.account_service.entity.copy.Account;
import com.cognizant.account_service.repository.AccountRepository;

@Service
public class AccountService {

	
	private AccountRepository accountRepository;
	
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	public Account getAccountByNumber(Long accountNumber) {
		return accountRepository.findById(accountNumber)
				.orElseThrow(() -> new RuntimeException("Account not found"));
	}
}
