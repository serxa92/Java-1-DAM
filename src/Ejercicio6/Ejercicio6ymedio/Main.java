package Ejercicio6.Ejercicio6ymedio;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Crear una queue
        Queue<Documento> documentos = new LinkedList<>();

        // Agregar documentos a la queue

        documentos.add(new Documento("Documento 1"));
        documentos.add(new Documento("Documento 2"));
        documentos.add(new Documento("Documento 3"));
        documentos.add(new Documento("Documento 4"));
        documentos.add(new Documento("Documento 5"));

        // Imprimir los documentos en orden

        System.out.println("Imprimiendo documentos en orden:");
        for (Documento documento : documentos) {
            documento.imprimir();
        }
        System.out.println("-----------------------------------");

        // Usar poll para eliminar el primer documento

        System.out.println("Eliminando el primer documento de la queue...");
        Documento documentoEliminado = documentos.poll();
        if (documentoEliminado != null) {
            System.out.println("Documento eliminado: " + documentoEliminado.titulo);
            System.out.println("-----------------------------------");
        } else {
            System.out.println("No hay documentos en la queue.");
        }
        // Imprimir los documentos restantes
        System.out.println("Documentos restantes en la queue:");
        for (Documento documento : documentos) {
            documento.imprimir();
        }
        System.out.println("-----------------------------------");


    }

}
