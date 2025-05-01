package Ejercicio5;

public class Alumno {

     String nombre;
     int edad;
    double notaMedia;

    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota media: " + notaMedia);
    }
}
