
package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("El Quijote", "Cervantes", 1000);
        Libro libro2 = new Libro("El Principito", "Saint-Exupéry", 200);

        libro1.mostrarinfo();
        System.out.println("-----------------");
        libro2.mostrarinfo();


    }
}