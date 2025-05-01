package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Pajaro pajaro = new Pajaro( "Canario", "Amarillo");
        Avion avion = new Avion("Boeing", "747");

        pajaro.mostrarInfo();
        pajaro.volar();
        System.out.println("-----------------");
        avion.mostrarInfo();
        avion.volar();
        System.out.println("-----------------");

    }


}
