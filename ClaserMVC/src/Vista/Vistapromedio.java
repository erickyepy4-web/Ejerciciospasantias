package Vista;

import java.util.Scanner;

public class Vistapromedio {
	
	Scanner alum = new Scanner (System.in);
	
	public Double pedirNota(int numNotas){
		System.out.println("Ingrese la nota"+ numNotas);
		return alum.nextDouble();
	}
	public void mostrarPromedio(Double promedio){
		
		System.out.println("el alumno tiene promedio de" + promedio);
		
	}
}
