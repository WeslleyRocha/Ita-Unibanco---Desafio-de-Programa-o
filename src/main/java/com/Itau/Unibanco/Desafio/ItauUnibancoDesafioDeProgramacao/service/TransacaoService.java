package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.model.TransacaoModel;

@Service
public class TransacaoService {

	public List<TransacaoModel> transacaoLista = new ArrayList<>();

	public List<TransacaoModel> getTransacoes() {
		return transacaoLista;
	}

	public TransacaoModel add(TransacaoModel transacaoModel) {
		transacaoLista.add(transacaoModel);
		int getAll = transacaoLista.indexOf(transacaoModel);
		return transacaoLista.get(getAll);
	}

	public List<TransacaoModel> clear() {
		transacaoLista.clear();
		return transacaoLista;

	}

	public DoubleSummaryStatistics getEstatistica() {
		DoubleSummaryStatistics dss = new DoubleSummaryStatistics();

		transacaoLista.stream().filter(repo -> repo.getDataHora().isAfter(OffsetDateTime.now().minusMinutes(1)))
				.forEach(valor -> dss.accept(valor.getValor()));
		
		return dss;

	}
}
