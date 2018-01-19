package com.example.demo.entity;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
//import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "applications")
public class ApplicationVO {
	@Id
	private BigInteger appId;

	private String desc;
	private LocationVO location;
	private GeoJsonPoint locPoint;
	private String appType;
	private Date createdDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public GeoJsonPoint getLocPoint() {
		return locPoint;
	}

	public void setLocPoint(GeoJsonPoint locPoint) {
		this.locPoint = locPoint;
	}

	public LocationVO getLocation() {
		return location;
	}

	public void setLocation(LocationVO location) {
		this.location = location;
	}

	public BigInteger getAppId() {
		return appId;
	}

	public void setAppId(BigInteger appId) {
		this.appId = appId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
