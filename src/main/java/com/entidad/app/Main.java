package com.entidad.app;

import com.entidad.vista.PrincipalView;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Ejecución en el hilo recomendado por Java Swing (EDT)
        SwingUtilities.invokeLater(() -> {
            PrincipalView vista = new PrincipalView();
            vista.setVisible(true);
        });
    }
}
