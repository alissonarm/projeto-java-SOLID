package br.com.alura.solid.AbertoFechado;

public enum Compra {

	TELEVISAO(10.0, "SAO PAULO"),
	FOGAO(20.0, "BRASILIA"); 
	
	private double valor;
	private String cidade;

	Compra(double valor, String cidade) {
		this.valor = valor;
		this.cidade = cidade;
	}

	double getValor() {
		return this.valor;
	}
	
	public String getCidade() {
		return cidade;
	}
	
}
