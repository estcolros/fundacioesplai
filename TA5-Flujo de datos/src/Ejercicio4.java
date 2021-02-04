import javax.swing.JOptionPane;

/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaramos las variables de tipo real
		double radio, area;

		String usuario = JOptionPane.showInputDialog("Introduce el radio del circulo, por favor");

		// Pasamos el string a double para poder realizar el cálculo
		radio = Double.parseDouble(usuario);

		// Formula area circulo, usamos algunos de los metodos de Math
		area = Math.PI * Math.pow(radio, 2);

		System.out.println("El area del circulo es " + area);

	}

}
