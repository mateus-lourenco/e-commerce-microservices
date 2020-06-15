package com.example.order;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Order 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public String toString(){
		return "[ order-number: " + getId() + " ]";
	}
}
