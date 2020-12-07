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
		
	//Metodo Post, com endpoint "transação". 
	@PostMapping("/transacao")
	public ResponseEntity<TransacaoModel> addTransacao(@Valid @RequestBody TransacaoModel transacao)
	{
		transacaoService.add(transacao);
		
		
		//Condição IF que valida se está passando o valor no modo “POST” na Transação, retorna o status “HttpStatus”
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
	
	//Metodo Delete, com endpoint, retornando o Https OK. 
	@DeleteMapping("/transacao")
	public ResponseEntity<TransacaoModel> delete()
	{	
		
		transacaoService.clear();
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	

}
