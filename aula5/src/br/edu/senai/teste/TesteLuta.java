package br.edu.senai.teste;

import br.edu.senai.model.Categoria;
import br.edu.senai.model.Luta;
import br.edu.senai.model.Lutador;

public class TesteLuta {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("PESO PESADO");
		Categoria categoria2 = new Categoria("PESO M�DIO");
		
		Lutador lutador1 = new Lutador("Jos�", 90., 40, categoria2);
		Lutador lutador2 = new Lutador("Marcos", 92., 43, categoria1);
		
		Luta luta = new Luta(lutador1, lutador2, false);
		
		System.out.println((luta.confirmacaoLuta())?"Confirmada a luta":"N�o Confirmado");
		
	}
}
