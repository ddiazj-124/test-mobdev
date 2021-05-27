package com.diego.prueba.mobdev.repository;

import com.diego.prueba.mobdev.entities.response.LocationResponse;

public interface ILocationRepository {

	public LocationResponse getlocation(String url);
}
