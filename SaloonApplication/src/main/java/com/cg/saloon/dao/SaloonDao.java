package com.cg.saloon.dao;


import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.repo.CustomerRepo;
import com.cg.saloon.repo.SaloonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SaloonDao {


    @Autowired
    SaloonRepo saloonRepo;

    @Autowired
    CustomerRepo customerRepo;

    public void save (Saloon saloon){
        saloonRepo.save(saloon);
    }
    public List <Saloon> findByName(String name){
      return   saloonRepo.findByName(name);
    }
    public void assignCustomer(  Customer customer){
      customerRepo.save(customer);
    }
    public List<Saloon> findAll(){
     return  saloonRepo.findAll();
    }
}
