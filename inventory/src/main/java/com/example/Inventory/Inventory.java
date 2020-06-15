package com.example.Inventory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Inventory 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public String toString() 
	{
		return "[ id: "+ getId() +" ]";
	}
}
