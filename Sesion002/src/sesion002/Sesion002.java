/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesion002;


import Clases.MiCelular;
import Clases.persona;

/**
 *
 * @author Alumnos
 */
public class Sesion002 {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    persona p1=new persona("angel",35,"Masculino","214124",1.43);
  
    p1.presentarse();
    p1.dormir();
  
    persona p3=new persona("yefry", 12, "Masculino", "71857126", 1.70);
    p3.presentarse();
    
    MiCelular p2=new MiCelular("negro", 143, 964768200,"Samsung");
     p2.presentacion();
    }

}
