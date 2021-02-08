import javax.swing.JOptionPane;
/**
*
* @author Estefania Colombo Rosario
*/
public class Ejercicio12 {

	public static void main(String[] args) {

		// Solicitamos al usuario la dimension del array y el digito
		String usuario = JOptionPane.showInputDialog("Indica el tamaño del array");
		int tamaño[] = new int[Integer.parseInt(usuario)];
		usuario = JOptionPane.showInputDialog("Indica que digito debe acabar el numero para ser guardado");
		int ultimoDigito = Integer.parseInt(usuario);

		// Rellenamos el array
		rellenarNumRandom(tamaño, 1, 300);

		// Creamos un array que contenga los numeros terminados en el numero especificado
		int terminadosEn[] = numUsuario(tamaño, ultimoDigito);

		// Mostramos el resultado,
		mostrarDatos(terminadosEn);

	}

	// Método para rellenar el array con numeros random
	public static void rellenarNumRandom(int lista[], int a, int b) {
		for (int i = 0; i < lista.length; i++) {
			// Generamos un número entre los parametros pasados
			lista[i] = ((int) (Math.random() * (a - b) + b));
		}
	}

	// Método para mostrar los datos que se han rellenado en los arrays
	public static void mostrarDatos(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			// No incluimos las posiciones que tengan un 0
			if (lista[i] != 0) {
				System.out.println("El numero " + lista[i] + " acaba en el numero introducido");
			}
		}
	}

	// Método para mostrar numeros del array acabados en el que introdujo el usuario
	public static int[] numUsuario(int num[], int ultimo_numero) {

		// Array que almacenara los numeros terminados en el numero pedido
		int terminadosEn[] = new int[num.length];

		for (int i = 0; i < terminadosEn.length; i++) {
			int numeroFinal = num[i] % 10;
			if (numeroFinal == ultimo_numero) {
				terminadosEn[i] = num[i];
			} 
		}

		return terminadosEn;
	}

}
