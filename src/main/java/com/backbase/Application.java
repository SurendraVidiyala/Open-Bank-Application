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
		System.out.println(applicationService.getAllTransactions());
	}
}