package com.app.client.vistaPrincipal;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.app.services.RecursosService;

/**
 * 
 * @author Pedro Lopez
 */

public class VistaPrincipalTemplate extends JFrame{

    private static final long serialVersionUID = 1L;

    private RecursosService sRecursos;

    public VistaPrincipalTemplate(){
        super("Vista Principal");

        sRecursos = RecursosService.getService();

        getContentPane().setBackground(sRecursos.getColorPrincipal());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }

    
}
