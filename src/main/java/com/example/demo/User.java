package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
@Id
	private int userid;
	private String Fname;
	private String Lname;
	private String username;
	private String password;
	

}

