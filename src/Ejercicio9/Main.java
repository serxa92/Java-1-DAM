package Ejercicio9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorAlumnos gestor = new GestorAlumnos();

        // Crear lista de alumnos
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(new Alumno("Ana", 20, 8.5));
        lista.add(new Alumno("Luis", 22, 7.2));
        lista.add(new Alumno("Marta", 19, 9.1));

        // Guardar en archivo
        gestor.guardarAlumnos(lista);

        // Leer desde archivo y mostrar
        ArrayList<Alumno> recuperados = gestor.leerAlumnos();

        for (Alumno a : recuperados) {
            System.out.println(a);
        }
    }
}
