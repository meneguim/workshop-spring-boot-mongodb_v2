package com.meneguim.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.meneguim.workshopmongo.domain.User;
import com.meneguim.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRespository;	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRespository.deleteAll();
	
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User alan = new User(null, "Alan Meneguim", "alan.meneguim@gmail.com");		
		
		userRespository.saveAll(Arrays.asList(maria,alex,alan));
	}

}
