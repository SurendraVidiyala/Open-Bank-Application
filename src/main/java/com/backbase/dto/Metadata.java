
package com.backbase.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "narrative",
    "comments",
    "tags",
    "images",
    "where"
})
public class Metadata {

    @JsonProperty("narrative")
    private Object narrative;
    @JsonProperty("comments")
    private List<Object> comments = null;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("images")
    private List<Object> images = null;
    @JsonProperty("where")
    private Object where;

    @JsonProperty("narrative")
    public Object getNarrative() {
        return narrative;
    }

    @JsonProperty("narrative")
    public void setNarrative(Object narrative) {
        this.narrative = narrative;
    }

    public Metadata withNarrative(Object narrative) {
        this.narrative = narrative;
        return this;
    }

    @JsonProperty("comments")
    public List<Object> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    public Metadata withComments(List<Object> comments) {
        this.comments = comments;
        return this;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Metadata withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("images")
    public List<Object> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Object> images) {
        this.images = images;
    }

    public Metadata withImages(List<Object> images) {
        this.images = images;
        return this;
    }

    @JsonProperty("where")
    public Object getWhere() {
        return where;
    }

    @JsonProperty("where")
    public void setWhere(Object where) {
        this.where = where;
    }

    public Metadata withWhere(Object where) {
        this.where = where;
        return this;
    }

}
