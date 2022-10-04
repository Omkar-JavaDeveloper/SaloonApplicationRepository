package com.cg.saloon.service;


import com.cg.saloon.dao.SaloonDao;
import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaloonService {

    @Autowired
    SaloonDao saloonDao;


    public String addSaloon(Saloon saloon) {
        saloonDao.save(saloon);
        return "saloon added successfully!";
    }

    public List<Saloon> searchByName(String name) {

        return saloonDao.findByName(name);
    }

    public String assignCustomer(int saloonId, Customer customer) {
        boolean status = false;
        for (Saloon s : saloonDao.findAll()) {
            if (s.getSaloonId() == saloonId) {
                saloonDao.assignCustomer(customer);
                status = true;
            }
        }
        if (status == false) {
            return "given Saloon Id is not available in Database!!";
        }
        return "customer assigned to this saloon successfully!";
    }
}
