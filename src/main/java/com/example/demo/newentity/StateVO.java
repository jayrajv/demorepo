package com.example.demo.newentity;

public class StateVO
{

	private String		stateName;
	private CountryVO	stateCountry;

	public String getStateName()
	{
		return stateName;
	}

	public void setStateName(
			String stateName)
	{
		this.stateName = stateName;
	}

	public CountryVO getStateCountry()
	{
		return stateCountry;
	}

	public void setStateCountry(
			CountryVO stateCountry)
	{
		this.stateCountry = stateCountry;
	}

	public StateVO() {
		// TODO Auto-generated constructor stub
	}

}
