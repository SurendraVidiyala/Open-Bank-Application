package com.backbase.services;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backbase.dto.BackbaseResponseBody;
import com.backbase.dto.Transactions;
import com.backbase.utilities.ApplicationConstants;
import com.backbase.utilities.TransactionsToBackbaseResponseBodyMapper;

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

	private static final Logger LOGGER = Logger.getLogger(ApplicationServiceImpl.class);

	/*
	 * @Autowired RestTemplate restTemplate;
	 */

	/**
	 * Method to fetch all the transaction and list them
	 */
	public ResponseEntity<ArrayList<BackbaseResponseBody>> getAllTransactions() {
		ArrayList<BackbaseResponseBody> backbaseResponseBodyList = new ArrayList<BackbaseResponseBody>();

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("getAllTransactions is executed");
		}

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Transactions> response = restTemplate.exchange(ApplicationConstants.BASEURL, HttpMethod.GET,
				null, Transactions.class);

		if (null != response && null != response.getBody()) {
			backbaseResponseBodyList = TransactionsToBackbaseResponseBodyMapper
					.transactionsToBackbaseResponseBodyConverter(response.getBody(), null);
		} else
			backbaseResponseBodyList = null;

		ResponseEntity<ArrayList<BackbaseResponseBody>> resp = new ResponseEntity<ArrayList<BackbaseResponseBody>>(backbaseResponseBodyList,HttpStatus.OK);

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Exiting getAllTransactions");
		}
		return resp;
	}

	/**
	 * Method to fetch the transactions based on the "transactionType" values passed
	 * as a filter key
	 * 
	 * @param
	 */
	public ResponseEntity<ArrayList<BackbaseResponseBody>> getFilteredTransactions(String filterKey) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("getFilteredTransactions is executed with filterKey=[" + filterKey + "]");
		}
		ArrayList<BackbaseResponseBody> backbaseResponseBodyList = new ArrayList<BackbaseResponseBody>();

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Transactions> response = restTemplate.exchange(ApplicationConstants.BASEURL, HttpMethod.GET,
				null, Transactions.class);

		if (null != response && null != response.getBody()) {
			backbaseResponseBodyList = TransactionsToBackbaseResponseBodyMapper
					.transactionsToBackbaseResponseBodyConverter(response.getBody(), filterKey);
		} else
			backbaseResponseBodyList = null;

		ResponseEntity<ArrayList<BackbaseResponseBody>> resp = new ResponseEntity<ArrayList<BackbaseResponseBody>>(backbaseResponseBodyList,HttpStatus.OK);

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Exiting getAllTransactions");
		}
		return resp;
	}

	/**
	 * Method to fetch all the transactions based on the transactionType passed and
	 * return the total transactionAmount
	 * 
	 * @param
	 */
	public ResponseEntity<String> getTotalAmount(String filterKey) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("getTotalAmount is executed with filterKey=[" + filterKey + "]");
		}
		ArrayList<BackbaseResponseBody> backbaseResponseBodyList = new ArrayList<BackbaseResponseBody>();

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Transactions> response = restTemplate.exchange(ApplicationConstants.BASEURL, HttpMethod.GET,
				null, Transactions.class);

		if (null != response && null != response.getBody()) {
			backbaseResponseBodyList = TransactionsToBackbaseResponseBodyMapper
					.transactionsToBackbaseResponseBodyConverter(response.getBody(), filterKey);
		} else
			backbaseResponseBodyList = null;
		
		return null;// TODO
	}

}
