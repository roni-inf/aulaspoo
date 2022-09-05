package br.org.serratec.model;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {

		return " Proprietário:" + nome;
	}

	public String getNome() {
		return nome;
	}

}
