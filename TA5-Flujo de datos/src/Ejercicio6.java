import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos una constante
        final double IVA=0.21;
        
        //Declaramos las variables
        double precio, precioFinal;
 
        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto, por favor");
        
        //Pasamos el String a double
        precio=Double.parseDouble(texto);
 
        //Obtenemos el precio final 
        precioFinal=precio+(precio*IVA);
 
        //Mostramos por pantalla el resultado 
        System.out.println("El precio con el IVA incluido es "+precioFinal+"€");

	}

}
