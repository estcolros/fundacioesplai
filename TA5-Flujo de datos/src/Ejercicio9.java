/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		// Declaramos la variable y la inicializamos
		int numero = 1;

		// Definimos el bucle, incluyendo el 100
		// Realizará el bucle si número es mas pequeño o igual a 100, cuando lo alcancé finalizará
		while (numero <= 100) {
			// Condición indicando si el resto es ==0 será divisible por 2 y 3
			if (numero % 2 == 0 || numero % 3 == 0) {
				System.out.println(numero);
			}
			// Contador, Incrementamos numero
			numero++;
		}

	}

}
