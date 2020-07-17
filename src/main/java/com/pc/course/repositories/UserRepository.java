package com.pc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
