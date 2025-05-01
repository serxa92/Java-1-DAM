package Ejercicio3;

public class Moto extends Vehiculo {

    boolean tieneCarenado;

    public Moto(String marca, int anyo, boolean tieneCarenado) {
        super(anyo, marca);
        this.tieneCarenado = tieneCarenado;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anyo);
        System.out.println("Carenado: " + (tieneCarenado ? "Sí" : "No"));
    }
}
