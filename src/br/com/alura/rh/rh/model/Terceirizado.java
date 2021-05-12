package br.com.alura.rh.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	private String empresa;
	private DadosPessoais dado;
	
	public Terceirizado(String empresa, String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.empresa = empresa;
		this.dado = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public DadosPessoais getDadosPessoais() {
		return dado;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dado = dadosPessoais;
	}

}
