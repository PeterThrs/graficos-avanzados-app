package com.app.client.vistaPrincipal;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.app.client.components.amigos.AmigosComponent;
import com.app.client.components.barraTitulo.BarraTituloComponent;
import com.app.client.components.configuraciones.ConfiguracionesComponent;
import com.app.client.components.inicio.InicioComponent;
import com.app.client.components.navegacionUsuario.NavegacionUsuarioComponent;
import com.app.client.components.perfil.PerfilComponent;
import com.app.client.components.productos.ProductosComponent;
import com.app.client.login.LoginComponent;

import lombok.Data;

@Data
public class VistaPrincipalComponent implements ActionListener {

    private LoginComponent loginComponent;
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private BarraTituloComponent barraTituloComponent;
    private NavegacionUsuarioComponent navegacionUsuarioComponent;

    private InicioComponent inicioComponent;
    private PerfilComponent perfilComponent;
    private AmigosComponent amigosComponent;
    private ProductosComponent productosComponent;
    private ConfiguracionesComponent configuracionesComponent;

    public VistaPrincipalComponent(LoginComponent loginComponent) {
        this.loginComponent = loginComponent;
        vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        this.barraTituloComponent = new BarraTituloComponent(this);
        vistaPrincipalTemplate.getPBarra().add(barraTituloComponent.getBarraTituloTemplate());
        this.navegacionUsuarioComponent = new NavegacionUsuarioComponent(this);
        // vistaPrincipalTemplate.getPNavegacion().setBackground(Color.red);
        vistaPrincipalTemplate.getPNavegacion().add(navegacionUsuarioComponent.getNavegacionUsuarioTemplate());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public void cerrar() {
        System.exit(0);
    }

    public void minimizar() {
        this.vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }

    public void mostrarComponente(String comando) {
        vistaPrincipalTemplate.getPPrincipal().removeAll();
        switch (comando) {
            case "Inicio":
                if(this.inicioComponent == null){
                    this.inicioComponent = new InicioComponent();
                }
                vistaPrincipalTemplate.getPPrincipal().add(
                        inicioComponent.getInicioTemplate());
                break;
            case "Perfil":
                if(this.perfilComponent == null){
                    this.perfilComponent = new PerfilComponent();
                }
                vistaPrincipalTemplate.getPPrincipal().add(
                        perfilComponent.getPerfilTemplate());
                break;
            case "Amigos":
                if(this.amigosComponent == null){
                    this.amigosComponent = new AmigosComponent();
                }
                vistaPrincipalTemplate.getPPrincipal().add(
                        amigosComponent.getAmigosTemplate());
                break;
            case "Productos":
                if(this.productosComponent == null){
                    this.productosComponent = new ProductosComponent();
                }
                vistaPrincipalTemplate.getPPrincipal().add(
                        productosComponent.getProductosTemplate());
                break;
            case "Configuraciones":
                if(this.configuracionesComponent == null){
                    this.configuracionesComponent = new ConfiguracionesComponent();
                }
                vistaPrincipalTemplate.getPPrincipal().add(
                        configuracionesComponent.getConfiguracionesTemplate());
                break;
            case "Cerrar Sesión":
                this.loginComponent.getLoginTemplate().setVisible(true);
                this.vistaPrincipalTemplate.setVisible(false);
                break;
        }
        vistaPrincipalTemplate.repaint();
    }

}
