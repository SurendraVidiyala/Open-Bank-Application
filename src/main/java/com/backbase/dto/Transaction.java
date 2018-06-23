
package com.backbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "Transaction" consisting member variables, getters, setters, builder
 * methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "this_account", "other_account", "details", "metadata" })
public class Transaction {

	@JsonProperty("id")
	private String id;
	@JsonProperty("this_account")
	private ThisAccount thisAccount;
	@JsonProperty("other_account")
	private OtherAccount otherAccount;
	@JsonProperty("details")
	private Details details;
	@JsonProperty("metadata")
	private Metadata metadata;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public Transaction withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("this_account")
	public ThisAccount getThisAccount() {
		return thisAccount;
	}

	@JsonProperty("this_account")
	public void setThisAccount(ThisAccount thisAccount) {
		this.thisAccount = thisAccount;
	}

	public Transaction withThisAccount(ThisAccount thisAccount) {
		this.thisAccount = thisAccount;
		return this;
	}

	@JsonProperty("other_account")
	public OtherAccount getOtherAccount() {
		return otherAccount;
	}

	@JsonProperty("other_account")
	public void setOtherAccount(OtherAccount otherAccount) {
		this.otherAccount = otherAccount;
	}

	public Transaction withOtherAccount(OtherAccount otherAccount) {
		this.otherAccount = otherAccount;
		return this;
	}

	@JsonProperty("details")
	public Details getDetails() {
		return details;
	}

	@JsonProperty("details")
	public void setDetails(Details details) {
		this.details = details;
	}

	public Transaction withDetails(Details details) {
		this.details = details;
		return this;
	}

	@JsonProperty("metadata")
	public Metadata getMetadata() {
		return metadata;
	}

	@JsonProperty("metadata")
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Transaction withMetadata(Metadata metadata) {
		this.metadata = metadata;
		return this;
	}

}
