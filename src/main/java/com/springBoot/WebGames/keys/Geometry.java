package com.springBoot.WebGames.keys;

import java.io.Serializable;
import java.util.ArrayList;

public class Geometry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private ArrayList<ArrayList<Double>> coordinates = new ArrayList<ArrayList<Double>>();;
	
	public Geometry() {
		
	}

	public String getType() {
		return type;
	}

	public ArrayList<ArrayList<Double>> getCoordinates() {
		return coordinates;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCoordinates(ArrayList<ArrayList<Double>> coordinates) {
		this.coordinates = coordinates;
	}
	
	
	
}
