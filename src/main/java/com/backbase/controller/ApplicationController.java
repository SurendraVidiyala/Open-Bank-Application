package com.backbase.controller;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backbase.dto.BackbaseResponseBody;
import com.backbase.services.ApplicationService;

/**
 * Controller Class for the application
 * 
 * @author Arka Bhattacharya
 *
 */
@RestController
public class ApplicationController {

	private static final Logger LOGGER = Logger.getLogger(ApplicationController.class);

	@Autowired
	ApplicationService applicationService;

	@GetMapping("/listAllTransactions")
	@ResponseBody
	public ResponseEntity<ArrayList<BackbaseResponseBody>> getAllTransactions() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("getAllTransactions is executed!");
		}
		return applicationService.getAllTransactions();
	}

	@GetMapping("/listAllTransactions/{transactionType}")
	@ResponseBody
	public ResponseEntity<ArrayList<BackbaseResponseBody>> getFilteredTransactions(
			@PathVariable(value = "transactionType") String transactionType) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("getFilteredTransactions is executed with filterKey=[" + transactionType + "]");
		}
		return applicationService.getFilteredTransactions(transactionType);
	}

	@GetMapping("/totalAmount/{transactionType}")
	@ResponseBody
	public ResponseEntity<String> getTotalAmount(@PathVariable(value = "transactionType") String transactionType) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("getTotalAmount is executed with transactionType=[" + transactionType + "]");
		}
		return applicationService.getTotalAmount(transactionType);
	}
}
