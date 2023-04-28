package com.springBoot.WebGames.keys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Place {

	private String lat;
	private String lon;
	private String display_name;
	
	public Place() {
		
	}

	
	public String getLat() {
		return lat;
	}

	public String getLon() {
		return lon;
	}

	public String getDisplay_name() {
		return display_name;
	}


	public void setLat(String lat) {
		this.lat = lat;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}


	@Override
	public String toString() {
		return "Place [lat=" + lat + ", lon=" + lon + ", display_name=" + display_name + "]";
	}
	
	
	
}
