package br.com.alura.solid.composicao;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimento {

	public static void main(String[] args) {

		for (ContaComum conta : contasComum()) {
			conta.rende();
			System.out.println("Novo Saldo:");
			System.out.println(conta.getSaldo());
		}

		for (ContaDeEstudante cc : contasDeEstudante()) {
			cc.rende();
			System.out.println("Novo Saldo:");
			System.out.println(cc.getSaldo());
		}
	}

	private static List<ContaComum> contasComum() {
		return Arrays.asList(umaContaCom(3100), umaContaCom(2150), umaContaCom(1200));
	}
	
	private static List<ContaDeEstudante> contasDeEstudante() {
		return Arrays.asList(contaDeEstudanteCom(100), contaDeEstudanteCom(150), contaDeEstudanteCom(200));
	}

	private static ContaDeEstudante contaDeEstudanteCom(double amount) {
		ContaDeEstudante c = new ContaDeEstudante();
		c.deposita(amount);;
		return c;
	}

	private static ContaComum umaContaCom(double valor) {
		ContaComum c = new ContaComum();
		c.deposita(valor);
		return c;
	}

}
