import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Solicitamos al usuario que introduzca un numero para contabilizar sus cifras
		String usuario = JOptionPane.showInputDialog("Introduce un numero para contabilizar sus cifras");
		int numero = Integer.parseInt(usuario);
		int xcifras = cifras(numero);

		// Mostramos por consola las cifras que tiene el numero introducido
		System.out.println("El numero " + numero + " tiene " + xcifras + " cifras");
	}

	// Método para calculas las cifras de un numero
	public static int cifras(int numero) {
		int i = 0;

		while (numero != 0) {
			numero = numero / 10;
			i++;
		}

		return i;

	}

}
