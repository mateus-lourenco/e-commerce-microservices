package com.example.Account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController 
{
	@GetMapping("/accounts/{id}/")
	public Account getAccount(@PathVariable int id)
	{
		Account account = new Account();
		account.setId(666);
		account.setUser("bitao");
		
		return account;
	}
}
