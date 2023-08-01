package com.app.client.vistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipalComponent implements ActionListener{

    private VistaPrincipalTemplate vistaPrincipalTemplate;

    public VistaPrincipalComponent(){
        vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
