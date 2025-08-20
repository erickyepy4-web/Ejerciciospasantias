package Controlador;

import Model.Promedio;
import Vista.Vistapromedio;

public class controladorPromedio {
	private Promedio alumno;
	private Vistapromedio vistaAlumno;

	public controladorPromedio(Promedio alumno, Vistapromedio vistaAlumno) {

		this.alumno=alumno;
		this.vistaAlumno=vistaAlumno;
	}
	public controladorPromedio( Vistapromedio vistaAlumno) {

		this.vistaAlumno=vistaAlumno;
	}
	public void sacarPromedio() {

		//asignar una nota
		if(this.alumno == null) {			
			Promedio alumno = new Promedio();
		}
		alumno.setNota1(vistaAlumno.pedirNota(1));
		alumno.setNota2(vistaAlumno.pedirNota(2));
		alumno.setNota3(vistaAlumno.pedirNota(3));
		alumno.setNota4(vistaAlumno.pedirNota(4));

		Double notafin;


		// realizamos el calculo y recuperamos las notas

		notafin=(alumno.getNota1() + alumno.getNota2() + alumno.getNota3() + alumno.getNota4())/4;
		// asignamos el resultado del calculo
		alumno.setNtfinal(notafin); 

		vistaAlumno.mostrarPromedio(alumno.getNtfinal());

	}

}
