package com.example.Shipping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController 
{
	@GetMapping("/shipments/{id}/")
	public Shipping getShipping(@PathVariable int id) 
	{
		Shipping shippingFake = new Shipping();
		shippingFake.setId(132);
		
		return shippingFake;
	}
}
