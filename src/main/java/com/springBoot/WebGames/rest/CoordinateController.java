package com.springBoot.WebGames.rest;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springBoot.WebGames.keys.Place;

@RestController
@RequestMapping("/api")
public class CoordinateController {

	@GetMapping("coordinates")
	public String displayCoord() throws IOException {

		RestTemplate restTemplate = new RestTemplate();

		

		ObjectMapper objectMapper = new ObjectMapper();
		URL www = new URL("https://nominatim.openstreetmap.org/search?format=jsonv2&city=hugo&state=minnesota");
		List<Place> res = objectMapper.readValue(www, objectMapper.getTypeFactory().constructCollectionType(List.class, Place.class));
		return res.get(0).toString();

	}

}
