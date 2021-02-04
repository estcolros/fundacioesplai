import javax.swing.JOptionPane;

/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Aparecerá el cuadro de dialogo preguntando el nombre
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

		// Mostramos por consola el mensaje de bienvenida con el nombre que nos a proporcionado el usuario
		System.out.println("Bienvenida " + nombre);
	}

}
