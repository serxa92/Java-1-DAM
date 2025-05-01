package Ejercicio4;

public class Pajaro implements Volador {

    // Atributos
    String nombre;
    String color;

    // Constructor

    public Pajaro(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Metodo para mostrar información del pájaro

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
    }


    @Override
    public void volar() {
        System.out.println("El pájaro vuela con sus alas");
    }
}
