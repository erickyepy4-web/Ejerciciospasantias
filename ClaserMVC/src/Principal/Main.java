package Principal;

import Controlador.CursoControlador;
import Model.Curso;
import Vista.CursoVista;

public class Main {

	public static void main(String[] args) {
		
		 String[] nombres= {"Juan","Pepito","Valeria","Juan","Pepito","Juan","Erick","Pepito","Erick"};
		 Curso alumnos = new Curso("java basico" , "1", 160, nombres);
		 
		 
		 CursoVista vista = new CursoVista();
		 
		 CursoControlador controlador = new CursoControlador(alumnos, vista);
		 
		 controlador.buscarAlumno("jairo");
		 controlador.buscarAlumno("erick");
		 

	}

}

