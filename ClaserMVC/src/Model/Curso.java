package Model;

import java.util.Arrays;
import java.util.List;

public class Curso {
	
	private String nombreCurso;
	private String nivel;
	private double duracionHoras;
	private String[] listAlumnos;
	/*private double promedio;
	private String nuevoAlum;
	private String infCurso;*/
	

	// Constructor
	/*public Curso(String nombreCurso, String nivel, double duracionHoras,  String[] listAlumnos,double promedio,String nuevoAlum,String infCurso) {
		this.nombreCurso = nombreCurso;
		this.nivel = nivel;
		this.duracionHoras = duracionHoras;
		this.listAlumnos = listAlumnos;
	    this.promedio = promedio;
	    this.setNuevoAlum(nuevoAlum);
	    this.setInfCurso(infCurso);

	}*/
	
	public Curso(String nombreCurso, String nivel, double duracionHoras,  String[] listAlumnos) {
		this.nombreCurso = nombreCurso;
		this.nivel = nivel;
		this.duracionHoras = duracionHoras;
		this.listAlumnos = listAlumnos;
		
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(double duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public String[] getListAlumnos() {
		return listAlumnos;
	}

	public void setListAlumnos(String[] listAlumnos) {
		this.listAlumnos = listAlumnos;
	}
	

	public String BuscarNombres(String nombreABuscar) {

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
	
	public void AgregarAlumno(String nuevoAlumno) {
		String[] nuevaLista = Arrays.copyOf(listAlumnos, listAlumnos.length +1);
		nuevaLista[nuevaLista.length - 1] = nuevoAlumno;
		this.listAlumnos = nuevaLista;
	
	}


}
