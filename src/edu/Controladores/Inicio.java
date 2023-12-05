package edu.Controladores;
import java.util.Scanner;
import edu.Servicios.MenuImplementacion;
import edu.Servicios.MenuInterfaz;
import edu.Servicios.OperativaInterfaz;
import edu.Servicios.OperativaImplementacion;

/**
 *  Clase principal de la aplicación
 * @author JRT 5/12/2023 
 */

public class Inicio {

	/**
	 * Método de entrada a la aplicación
	 * @author JRT - 5-12/2023
	 * @param args
	 */
	

	public static void main(String[] args) {
		
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		Scanner sc = new Scanner (System.in);
		
		int seleccionUsuario;
		boolean cerrarMenu=false;
		
		while(!cerrarMenu) {
			
			seleccionUsuario= mi.mostrarMenuYSeleccion(sc);
			
			switch(seleccionUsuario) {
			
			case 0 :
				System.out.println("0.Se cerrará el menú");
				cerrarMenu=true;
				break;
			case 1:
				System.out.println("1. Se añadirá una venta");
				oi.pruebaVenta();
				break;
			case 2: 
				System.out.println("2. Se añadirá un gasto");
				oi.añadirGasto();
				break;
			case 3:
				System.out.println("3. Se mostrará el total");
				oi.mostrarTotal();
				break;
			
			}
		}
			
			

	}

}
