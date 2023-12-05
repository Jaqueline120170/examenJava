package edu.Servicios;

import java.util.Scanner;
/**
 * Interfaz que contiene los metodos en relacion con toda la operativa para llevar  acabo la implementacion del menú
 * @author jrt 5/12/2023
 */
public interface OperativaInterfaz {

	/**
	 * método que lleva  acabo toda la operativa para ir añadiendo el importe de las ventas cada vez que se quiera añadir una e ir sumando
	 * @author jrt 5/12/2023
	 */
	public void añadirVenta();
	
	/**
	 * método que lleva a cabo la operativa para poder ir restando el importe de gastos al total de ventas 
	 * @author jrt 5/12/2023
	 * devuelve un entero con el total de la resta
	 */
	public int añadirGasto();
	
	/**
	 * Método que mostrará un mensaje en relacion al calculo de cierre de ventas menos los gastos del día
	 * @author JRT 5/12/2023
	 * devuelve un entero con el total y ademas un mensaje string
	 */
	public void mostrarTotal();
	public int pruebaVenta();
	
}
