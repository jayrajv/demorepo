package com.example.demo.newentity;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "incidentsCollection")
public class IncidentVO
{

	@Id
	public BigInteger			incidentId;
	public ChannelUserInfoVO	incReportedBy;
	public LocationVO			incLocation;
	public boolean				wasHelpAvailalble;
	public String				incDescription;
	public byte[]				incPhoto;
	public String				incidentSeverity;
	public String				incType;
	public String				incidentReportedOnChannel;

	public IncidentVO() {
		super();
	}

	public BigInteger getIncidentId()
	{
		return incidentId;
	}

	public void setIncidentId(
			BigInteger incidentId)
	{
		this.incidentId = incidentId;
	}

	public ChannelUserInfoVO getIncReportedBy()
	{
		return incReportedBy;
	}

	public void setIncReportedBy(
			ChannelUserInfoVO incReportedBy)
	{
		this.incReportedBy = incReportedBy;
	}

	public LocationVO getIncLocation()
	{
		return incLocation;
	}

	public void setIncLocation(
			LocationVO incLocation)
	{
		this.incLocation = incLocation;
	}

	public boolean isWasHelpAvailalble()
	{
		return wasHelpAvailalble;
	}

	public void setWasHelpAvailalble(
			boolean wasHelpAvailalble)
	{
		this.wasHelpAvailalble = wasHelpAvailalble;
	}

	public String getIncDescription()
	{
		return incDescription;
	}

	public void setIncDescription(
			String incDescription)
	{
		this.incDescription = incDescription;
	}

	public byte[] getIncPhoto()
	{
		return incPhoto;
	}

	public void setIncPhoto(
			byte[] incPhoto)
	{
		this.incPhoto = incPhoto;
	}

	public String getIncidentSeverity()
	{
		return incidentSeverity;
	}

	public void setIncidentSeverity(
			String incidentSeverity)
	{
		this.incidentSeverity = incidentSeverity;
	}

	public String getIncType()
	{
		return incType;
	}

	public void setIncType(
			String incType)
	{
		this.incType = incType;
	}

	public String getIncidentReportedOnChannel()
	{
		return incidentReportedOnChannel;
	}

	public void setIncidentReportedOnChannel(
			String incidentReportedOnChannel)
	{
		this.incidentReportedOnChannel = incidentReportedOnChannel;
	}

}
