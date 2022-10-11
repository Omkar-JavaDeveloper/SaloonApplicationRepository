package com.cg.saloon.repo;

import com.cg.saloon.dto.Saloon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaloonRepo extends JpaRepository<Saloon,Integer> {
    public List<Saloon> findByName(String name);

}
