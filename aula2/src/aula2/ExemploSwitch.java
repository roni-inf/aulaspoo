package aula2;

public class ExemploSwitch {

	public static void main(String[] args) {
		int mes = 5;
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
		break;
		case 2:
			System.out.println("Fevereiro");
		break;
		case 3:
			System.out.println("Mar�o");
		break;
		case 4:
			System.out.println("Abril");
		break;
		case 5:
			System.out.println("Maio");
		break;

		default:
			System.out.println("M�s inv�lido !");
			break;
		}

	}

}
