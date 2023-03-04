package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooditemsDAO {

	
	@Autowired
	
	FooditemsRepo repo;
	public Fooditems insert(Fooditems f) {
		return repo.save(f);
	}
	public List<Fooditems> getall()
	{
		return repo.findAll();
	}
	public Fooditems edit(Fooditems s) {
		// TODO Auto-generated method stub
		
			Fooditems ff=repo.findById(s.getFoodid()).orElse(null);
			
			ff.setDish(s.getDish());
		return	repo.save(ff);
			
		}


	
	public String delete(Fooditems f) {
		repo.delete(f);
		return "deleted";
	}
	
}

	

