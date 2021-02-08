import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Solicitamos al usuario que introduzca un numero para más adelante saber si es primo o no
		String usuario = JOptionPane.showInputDialog("Introduce un número");
		int numero = Integer.parseInt(usuario);

		// Ejecutamos la funcion, al ejecutar el metodo devolverá true o false
		if (primo(numero)) {
			System.out.println("El numero " + numero + " es primo");
		} else {
			System.out.println("El numero " + numero + " no es primo");
		}
	}

	//Método para calcular un numéro primo
	public static boolean primo(int numero) {

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)  
				return false; //no es primo
		}
		return true; //si es primo
	}

}
