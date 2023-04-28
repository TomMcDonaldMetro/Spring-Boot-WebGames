package com.springBoot.WebGames.keys;

import com.springBoot.WebGames.printing.PrettyPeriod;

public class Period {

	private int number;
	private String name;
	private String startTime;
	private String endTime;
	private boolean isDaytime;
	private int temperature;
	private String temperatureUnit;
	private String temperatureTrend;
	private String windSpeed;
	private String windDirection;
	private String icon;
	private String shortForecast;
	private String detailedForecast;
	
	public Period() {
		
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public boolean isDaytime() {
		return isDaytime;
	}

	public int getTemperature() {
		return temperature;
	}

	public String getTemperatureUnit() {
		return temperatureUnit;
	}

	public String getTemperatureTrend() {
		return temperatureTrend;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public String getIcon() {
		return icon;
	}

	public String getShortForecast() {
		return shortForecast;
	}

	public String getDetailedForecast() {
		return detailedForecast;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setDaytime(boolean isDaytime) {
		this.isDaytime = isDaytime;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void setTemperatureUnit(String temperatureUnit) {
		this.temperatureUnit = temperatureUnit;
	}

	public void setTemperatureTrend(String temperatureTrend) {
		this.temperatureTrend = temperatureTrend;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setShortForecast(String shortForecast) {
		this.shortForecast = shortForecast;
	}

	public void setDetailedForecast(String detailedForecast) {
		this.detailedForecast = detailedForecast;
	}


	@Override
	public String toString() {
		PrettyPeriod pretty = new PrettyPeriod(this);
		return pretty.Print();
	}
	
	
}
