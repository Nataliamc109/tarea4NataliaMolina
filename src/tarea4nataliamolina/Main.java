/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4nataliamolina;

/**
 *
 * @author irisledesma
 */
public class Main {
 
     public static void main(String[] args) {
        Mascota perro = new Mascota("Bobby",5,"Pitbull","marron");
        Mascota gato = new Mascota("Garfield",2,"Sin raza","naranjita");
       
         System.out.println(perro.toString());
         System.out.println(gato.toString());
        
    }
    
}
