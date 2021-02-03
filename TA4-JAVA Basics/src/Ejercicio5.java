/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaramos y inicializamos todas las variables
		int A = 5, B = 7, C = 1, D = 9, AUX;

		// Imprimimos por consola los valores iniciales
		System.out.println("Asignación de valores inicales");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);

		// Reasignamos los valores de las varibles
		AUX = B;
		B = C;
		C = A;
		A = D;
		D = AUX;

		// Imprimimos por consola los nuevos valores de las variables
		System.out.println("\nAsignación de valores finales");
		System.out.println("El resultado final de B = " + B);
		System.out.println("El resultado final de C = " + C);
		System.out.println("El resultado final de A = " + A);
		System.out.println("El resultado final de D = " + D);
	}

}
