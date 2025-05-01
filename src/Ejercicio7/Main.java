package Ejercicio7;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        // Ejemplo de división

        System.out.println("Ejemplo de división:");
        calculadora.dividir(10,0);
        System.out.println("-----------------------------------");


        // Ejemplo de conversión a entero

        System.out.println("Ejemplo de conversión a entero:");
        calculadora.convertirAEntero("abc");
        System.out.println("-----------------------------------");
        calculadora.convertirAEntero("123");
        System.out.println("-----------------------------------");
        calculadora.dividir(123,3);
    }
}
