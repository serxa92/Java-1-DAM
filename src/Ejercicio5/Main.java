package Ejercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //crear arraylist de alumnos

        ArrayList<Alumno> alumnos = new ArrayList<>();

        //crear alumnos

        Alumno alumno1 = new Alumno("Juan", 20, 6.6);
        Alumno alumno2 = new Alumno("Maria", 22, 7.6);
        Alumno alumno3 = new Alumno("Pedro", 19, 8.9);

        //añadir alumnos al arraylist

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        //recorrer la lista con un for-each y llamar a mostrarInfo()

        for (Alumno alumno : alumnos) {
            alumno.mostrarDatos();
            System.out.println("-----------------");
        }

        //calcular la nota media de todos los alumnos

        double suma = 0;
        for (Alumno alumno : alumnos) {
            suma += alumno.notaMedia;
        }

        double notaMedia = suma / alumnos.size();
        System.out.println("La nota media de todos los alumnos es: " + notaMedia);
        System.out.println("-----------------");

        //alumno con la nota mas alta

        Alumno alumnoConNotaMasAlta = alumnos.get(0);
        for (Alumno alumno : alumnos) {
            if (alumno.notaMedia > alumnoConNotaMasAlta.notaMedia) {
                alumnoConNotaMasAlta = alumno;
            }
        }
        System.out.println("El alumno con la nota más alta es: " + alumnoConNotaMasAlta.nombre + " con una nota de: " + alumnoConNotaMasAlta.notaMedia);
        System.out.println("-----------------");

        //ordenar alumnos por nota media

        alumnos.sort((a1, a2) -> Double.compare(a1.notaMedia, a2.notaMedia));
        System.out.println("Alumnos ordenados por nota media:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre + " => " + alumno.notaMedia);
        }
        System.out.println("-----------------");
    }
}
