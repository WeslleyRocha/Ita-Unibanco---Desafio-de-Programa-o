package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.service;

import com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.model.TransacaoModel;

public interface TransacaoService {
	
	TransacaoService addTransacao (TransacaoModel transacao);
	
	static void deleteAll()
	{
		
	}
	
}
