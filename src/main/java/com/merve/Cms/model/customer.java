package com.merve.Cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class customer {

    @JsonProperty("ID")
    private int customerID;
    @JsonProperty("FirstName")
    private String customerFirstName;
    @JsonProperty("LastName")
    private String customerLastName;
    @JsonProperty("Email")
    private String customerEmail;

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }



    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
