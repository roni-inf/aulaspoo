package br.org.serratec.model;

public class TotalizaTributos {
	private Double total;

	public Double getTotal() {
		return total;
	}
	
	public void totalGeralTributos(Tributacao t) {
		total += t.calcularICMS() + t.calcularImpostoDeRenda();
	}
}
