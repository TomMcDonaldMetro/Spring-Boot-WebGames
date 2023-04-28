package com.springBoot.WebGames.keys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherGrid {

	private String id;
	private String type;
	private com.springBoot.WebGames.keys.two.Properties properties;
	
	public WeatherGrid() {
		
	}
	
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public com.springBoot.WebGames.keys.two.Properties getProperties() {
		return properties;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setProperties(com.springBoot.WebGames.keys.two.Properties properties) {
		this.properties = properties;
	}
	
	
}
