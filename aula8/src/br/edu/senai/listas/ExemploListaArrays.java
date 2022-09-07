package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {

	public static void main(String[] args) {
		// N�o pode ser alterada a lista
		List<String> cores = Arrays.asList("Amarelo", "Verde", "Azul");
		// cores.add("Branco");
		cores.set(0, "Laranja");
		if (cores.isEmpty()) {
			System.out.println("A lista est� vazia !");
		} else {
			System.out.println(cores);
		}
		System.out.println("A lista cont�m a cor Verde?" + (cores.contains("Verde") ? "Sim" : "N�o"));

		
		List<String>meses = List.of("Jan","Fev","Mar");
		//meses.set(0, "Janeiro");
		System.out.println(meses);
		
		
		
	}

}
