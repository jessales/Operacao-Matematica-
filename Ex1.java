import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String[] args) {
	int n1, n2 = 0, n3, n4;
	
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
	n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
	n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número inteiro"));
	n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número inteiro"));
	
	Calculos calc;
	calc = new Calculos();
	int resultado = calc.somar(n1, n2, n3, n4);
	JOptionPane.showMessageDialog(null, "o resultado da some é "+resultado);

	 	}

	}
