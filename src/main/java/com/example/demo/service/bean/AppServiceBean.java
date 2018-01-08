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
import com.example.demo.criteria.IncTypeAndCityCriteriaVO;
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

	@Override
	public List<ApplicationVO> findByLocationNear(Double dist) {
		// TODO Auto-generated method stub
		System.out.println("Inside findByLocationNear");

		// Position pos = new Position(73.8984, 18.5362);
		;
		Point p2 = new Point(73.8417,18.5176); // Koregaon Park
		// Point p2 = new Point(73.7659, 18.6571); // Nigdi
		Distance d = new Distance(dist, Metrics.KILOMETERS);

		List<ApplicationVO> apps = appRepo.findByLocPointNear(p2, d);
		System.out.println("Total locations near:" + apps.size());
		return apps;

	}

	public List<ApplicationVO> findByLocationGeoPoint(Double dist) {
		// TODO Auto-generated method stub
		System.out.println("Inside findByfindByLocationGeoPoint");

		// Position pos = new Position(73.8984, 18.5362);
		;
		Point p2 = new Point(73.8984, 18.5362); // Koregaon Park
		// Point p2 = new Point(73.7659, 18.6571); // Nigdi
		Distance d = new Distance(dist, Metrics.KILOMETERS);

		List<ApplicationVO> apps = appRepo.findByLocationGeoPointNear(p2, d);
		System.out.println("Total locations near:" + apps.size());
		return apps;

	}

	public List<ApplicationVO> getByCityType() {
		Query query = new Query();

		IncTypeAndCityCriteriaVO typeCityCriteriaVo = null;
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
		query.addCriteria(CriteriaBuilder.findWithinCriteria(73.8984,18.5362, 30));
		
		//List<ApplicationVO> apps = findByLocationGeoPoint(new Double(2));
		List<ApplicationVO> apps = mongoTemplate.find(query, ApplicationVO.class);
		Utils.printApps(apps, "CriteriaBuilder.findWithinCriteria");
		return apps;
	}

}
