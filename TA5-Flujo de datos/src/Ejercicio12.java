import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio12 {

	// Declaramos como constante el máximo de intentos
	public static final int MAX_INTENTOS = 3;

	public static void main(String[] args) {
		
		// Declaramos las variables y las inicializamos
		int i = 0;
		String contraseña = "eureka";
		boolean acierto = false; // Variable booleana, ayudará a saber si la condición varia

		// Bucle principal del programa
		do {
			i++;// Incrementamos contador
			String password = JOptionPane.showInputDialog("Introduce una contraseña, por favor");

			// Comprobamos si coincide usando el metodo equals
			if (password.equals(contraseña)) {
				System.out.println("Enhorabuena, contraseña correcta"); // mensaje por consola si es correcta
				acierto = true; // variable de comprobación
				// Contabiliza los intentos que llevamos y muestra por consola un mensaje
			} else if (i <= 2) {
				System.out.println("Error, vuelve a introducir una contraseña. Llevas " + i + " intentos.");
				acierto = false;// variable de comprobación
				// Cuando llegamos al último intento
			} else {
				System.out.println("Error, es tu 3 intento. Intentos agotados.");
			}
			// Si hay un error en todo lo anterior no podremos continuar
		} while ((!acierto) && (i < MAX_INTENTOS));
	}

}
