package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.model.TransacaoModel;
import com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.service.TransacaoService;


@Controller("*")
@RestController
public class TransacaoController {
	
	@Autowired
	private TransacaoService transacaoService;
		
	//Metodo Post
	@PostMapping("/transacao")
	public ResponseEntity<TransacaoModel> addTransacao(@Valid @RequestBody TransacaoModel transacao)
	{
		transacaoService.add(transacao);
		
		if(transacao == null) 
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			
		} 
		
		if(transacao.getValor() <= -1) 
		
		{
			return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	
	@DeleteMapping("/transacao")
	public ResponseEntity<TransacaoModel> delete()
	{	
		
		transacaoService.clear();
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	

}
