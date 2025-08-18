package Principal;

import Controlador.CursoControlador;
import Model.Curso;
import Vista.CursoVista;

public class Main {
	
	public static void main(String[] args) {
		
		 String info = null;
		 if (info == null) {
			 String terceBgu;
				terceBgu = info;
				 terceBgu = "el curso cuenta con 18 estudiantes y son mmuy diciplinados reciben 13 materias diferentes";
					System.out.println("cursos" + terceBgu);
				
			
			}	 
		
		
		//nuevo estudiante
		
		 String nuevo1 = null;
		 if (nuevo1 == null) {
			// Ahora asignamos un valor
				nuevo1 = "Juan";
				System.out.println("el nuevo estudiante es" + nuevo1);
				System.out.println("el nueva estuidainte" +nuevo1 + " ha sido agregado");
			 
			    
			}

		
	//promedio
	 double n1= 8;
	 double n2 = 0;
	 double n3 = 7;
	 double n4= 7;
     double resu;
	 double nota = (n1+n2+n3+n4)/4;
	 resu=nota;
		
		 String[] nombres= {"Juan","Pepito","Valeria","Juan","Pepito","Juan","Erick","Pepito","Erick"};

		 Curso alumnos = new Curso("java basico" , "1", 160, nombres , nota, nuevo1,info);
		 
		 
		 CursoVista vista = new CursoVista();
		 CursoControlador controlador = new CursoControlador(alumnos, vista);
		 
		 controlador.buscarAlumno("jairo");
		 controlador.buscarAlumno("erick");
		 

	
	}

}

