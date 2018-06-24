package com.backbase.services;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;

import com.backbase.dto.BackbaseResponseBody;

/**
 * Service Interface. Implemented by ApplicationServiceImpl
 * 
 * @author Arka Bhattacharya
 *
 */
public interface ApplicationService {
	ResponseEntity<ArrayList<BackbaseResponseBody>> getAllTransactions();

	ResponseEntity<ArrayList<BackbaseResponseBody>> getFilteredTransactions(String filterKey);

	ResponseEntity<String> getTotalAmount(String filterKey);
}