package com.springBoot.WebGames.printing;

public class Day {

	private String day = "";
	private String meridian = "";

	// takes a number from REST API to create a Day.
	public Day(int dayNum) {
		//setDay(dayNum); 
	}

	public String getDay() {
		return day;
	}

	public String getMeridian() {
		return meridian;
	}
	
	public void setDay(String day) {
		this.day = day;
	}




}
