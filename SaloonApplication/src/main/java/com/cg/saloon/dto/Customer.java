package com.cg.saloon.dto;


import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "customer_Table")
public class Customer {

    @Id
    private int cunstomerId;

    private String name;

    private String emailId;

    private BigInteger mobileNumber;


    public int getCunstomerId() {
        return cunstomerId;
    }

    public void setCunstomerId(int cunstomerId) {
        this.cunstomerId = cunstomerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public BigInteger getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(BigInteger mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
