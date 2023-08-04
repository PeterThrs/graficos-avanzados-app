package com.app.client.components.configuraciones;

import java.awt.Color;

import javax.swing.JPanel;

public class ConfiguracionesTemplate extends JPanel{

    private ConfiguracionesComponent configuracionesComponent;

    public ConfiguracionesTemplate(ConfiguracionesComponent configuracionesComponent){
        this.configuracionesComponent = configuracionesComponent;

        this.setSize(850, 600);
        this.setBackground(Color.GREEN);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
