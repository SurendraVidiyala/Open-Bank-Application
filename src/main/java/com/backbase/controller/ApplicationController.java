package com.backbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	
	/*Not working
	 * public ResponseEntity<List<Transaction>> listAllUsers() {
        List<Transaction> transactions = applicationService.getAllTransactions();
        if(transactions .isEmpty()){
            return new ResponseEntity<List<Transaction>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Transaction>>(transactions, HttpStatus.OK);
    }*/
	
	@GetMapping("/listAllTransactions")
	@ResponseBody
	public ResponseEntity<String> listAllUsers() {
        String transactions = applicationService.getAllTransactions();
        if(transactions .isEmpty()){
            return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<String>(transactions, HttpStatus.OK);
    }
}
