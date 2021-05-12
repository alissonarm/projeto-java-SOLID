package br.com.alura.solid.teste;

import br.com.alura.solid.AbertoFechado.CalculadoraDePreco;
import br.com.alura.solid.AbertoFechado.Frete;
import br.com.alura.solid.AbertoFechado.ServicoDeEntrega;
import br.com.alura.solid.AbertoFechado.TabelaDePreco;
import br.com.alura.solid.AbertoFechado.TabelaDePrecoPadrao;

public class TesteAbertoFechado {

	public static void main(String[] args) {
		
		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
		
		CalculadoraDePreco calculadora = new CalculadoraDePreco(tabela, entrega);
		
	}
	
}
