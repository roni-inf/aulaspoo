package teste;

import javax.swing.JOptionPane;

public class Teste3EntradaDados {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Entre com o primeiro n�mero:");
		String numero2 = JOptionPane.showInputDialog("Entre com o segundo n�mero:");
		
		Double nota1 = Double.parseDouble(numero1);
		Double nota2 = Double.parseDouble(numero2);
		
		JOptionPane.showMessageDialog(null,"M�dia"+ (nota1+nota2)/2);
	}

}
