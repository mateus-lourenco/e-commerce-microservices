package com.example.Shipping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipments")
public class ShippingController 
{
	@GetMapping
	public String getShipping() 
	{
		Shipping shippingFake = new Shipping();
		
		return shippingFake.toString();
	}
}
