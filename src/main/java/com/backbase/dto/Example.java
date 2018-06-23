
package com.backbase.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "Example" consisting member variables, getters, setters, builder
 * methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "transactions" })
public class Example {

	@JsonProperty("transactions")
	private List<Transaction> transactions = null;

	@JsonProperty("transactions")
	public List<Transaction> getTransactions() {
		return transactions;
	}

	@JsonProperty("transactions")
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Example withTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
		return this;
	}

}
