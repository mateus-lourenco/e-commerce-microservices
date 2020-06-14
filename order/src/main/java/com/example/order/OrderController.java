package com.example.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController 
{
	@GetMapping("/orders/{id}/")
	public Order getOrder(@PathVariable int id)
	{
		Order order = new Order();
		order.setId(123);
		
		return order;
	}
}
