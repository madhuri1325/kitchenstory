package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {

	//we can still define queires of our own over here 
	}


