package br.senac.sc.meuspedidos.model;

public enum TipoPessoa {

	FISICA ("FISICA"), JURIDICA("JURIDICA");

	private String label;

	TipoPessoa(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}