package Alumnos;

import java.util.Arrays;
import java.util.List;

public class Curso {
    // 5 atributos 
	String nombreABuscar;
    String nombreCurso;
    String nivel;
    double duracionHoras;
    String[] listAlumnos;

    // Constructor
    public Curso(String nombreABuscar, String nombreCurso, String nivel, double duracionHoras,  String[] listAlumnos) {
    	this.nombreABuscar=nombreABuscar;
    	this.nombreCurso = nombreCurso;
        this.nivel = nivel;
        this.duracionHoras = duracionHoras;
        this.listAlumnos = listAlumnos;
    }

    
    public String BuscarNombres() {
    	 
    	 List<String> listaNombres=  Arrays.asList(listAlumnos);
    	 
    	 long contador = listaNombres.stream()
    			 .filter(nombre ->  nombre.matches("(?i)"+ nombreABuscar))
    			 .count();
    	 if(contador == 0) {
    		 return "El alumno "+nombreABuscar+" no esta inscrito en este curso";
    	 }else {
    		 return "El curso "+ nombreCurso + " tiene "+ contador + " alumnos con el mismo nombre "+ nombreABuscar;
    	 }
    }
    
    /*public static void main(String[] args) {
        // Ingreso de datos
        Curso curso1 = new Curso("Java Básico", "Principiante", 40, 199.99, "Juan Pérez");
        alum2 datosAlumnos = new alum2();
        String[] arregloNombres = datosAlumnos.ingresarNombres();

        // Nombre que queremos buscar
        String nombreBuscado = "Juan";

        int contador = 0;
        for (String nombre : arregloNombres) {
            if (nombre.matches("(?i)" + nombreBuscado)) { 
                contador++;
            }
        }

        //resultado
        System.out.println("Curso: " + curso1.nombreCurso);
        System.out.println("El nombre \"" + nombreBuscado + "\" aparece " + contador + " veces en la lista.");
    }*/
}
