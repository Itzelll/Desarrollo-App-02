/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Itzel
 */
public class Singleton {
    
    //metodos estatico y publico para hacer la instancia
    private static Singleton s= null;
    //metodo para que regrese la instancia
    public static Singleton getInstance(){
        if (s==null)
            s=new Singleton();
        return s;
    }
    
    //para que sea instancia unica
    private Singleton() { 
    }
    
    public void imprimir(){
        Logger.getLogger(Singleton.class.getName()).log(Level.INFO, "Hola...");
    }
    
}
