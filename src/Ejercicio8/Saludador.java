package Ejercicio8;

import java.io.*;

public class Saludador {

    public void saludarNombres() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("nombres.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("saludos.txt"))
        ) {
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                String saludo = "Hola, " + linea + "!";
                bw.write(saludo);
                bw.newLine();
                contador++;
            }

            System.out.println("Se han guardado " + contador + " saludos correctamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
