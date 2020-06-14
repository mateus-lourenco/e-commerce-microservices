package com.example.recommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController 
{
	@GetMapping("/recommendations/{id}/")
	public Recommendation getRecommendation(@PathVariable int id) 
	{
		Recommendation recommendation = new Recommendation();
		recommendation.setId(134);
		
		return recommendation;
	}
}
