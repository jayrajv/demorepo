package com.example.demo.criteria;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.query.NearQuery;
import org.springframework.data.mongodb.core.query.Query;

/*
 * https://docs.mongodb.com/manual/tutorial/calculate-distances-using-spherical-geometry-with-2d-geospatial-indexes/
 */

public  final class QueryBuilder {

	public QueryBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public static NearQuery findWithinNearQuery(double longitude, double latitude, double d)
	{
		Point pt = new Point(longitude,latitude);
		if(d==0)
		{
			d=30;
		}
		NearQuery query = NearQuery.near(pt).maxDistance(new Distance(d,Metrics.KILOMETERS));
		return null;
	}
	
	

}

