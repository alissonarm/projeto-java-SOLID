package br.com.alura.rh.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dado;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dado = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dado.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	@Override
	public String toString() {
		return "Funcionario [" + dado + ", dataUltimoReajuste=" + dataUltimoReajuste + "]";
	}

	public void promover(Cargo novoCargo) {
		this.dado.setCargo(novoCargo); 
		
	}

	public BigDecimal getSalario() {
		return this.dado.getSalario();
	}

	public Cargo getCargo() {
		return this.dado.getCargo();
	}
	
}
