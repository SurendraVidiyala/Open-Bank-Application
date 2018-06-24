
package com.backbase.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "Transactions" consisting member variable list of Transaction,
 * corresponding getter, setter, builder method
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "transactions" })
public class Transactions {

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

	public Transactions withTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
		return this;
	}

}
