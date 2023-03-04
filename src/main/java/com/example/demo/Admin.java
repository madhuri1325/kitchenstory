package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {
@Id
	private String Username;
	private String password;
	

}

