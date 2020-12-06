package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.service.TransacaoService;


@CrossOrigin("*")
@RestController
public class EstatisticaController {
	
	@Autowired
	private TransacaoService repository;
	
	@GetMapping("/estatistica")
	public ResponseEntity<DoubleSummaryStatistics> getAll() 
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.getEstatistica());
	}


}
