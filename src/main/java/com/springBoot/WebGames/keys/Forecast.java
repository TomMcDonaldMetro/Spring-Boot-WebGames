package com.springBoot.WebGames.keys;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
	
	/**
	 * 
	 */
	private String type;
	//private Geometry geometry;
	private Properties properties;
	
	public Forecast() {
		
	}

	public String getType() {
		return type;
	}

//	public Geometry getGeometry() {
//		return geometry;
//	}

	public Properties getProperties() {
		return properties;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public void setGeometry(Geometry geometry) {
//		this.geometry = geometry;
//	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Forecast [type=" + type + ", properties=" + properties + "]";
	}
	
	
}
