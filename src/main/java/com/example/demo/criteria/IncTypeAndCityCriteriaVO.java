package com.example.demo.criteria;

import java.util.List;

public class IncTypeAndCityCriteriaVO

{
	private List<String> cities;
	private List<String> incTypes;
	private double distance;

	public IncTypeAndCityCriteriaVO() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public List<String> getIncTypes() {
		return incTypes;
	}

	public void setIncTypes(List<String> incTypes) {
		this.incTypes = incTypes;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}
