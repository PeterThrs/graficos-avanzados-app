package com.app;

import javax.swing.SwingUtilities;

import com.app.client.login.LoginTemplate;
import com.app.client.vistaPrincipal.VistaPrincipalTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        Runnable runApplication = new Runnable(){
            public void run(){
                LoginTemplate login = new LoginTemplate();
                //VistaPrincipalTemplate login = new VistaPrincipalTemplate();
                login.getClass();
            }
        };
        SwingUtilities.invokeLater(runApplication);
    }
}
