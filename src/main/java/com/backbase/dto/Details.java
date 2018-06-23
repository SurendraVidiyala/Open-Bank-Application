
package com.backbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "description",
    "posted",
    "completed",
    "new_balance",
    "value"
})
public class Details {

    @JsonProperty("type")
    private String type;
    @JsonProperty("description")
    private String description;
    @JsonProperty("posted")
    private String posted;
    @JsonProperty("completed")
    private String completed;
    @JsonProperty("new_balance")
    private NewBalance newBalance;
    @JsonProperty("value")
    private Value value;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Details withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Details withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("posted")
    public String getPosted() {
        return posted;
    }

    @JsonProperty("posted")
    public void setPosted(String posted) {
        this.posted = posted;
    }

    public Details withPosted(String posted) {
        this.posted = posted;
        return this;
    }

    @JsonProperty("completed")
    public String getCompleted() {
        return completed;
    }

    @JsonProperty("completed")
    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public Details withCompleted(String completed) {
        this.completed = completed;
        return this;
    }

    @JsonProperty("new_balance")
    public NewBalance getNewBalance() {
        return newBalance;
    }

    @JsonProperty("new_balance")
    public void setNewBalance(NewBalance newBalance) {
        this.newBalance = newBalance;
    }

    public Details withNewBalance(NewBalance newBalance) {
        this.newBalance = newBalance;
        return this;
    }

    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
    }

    public Details withValue(Value value) {
        this.value = value;
        return this;
    }

}
