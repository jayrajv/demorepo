package com.example.demo.entity;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

public class LocationVO {

	public LocationVO() {
		// TODO Auto-generated constructor stub
	}
	   //@JsonSerialize(using = GeometrySerializer.class)
	    //@JsonDeserialize(contentUsing = GeometryDeserializer.class)
	
	private double lati;
	private double longi;
	private String pincode;
	private String country;
	private String state;
	private String city;
	private String locality;
private GeoJsonPoint geoPoint;
	
	
	public GeoJsonPoint getGeoPoint() {
	return geoPoint;
}

public void setGeoPoint(GeoJsonPoint geoPoint) {
	this.geoPoint = geoPoint;
}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public double getLati() {
		return lati;
	}

	public void setLati(double lati) {
		this.lati = lati;
	}

	public double getLongi() {
		return longi;
	}

	public void setLongi(double longi) {
		this.longi = longi;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
