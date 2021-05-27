package com.diego.prueba.mobdev.repository;

import com.diego.prueba.mobdev.entities.response.CharacterResponse;

public interface ICharacterRepository {

	public CharacterResponse getCharacter(Integer id);
}
