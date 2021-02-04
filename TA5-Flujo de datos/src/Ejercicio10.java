import javax.swing.JOptionPane;
/**
 *
 * @author Estefania Colombo Rosario
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Declaramos las variables y las inicializamos
		int sumaVentas=0, numeroVentas, venta;
		
		//Guardamos el valor de la venta el la variable numero
		String numero=JOptionPane.showInputDialog("Introduce el número de ventas , por favor");
		
		//Pasamos el String a int para poder realizar los cálculos
        numeroVentas=Integer.parseInt(numero);
       
        //Bucle para obtener tantas ventas como el valor de cada una de ellas
        for (int i=0;i<numeroVentas;i++){
            //Solicitamos al usuario el precio de cada venta 
            numero=JOptionPane.showInputDialog("Introduce el precio de la venta"+(i+1));
            venta=Integer.parseInt(numero);
 
            //Sumatorio de los valores de cada venta 
            sumaVentas=sumaVentas+venta;
        }
        //Mostramos por consola el sumatorio de todas las ventas
        System.out.println("La suma de todas las ventas es "+sumaVentas);
	}

}
