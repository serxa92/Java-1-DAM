package Ejercicio3;

public class Coche extends Vehiculo {

    int puertas;


    public Coche(String marca, int anyo, int puertas) {
        super(anyo, marca);
        this.puertas = puertas;
    }
    @Override
    public void mostrarInfo(){
    System.out.println("Marca: " + marca);
    System.out.println("Año: " + anyo);
    System.out.println("Puertas: " + puertas);
}

}
