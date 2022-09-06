package br.edu.senai.model;

//Com o final essa classe n�o poder� ter filhos
//Imut�vel  Math
//public final class Policial {
public class Policial {
	private String nome;
	private String matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	//Quando colocar o final no m�todo estamos proibindo a sobreescrita
	@Override
	public final String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
