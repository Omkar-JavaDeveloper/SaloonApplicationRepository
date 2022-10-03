package com.cg.saloon.dao;


import com.cg.saloon.dto.Saloon;
import com.cg.saloon.repo.SaloonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SaloonDao {

    @Autowired
    SaloonRepo saloonRepo;

    public void save (Saloon saloon){
        saloonRepo.save(saloon);
    }
    public List <Saloon> findByName(String name){
      return   saloonRepo.findByName(name);

    }


}
