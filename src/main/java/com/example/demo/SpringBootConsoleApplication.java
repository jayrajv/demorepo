package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.geo.GeoResults;

import com.example.demo.entity.ApplicationVO;
import com.example.demo.repo.AppRepository;
import com.example.demo.service.iAppService;



@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
	
	@Autowired
	private iAppService appService;
	
	@Autowired
	private AppRepository appRepo;

    public static void main(String[] args) throws Exception {

        SpringApplication.run(SpringBootConsoleApplication.class, args);

    }

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {
    	
    //	System.out.println("getByCityType");
//appRepo.findAll();
        //List<ApplicationVO> apps = appRepo.findByLocation_CityAllIgnoreCase("Pune");
    	//List<ApplicationVO> apps = appService.runTrials();
    	//System.out.println("App size for getByCityType" + apps.size());
    	/*GeoResults<ApplicationVO> apps = appService.runGeoTrials();
    	
        System.out.println("App size for getByCityType" + apps.toString());*/

    }
}