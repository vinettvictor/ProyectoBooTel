/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import archivo.Archivo;
import java.util.Scanner;
/**
 *
 * @author Vinett
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
    Archivo registra = new Archivo();
    String nombre,institucion,rut;
   
    private int opcion;
    private boolean op = true;
    
    public void crearMenu(){
        while(op){
            
            System.out.println("Menu");
            System.out.println("1. Mostrar departamentos disponibles");
            System.out.println("2. Registrate");
            System.out.println("3. Salir");
            
            System.out.println("Seleccione una opción");
            opcion = sc.nextInt();
            
            if (opcion == 3){
                
                System.out.println("Usted ha salido del programa");
                break;
                
            }else {
                
                switch(opcion){
                    
                    case 1:
                        
                        inventarioDepartamento depto = new inventarioDepartamento();
                        depto.Depto();
                        depto.mostrarDeptoDisponibles();
                        break;
                        
                    case 2:
                        Validar valida = new Validar();
                        System.out.println("Bienvenido");
                        do {
                        System.out.println("Por favor ingrese su nombre ");
                        nombre = sc.next();
                        if (!valida.validarNombre(nombre)){
                            System.out.println("Asegurese de estar ingresando un nombre correcto(La primera letra tiene que ser Mayuscula)");                            
                        }
                        }while(!(valida.validarNombre(nombre)));
                        
                        do {     
                        System.out.println("Por favor ingrese su rut (Con puntos y guion)");
                        rut  = sc.next();
                        if(!valida.validarRut(rut)){
                            System.out.println("Asegurese de ingresar un rut correcto");                         
                        }
                        }while((!valida.validarRut(rut))) ;
                        
                        do {
                        System.out.println("Por favor ingrese su universidad a la que pertenece");
                        institucion = sc.next();
                        if(!valida.validarInstitucion(institucion)){
                            System.out.println("Asegurate de ingresar una institucion correcta");
                        }
                        }while(!valida.validarInstitucion(institucion));                       
                        Persona estudiante = new Persona(nombre,rut,institucion);
                        registra.registrarUsuario(estudiante);
                        break;
                        
                    default: 
                        
                        System.out.println("La opcion que ha marcado no es valida. por favor intente nuevamente");
                    
                        }
                        
            }
        }
    }
}
