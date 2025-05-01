package Ejercicio7;

public class Calculadora {

    public void dividir(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }

    public void convertirAEntero(String texto) {
        try {
            int resultado = Integer.parseInt(texto);
            System.out.println("El número entero es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto no se puede convertir a entero.");
        }
    }
}
