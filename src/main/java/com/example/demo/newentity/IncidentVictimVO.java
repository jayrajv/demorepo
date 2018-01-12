package com.example.demo.newentity;

public class IncidentVictimVO extends PersonVO
{

	private boolean	victimIsAdmittedInHospital;
	private boolean	victimIsAlive;
	private String	victimHosptialName;
	private String	victimIsDocNameAvail;
	private byte[]	victimPhoto[];

	public IncidentVictimVO() {
		// TODO Auto-generated constructor stub
		super();

	}

	public boolean isVictimIsAdmittedInHospital()
	{
		return victimIsAdmittedInHospital;
	}

	public void setVictimIsAdmittedInHospital(
			boolean victimIsAdmittedInHospital)
	{
		this.victimIsAdmittedInHospital = victimIsAdmittedInHospital;
	}

	public boolean isVictimIsAlive()
	{
		return victimIsAlive;
	}

	public void setVictimIsAlive(
			boolean victimIsAlive)
	{
		this.victimIsAlive = victimIsAlive;
	}

	public String getVictimHosptialName()
	{
		return victimHosptialName;
	}

	public void setVictimHosptialName(
			String victimHosptialName)
	{
		this.victimHosptialName = victimHosptialName;
	}

	public String getVictimIsDocNameAvail()
	{
		return victimIsDocNameAvail;
	}

	public void setVictimIsDocNameAvail(
			String victimIsDocNameAvail)
	{
		this.victimIsDocNameAvail = victimIsDocNameAvail;
	}

	public byte[][] getVictimPhoto()
	{
		return victimPhoto;
	}

	public void setVictimPhoto(
			byte[][] victimPhoto)
	{
		this.victimPhoto = victimPhoto;
	}

}
