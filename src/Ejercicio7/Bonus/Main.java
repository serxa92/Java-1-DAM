package Ejercicio7.Bonus;

public class Main {
    public static void main(String[] args) {

        //Crear una instancia de la clase Persona

        Persona persona = new Persona();
        Persona persona2 = new Persona();

        // Establecer una edad

        try {
            persona.setEdad(25);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        // Intentar establecer una edad negativa

        try {
            persona2.setEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }
}
