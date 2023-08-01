package com.app;

import javax.swing.SwingUtilities;

import com.app.client.login.LoginComponent;

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
                LoginComponent login = new LoginComponent();
            }
        };
        SwingUtilities.invokeLater(runApplication);
    }
}
