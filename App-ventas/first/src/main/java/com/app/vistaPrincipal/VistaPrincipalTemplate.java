package com.app.vistaPrincipal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Pedro Lopez
 */

public class VistaPrincipalTemplate extends JFrame{

    // private JButton bEnviar;
    // private JTextField tNombre;
    // private JLabel lNombre;
    

    public VistaPrincipalTemplate(){
        super("Vista Principal");
        //indica que la ejecucion termine al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        // Es importante que este método se llame después de asignar el tamaño a la ventana o el compilador se confundirá y no la posicionará donde se quiere.
        setLocationRelativeTo(this);
        setLayout(null);
        //debe ir al ultimo
        setVisible(true);
    }

    public void saludar(){
        String mensaje = "Hola Mundo";
        System.out.println(mensaje);
    }
    
}
