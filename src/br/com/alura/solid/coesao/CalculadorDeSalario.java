package br.com.alura.solid.coesao;

public class CalculadorDeSalario {

	public double calcula(Funcionario funcionario) {
		
//		return funcionario.getCargo().getRegra().calcula(funcionario);
		
		return funcionario.calculaSalario();		
		
	}



	

}
