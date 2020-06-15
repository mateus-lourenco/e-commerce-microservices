package com.example.recommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController 
{
	@GetMapping
	public Recommendation getRecommendation() 
	{
		Recommendation recommendation = new Recommendation();
		
		return recommendation;
	}
}
