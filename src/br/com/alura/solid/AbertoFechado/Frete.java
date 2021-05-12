package br.com.alura.solid.AbertoFechado;

public class Frete implements ServicoDeEntrega {
	
	public double para(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}

}
