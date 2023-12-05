package edu.Servicios;
import java.util.Scanner;

/**
 * Clase con la implementación de cada método para la operativa de calculos en función de la opcion que seleccione el usuario
 * @author JRT 5/12/2023
 */

public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);
	MenuInterfaz mi = new MenuImplementacion();
	
	public void añadirVenta() {
		
		
		int ventaInicial =mi.pedirVenta(sc);
		int acumulador=0;
		for(int i= 0; i<ventaInicial; i++ ) {
			
			acumulador += ventaInicial;
		System.out.println("el total es : " + acumulador);}
		
		}
		
		public int pruebaVenta() {
		int nuevaVenta=mi.pedirVenta(sc);
		int ventaInicial=mi.pedirVenta(sc);
		int totalVenta= (ventaInicial + nuevaVenta);
		System.out.println("El importe total de ventas es: " + totalVenta);
	
		return totalVenta;
	}
		
	
	public int añadirGasto() {
		int ventaTotal=mi.pedirVenta(sc);
		int gastoAdd=mi.pedirGasto(sc);
		int total= ventaTotal - gastoAdd;
		return total;
		
	}
	
	public void mostrarTotal() {
		
		int ventaTotal=mi.pedirVenta(sc);
		int gastoTotal=mi.pedirGasto(sc);
		int total= (ventaTotal - gastoTotal);
	
		if (total==0) {
			
			System.out.println("Vamos mal");
		}else if(total<0) {
			System.out.println("Vamos muy mal");
		}
	}
	
	
	}
	
	
	



