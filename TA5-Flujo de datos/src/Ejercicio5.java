import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		String usuario = JOptionPane.showInputDialog("Introduce un numero, por favor");

		// Pasamos el String a int para poder realizar el cálculo
		int numero = Integer.parseInt(usuario);

		// Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " si es divisible entre 2");
			// Imprime el resultado final
			System.out.println("El resultado es " + numero / 2);
		} else {
			System.out.println("El numero " + numero + " no es divisible entre 2");
		}

	}

}
