package com.app.client.components.barraTitulo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.app.services.ObjGraficosService;
import com.app.services.RecursosService;

public class BarraTituloTemplate extends JPanel {

    private BarraTituloComponent barraTituloComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración objetos gráficos
    private JLabel lLogoApp, lTituloApp;
    private JButton bCerrar, bMinimizar;

    // Declaración Objetos Decoradores
    private ImageIcon iLogoApp, iDimAux;
    private Font fontTituloBarra;

    public BarraTituloTemplate(BarraTituloComponent barraTituloComponent) {
        this.barraTituloComponent = barraTituloComponent;
        this.sObjGraficos = ObjGraficosService.getService();
        this.sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJLabels();
        this.crearJButtons();

        this.setSize(850, 50);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearObjetosDecoradores() {
        iLogoApp = new ImageIcon("first/src/main/resources/img/logo_app.png");
        fontTituloBarra = new Font("Britannic Bold", Font.PLAIN, 24);
    }

    public void crearJButtons() {
        // BOTÓN CERRAR ----------------------------------------------------
        iDimAux = new ImageIcon(
                sRecursos.getICerrar().getImage()
                        .getScaledInstance(23, 23, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton(
                null,
                800, 10, 45, 30,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c",
                false);
        bCerrar.addActionListener(barraTituloComponent);
        this.add(bCerrar);

        // BOTÓN MINIMIZAR ----------------------------------------------------
        iDimAux = new ImageIcon(
                sRecursos.getIMinimizar().getImage()
                        .getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING));
        bMinimizar = sObjGraficos.construirJButton(
                null,
                750, 10, 45, 30,
                sRecursos.getCMano(),
                iDimAux,
                null, null, null, null,
                "c",
                false);
        bMinimizar.addActionListener(barraTituloComponent);
        this.add(bMinimizar);
    }

    public void crearJLabels() {
        // LABEL LOGO
        // APP--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iLogoApp.getImage()
                        .getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        lLogoApp = sObjGraficos.construirJLabel(
                null,
                20, 0, 50, 50,
                null,
                iDimAux,
                null, null, null, null,
                "c");
        this.add(lLogoApp);

        // LABEL TITULO
        // APP--------------------------------------------------------------------
        lTituloApp = sObjGraficos.construirJLabel(
                "ProductList",
                40, 5, 200, 40,
                null, null,
                fontTituloBarra,
                null,
                sRecursos.getColorPrincipal(),
                null,
                "c");
        this.add(lTituloApp);
    }

    public JButton getBCerrar() {
        return bCerrar;
    }

    public JButton getBMinimizar() {
        return bMinimizar;
    }

}
