package br.com.alura.solid.teste;

import java.util.Calendar;

import br.com.alura.solid.coesao.Cargo;
import br.com.alura.solid.coesao.Funcionario;

public class TesteCoesao {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.setDataDeAdmissao(Calendar.getInstance());
		funcionario.setCargo(Cargo.DESENVOLVEDOR);
		funcionario.setId(1);
		funcionario.setNome("Fulano");
		funcionario.setSalarioBase(1000.0);
		
		System.out.println(funcionario.calculaSalario());
		
	}

}
