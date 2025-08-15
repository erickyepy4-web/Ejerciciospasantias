package Inventario;

import java.util.Scanner;

public class Iva {
	public static void main(String[] args) {
		//iniciamos entrada por consola
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Cantidad; ");
		
		//espera una entrada de tipo double 
		double precio = lector.nextDouble();
		
		double iva = precio *0.15;
		
		System.out.println("precio con iva: "   + iva);
		System.out.println("precio sin iva: "   + precio);
		
		lector.close();
		
		
	}
	

}
