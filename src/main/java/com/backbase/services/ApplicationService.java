package com.backbase.services;

import java.util.List;

import com.backbase.dto.Transaction;

/**
 * Service Interface. Implemented by ApplicationServiceImpl
 * 
 * @author Arka Bhattacharya
 *
 */
public interface ApplicationService {
	String getAllTransactions();
	/*Not working
	 * List<Transaction>String getAllTransactions();*/

	String getFilteredTransactions(String filterKey);

	String getTotalAmount(String filterKey);
}