package edu.Servicios;

import java.util.Scanner;
/// Interfaz que contiene la relacio n de los metodos con la funcionalidad del menú
public interface MenuInterfaz {
	
	/**
	 * método que muestra el menú de opciones al usuario y recoge la opcion seleccionada
	 * @author JRT 5/12/2023
	 * @param sc
	 * @return la opcion int que selecciona el usuario
	 */
	public int mostrarMenuYSeleccion(Scanner sc);
	/**
	 * Método que solicita al usuario el importe de la venta 
	 * @author JRT 4/12/2023
	 * @param sc
	 * @return devuelve el importe de la venta en un tipo int
	 */
	public int pedirVenta (Scanner sc);
	
	/**
	 * MÉTODO que solicita al usuario el monto del gasto
	 * @author JRT 5/12/2023
	 * @param sc
	 * @return devuelve el monto del gasto en un tipo int
	 */
	public int pedirGasto (Scanner sc);

}
