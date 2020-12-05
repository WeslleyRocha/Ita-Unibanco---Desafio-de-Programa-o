package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.model;

import java.time.OffsetDateTime;
import java.util.Date;

import javax.validation.constraints.NotNull;


public class TransacaoModel {
	
		@NotNull	
		private float valor;	
		
		//Transforma no formato AAAA/MM/DD - HH:MM
		private OffsetDateTime dataHora= OffsetDateTime.now();		
					
		public TransacaoModel()
		{
			super();

		}
			
		public TransacaoModel(float valor, Date dataHora)
		{
			super();
			this.valor = valor;
		}
		

		public float getValor() {
			return valor;
		}


		public void setValor(float valor) {
			this.valor = valor;
		}


		public OffsetDateTime getDataHor() {
			return dataHora;
		}


		public void setDataHora(OffsetDateTime dataHora) {
			this.dataHora = dataHora;
		}
		
}
