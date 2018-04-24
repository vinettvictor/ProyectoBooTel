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
public class Departamento {
    private int numero;
    private int numeroHabitaciones;
    private int capacidad;
    private int distanciaCentro;
    private int distanciaU;
    private int precio;
    private String parteCercana;
  
    
    
    public Departamento(int numero, int numeroHabitaciones, int capacidad,int distanciaCentro,int distanciaU,String parteCercana,int precio){
        this.numero=numero;
        this.numeroHabitaciones=numeroHabitaciones;
        this.capacidad=capacidad;
        this.distanciaCentro=distanciaCentro;
        this.distanciaU=distanciaU;
        this.parteCercana=parteCercana;
        this.precio=precio;
        
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public int getNumeroHabitaciones(){
        return this.numeroHabitaciones;
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    public int getDistanciaCentro(){
        return this.distanciaCentro;
    }
    
    public int getDisntanciaU(){
        return this.distanciaU;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setNumero(int num){
        this.numero=num;
    }
       
    public void setNumeroHabitaciones(int numH){
        this.numeroHabitaciones=numH;
    }
    
    public void setCapacidad(int cap){
        this.capacidad=cap;
    }
    
    public void setDistanciaCentro(int distC){
        this.distanciaCentro=distC;
    }
    
    public void setDisntanciaU (int distU){
        this.distanciaU=distU;
    }
    
    public void setPrecio(int prc){
        this.precio=prc;
    }
  
    
    public void mostrarDepto(){
        String msj="";
        msj = "\t"+this.numero;
        msj += "\t\t"+this.capacidad;
        msj += "\t\t"+this.numeroHabitaciones;
        msj +="\t\t\t"+this.distanciaCentro;
        msj +="\t\t\t\t"+this.distanciaU;
        msj +="\t\t\t"+this.parteCercana;        
        msj += "\t\t\t"+this.precio;
        System.out.println(msj);
    }
    
    
}
