package com.example.demo.service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;

import com.example.demo.criteria.IncidentCriteriaVO;
import com.example.demo.entity.ApplicationVO;
import com.mongodb.client.model.geojson.Point;

public interface iAppService {

	Collection<ApplicationVO> findAll();

	ApplicationVO findOne(BigInteger id);

	ApplicationVO create(ApplicationVO app);

	ApplicationVO update(ApplicationVO app);

	void delete(BigInteger id);
	
	List<ApplicationVO>  runTrials();
	
	GeoResults<ApplicationVO>  runGeoTrials();
	
	List<ApplicationVO> findUsingRepoLocationsWithin(IncidentCriteriaVO criteriaVO);

}
