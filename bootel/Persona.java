/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;


/**
 *
 * @author V. Vinett, C. Herrera, J. llanos.
 */
public class Persona {
   public String nombre;
   public String rut;
     
     public Persona(String nombre,String rut){
         this.nombre=nombre;
         this.rut=rut;
     }
     
     public String getNombre(){
         return this.nombre;
     }
     
     public String getRut(){
         return this.rut;
     }
     
     public void setNombre(String nom){
         this.nombre=nom;
     }
     
     public void setRut(String r){
         this.rut=r;
     }
}
