
package com.backbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "holder",
    "number",
    "kind",
    "IBAN",
    "swift_bic",
    "bank",
    "metadata"
})
public class OtherAccount {

    @JsonProperty("id")
    private String id;
    @JsonProperty("holder")
    private Holder holder;
    @JsonProperty("number")
    private String number;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("IBAN")
    private String iBAN;
    @JsonProperty("swift_bic")
    private String swiftBic;
    @JsonProperty("bank")
    private Bank bank;
    @JsonProperty("metadata")
    private OtherAccountMetadata metadata;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public OtherAccount withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("holder")
    public Holder getHolder() {
        return holder;
    }

    @JsonProperty("holder")
    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public OtherAccount withHolder(Holder holder) {
        this.holder = holder;
        return this;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public OtherAccount withNumber(String number) {
        this.number = number;
        return this;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    public OtherAccount withKind(String kind) {
        this.kind = kind;
        return this;
    }

    @JsonProperty("IBAN")
    public String getIBAN() {
        return iBAN;
    }

    @JsonProperty("IBAN")
    public void setIBAN(String iBAN) {
        this.iBAN = iBAN;
    }

    public OtherAccount withIBAN(String iBAN) {
        this.iBAN = iBAN;
        return this;
    }

    @JsonProperty("swift_bic")
    public String getSwiftBic() {
        return swiftBic;
    }

    @JsonProperty("swift_bic")
    public void setSwiftBic(String swiftBic) {
        this.swiftBic = swiftBic;
    }

    public OtherAccount withSwiftBic(String swiftBic) {
        this.swiftBic = swiftBic;
        return this;
    }

    @JsonProperty("bank")
    public Bank getBank() {
        return bank;
    }

    @JsonProperty("bank")
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public OtherAccount withBank(Bank bank) {
        this.bank = bank;
        return this;
    }

    @JsonProperty("metadata")
    public OtherAccountMetadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(OtherAccountMetadata metadata) {
        this.metadata = metadata;
    }

    public OtherAccount withMetadata(OtherAccountMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

}
