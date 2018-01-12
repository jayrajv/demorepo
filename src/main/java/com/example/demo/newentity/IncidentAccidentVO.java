package com.example.demo.newentity;

import java.util.List;

//@Document(collection = "incidentsCollection")
public class IncidentAccidentVO extends IncidentVO
{

	public String			incAccidentHighway;
	public String			incAccidentStreet;
	public boolean			incAccidentIsTRafficJam;
	public String			incAccidentNearbyPoliceStation;
	public String			incAccidentAuthorityName;
	public String			incAccidentAuthorityConNumber;
	public List<PersonVO>	incVictimDetails	= null;
	public List<PersonVO>	incAccused			= null;

	public IncidentAccidentVO() {
		// TODO Auto-generated constructor stub
		super();

	}

	public String getIncAccidentHighway()
	{
		return incAccidentHighway;
	}

	public void setIncAccidentHighway(
			String incAccidentHighway)
	{
		this.incAccidentHighway = incAccidentHighway;
	}

	public String getIncAccidentStreet()
	{
		return incAccidentStreet;
	}

	public void setIncAccidentStreet(
			String incAccidentStreet)
	{
		this.incAccidentStreet = incAccidentStreet;
	}

	public boolean isIncAccidentIsTRafficJam()
	{
		return incAccidentIsTRafficJam;
	}

	public void setIncAccidentIsTRafficJam(
			boolean incAccidentIsTRafficJam)
	{
		this.incAccidentIsTRafficJam = incAccidentIsTRafficJam;
	}

	public String getIncAccidentNearbyPoliceStation()
	{
		return incAccidentNearbyPoliceStation;
	}

	public void setIncAccidentNearbyPoliceStation(
			String incAccidentNearbyPoliceStation)
	{
		this.incAccidentNearbyPoliceStation = incAccidentNearbyPoliceStation;
	}

	public String getIncAccidentAuthorityName()
	{
		return incAccidentAuthorityName;
	}

	public void setIncAccidentAuthorityName(
			String incAccidentAuthorityName)
	{
		this.incAccidentAuthorityName = incAccidentAuthorityName;
	}

	public String getIncAccidentAuthorityConNumber()
	{
		return incAccidentAuthorityConNumber;
	}

	public void setIncAccidentAuthorityConNumber(
			String incAccidentAuthorityConNumber)
	{
		this.incAccidentAuthorityConNumber = incAccidentAuthorityConNumber;
	}

	public List<PersonVO> getIncVictimDetails()
	{
		return incVictimDetails;
	}

	public void setIncVictimDetails(
			List<PersonVO> incVictimDetails)
	{
		this.incVictimDetails = incVictimDetails;
	}

	public List<PersonVO> getIncAccused()
	{
		return incAccused;
	}

	public void setIncAccused(
			List<PersonVO> incAccused)
	{
		this.incAccused = incAccused;
	}

}
