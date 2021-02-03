/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Declaramos y inicializamos la variable
		int N = 3;

		// Imprimos por consola el valor inicial de N
		System.out.println("Valor inicial de N = " + N);

		// Irá realizando los calculos con el último valor asignado a N
		// Calculamos la suma, el operador de asignación N+=77 es igual a N=N+77(3=3+77)
		N += 77;
		// Imprimimos por consola el resultado de la suma
		System.out.println("N + 77 = " + N);

		// Calculamos la resta, el operador de asignación N-=3 es igual a N=N-3(80=80-3)
		N -= 3;
		// Imprimimos por consola el resultado de la resta
		System.out.println("N - 3 = " + N);

		// Calculamos la multiplicación, el operador de asignación N*=2 es igual a N=N*2(77=77*2)
		N *= 2;
		// Imprimimos por consola el resultado de la multiplicación
		System.out.println("N * 2 = " + N);

	}

}
