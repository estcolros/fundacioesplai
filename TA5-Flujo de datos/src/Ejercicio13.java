import javax.swing.JOptionPane;

/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio13 {

	public static void main(String[] args) {

		// Declaramos y inicializamos variables
		int op1, op2, resultado = 0;

		// Solicitamos el operario 1
		String mensaje1 = JOptionPane.showInputDialog("Escribe el operando 1");
		op1 = Integer.parseInt(mensaje1);// conversión

		// Solicitamos el signo aritmétrico que utilizaremos para el cálculo
		String signo = JOptionPane.showInputDialog("Escribe el signo aritmétrico (+  -  /  *  ^  %)");

		// Solicitamos el operario 2
		String mensaje2 = JOptionPane.showInputDialog("Escribe el operando 2");
		op2 = Integer.parseInt(mensaje2); // conversión

		// Según el signo arimétrico cogerá un caso u otro y realizará la operación de dentro del caso
		switch (signo) {
		case "+":
			resultado = op1 + op2;
			break;
		case "-":
			resultado = op1 - op2;
			break;
		case "*":
			resultado = op1 * op2;
			break;
		case "/":
			resultado = op1 / op2;
			break;
		case "^":
			resultado = (int) Math.pow(op1, op2);
			break;
		case "%":
			resultado = op1 % op2;
			break;
		}

		// Muestra el resultado
		JOptionPane.showMessageDialog(null,
				"La operación y su resultado: " + op1 + " " + signo + " " + op2 + " = " + resultado);

	}

}
