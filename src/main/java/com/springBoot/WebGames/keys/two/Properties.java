package com.springBoot.WebGames.keys.two;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {

	String id;
	String type;
	String cwa;
	String forecastOffice;
	int gridX;
	int gridY;
	
	public Properties() {
		
	}
	
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getCwa() {
		return cwa;
	}
	public String getForecastOffice() {
		return forecastOffice;
	}
	public int getGridX() {
		return gridX;
	}
	public int getGridY() {
		return gridY;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCwa(String cwa) {
		this.cwa = cwa;
	}
	public void setForecastOffice(String forecastOffice) {
		this.forecastOffice = forecastOffice;
	}
	public void setGridX(int gridX) {
		this.gridX = gridX;
	}
	public void setGridY(int gridY) {
		this.gridY = gridY;
	}
	
	
	
	
}
