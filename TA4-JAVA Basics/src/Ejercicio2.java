/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaramos las variables (tipo entero,decilmal y carácter) y las
		// inicializamos
		int N = 5;
		double A = 4.56;
		char C = 'a';

		// Imprimimos por consola el valor que se le asigna a cada variable
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + C);

		// Imprimos por consola los calculos (suma y resta)
		System.out.println(N + " + " + A + " = " + (N + A));
		System.out.println(A + " - " + N + " = " + (A - N));

		// Imprimimos por consola el valor númerico correspondiente al carácter que
		// contiene la variable C
		// (casting)
		System.out.println("Valor numérico del carácter " + C + " = " + (int) C);
	}

}
