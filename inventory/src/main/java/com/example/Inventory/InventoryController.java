package com.example.Inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController 
{
	@GetMapping("/inventories/{id}/")
	public Inventory getInventory(@PathVariable int id) 
	{
		Inventory inventoryFake = new Inventory();
		inventoryFake.setId(321);
		
		return inventoryFake;
	}
}
