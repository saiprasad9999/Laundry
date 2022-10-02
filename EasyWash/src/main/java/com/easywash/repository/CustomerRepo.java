package com.easywash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easywash.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
