/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos y inicializamos las variables de tipo entero
		int A = 94, B = 26;

		// Iniciamos la condicion if
		// Hacemos la comprobación para verificar que la variable A es mayor o igual a B
		// Sino ponemos un igual no lo tendria en cuenta y no entraria en la condición
		if (A >= B) {
			// If anidado
			// Comprobamos si A tiene el mismo valor que B
			if (A == B) {
				System.out.println("Los numeros " + A + " y " + B + " son iguales");
				// Sino imprimirá que es más mayor (lo comprueba previamente en el primer if)
			} else {
				System.out.println("El número " + A + " es mayor que el número " + B);
			}
			// Al contrario, B será mayor que A
		} else {
			System.out.println("El número " + B + " es mayor que el número " + A);
		}
	}
}
