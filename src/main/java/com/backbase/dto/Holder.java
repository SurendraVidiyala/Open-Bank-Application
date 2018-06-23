
package com.backbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "Holder" consisting member variables, getters, setters, builder
 * methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "is_alias" })
public class Holder {

	@JsonProperty("name")
	private String name;
	@JsonProperty("is_alias")
	private Boolean isAlias;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Holder withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("is_alias")
	public Boolean getIsAlias() {
		return isAlias;
	}

	@JsonProperty("is_alias")
	public void setIsAlias(Boolean isAlias) {
		this.isAlias = isAlias;
	}

	public Holder withIsAlias(Boolean isAlias) {
		this.isAlias = isAlias;
		return this;
	}

}
