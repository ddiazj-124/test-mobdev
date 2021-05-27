package com.diego.prueba.mobdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.prueba.mobdev.business.IRootService;
import com.diego.prueba.mobdev.entities.response.GetCharacterResponse;

@RestController
@RequestMapping("api/")
public class RootController {
	
	@Autowired
    private IRootService rootService;

	@GetMapping(value = "getCharacter/{id}")
    public ResponseEntity<GetCharacterResponse> getCharacter(@PathVariable(value = "id") int id) {
		GetCharacterResponse getCharacterResponse = rootService.getCharacter(id);
        return new ResponseEntity<GetCharacterResponse>(getCharacterResponse,HttpStatus.OK);
    }
	
	
}
