package com.backbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backbase.dto.Transactions;
import com.backbase.services.ApplicationService;

/**
 * Controller Class for the application
 * 
 * @author Arka Bhattacharya
 *
 */
@RestController
public class ApplicationController {
	
	@Autowired
	ApplicationService applicationService;
	
	@GetMapping("/listAllTransactions")
	@ResponseBody
	public ResponseEntity<Transactions> getAllTransactions() {
        return applicationService.getAllTransactions();
    }
	
	@GetMapping("/listAllTransactions/{transactionType}")
	@ResponseBody
	public ResponseEntity<Transactions> getFilteredTransactions(@PathVariable(value="transactionType")String filterKey) {
        return applicationService.getFilteredTransactions(filterKey);
    }
	
	@GetMapping("/totalAmount/{transactionType}")
	@ResponseBody
	public ResponseEntity<String> getTotalAmount(@PathVariable(value="transactionType")String filterKey) {
        return applicationService.getTotalAmount(filterKey);
    }
}
