package model;

public class Conta {

	public int numeroConta;
	public String titular;
	public double saldo;

	// N�o tem retorno
	public void deposito(double valor) {
		// saldo = saldo + valor;
		saldo += valor;
	}

	// M�todo com retorno
	public boolean saque(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo-=valor;
			return true;
		}
	}
}
