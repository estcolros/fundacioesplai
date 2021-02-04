import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		// Guardamos lo que introduzca el usuario en dia
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana (en minisculas y sin tildes)");

		// Evalua la expresión
		// Ejecutará el bloque de sentencias que coincida con el valor de la expresión anterior
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println(dia+" es un dia laboral");
			break;
		case "sabado":
		case "domingo":
			System.out.println(dia+" es un dia festivo");
		break;
		default:
			System.out.println("Error, vuelve a ejecutar el programa");
		}

	}

}
