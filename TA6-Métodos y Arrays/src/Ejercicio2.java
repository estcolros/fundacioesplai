import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		//Solicitamos al usuario la cantidad de numeros que quiere mostrar por pantalla 
		String usuario = JOptionPane.showInputDialog("Introduce la cantidad de números que quieres mostrar por pantalla");
		int limite = Integer.parseInt(usuario);

		//Solicitamos al usuario desde que numero quiere generarlos
		usuario = JOptionPane.showInputDialog("Introduce un número para generar aleatorios");
		int numero = Integer.parseInt(usuario);

		//Bucle for 
		for (int i = 0; i < limite; i++) {
			//Muestra por consola los numeros aleatorios
			System.out.println(aleatorio(numero));
		}
	}

	// Método para generar un numero aleatorio
	public static int aleatorio(int num) {
		Random a = new Random();
		int consola = a.nextInt(num);
		return consola;

	}

}
