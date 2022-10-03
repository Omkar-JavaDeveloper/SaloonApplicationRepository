package com.cg.saloon.dto;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "saloon_table")
public class Saloon {

    private int saloonId;

    private String saloonName;

    @OneToOne
    private Address address;

    private BigInteger phoneNumber;

    @ManyToOne
    private List<Customer> customerList;

    public int getSaloonId() {
        return saloonId;
    }

    public void setSaloonId(int saloonId) {
        this.saloonId = saloonId;
    }

    public String getSaloonName() {
        return saloonName;
    }

    public void setSaloonName(String saloonName) {
        this.saloonName = saloonName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
