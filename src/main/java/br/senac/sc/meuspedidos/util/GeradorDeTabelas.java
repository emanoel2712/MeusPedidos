package br.senac.sc.meuspedidos.util;

import javax.persistence.Persistence;

public class GeradorDeTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("MeusPedidosPU");
	}
	
}
