package com.backbase.services;

/**
 * Service Interface. Implemented by ApplicationServiceImpl
 * 
 * @author Arka Bhattacharya
 *
 */
public interface ApplicationService {
	String getAllTransactions();

	String getFilteredTransactions(String filterKey);

	String getTotalAmount(String filterKey);
}