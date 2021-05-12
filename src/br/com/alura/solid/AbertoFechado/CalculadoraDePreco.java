package br.com.alura.solid.AbertoFechado;

public class CalculadoraDePreco {

	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;

	public CalculadoraDePreco(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto) {
		
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}

}
