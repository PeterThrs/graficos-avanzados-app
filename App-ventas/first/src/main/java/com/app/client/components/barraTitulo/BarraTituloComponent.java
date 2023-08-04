package com.app.client.components.barraTitulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.app.client.vistaPrincipal.VistaPrincipalComponent;

public class BarraTituloComponent implements ActionListener {

    private BarraTituloTemplate barraTituloTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public BarraTituloComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.barraTituloTemplate = new BarraTituloTemplate(this);
        this.vistaPrincipalComponent = vistaPrincipalComponent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == barraTituloTemplate.getBMinimizar()) {
            // Acción para minimizar
            vistaPrincipalComponent.minimizar();
        }
        
        if (e.getSource() == barraTituloTemplate.getBCerrar()) {
            // Acción para Cerrar
            vistaPrincipalComponent.cerrar();
        }
        
    }

    public BarraTituloTemplate getBarraTituloTemplate() {
        return this.barraTituloTemplate;
    }

}
