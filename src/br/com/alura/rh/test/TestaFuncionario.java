package br.com.alura.rh.test;

import java.math.BigDecimal;

import br.com.alura.rh.rh.model.Funcionario;
import br.com.alura.rh.service.ValidacaoPercentualReajuste;
import br.com.alura.rh.service.ValidacaoPeriodicidadeEntreReajuste;

public class TestaFuncionario {

	public static void main(String[] args) {
		
	Funcionario funcionario = new Funcionario("Alisson", "125.784.952.00", null , new BigDecimal("10000.0"));
	System.out.println(funcionario);
	
//	funcionario.atualizarSalario(new BigDecimal("2000.0"));
//	System.out.println(funcionario);
	
	}

}
