package Alumnos;

	public class alum2 {
		//arreglo
		public static void main(String[] args){
			
		     String[] nombres= {"Juan","Pepito","Valeria","Juan","Pepito","Juan","Erick","Pepito","Erick"};
			
			Curso alumnos = new Curso("Jairo","java basico" , "1", 160, nombres);
			System.out.println(alumnos.BuscarNombres());
		
	    }
	}

