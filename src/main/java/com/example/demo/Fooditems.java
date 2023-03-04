package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Fooditems {
	@Id
	private int foodid;
	private String category;
	private String dish;
	private int foodprice;
	
	
	

}
