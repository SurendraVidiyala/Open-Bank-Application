package com.backbase.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.backbase.dto.Transaction;
import com.backbase.dto.Transactions;

/**
 * Service Interface. Implemented by ApplicationServiceImpl
 * 
 * @author Arka Bhattacharya
 *
 */
public interface ApplicationService {
	ResponseEntity<Transactions> getAllTransactions();

	ResponseEntity<Transactions> getFilteredTransactions(String filterKey);

	String getTotalAmount(String filterKey);
}