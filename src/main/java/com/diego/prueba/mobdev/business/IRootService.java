package com.diego.prueba.mobdev.business;

import com.diego.prueba.mobdev.entities.response.GetCharacterResponse;

public interface IRootService {

	public GetCharacterResponse getCharacter(Integer id);
}
