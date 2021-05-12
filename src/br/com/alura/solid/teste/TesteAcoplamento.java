package br.com.alura.solid.teste;

import java.util.ArrayList;

import br.com.alura.solid.acoplamento.AcaoAposGerarNota;
import br.com.alura.solid.acoplamento.EnviadorDeEmail;
import br.com.alura.solid.acoplamento.Fatura;
import br.com.alura.solid.acoplamento.GeradorDeNotaFiscal;
import br.com.alura.solid.acoplamento.NotaFiscal;
import br.com.alura.solid.acoplamento.NotaFiscalDao;

public class TesteAcoplamento {
	
	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscal(10, 20);
		
		Fatura fatura = new Fatura();
		fatura.setCliente("Fulano");
		fatura.setValorMensal(200);
				
		ArrayList<AcaoAposGerarNota> acoes = new ArrayList<>();
		acoes.add(new EnviadorDeEmail());
		acoes.add(new NotaFiscalDao());
			
		GeradorDeNotaFiscal gnf = new GeradorDeNotaFiscal(acoes);
		gnf.gera(fatura);
		
	}

}
