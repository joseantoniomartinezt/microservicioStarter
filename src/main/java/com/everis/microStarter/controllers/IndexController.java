package com.everis.microStarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import starter.Saludo;

@RestController
public class IndexController {

	@Autowired
	private Saludo saludo;
	
	@GetMapping("/")
	public ResponseEntity<String> index(){
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}
}
