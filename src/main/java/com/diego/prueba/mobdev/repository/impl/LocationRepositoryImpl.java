package com.diego.prueba.mobdev.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.diego.prueba.mobdev.entities.response.LocationResponse;
import com.diego.prueba.mobdev.repository.ILocationRepository;

@Service
public class LocationRepositoryImpl implements ILocationRepository{
	
	private static Logger LOG = LoggerFactory.getLogger(LocationRepositoryImpl.class);

	@Override
	public LocationResponse getlocation(String url) {
		LOG.info("Method getlocation: "+url);
		RestTemplate restTemplate = new RestTemplate();
		LocationResponse locacionRequest = restTemplate.getForObject(url, LocationResponse.class);
		LOG.info("Return : "+locacionRequest);
        return locacionRequest;
	}

	
}
