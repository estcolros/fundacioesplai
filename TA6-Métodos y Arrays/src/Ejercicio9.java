import javax.swing.JOptionPane;
/**
*
* @author Estefania Colombo Rosario
*/
public class Ejercicio9 {

	public static void main(String[] args) {
		// Declaramos las variables y las inicializamos (0 y 9 porque generará numeros entre esos dos valores)
		int a = 0, b = 9;

		// Solicitiamos al usuario el tamaño del array para guardar los datos
		String usuario = JOptionPane.showInputDialog("Introduce una capacidad para guardar datos");
		int num[] = new int[Integer.parseInt(usuario)];

		// Llamamos a las funciones creadas para ejecutarlas
		numRandom(num, a, b);
		mostrarDatos(num);
		suma(num);

	}

	//Método que nos calcula un numero aleatorio
	public static void numRandom(int lista[], int a, int b) {
		for (int i = 0; i < lista.length; i++) {
			// Generamos un número entre los parametros pasados
			lista[i] = ((int) (Math.random() * (a - b) + b));

		}
	}

	//Método para mostrar los datos
	public static void mostrarDatos(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En la posición " + (i+1) + " esta el valor " + lista[i]);

		}

	}

	//Metodo que realiza el sumatorio de los numeros mostrados
	public static void suma(int lista[]) {
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			suma += lista[i];
		}
		System.out.println("La suma de todos los numeros aleatorios es " + suma);
	}
}