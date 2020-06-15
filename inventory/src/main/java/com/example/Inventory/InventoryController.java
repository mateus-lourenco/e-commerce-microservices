package com.example.Inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventories")
public class InventoryController 
{
	@GetMapping
	public Inventory getInventory() 
	{
		Inventory inventoryFake = new Inventory();
		
		return inventoryFake;
	}
}
