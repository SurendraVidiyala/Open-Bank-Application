package com.backbase.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.backbase.constants.ApplicationConstants;

/**
 * Service Implementation class with 3 major methods:
 *  [1] Fetch all the transactions
 *  [2] Fetch transactions based on transaction type filter
 *  [3] Calculate the total amount for transaction type
 * 
 * @author Arka Bhattacharya
 *
 */
public class ApplicationServiceImpl implements ApplicationService {

	/*@Autowired
	RestTemplate restTemplate;*/
	
	/**
	 * Method to fetch all the transaction and list them
	 */
	public String getAllTransactions() {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(ApplicationConstants.BASEURL, HttpMethod.GET, null, String.class);
		return response.getBody();
		
		/*Not working
		RestTemplate restTemplate = new RestTemplate();
		List<Transaction> response = (List<Transaction>) restTemplate.exchange(ApplicationConstants.BASEURL, HttpMethod.GET, null, List.class);
		return response;*/
	}

	/**
	 * Method to fetch all the transaction and filter the output based on
	 * transactionType
	 * 
	 * @param
	 */
	public String getFilteredTransactions(String filterKey) {
		return "TODO";// TODO
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
