package com.pc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
