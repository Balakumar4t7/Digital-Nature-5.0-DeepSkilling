package com.cognizant.loan_service.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cognizant.loan_service.client.AccountClinet;
import com.cognizant.loan_service.entity.Loans;
import com.cognizant.loan_service.repository.LoanRepository;

@Service
public class LoanService {
	
	 private  LoanRepository loanRepository;
	 private  AccountClinet accountClinet;
	 
	 public LoanService(LoanRepository loanRepository, AccountClinet accountClinet) {
		this.loanRepository = loanRepository;
		 this.accountClinet = accountClinet;
		
	}

	public Loans getloansById(long loanId) {
		
		return  loanRepository.findById(loanId).orElseThrow( ()-> new RuntimeException("Loan Not Found") );
	}
	
public Map<String,Object> getloansWithAccount(long loanId, long accountNumber) {
		
		Loans loan=  loanRepository.findById(loanId).orElseThrow( ()-> new RuntimeException("Loan Not Found") );
		Map<String, Object> accountDetails = accountClinet.getAccountDetails(accountNumber);

        Map<String, Object> response = new HashMap<>();
        response.put("loanDetails", loan);
        response.put("accountDetails", accountDetails);
        
		return response;
	}

	    public Map<String, Object> getLinkedAccountDetails(long number) {
	        return accountClinet.getAccountDetails(number);
	    }
}
