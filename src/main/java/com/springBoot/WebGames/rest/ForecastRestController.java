package com.springBoot.WebGames.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springBoot.WebGames.keys.Forecast;


@RestController
@RequestMapping("/api")
public class ForecastRestController {
		
	@GetMapping("/forecast")
	public String display() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		String uri = "https://api.weather.gov/gridpoints/MPX/108,72/forecast";
		
		Forecast result = restTemplate.getForObject(uri, Forecast.class);
		return result.getProperties().getPeriods().toString();
	}
}
