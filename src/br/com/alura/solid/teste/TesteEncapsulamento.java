package br.com.alura.solid.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.solid.encapsulamento.Boleto;
import br.com.alura.solid.encapsulamento.Fatura;
import br.com.alura.solid.encapsulamento.MeioDePagamento;
import br.com.alura.solid.encapsulamento.Pagamento;
import br.com.alura.solid.encapsulamento.ProcessadorDeBoletos;

public class TesteEncapsulamento {
	
	public static void main(String[] args) {
		Fatura fatura = new Fatura("Ciclano", 1000.0);
		
		List<Boleto> listaDeBoletos = new ArrayList<>();
		
		Boleto boleto = new Boleto(1111.0);
		
		ProcessadorDeBoletos pb = new ProcessadorDeBoletos();
		Pagamento pag = new Pagamento(1001.0, MeioDePagamento.BOLETO);
		fatura.adicionaPagamento(pag);
		
		pb.processa(listaDeBoletos, fatura);
		
		System.out.println(pag.getValor());
		System.out.println(pag.getForma());
		
		System.out.println(fatura.isPago());
		
	}

}
