package com.cg.saloon.dto;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private int addressId;

    private String city;

    private String State;

    private Long postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }
}
