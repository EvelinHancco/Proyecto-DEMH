/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumnos
 */

  

 
    
public class MiCelular {
String color;
int precio;
int numero;
String modelo;

    public MiCelular(String color, int precio, int numero, String modelo) {
        this.color = color;
        this.precio = precio;
        this.numero = numero;
        this.modelo = modelo;
    }

       
        

    public MiCelular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
 

public void llamar(){
    System.out.println("Estoy llamando :gg");
    
}
public void tomarfotos(){
    System.out.println("te estoy tomando foto :chik");
}
public void juegos(){
    System.out.println("Estoy jugando :0");
}
public void presentacion(){
    JOptionPane.showMessageDialog(null,"hola,soy un celular: "+modelo+"\n"+"Mi precio es: "+precio+"$\n"+"soy de color: "+color+" \n"+"mi numero es: "+numero);
}
    }
