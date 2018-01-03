package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.geo.GeoJsonModule;

import com.fasterxml.jackson.databind.Module;

@Configuration
public class AppConfig {

    @Bean
    public Module registerGeoJsonModule(){
        return new GeoJsonModule();
    }

}