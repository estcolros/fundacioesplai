import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// Solicitamos al usuario el tamaño de la dimensión
		String usuario = JOptionPane.showInputDialog("Introduce un tamaño");
		int num[] = new int[Integer.parseInt(usuario)];

		// Solicitamos los limites para generar numeros primos aleatorios
		String usuario1 = JOptionPane.showInputDialog("Primer limite:");
		int a = Integer.parseInt(usuario1);
		String usuario2 = JOptionPane.showInputDialog("Segundo limite:");
		int b = Integer.parseInt(usuario2);

		// Llamamos a las funciones creadas para ejecutarlas
		rellenarRandomPrimos(num, a, b); // valores entre 1 y 100 (podriamos cambiarlo a los num deseados)
		mostrarDatos(num);

		// Mostramos el primo más grande
		int primoMayor = mayor(num);
		System.out.println("El primo más grande es el " + primoMayor);
	}

	// Método para rellenar el array con numeros primos aleatorios
	public static void rellenarRandomPrimos(int lista[], int a, int b) {

		int i = 0;
		while (i < lista.length) {
			int num = ((int) (Math.random() * (a - b) + b));
			if (primo(num)) {
				lista[i] = num;
				i++;
			}
		}
	}

	// Método para diferenciar si un numero es primo o no
	private static boolean primo(int num) {

		boolean primo = true;
		int cont = 2; // Iniciamos en 2, todos los primos son divisibles por 1 o por ellos mismos

		// Se ejecutara el bucle siempre que siga siendo primo y el numero no sea igual
		// al contador
		while (primo && (cont != num)) {
			if (num % cont == 0) {
				primo = false;
			} else {
				primo = true;
			}
			cont++;
		}
		return primo;

	}

	// Método para mostrar el contenido de la array
	public static void mostrarDatos(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En la posición " + (i + 1) + " esta el valor " + lista[i]);
		}
	}

	// Método para diferenciar el numero primo más mayor
	public static int mayor(int lista[]) {
		int mayor = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > mayor) {
				mayor = lista[i];
			}
		}

		return mayor;
	}

}
