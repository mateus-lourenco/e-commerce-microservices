package com.example.Account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController 
{
	@GetMapping
	public Account getAccount()
	{
		Account account = new Account();
		account.setUser("bitao");
		
		return account;
	}
}
