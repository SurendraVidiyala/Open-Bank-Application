package com.backbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "Bank" consisting member variables, getters, setters, builder methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "national_identifier", "name" })
public class Bank {

	@JsonProperty("national_identifier")
	private String nationalIdentifier;
	@JsonProperty("name")
	private String name;

	@JsonProperty("national_identifier")
	public String getNationalIdentifier() {
		return nationalIdentifier;
	}

	@JsonProperty("national_identifier")
	public void setNationalIdentifier(String nationalIdentifier) {
		this.nationalIdentifier = nationalIdentifier;
	}

	public Bank withNationalIdentifier(String nationalIdentifier) {
		this.nationalIdentifier = nationalIdentifier;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Bank withName(String name) {
		this.name = name;
		return this;
	}

}