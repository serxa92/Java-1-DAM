package Ejercicio7.Bonus;

public class Persona {

    int edad;

    public void setEdad(int edad) {
        try {
            if (edad < 0) {
                throw new EdadInvalidaException("La edad no puede ser negativa.");
            } else {
                this.edad = edad;
                System.out.println("La edad es: " + this.edad);
            }
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
