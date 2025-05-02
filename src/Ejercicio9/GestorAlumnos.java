package Ejercicio9;

import java.io.*;
import java.util.ArrayList;

public class GestorAlumnos {

    /* Metodo para guardar la lista de alumnos en un archivo
     Se utiliza ObjectOutputStream para escribir objetos en un archivo
     Se utiliza FileOutputStream para especificar el archivo
     Se utiliza try-with-resources para cerrar el flujo automáticamente */

    public void guardarAlumnos(ArrayList<Alumno> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Ejercicio9/alumnos.dat"))) {
            oos.writeObject(lista); // guardamos toda la lista
            System.out.println("Alumnos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public ArrayList<Alumno> leerAlumnos() {
        ArrayList<Alumno> listaLeida = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Ejercicio9/alumnos.dat"))) {
            listaLeida = (ArrayList<Alumno>) ois.readObject(); // hacemos cast porque leemos un Object
            System.out.println("Alumnos leídos correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }

        return listaLeida;
    }
}
