package com.backbase;
import com.backbase.services.ApplicationService;
import com.backbase.services.ApplicationServiceImpl;

/**
 * Application entry point containing the main method
 * 
 * @author Arka Bhattacharya
 *
 */
public class Application {

	public static void main(String[] args) {
		ApplicationService applicationService = new ApplicationServiceImpl();

		//Test retrieval of all transactions()
		applicationService.getAllTransactions();
		
		//Test retrieval of transactions based on filter
		applicationService.getFilteredTransactions("SANDBOX_TAN");
	}
}