package com.example.demo.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.query.Criteria;

public final class CriteriaBuilder {
	
	static final String []cities = {"Mumbai","Pune"};
	static final String []types = {"Hot","Cool"};

	public CriteriaBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public static Criteria buildAppsWithCityTypeCriteria(IncTypeAndCityCriteriaVO typeCityCriteriaVo)
	{
		
		typeCityCriteriaVo = buildIncTypeCityCriteriaVO(typeCityCriteriaVo);
		
		Criteria criteriaCity = Criteria.where("location.city").in(typeCityCriteriaVo.getCities());
		Criteria criteriaType = Criteria.where("appType").in(typeCityCriteriaVo.getIncTypes());
		Criteria criteria = new Criteria().andOperator(criteriaCity,criteriaType);

		return criteria;
	}
	
	
	public static Criteria findWithinCriteria(double longitude, double latitude, double d)
	{
		Point pt = new Point(longitude,latitude);
		
		
		if(d==0)
		{
			d=30;
		}
		//d=d/111;/For Km radius
		//Distance distance = new Distance(d,Metrics.KILOMETERS);
	//Criteria critera = Criteria.where("location.geoPoint").near(pt).ma;
	
	return null;
	}
	
	
	private static IncTypeAndCityCriteriaVO buildIncTypeCityCriteriaVO(IncTypeAndCityCriteriaVO typeCityCriteriaVo)
	{
		typeCityCriteriaVo = new IncTypeAndCityCriteriaVO();
		
		List <String >lstCities = new ArrayList<>(Arrays.asList(cities));
		List <String >lstTypes = new ArrayList<>(Arrays.asList(types));
		typeCityCriteriaVo.setCities(lstCities);
		typeCityCriteriaVo.setIncTypes(lstTypes);
		
		return typeCityCriteriaVo;
		
/*		List lstCities = new ArrayList();
		lstCities.add("Mumbai");
		lstCities.add("Pune");
		lstCities.add("Delhi");*/
		
/*		List lstTypes = new ArrayList();
		lstTypes.add("Hot");
		lstTypes.add("Cool");*/
		
	}
}
