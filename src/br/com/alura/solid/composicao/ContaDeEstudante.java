package br.com.alura.solid.composicao;

import br.com.alura.solid.teste.TesteComposicao;

public class ContaDeEstudante {

	private TesteComposicao m;
	private int milhas;

	public ContaDeEstudante() {
		this.m = new TesteComposicao();
	}

	public void deposita(double valor) {
		m.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}
	
	public void rende() {
		this.m.rende(1.01);
	}
	
	public double getSaldo() {
		return m.getSaldo();
	}


}
