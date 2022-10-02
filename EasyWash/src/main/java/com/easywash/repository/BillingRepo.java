package com.easywash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easywash.entity.Billing;

public interface BillingRepo extends JpaRepository<Billing, Integer> {

}
