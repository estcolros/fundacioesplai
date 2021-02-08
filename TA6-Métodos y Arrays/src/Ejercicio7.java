import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio7 {
	public static void main(String[] args) {

		// Solicitamos cantidad al usuario
		String usuario = JOptionPane.showInputDialog("Escribe una cantidad en euros");
		double cantidad = Double.parseDouble(usuario);

		// Solicitamos la moneda para realizar la conversion
		String moneda = JOptionPane
				.showInputDialog("Escribe la moneda a la que quieres convertir (libras/dolares/yenes)");
		conversion(cantidad, moneda);

	}

	// Método para realizar la conversión
	public static void conversion(double cantidad, String moneda) {

		double res = 0;

		// Booleano de control, lo utilizo en caso de que alguien no introduzca un nombre de moneda correcto
		boolean correcto = true;

		// Segun la moneda, realizamos una conversion u otra
		switch (moneda) {
		case "libras":
			res = cantidad * 0.86;
			break;
		case "dolares":
			res = cantidad * 1.29;
			break;
		case "yenes":
			res = cantidad * 129.852;
			break;
		default: // si la moneda introducida no es correcta
			System.out.println("No has introducido una moneda correcta");
			correcto = false;
		}

		// Solo si es correcto muestra el mensaje
		if (correcto) {
			System.out.println(cantidad + " euros en " + moneda + " son " + res);
		}
	}
}
