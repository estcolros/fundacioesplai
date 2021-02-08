import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Solicitamos al usuario un numero para calcular su factorial
		String usuario = JOptionPane.showInputDialog("Introduce un numero para calcular su factorial");
		int numero = Integer.parseInt(usuario);

		// Mostramos por consola el resultado
		System.out.println("El factorial de " + numero + " es " + factorial(numero));

	}

	// Método para calcular el factorial de un numero
	public static int factorial(int numero) {
		int resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;

	}
}