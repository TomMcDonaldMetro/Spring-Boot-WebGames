package com.springBoot.WebGames.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springBoot.WebGames.keys.Forecast;
import com.springBoot.WebGames.keys.Place;
import com.springBoot.WebGames.keys.WeatherGrid;

@Controller
public class WeatherController {

	@RequestMapping("/weather")
	public String displayWeather(HttpSession session, HttpServletRequest request) throws StreamReadException, DatabindException, IOException {
		
		RestTemplate restTemplate = new RestTemplate();

		String city = request.getParameter("city");
		String state = request.getParameter("state");
		
		System.out.println(city);
		System.out.println(state);
		
		
		if(city != null) {
			try {
				ObjectMapper objectMapper = new ObjectMapper();
				URL www = new URL("https://nominatim.openstreetmap.org/search?format=jsonv2&city=" + city + "&state=" + state);
				List<Place> res = objectMapper.readValue(www, objectMapper.getTypeFactory().constructCollectionType(List.class, Place.class));
				
				double lat = Double.parseDouble(res.get(0).getLat());
				double lon = Double.parseDouble(res.get(0).getLon());
				
				String ur = "https://api.weather.gov/points/" + lat + "," + lon;
				
				WeatherGrid wg = restTemplate.getForObject(ur, WeatherGrid.class);
				
				String uri = "https://api.weather.gov/gridpoints/" + wg.getProperties().getCwa() +"/" + wg.getProperties().getGridX() + "," + wg.getProperties().getGridY() + "/forecast";
				
				Forecast result = restTemplate.getForObject(uri, Forecast.class);
				
				session.setAttribute("forecast", result.getProperties().getPeriods());
			} catch(IOException e) {
				e.printStackTrace();
				System.out.println("Invalid input" + city + " " + state + " possibly invalid");
			}
		}
		
		
		
		return "weather";
		
	}
	
}
