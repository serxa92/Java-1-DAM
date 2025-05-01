package Ejercicio3;



public class Vehiculo {

    String marca;
    int anyo;

    public Vehiculo(int anyo, String marca) {
        this.anyo = anyo;
        this.marca = marca;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anyo);
    }
}
