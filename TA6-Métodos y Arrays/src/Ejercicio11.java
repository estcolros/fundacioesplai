import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio11 {

	public static void main(String[] args) {

		// Solicitamos al usuario que introduzca la dimensión deseada para los arrays
		String usuario = JOptionPane.showInputDialog("Introduce una dimensión");
		int tamaño = Integer.parseInt(usuario);

		// Creamos los arrays
		int array1[] = new int[tamaño];
		int array2[];

		// Rellenamos el array1 con numeros aleatorios entre 10 y 100
		rellenarNumRandom(array1, 10, 100);

		// Apuntamos el array2 al array1, reasignando los valores con numeros aleatorios
		array2 = array1;

		// Creamos un nuevo array para el array1, ya que anteriormente se ha volcado el array2 en él
		array1 = new int[tamaño];

		// Lo volvemos a rellenar, ya que al crear el array de nuevo no contiene los  numeros anteriores
		rellenarNumRandom(array1, 10, 100);

		// Creamos array3, obtendrá el resultado de multiplicar los valores de array1*array2
		int array3[] = multiplicacion(array1, array2);

		// Mostramos los datos de los arrays
		System.out.println("Array1");
		mostrarDatos(array1);

		System.out.println("Array2");
		mostrarDatos(array2);

		System.out.println("Array3");
		mostrarDatos(array3);

	}

	// Método para rellenar el array con numeros random
	public static void rellenarNumRandom(int lista[], int a, int b) {
		for (int i = 0; i < lista.length; i++) {
			// Generamos un número entre los parametros pasados
			int random = (int) (Math.random() * 100);
			lista[i] = random;
		}
	}

	// Método para mostrar los datos que se han rellenado en los arrays
	public static void mostrarDatos(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			int ifinal;
			ifinal = i + 1;
			System.out.println("El indice " + ifinal + " esta el valor " + lista[i]);
		}
	}

	// Método para multiplicar las arrays
	public static int[] multiplicacion(int array1[], int array2[]) {
		int array3[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}

}
