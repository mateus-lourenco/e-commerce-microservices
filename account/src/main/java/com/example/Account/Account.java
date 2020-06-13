package com.example.Account;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Account 
{
	@Id
	private int id;
	
	private String user;
}
