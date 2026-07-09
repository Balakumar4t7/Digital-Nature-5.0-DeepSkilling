package com.cognizant.loan_service.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "account-service")
public interface AccountClinet {

	@GetMapping("/account/{number}")
	 Map<String,Object> getAccountDetails(@PathVariable long number);
}
