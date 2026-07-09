package com.cognizant.loan_service.controller;

import java.rmi.MarshalledObject;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan_service.entity.Loans;
import com.cognizant.loan_service.service.LoanService;

@RestController
public class LoanController {
	
	 private LoanService loanService;
	 
	 public LoanController(LoanService loanService) {
		this.loanService =loanService;
	}

	@GetMapping("/loans/{loanId}")
	public ResponseEntity<Loans> getLoanById(@PathVariable long loanId){
		Loans loans = loanService.getloansById(loanId);
		return ResponseEntity.ok().body(loans);
	}
	
	@GetMapping("/loans/{loanId}/with-account/{accountNumber}")
	public Map<String, Object> getLoanWithAccountDetails(
	        @PathVariable long loanId,
	        @PathVariable long accountNumber) {
	    return loanService.getloansWithAccount(loanId, accountNumber);
	}
	
	@GetMapping("/loans/account/{number}")
	public ResponseEntity<Map<String,Object>> getAccountDetails(@PathVariable long number){
		return ResponseEntity.ok().body(loanService.getLinkedAccountDetails(number));
	}
	
}
