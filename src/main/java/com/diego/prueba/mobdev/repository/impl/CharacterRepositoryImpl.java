package com.diego.prueba.mobdev.repository.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.diego.prueba.mobdev.entities.response.CharacterResponse;
import com.diego.prueba.mobdev.repository.ICharacterRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CharacterRepositoryImpl implements ICharacterRepository{
	
	@Value("${characterUrl}")
    private String urlCharacter;
	
	private static Logger LOG = LoggerFactory.getLogger(CharacterRepositoryImpl.class);

	@Override
	public CharacterResponse getCharacter(Integer id) {
		
		String url = urlCharacter + id;
		
		LOG.info("Method getCharacter: "+url);
		
		//Consumo URL
        RestTemplate restTemplate = new RestTemplate();
        
        //Headers para aceptar json
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Accept", "application/json");
        httpHeaders.set("Content-Type", "application/json");
       
        
        HttpEntity<CharacterResponse> httpEntity = new HttpEntity<>(httpHeaders);
        CharacterResponse character = new CharacterResponse();
        
        try {
            ResponseEntity<CharacterResponse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, CharacterResponse.class);
            LOG.info("Respuesta:"+responseEntity.getStatusCode());
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
            	LOG.info("Respuesta:"+responseEntity.getBody());
            	character = responseEntity.getBody();
            }
            
        } catch (Exception e){
        	if (e.getMessage().contains("Character not found")) {
        		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Character not found");
            }
            
            if(e.getMessage().contains( "Hey! you must provide an id")) {
            	throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Hey! you must provide an id");
            }
        }
        
        LOG.info("Return : "+character);
        
		return character;
	}
	

	

}
