package Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Coche bmw = new Coche("BMW", 2020, 4);
        Moto kawasaki = new Moto("Kawasaki", 2021, false);

        bmw.mostrarInfo();
        System.out.println("-----------------");
        kawasaki.mostrarInfo();
    }
}
