package com.diego.prueba.mobdev.entities.response;

public class GetCharacterResponse {

	private Integer id;
	private String name;
	private String status;
	private String species;
	private String type;
	private int episode_count;
	private OriginResponse origin;
	
	public GetCharacterResponse(Integer id, String name, String status, String species, String type, int episode_count,
			OriginResponse origin) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.type = type;
		this.episode_count = episode_count;
		this.origin = origin;
	}
	
	public GetCharacterResponse() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEpisode_count() {
		return episode_count;
	}

	public void setEpisode_count(int episode_count) {
		this.episode_count = episode_count;
	}

	public OriginResponse getOrigin() {
		return origin;
	}

	public void setOrigin(OriginResponse origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "RootResponse [id=" + id + ", name=" + name + ", status=" + status + ", species=" + species + ", type="
				+ type + ", episode_count=" + episode_count + ", origin=" + origin + "]";
	}
	
	

}
