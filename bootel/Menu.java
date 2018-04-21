/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;


import java.util.Scanner;
/**
 *
 * @author Vinett
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
    private int opcion;
    private boolean op = true;
    
    public void crearMenu(){
        while(op){
            
            System.out.println("Menu");
            System.out.println("1. Mostrar departamentos disponibles");
            System.out.println("2. Salir");
            
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            
            if (opcion ==2){
                System.out.println("Usted ha salido del programa");
                break;
            }else {
                switch(opcion){
                    case 1:
                        inventarioDepartamento depto = new inventarioDepartamento();
                        depto.Depto();
                        depto.mostrarDeptoDisponibles();
                    default: 
                        System.out.println("La opcion que ha marcado no es valida. por favor intente nuevamente");
                    
                }
            }
        }
    }
}
