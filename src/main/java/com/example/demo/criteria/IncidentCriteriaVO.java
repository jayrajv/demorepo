package com.example.demo.criteria;

import java.util.List;

public class IncidentCriteriaVO

{
	private List<String> cities;
	private List<String> incTypes;
	private double distance;
	private double latitude;
	private double longitude;

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

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
