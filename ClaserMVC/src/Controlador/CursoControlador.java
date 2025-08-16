package Controlador;

import Model.Curso; 
import Vista.CursoVista;

public class CursoControlador {
	private Curso modelo;
	private CursoVista vista;

	public CursoControlador(Curso modelo, CursoVista vista) {
		this.modelo= modelo;
		this.vista=vista;
	}
	
	public void buscarAlumno(String nombre) {
		String resultado = modelo.BuscarNombres(nombre);
		vista.mostrarResultadosBusqueda(resultado);
		
	}
}
