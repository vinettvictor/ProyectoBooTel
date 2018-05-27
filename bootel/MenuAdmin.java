/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import java.util.Scanner;
import archivo.Archivo;
import archivo.ArchivoAdmin;
/**
 *
 * @author Vinett
 */
public class MenuAdmin {
    Scanner scr = new Scanner(System.in);
    Archivo registra = new Archivo();
    ArchivoAdmin registraDato = new ArchivoAdmin();
    Validador valida;
    
    private String nombre,rut;
    private int codIdent;
    private int opcion;
    private boolean op = true;
    
    public void crearMenuAdmin(){
        while(op){
            
            System.out.println("Menu");
            System.out.println("1. Registrarse");
            System.out.println("2. Agregar Departamentos");
            System.out.println("3. Salir");
            
            System.out.println("Seleccione una opción");
            opcion = scr.nextInt();
            
            if (opcion == 3){
                
                System.out.println("Usted ha salido del programa");
                break;
                
            }else {
                
                switch(opcion){
                   
                    case 1:
                        System.out.println("Nombre");
                        nombre = scr.next();
                        System.out.println("Rut");
                        rut = scr.next();
                        System.out.println("Codigo identificador");
                        codIdent = scr.nextInt();
                        
                        Admin admin = new Admin(nombre,rut,codIdent);
                        registra.registrarAdmin(admin);
                        
                        break;
                        
                    case 2:
                                System.out.println("Ingrese el numero de Departamento");
                                String numero = scr.next();
                                System.out.println("Ingrese el numero de Habitaciones");
                                String nHabitacion = scr.next();
                                System.out.println("Ingrese el numero de Baños");
                                String nBaño = scr.next();
                                System.out.println("Ingrese si tiene estacionamiento(si/no)");
                                String estacionamiento = scr.next();
                                System.out.println("Ingrese la capacidad del departamento");
                                String capacidad = scr.next();
                                System.out.println("Ingrese la distancia al centro");
                                String distC = scr.next();
                                System.out.println("Ingrese la ditancia a universidad mas cercana");
                                String distU = scr.next();
                                System.out.println("Ingrese la parte mas cercana (universad o centro)");
                                String parteCercana = scr.next();
                                System.out.println("Ingrese el valor del Departamento");
                                String valor = scr.next();
                                System.out.println("Ingrese la informacion del Depto");
                                String infoDepto = scr.next();          

                                Departamento depto = new Departamento(numero,nHabitacion,nBaño,estacionamiento,capacidad,distC,distU,parteCercana,valor,infoDepto);
                                registraDato.agregarDepto(depto);
                                         
                        break;
                        
                    default: 
                        
                        System.out.println("La opcion que ha marcado no es valida. por favor intente nuevamente");
                    
                        }
                        
            }
        }
    }
    
}
