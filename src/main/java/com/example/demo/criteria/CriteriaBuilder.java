package com.example.demo.criteria;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.query.Criteria;

/*
 * https://docs.mongodb.com/manual/tutorial/calculate-distances-using-spherical-geometry-with-2d-geospatial-indexes/
 */
public final class CriteriaBuilder {

	static final String[] cities = { "Mumbai", "Pune" };
	static final String[] types = { "Hot", "Cool" };

	public CriteriaBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static Criteria buildAppsWithCityTypeCriteria(IncidentCriteriaVO typeCityCriteriaVo) {

		typeCityCriteriaVo = buildIncTypeCityCriteriaVO(typeCityCriteriaVo);

		Criteria criteriaCity = Criteria.where("location.city").in(typeCityCriteriaVo.getCities());
		Criteria criteriaType = Criteria.where("appType").in(typeCityCriteriaVo.getIncTypes());
		Criteria criteria = new Criteria().andOperator(criteriaCity, criteriaType);

		return criteria;
	}

	public static Criteria findWithinCriteria(IncidentCriteriaVO criteriaVO) {

		/*
		 * The $maxDistance operator constrains the results of a geospatial $near or
		 * $nearSphere query to the specified distance. The measuring units for the
		 * maximum distance are determined by the coordinate system in use. For GeoJSON
		 * point object, specify the distance in meters, not radians.
		 */
		criteriaVO = buildIncTypeCityCriteriaVO(criteriaVO);
		List<String> cities = criteriaVO.getCities();
		List<String> incTypes = criteriaVO.getIncTypes();
		Date stDate = criteriaVO.getStartDate();
		Date endDate = criteriaVO.getEndDate();

		if (cities != null) {
			Criteria criteriaCities = Criteria.where("location.city").in(cities);
			if (incTypes != null) {
				Criteria criteriaType = Criteria.where("appType").in(incTypes);
				criteriaCities.andOperator(criteriaType);
			}
			if (stDate != null && endDate != null) {
				Criteria criteriaDate = Criteria.where("createdDate").gte(stDate).lte(endDate);
				criteriaCities.andOperator(criteriaDate);
			}

			return criteriaCities;

		}
		double longitude = criteriaVO.getLongitude();
		double latitude = criteriaVO.getLatitude();
		double distance = criteriaVO.getDistance();

		Point pt = new Point(longitude, latitude);
		if (distance == 0) {
			distance = 30;
		}
		Circle circle = new Circle(pt, distance / LocationConstants.DISTANCE_IN_KMS);
		Criteria criteria = Criteria.where("location.geoPoint").withinSphere(circle);
		if (incTypes != null) {
			Criteria criteriaType = Criteria.where("appType").in(incTypes);
			criteria.andOperator(criteriaType);
		}
		if (stDate != null && endDate != null) {
			Criteria criteriaDate = Criteria.where("createdDate").gte(criteriaVO).lte(endDate);
			criteria.andOperator(criteriaDate);
		}

		return criteria;
		// Distance distance = new Distance(d,Metrics.KILOMETERS);

		// Criteria critera =
		// Criteria.where("location.geoPoint").nearSphere(pt).maxDistance(distance/LocationConstants.DISTANCE_IN_KMS);
		// Criteria critera =
		// Criteria.where("location.geoPoint").nearSphere(pt).maxDistance(distance/6378.1);

	}

	public static Criteria findwithinDate(IncidentCriteriaVO typeCityCriteriaVo) {

		typeCityCriteriaVo = buildIncTypeCityCriteriaVO(typeCityCriteriaVo);

		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.DECEMBER, 1);

		Date stDate = cal.getTime();
		cal.set(2018, Calendar.JANUARY, 19);
		Date endDate = cal.getTime();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		System.out.println("stDate-" + sf.format(stDate) + " " + stDate.toString());
		System.out.println("endDate-" + sf.format(endDate));

		Criteria criteria = Criteria.where("createdDate").gte(stDate).lte(endDate);
		return criteria;
	}

	private static IncidentCriteriaVO buildIncTypeCityCriteriaVO(IncidentCriteriaVO typeCityCriteriaVo) {
		typeCityCriteriaVo = new IncidentCriteriaVO();
		String pattern = "yyyy-MM-dd";
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		// Date stDate = new Date(new SimpleDateFormat)

		typeCityCriteriaVo.setLongitude(73.8984);
		typeCityCriteriaVo.setLatitude(18.5362);
		typeCityCriteriaVo.setDistance(3);
		List<String> lstCities = new ArrayList<>(Arrays.asList(cities));
		List<String> lstTypes = new ArrayList<>(Arrays.asList(types));
		typeCityCriteriaVo.setCities(lstCities);
		typeCityCriteriaVo.setIncTypes(lstTypes);

		return typeCityCriteriaVo;
	}
}
