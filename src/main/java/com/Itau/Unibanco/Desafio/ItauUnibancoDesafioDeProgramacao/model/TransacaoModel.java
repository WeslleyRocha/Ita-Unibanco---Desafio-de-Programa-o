package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.model;

import java.time.OffsetDateTime;

import javax.validation.constraints.PastOrPresent;



public class TransacaoModel {
	
			
		private double valor;	
		
		//OffsetDateTime converte  no formato AAAA/MM/DD - HH:MM da data. 
		
		@PastOrPresent
		private OffsetDateTime dataHora = OffsetDateTime.now();		
					
		

		public double getValor() {
			return valor;
		}


		public void setValor(double valor) {
			this.valor = valor;
		}


		public OffsetDateTime getDataHora() {
			return dataHora;
		}


		public void setDataHora(OffsetDateTime dataHora) {
			this.dataHora = dataHora;
		}
		
}
