import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos una cadena "vacia" para no tener que crear una cadena para cada figura
		String figura = "";

		// Declaramos las variables y las inicializamos
		double resultado = 0;

		//Preguntamos al usuario que figura quiere coger para calcular su area
		String opcion = JOptionPane.showInputDialog("Escoge una figura para calcular su area: circulo, cuadrado o triangulo");

		//Estructura condicional de selección multiple
		// Depende de la figura que escoja el usuario se ejecutará un case u otro
		switch (opcion) {
		case "circulo":
			figura = JOptionPane.showInputDialog("Introduce el radio del circulo");
			int radio = Integer.parseInt(figura);
			resultado = ACirculo(radio);
			break;

		case "cuadrado":
			figura = JOptionPane.showInputDialog("Introduce la medida de un cateto del cuadrado");
			int cateto = Integer.parseInt(figura);
			resultado = ACuadrado(cateto);
			break;

		case "triangulo":
			figura = JOptionPane.showInputDialog("Introduce la base del triangulo");
			int base = Integer.parseInt(figura);
			figura = JOptionPane.showInputDialog("Introduce la altura del triangulo");
			int altura = Integer.parseInt(figura);
			resultado = ATriangulo(base, altura);
			break;

		default:
			System.out.println("La figura introducida no es correcta");
		}
		System.out.println("El area del "+opcion+" es "+resultado);
	}
	
	//Método para calcular la area de un circulo
	public static double ACirculo(int radio) {
		//Math.pow base elevada al exponente
		return Math.pow(radio, 2) * Math.PI;  
	}

	//Método para calcular la area de un cuadrado
	public static double ACuadrado(int lado) {
		return lado * lado;
	}
	
	//Método para calcular la area de un triangulo
	public static double ATriangulo(int base, int altura) {
		return base * altura / 2;
	}
	
}
