/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;


/**
 *
 * @author Vinett
 */
public class Persona {
   public String nombre;
   public String rut;
   public String institucion;
     
     public Persona(String nombre,String rut,String institucion){
         this.nombre=nombre;
         this.rut=rut;
         this.institucion=institucion;
     }
     
     public String getNombre(){
         return this.nombre;
     }
     
     public String getRut(){
         return this.rut;
     }
     
     public String getInstitucion(){
         return this.institucion;
     }
     
     public void setNombre(String nom){
         this.nombre=nom;
     }
     
     public void setRut(String r){
         this.rut=r;
     }
     
     public void setInstitucion(String inst){
         this.institucion=inst;
     }
}
