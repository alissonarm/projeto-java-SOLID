package br.com.alura.solid.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salva Nota Fiscal número: " + nf.getId() + " , "  + nf.getValorBruto()   
				+ " , " + nf.getImpostos() + " , " + nf.getValorLiquido() + " , no banco");
	}

}
