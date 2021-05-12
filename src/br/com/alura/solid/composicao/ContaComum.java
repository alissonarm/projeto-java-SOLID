package br.com.alura.solid.composicao;

import br.com.alura.solid.teste.TesteComposicao;

public class ContaComum {

	private TesteComposicao manipulador;

	public ContaComum() {
		this.manipulador = new TesteComposicao();
	}

	public void saca(double valor) {
		manipulador.saca(valor);
	}

	public void deposita(double valor) {
		manipulador.deposita(valor);
	}

	public void rende() {
		this.manipulador.rende(1.1);
	}

	public double getSaldo() {
		return manipulador.getSaldo();
	}

}
