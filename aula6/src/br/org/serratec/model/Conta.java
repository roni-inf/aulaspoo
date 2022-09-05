package br.org.serratec.model;

//Uma interface n�o pode ter inst�ncias
//N�o posso fazer - Conta conta = new Conta();
//� uma forma de substituir a heran�a em alguns coisas
//Toda interface � criada para ter somente assinaturas
//Interfaces n�o tem implementa��o.

public interface Conta {
	Double taxaBancaria=2.50;
	
	// N�o � necess�rio colocar o abstract porque fica impl�cito
	public Boolean saque(Double valor);

	public Boolean deposito(Double valor);

}
