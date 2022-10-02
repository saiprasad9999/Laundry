package com.easywash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easywash.entity.Items;

public interface ItemRepo extends JpaRepository<Items, Integer>  {

}
