package Ejercicio4;

public class Avion implements Volador {

    // Atributos
    String modelo;
    String marca;

    // Constructor

    public Avion(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    // Metodo para mostrar información del avión
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }

    @Override
    public void volar() {
        System.out.println("El avión vuela con sus motores");
    }
}
