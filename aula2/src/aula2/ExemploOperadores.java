package aula2;

public class ExemploOperadores {

	public static void main(String[] args) {
		// Um atleta poder� participar de uma maratona caso
		// a idade seja superior ou altura maior ou a 1.80
		int idade = 19;
		double altura = 1.65;

		if (idade > 18 || altura >= 1.80) {
			System.out.println("Competir�");
		} else {
			System.out.println("N�o Competir�");
		}
		
		//Tern�rio
		String resposta = idade > 18 || altura >= 1.80 ? "Competir�":"N�o Competir�";
		System.out.println(resposta);
	}

}
