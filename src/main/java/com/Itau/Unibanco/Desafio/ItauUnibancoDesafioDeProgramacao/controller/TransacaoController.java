package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.service.TransacaoService;


@Controller("*")
@RestController
public class TransacaoController {
	
		
	//Metodo Post
	@PostMapping("/transacao")
	public void addTransacao()
	{
		
	}
	
	@DeleteMapping("/delete")
	public void deleteAll()
	{
		TransacaoService.deleteAll();
	}

}
