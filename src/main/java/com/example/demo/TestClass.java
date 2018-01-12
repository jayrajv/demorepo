package com.example.demo;

import java.lang.reflect.Field;
import java.math.BigInteger;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import com.example.demo.entity.ApplicationVO;
import com.example.demo.entity.LocationVO;

class TestClass {
	
	public BigInteger appId;

	public String desc;
	public LocationVO location;
	public GeoJsonPoint locPoint;
	public String appType;

	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationVO vo = new ApplicationVO();
		printClassVariables(ApplicationVO.class);
		

	}
	
	public static void printClassVariables(Class myclass)
	{
		
		Field[] fields =  new TestClass().getClass().getFields();	
		System.out.println(fields.length);
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
	}

}
