import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Solicitamos al usuario que introduzca un numero para realizar la conversion a binario
		String usuario = JOptionPane.showInputDialog("Introduce un numero para realizar la conversión");
		int numero = Integer.parseInt(usuario);
		
		String binario = conversion(numero);
		System.out.println("El numero " + numero + " en binario es " + binario);
	}

	// Método para realizar la conversión de un numero a binario
	public static String conversion(int numero) {
		String binario = ""; // cadena vacia para ir almacenando
		String numbin;

		for (int i = numero; i > 0; i = i / 2) {
			if (i % 2 == 0) { // si el resto es 0
				numbin = "0";
			} else {
				numbin = "1";
			}
			binario += numbin;
		}

		return binario;

	}

	// Otra manera de realizar la conversión
	// String binario = Integer.toBinaryString(numero);
}