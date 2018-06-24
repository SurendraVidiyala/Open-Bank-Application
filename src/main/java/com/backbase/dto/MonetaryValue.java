
package com.backbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "MonetaryValue" consisting member variables, getters, setters,
 * builder methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "currency", "amount" })
public class MonetaryValue {

	@JsonProperty("currency")
	private String currency;
	@JsonProperty("amount")
	private String amount;

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public MonetaryValue withCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	@JsonProperty("amount")
	public String getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public MonetaryValue withAmount(String amount) {
		this.amount = amount;
		return this;
	}

}
