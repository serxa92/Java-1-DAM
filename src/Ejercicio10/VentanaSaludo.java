package Ejercicio10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSaludo extends JFrame {

    // Componentes de la ventana
    private JTextField campoNombre;
    private JButton botonSaludar;
    private JLabel etiquetaResultado;

    public VentanaSaludo() {
        setTitle("Saludador");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear panel y layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Crear componentes
        campoNombre = new JTextField(15);
        botonSaludar = new JButton("Saludar");
        etiquetaResultado = new JLabel("");

        // Añadir acción al botón
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText();
                etiquetaResultado.setText("Hola, " + nombre + "!");
            }
        });

        // Añadir componentes al panel
        panel.add(new JLabel("Nombre:"));
        panel.add(campoNombre);
        panel.add(botonSaludar);
        panel.add(etiquetaResultado);

        // Añadir panel al frame
        add(panel);

        setVisible(true); // Mostrar la ventana
    }
}

