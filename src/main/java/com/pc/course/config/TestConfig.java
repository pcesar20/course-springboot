package com.pc.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pc.course.entities.User;
import com.pc.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Paulo Cesar", "pc@pcsoft.com", "982529041", "12345");
		User u2 = new User(null, "Thais Rocha", "tr@pcsoft.com", "982529041", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
