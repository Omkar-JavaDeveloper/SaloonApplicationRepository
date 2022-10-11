package com.cg.saloon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.saloon.dao.SaloonDao;
import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;

@RestController
@RequestMapping("/saloon")
public class SaloonController {
	
	@Autowired
	SaloonDao saloondao;
	
	@PostMapping("/savesaloon")
	public void save (Saloon saloon){
        saloondao.save(saloon);
    }
	@GetMapping("/findbyname")
    public List <Saloon> findByName(String name){
      return   saloondao.findByName(name);
    }
	@PostMapping("/assigncustomer")
    public void assignCustomer(  Customer customer){
    	saloondao.assignCustomer(customer);
    }
	@GetMapping("/findall")
    public List<Saloon> findAll(){
     return  saloondao.findAll();
    }
	
}
