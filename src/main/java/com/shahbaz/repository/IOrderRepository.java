package com.shahbaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahbaz.model.OrderMethod;

public interface IOrderRepository extends JpaRepository<OrderMethod, Integer>{
	
}
