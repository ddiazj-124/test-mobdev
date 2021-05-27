package com.diego.prueba.mobdev.entities.response;

import java.util.List;

public class OriginResponse {

	private String name;
	private String url;
	private String dimension;
	private List<String> residents;

	public OriginResponse(String name, String url, String dimension, List<String> residents) {
		this.name = name;
		this.url = url;
		this.dimension = dimension;
		this.residents = residents;
	}
	
	public OriginResponse() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public List<String> getResidents() {
		return residents;
	}

	public void setResidents(List<String> residents) {
		this.residents = residents;
	}

	@Override
	public String toString() {
		return "OriginResponse [name=" + name + ", url=" + url + ", dimension=" + dimension + ", residents=" + residents
				+ "]";
	}
	
	

}
