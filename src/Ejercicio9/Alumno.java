package Ejercicio9;

import java.io.Serializable;

// Serializable es necesario para poder guardar el objeto en un archivo
public class Alumno implements Serializable {
    private String nombre;
    private int edad;
    private double notaMedia;


    //Constructores
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Aqui se hace toString para poder imprimir el objeto
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", notaMedia=" + notaMedia +
                '}';
    }
}
