
package com.backbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "OtherAccountMetadata" consisting member variables, getters, setters,
 * builder methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "public_alias", "private_alias", "more_info", "URL", "image_URL", "open_corporates_URL",
		"corporate_location", "physical_location" })
public class OtherAccountMetadata {

	@JsonProperty("public_alias")
	private String publicAlias;
	@JsonProperty("private_alias")
	private String privateAlias;
	@JsonProperty("more_info")
	private String moreInfo;
	@JsonProperty("URL")
	private String uRL;
	@JsonProperty("image_URL")
	private String imageURL;
	@JsonProperty("open_corporates_URL")
	private String openCorporatesURL;
	@JsonProperty("corporate_location")
	private String corporateLocation;
	@JsonProperty("physical_location")
	private String physicalLocation;

	@JsonProperty("public_alias")
	public String getPublicAlias() {
		return publicAlias;
	}

	@JsonProperty("public_alias")
	public void setPublicAlias(String publicAlias) {
		this.publicAlias = publicAlias;
	}

	public OtherAccountMetadata withPublicAlias(String publicAlias) {
		this.publicAlias = publicAlias;
		return this;
	}

	@JsonProperty("private_alias")
	public String getPrivateAlias() {
		return privateAlias;
	}

	@JsonProperty("private_alias")
	public void setPrivateAlias(String privateAlias) {
		this.privateAlias = privateAlias;
	}

	public OtherAccountMetadata withPrivateAlias(String privateAlias) {
		this.privateAlias = privateAlias;
		return this;
	}

	@JsonProperty("more_info")
	public String getMoreInfo() {
		return moreInfo;
	}

	@JsonProperty("more_info")
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	public OtherAccountMetadata withMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
		return this;
	}

	@JsonProperty("URL")
	public String getURL() {
		return uRL;
	}

	@JsonProperty("URL")
	public void setURL(String uRL) {
		this.uRL = uRL;
	}

	public OtherAccountMetadata withURL(String uRL) {
		this.uRL = uRL;
		return this;
	}

	@JsonProperty("image_URL")
	public String getImageURL() {
		return imageURL;
	}

	@JsonProperty("image_URL")
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public OtherAccountMetadata withImageURL(String imageURL) {
		this.imageURL = imageURL;
		return this;
	}

	@JsonProperty("open_corporates_URL")
	public String getOpenCorporatesURL() {
		return openCorporatesURL;
	}

	@JsonProperty("open_corporates_URL")
	public void setOpenCorporatesURL(String openCorporatesURL) {
		this.openCorporatesURL = openCorporatesURL;
	}

	public OtherAccountMetadata withOpenCorporatesURL(String openCorporatesURL) {
		this.openCorporatesURL = openCorporatesURL;
		return this;
	}

	@JsonProperty("corporate_location")
	public String getCorporateLocation() {
		return corporateLocation;
	}

	@JsonProperty("corporate_location")
	public void setCorporateLocation(String corporateLocation) {
		this.corporateLocation = corporateLocation;
	}

	public OtherAccountMetadata withCorporateLocation(String corporateLocation) {
		this.corporateLocation = corporateLocation;
		return this;
	}

	@JsonProperty("physical_location")
	public String getPhysicalLocation() {
		return physicalLocation;
	}

	@JsonProperty("physical_location")
	public void setPhysicalLocation(String physicalLocation) {
		this.physicalLocation = physicalLocation;
	}

	public OtherAccountMetadata withPhysicalLocation(String physicalLocation) {
		this.physicalLocation = physicalLocation;
		return this;
	}

}
