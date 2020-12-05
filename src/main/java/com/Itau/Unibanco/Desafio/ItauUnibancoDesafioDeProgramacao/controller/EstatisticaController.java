package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.model.EstatisticaModel;


@CrossOrigin("*")
@RestController
public class EstatisticaController {
	
	@GetMapping("/estatistica")
	public ResponseEntity<Object> getAll() 
	{
		return ResponseEntity.ok(EstatisticaModel.findAll());
	}


}
