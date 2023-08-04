package com.app.client.components.configuraciones;

public class ConfiguracionesComponent {

    private ConfiguracionesTemplate configuracionesTemplate;

    public ConfiguracionesComponent(){
        this.configuracionesTemplate = new ConfiguracionesTemplate(this);
    }

    public ConfiguracionesTemplate getConfiguracionesTemplate(){
        return this.configuracionesTemplate;
    }
    
}
