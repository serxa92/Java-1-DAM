package Ejercicio6;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // Crear una pila para almacenar las páginas web

        Stack<PaginaWeb> historial = new Stack<PaginaWeb>();

        // Crear instancias de PaginaWeb

        PaginaWeb pagina1 = new PaginaWeb("www.google.com");
        PaginaWeb pagina2 = new PaginaWeb("www.facebook.com");
        PaginaWeb pagina3 = new PaginaWeb("www.twitter.com");

        // Agregar páginas al historial

        historial.push(pagina1);
        historial.push(pagina2);
        historial.push(pagina3);

        // Mostrar la última página visitada

        System.out.println("Última página visitada:");
        PaginaWeb ultimaPagina = historial.peek();

        ultimaPagina.mostrar();

        // Eliminar la última página visitada

        System.out.println("Eliminando la última página visitada...");
        historial.pop();

        // Mostrar la nueva última página visitada

        System.out.println("Nueva última página visitada:");
        PaginaWeb nuevaUltimaPagina = historial.peek();
        nuevaUltimaPagina.mostrar();


        // Mostrar el historial

        System.out.println("Historial de páginas web:");
        for (PaginaWeb pagina : historial) {
            pagina.mostrar();
        }
    }


}
