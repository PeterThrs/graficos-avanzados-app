package com.app;

import javax.swing.SwingUtilities;

import com.app.login.LoginTemplate;

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
                login.getClass();
            }
        };
        SwingUtilities.invokeLater(runApplication);
    }
}
