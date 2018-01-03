package com.example.demo.controller;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ApplicationVO;
import com.example.demo.service.iAppService;

@RestController
public class DemoController {

	@Autowired
	private iAppService appService;

	public DemoController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/api/app", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApplicationVO> createApp(@RequestBody ApplicationVO myapp) {

		ApplicationVO returnApp = appService.create(myapp);

		return new ResponseEntity<ApplicationVO>(returnApp, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/api/getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<ApplicationVO>> getAllApps() {

		Collection<ApplicationVO> listApps = appService.findAll();

		return new ResponseEntity<Collection<ApplicationVO>>(listApps, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/api/getlocations/{distance}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ApplicationVO>> getbyLocDistance(@PathVariable("distance") String distance) {

		//List<ApplicationVO> listApps = appService.findByLocationNear(Double.parseDouble(distance));
		List<ApplicationVO> listApps = appService.findByLocationGeoPoint(Double.parseDouble(distance));

		return new ResponseEntity<List<ApplicationVO>>(listApps, HttpStatus.OK);
	}

	@RequestMapping(value = "/api/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ApplicationVO> deleteApp(@PathVariable("id") BigInteger id) {

		appService.delete(id);

		return new ResponseEntity<ApplicationVO>(HttpStatus.NO_CONTENT);
	}

}
