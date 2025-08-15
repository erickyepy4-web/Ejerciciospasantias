package Alumnos;

public class Curso {
    // 5 atributos d
    String nombreCurso;
    String nivel;
    int duracionHoras;
    double precio;
    String apellido;

    // Constructor
    public Curso(String nombreCurso, String nivel, int duracionHoras, double precio, String profesor) {
        this.nombreCurso = nombreCurso;
        this.nivel = nivel;
        this.duracionHoras = duracionHoras;
        this.precio = precio;
        this.apellido = apellido;
    }

    public static void main(String[] args) {
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
    }
}
