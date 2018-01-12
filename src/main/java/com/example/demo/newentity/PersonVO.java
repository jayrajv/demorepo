package com.example.demo.newentity;

import java.math.BigInteger;

public class PersonVO
{

	private BigInteger	personId;
	private String		personFirstName;
	private String		personLastName;
	private AddressVO	personAddress;
	private String		personPhoneNumber;
	private String		personIdentiType;
	private String		personIdentiInfo;
	private byte[]		personPhoto;

	public PersonVO() {
		// TODO Auto-generated constructor stub

	}

	public BigInteger getPersonId()
	{
		return personId;
	}

	public void setPersonId(
			BigInteger personId)
	{
		this.personId = personId;
	}

	public String getPersonFirstName()
	{
		return personFirstName;
	}

	public void setPersonFirstName(
			String personFirstName)
	{
		this.personFirstName = personFirstName;
	}

	public String getPersonLastName()
	{
		return personLastName;
	}

	public void setPersonLastName(
			String personLastName)
	{
		this.personLastName = personLastName;
	}

	public String getPersonPhoneNumber()
	{
		return personPhoneNumber;
	}

	public void setPersonPhoneNumber(
			String personPhoneNumber)
	{
		this.personPhoneNumber = personPhoneNumber;
	}

	public String getPersonIdentiType()
	{
		return personIdentiType;
	}

	public void setPersonIdentiType(
			String personIdentiType)
	{
		this.personIdentiType = personIdentiType;
	}

	public String getPersonIdentiInfo()
	{
		return personIdentiInfo;
	}

	public void setPersonIdentiInfo(
			String personIdentiInfo)
	{
		this.personIdentiInfo = personIdentiInfo;
	}

	public byte[] getPersonPhoto()
	{
		return personPhoto;
	}

	public void setPersonPhoto(
			byte[] personPhoto)
	{
		this.personPhoto = personPhoto;
	}

	public AddressVO getPersonAddress()
	{
		return personAddress;
	}

	public void setPersonAddress(
			AddressVO personAddress)
	{
		this.personAddress = personAddress;
	}

}
