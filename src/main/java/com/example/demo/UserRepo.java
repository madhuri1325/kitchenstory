package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

	//we can still define queires of our own over here 
	}



