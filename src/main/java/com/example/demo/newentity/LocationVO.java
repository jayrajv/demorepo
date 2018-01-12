package com.example.demo.newentity;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public class LocationVO
{

	private double	locationLatitude;
	private double	locationLongitude;
	private String	locationDesc;
	private String	locationCity;
	private String	locationAPIDesc;
	private String	locationState;
	private String	locationCountry;
	private GeoJsonPoint locPoint;
	
	public 

	public GeoJsonPoint getLocPoint()
	{
		return locPoint;
	}

	public void setLocPoint(
			GeoJsonPoint locPoint)
	{
		this.locPoint = locPoint;
	}

	public String getLocationState()
	{
		return locationState;
	}

	public void setLocationState(
			String locationState)
	{
		this.locationState = locationState;
	}

	public String getLocationCountry()
	{
		return locationCountry;
	}

	public void setLocationCountry(
			String locationCountry)
	{
		this.locationCountry = locationCountry;
	}

	public double getLocationLatitude()
	{
		return locationLatitude;
	}

	public void setLocationLatitude(
			double locationLatitude)
	{
		this.locationLatitude = locationLatitude;
	}

	public double getLocationLongitude()
	{
		return locationLongitude;
	}

	public void setLocationLongitude(
			double locationLongitude)
	{
		this.locationLongitude = locationLongitude;
	}

	public String getLocationDesc()
	{
		return locationDesc;
	}

	public void setLocationDesc(
			String locationDesc)
	{
		this.locationDesc = locationDesc;
	}

	public String getLocationCity()
	{
		return locationCity;
	}

	public void setLocationCity(
			String locationCity)
	{
		this.locationCity = locationCity;
	}

	public String getLocationAPIDesc()
	{
		return locationAPIDesc;
	}

	public void setLocationAPIDesc(
			String locationAPIDesc)
	{
		this.locationAPIDesc = locationAPIDesc;
	}

	public LocationVO() {
		// TODO Auto-generated constructor stub
	}

}
