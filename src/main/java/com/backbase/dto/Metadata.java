
package com.backbase.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "Metadata" consisting member variables, getters, setters, builder
 * methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "narrative", "comments", "tags", "images", "where" })
public class Metadata {

	@JsonProperty("narrative")
	private String narrative;
	@JsonProperty("comments")
	private List<String> comments = null;
	@JsonProperty("tags")
	private List<String> tags = null;
	@JsonProperty("images")
	private List<String> images = null;
	@JsonProperty("where")
	private String where;

	@JsonProperty("narrative")
	public String getNarrative() {
		return narrative;
	}

	@JsonProperty("narrative")
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public Metadata withNarrative(String narrative) {
		this.narrative = narrative;
		return this;
	}

	@JsonProperty("comments")
	public List<String> getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public Metadata withComments(List<String> comments) {
		this.comments = comments;
		return this;
	}

	@JsonProperty("tags")
	public List<String> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Metadata withTags(List<String> tags) {
		this.tags = tags;
		return this;
	}

	@JsonProperty("images")
	public List<String> getImages() {
		return images;
	}

	@JsonProperty("images")
	public void setImages(List<String> images) {
		this.images = images;
	}

	public Metadata withImages(List<String> images) {
		this.images = images;
		return this;
	}

	@JsonProperty("where")
	public String getWhere() {
		return where;
	}

	@JsonProperty("where")
	public void setWhere(String where) {
		this.where = where;
	}

	public Metadata withWhere(String where) {
		this.where = where;
		return this;
	}

}
