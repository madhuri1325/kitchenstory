package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FooditemsRepo extends JpaRepository<Fooditems,Integer> {

	//we can still define queires of our own over here 
	}
