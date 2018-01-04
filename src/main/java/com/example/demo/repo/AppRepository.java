package com.example.demo.repo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.ApplicationVO;


public interface AppRepository extends MongoRepository<ApplicationVO, BigInteger> {
	List<ApplicationVO> findByLocPointNear(Point p, Distance d);
	List<ApplicationVO> findByLocationGeoPointNear(Point p, Distance d);
	List<ApplicationVO> findByLocation_CityAllIgnoreCase(String city);
	

}
