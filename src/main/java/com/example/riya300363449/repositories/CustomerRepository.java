package com.example.riya300363449.repositories;

import com.example.riya300363449.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CusomerRepository extends JpaRepository<Customer,Integer> {


}
