package com.pc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
