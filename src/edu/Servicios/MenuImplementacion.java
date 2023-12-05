package edu.Servicios;
import java.util.Scanner;

/**
 * Clase con la implementacion o procedimiento de cada metodo para la interacción con el usuario
 * @author JRT 5/12/2023
 */
public class MenuImplementacion implements MenuInterfaz {
	Scanner sc = new Scanner (System.in);
	
	@Override
	public int mostrarMenuYSeleccion(Scanner sc) {
		int opcionSeleccionada;
		
		System.out.println("Introduzca la opcion que desee ejecutar");
		System.out.println("0. Cerrar el menu");
		System.out.println("1.Añadir venta ");
		System.out.println("2. Añadir un gasto");
		System.out.println("3 Quiero ver el total");
		opcionSeleccionada=sc.nextInt();
		return opcionSeleccionada;
		
	}
	
public int pedirVenta (Scanner sc) {
		
		int venta;
		System.out.println("Introduzca el importe de la venta");
		venta=sc.nextInt();
		return venta;
		
	}

public int pedirGasto (Scanner sc) {
	
	int gasto;
	System.out.println("Introduzca el monto del gasto");
	gasto=sc.nextInt();
	return gasto;
}

}
