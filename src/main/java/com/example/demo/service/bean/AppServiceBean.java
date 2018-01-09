package com.example.demo.service.bean;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.example.demo.criteria.CriteriaBuilder;
import com.example.demo.criteria.IncidentCriteriaVO;
import com.example.demo.entity.ApplicationVO;
import com.example.demo.repo.AppRepository;
import com.example.demo.service.iAppService;
import com.example.demo.criteria.*;

/*
 * https://docs.mongodb.com/manual/tutorial/calculate-distances-using-spherical-geometry-with-2d-geospatial-indexes/
 */

@Service
public class AppServiceBean implements iAppService {

	@Autowired
	private AppRepository appRepo;

	@Autowired
	private MongoTemplate mongoTemplate;

	public AppRepository getAppRepo() {
		return appRepo;
	}

	public void setAppRepo(AppRepository appRepo) {
		this.appRepo = appRepo;
	}

	public AppServiceBean() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public Collection<ApplicationVO> findAll() {
		Collection<ApplicationVO> apps = appRepo.findAll();
		if (apps != null) {
			for (ApplicationVO app : apps) {
				System.out.println("AppID#" + app.getAppId() + "#Type#" + app.getAppType() + "#Locality#"
						+ app.getLocation().getLocality() + "#City#" + app.getLocation().getCity() + "#Longi/Lati#"
						+ app.getLocation().getLongi() + "," + app.getLocation().getLati());

			}
		}

		return apps;
	}

	@Override
	public ApplicationVO findOne(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplicationVO create(ApplicationVO myapp) {
		// TODO Auto-generated method stub
		ApplicationVO appv = appRepo.save(myapp);
		System.out.println("ID is " + appv.getAppId().toString() + "#" + appv.getLocation().getCity() + "#type#"
				+ appv.getAppType());
		return appv;
	}

	@Override
	public ApplicationVO update(ApplicationVO myapp) {
		// TODO Auto-generated method stub
		return appRepo.save(myapp);
	}

	@Override
	public void delete(BigInteger id) {

		appRepo.delete(id);

	}


	public List<ApplicationVO> getByCityType() {
		Query query = new Query();

		IncidentCriteriaVO typeCityCriteriaVo = null;
		query.addCriteria(CriteriaBuilder.buildAppsWithCityTypeCriteria(typeCityCriteriaVo));
		return mongoTemplate.find(query, ApplicationVO.class);

	}

	public GeoResults<ApplicationVO> getNear() {

		// NearQuery query = QueryBuilder.findWithin(73.7659, 18.6571, 5);

		// return mongoTemplate.geoNear(query, ApplicationVO.class);

		return null;

	}

	@Override
	public GeoResults<ApplicationVO> runGeoTrials() {
		// TODO Auto-generated method stub
		return getNear();
	}

	@Override
	public List<ApplicationVO> runTrials() {
		// TODO Auto-generated method stub
		Query query = new Query();
		IncidentCriteriaVO criteriaVO = null;

		// query.addCriteria(CriteriaBuilder.findWithinCriteria(73.8984,18.5362, 30));
		query.addCriteria(CriteriaBuilder.findWithinCriteria(criteriaVO));
		// List<ApplicationVO> apps = findByLocationGeoPoint(new Double(2));
		List<ApplicationVO> apps = mongoTemplate.find(query, ApplicationVO.class);
		Utils.printApps(apps, "CriteriaBuilder.findWithinCriteria");
		return apps;
	}

	@Override
	public List<ApplicationVO> findUsingRepoLocationsWithin(IncidentCriteriaVO criteriaVO){
		/*
		 * This method uses repository method to find apps near x,y
		 */

		double longitude = criteriaVO.getLongitude();
		double latitude = criteriaVO.getLatitude();
		double distance = criteriaVO.getDistance();

		Point pt = new Point(longitude, latitude);
		if (distance == 0) {
			distance = 30;
		}
		Distance d = new Distance(distance, Metrics.KILOMETERS);

		List<ApplicationVO> apps = appRepo.findByLocation_GeoPointNear(pt, d);

		return apps;
	}

}
