package br.org.serratec.diversos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		// ALT+SHIFT+R - ALTERAR NOME DE VARI�VEIS E M�TODOS
		// CTRL+SHIFT+F - indenta��o do programa
		int preco = 100;
		preco = 300;
		//CTRL + SHIFT + O - importa��o de pacotes
		List Alunos;
		
		LocalDate data = LocalDate.now();
		System.out.println("Hoje � dia:" + data);
		System.out.println(preco);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
