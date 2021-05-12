package br.com.alura.solid.coesao;

public enum Cargo {
	
	DESENVOLVEDOR(new dezOuVintePorcento()), 
	DBA(new quinzeOuVinteCincoPorcento()), 
	TESTER(new quinzeOuVinteCincoPorcento());
	
	private RegraDeCalculo regra;
	
	Cargo (RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
