package Controlador;

import Model.Curso; 
import Vista.CursoVista;

public class CursoControlador {
	private Curso modelo;
	private CursoVista vista;

	//constructor
	public CursoControlador(Curso modelo, CursoVista vista) {
		this.modelo= modelo;
		this.vista=vista;
	}
	
	public void buscarAlumno(String nombre) {
		String resultado = modelo.BuscarNombres(nombre);
		vista.mostrarResultadosBusqueda(resultado);
		
	}
	
	//Agregar alumno
	public void agregarAlumno(String nombreAlumno) {
		modelo.AgregarAlumno(nombreAlumno);
		vista.mostrarNuevoAlumno(nombreAlumno);
	}
	public void listaAlumnos() {
		vista.mostrarListaAlumnos(modelo.getListAlumnos());
	}
}
