package Model;

import java.util.Arrays;
import java.util.List;

public class Curso {
	// 5 atributos 
	private String nombreCurso;
	private String nivel;
	private double duracionHoras;
	private String[] listAlumnos;


	// Constructor
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
}
