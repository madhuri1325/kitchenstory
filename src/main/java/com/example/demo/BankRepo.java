package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BankRepo extends JpaRepository<Bank,Integer> {
	@Query("Select b.Bbalance from Bank b where b.bname=?1")
	public int getBalance(String bname);
	}

