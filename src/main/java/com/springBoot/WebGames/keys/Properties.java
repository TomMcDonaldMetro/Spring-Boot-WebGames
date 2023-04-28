package com.springBoot.WebGames.keys;

import java.io.Serializable;
import java.util.ArrayList;

public class Properties implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String updated;
	private String units;
	private String forecastGenerator;
	private String generatedAt;
	private String updateTime;
	private String validTimes;
	private Elevation elevation;
	private ArrayList<Period> periods = new ArrayList<Period>();
	
	public Properties() {
		
	}

	public String getUpdated() {
		return updated;
	}

	public String getUnits() {
		return units;
	}

	public String getForecastGenerator() {
		return forecastGenerator;
	}

	public String getGeneratedAt() {
		return generatedAt;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String getValidTimes() {
		return validTimes;
	}

	public Elevation getElevation() {
		return elevation;
	}

	public ArrayList<Period> getPeriods() {
		return periods;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public void setForecastGenerator(String forecastGenerator) {
		this.forecastGenerator = forecastGenerator;
	}

	public void setGeneratedAt(String generatedAt) {
		this.generatedAt = generatedAt;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public void setValidTimes(String validTimes) {
		this.validTimes = validTimes;
	}

	public void setElevation(Elevation elevation) {
		this.elevation = elevation;
	}

	public void setPeriods(ArrayList<Period> periods) {
		this.periods = periods;
	}

	@Override
	public String toString() {
		return "Properties [updated=" + updated + ", units=" + units + ", forecastGenerator=" + forecastGenerator
				+ ", generatedAt=" + generatedAt + ", updateTime=" + updateTime + ", validTimes=" + validTimes
				+ ", elevation=" + elevation + ", periods=" + periods + "]";
	}
	
	
	
}
