import javax.swing.JOptionPane;
/**
*
* @author Estefania Colombo Rosario
*/
public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaramos y definimos el array con 10 posiciones
		int num[] = new int[10];

		// Llamamos a los metodos creados
		rellenarArray(num);
		mostrarArray(num);
	}

	public static void rellenarArray(int lista[]) {
		// Recoremos el array
		// .length indica la longitud del array
		for (int i = 0; i < lista.length; i++) {
			// Solicitamos al usuario los datos para ir rellenando el array
			String usuario = JOptionPane.showInputDialog("Introduce un número");
			// Los datos se irán guardando
			lista[i] = Integer.parseInt(usuario);
		}
	}

	public static void mostrarArray(int lista[]) {
		// Recoremos el array
		// .length indica la longitud del array
		for (int i = 0; i < lista.length; i++) {
			// Mostramos al usuario por consola los numeros guardados en la posición
			// correspondiente
			System.out.println("En la posición " + (i+1) + " se encuentra el valor " + lista[i]);
		}
	}

}
