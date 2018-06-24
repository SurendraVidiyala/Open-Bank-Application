package com.backbase.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backbase.constants.ApplicationConstants;
import com.backbase.dto.Transactions;

/**
 * Service Implementation class with 3 major methods: [1] Fetch all the
 * transactions [2] Fetch transactions based on transaction type filter [3]
 * Calculate the total amount for transaction type
 * 
 * @author Arka Bhattacharya
 *
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

	// private static final Logger logger =
	// LogManager.getLogger(ApplicationServiceImpl.class);

	/*
	 * @Autowired RestTemplate restTemplate;
	 */

	/**
	 * Method to fetch all the transaction and list them
	 */
	public ResponseEntity<Transactions> getAllTransactions() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Transactions> response = restTemplate.exchange(ApplicationConstants.BASEURL, HttpMethod.GET,
				null, Transactions.class);
		System.out.println(response);
		return response;
	}

	/**
	 * Method to fetch the transactions based on the "transactionType" values passed
	 * as a filter key
	 * 
	 * @param
	 */
	public ResponseEntity<Transactions> getFilteredTransactions(String filterKey) {
		return null;// TODO
	}

	/**
	 * Method to fetch all the transactions based on the transactionType passed and
	 * return the total transactionAmount
	 * 
	 * @param
	 */
	public String getTotalAmount(String filterKey) {
		return "TODO";// TODO
	}

}
