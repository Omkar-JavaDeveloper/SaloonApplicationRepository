package com.cg.saloon.repo;

import com.cg.saloon.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {




}
