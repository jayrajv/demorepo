package com.example.demo.newentity;

public class AddressVO
{
	public String	pincode;
	public String	city;
	public String	state;
	public String	country;
	public String	streetname;

	public AddressVO() {
		// TODO Auto-generated constructor stub
	}

	public String getPincode()
	{
		return pincode;
	}

	public void setPincode(
			String pincode)
	{
		this.pincode = pincode;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(
			String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(
			String state)
	{
		this.state = state;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(
			String country)
	{
		this.country = country;
	}

	public String getStreetname()
	{
		return streetname;
	}

	public void setStreetname(
			String streetname)
	{
		this.streetname = streetname;
	}

}
