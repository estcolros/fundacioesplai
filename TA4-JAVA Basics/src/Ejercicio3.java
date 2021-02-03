/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos las variables (valor entero y real) y las inicializamos
		int X = 5, Y = 3;
		double M = 2.7, N = 8.1;

		// Imprimimos por consola los valores asignados a cada variable
		System.out.println("Variable X = " + X);
		System.out.println("Variable Y = " + Y);
		System.out.println("Variable M = " + M);
		System.out.println("Variable N = " + N);

		// Imprimimos por consola las diferentes operaciones matemáticas
		System.out.println("\n" + X + " + " + Y + " = " + (X + Y));
		System.out.println(X + " - " + Y + " = " + (X - Y));
		System.out.println(X + " * " + Y + " = " + X * Y);
		System.out.println(X + " / " + Y + " = " + X / Y);
		System.out.println(X + " % " + Y + " = " + X % Y);
		System.out.println(N + " + " + M + " = " + (N + M));
		System.out.println(N + " - " + M + " = " + (N - M));
		System.out.println(N + " * " + M + " = " + N * M);
		System.out.println(N + " / " + M + " = " + N / M);
		System.out.println(N + " % " + M + " = " + N % M);
		System.out.println(X + " + " + N + " = " + (X + N));
		System.out.println(Y + " / " + M + " = " + Y / M);
		System.out.println(Y + " % " + M + " = " + Y % M);

		// Imprimimos por consola el doble de cada variable
		System.out.println("\n" + "Variable X = " + X + " el doble es " + X * 2);
		System.out.println("Variable Y = " + Y + " el doble es " + Y * 2);
		System.out.println("Variable M = " + M + " el doble es " + M * 2);
		System.out.println("Variable N = " + N + " el doble es " + N * 2);

		// Imprimimos por consola la suma de todas las varibles
		System.out.println("\n" + X + " + " + Y + " + " + N + " + " + M + " = " + (X + Y + M + N));

		// Imprimimos por consola el producto de todas las variables
		System.out.println("\n" + X + " * " + Y + " * " + N + " * " + M + " = " + (X * Y * M * N));

	}

}
