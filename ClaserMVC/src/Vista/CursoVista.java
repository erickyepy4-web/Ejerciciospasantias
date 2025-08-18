package Vista;

public class CursoVista {

	public void mostrarResultadosBusqueda(String resultado) {
		System.out.println(resultado);
	}
	public void mostrarNuevoAlumno(String alumno) {
		System.out.println("Alumno agregado correctamente: "+ alumno);
	}
	
	public void mostrarListaAlumnos(String[] alumnos) {
		System.out.println("Lista alumnos inscritos:");
		for(String alumno : alumnos) {
			System.out.println("- "+ alumno);
		}
		System.out.println("---------------------------------");
	}
}
