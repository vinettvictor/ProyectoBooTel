/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;


import bootel.Admin;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;
import java.lang.String;
import bootel.Reserva;
import bootel.Cliente;
/**
 *
 * @author Vinett
 */
public class Archivo {
    
    // Se escribira un archivo en la carpeta del proyecto llamado Reserva.txt
    //Registo de Usuario
     public void registrarUsuario(Cliente nueva){
        try{
            File f = new File("Registro.txt");
            FileWriter fw;
            BufferedWriter bw;
           
            if(f.exists()){
                 fw = new FileWriter(f,true);
                 bw = new BufferedWriter(fw);
                 bw.newLine();
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.institucion);
              
                
            }else {
                 fw = new FileWriter(f);
                 bw = new BufferedWriter(fw);
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.institucion);               
            }
            
            bw.close();
            fw.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
        
    //Registro de Admin
    //Se guarda en un archivo Admins.txt
    }
          public void registrarAdmin(Admin nueva){
        try{
            File f = new File("Admins.txt");
            FileWriter fw;
            BufferedWriter bw;
           
            if(f.exists()){
                 fw = new FileWriter(f,true);
                 bw = new BufferedWriter(fw);
                 bw.newLine();
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.codIdentificador);
              
                
            }else {
                 fw = new FileWriter(f);
                 bw = new BufferedWriter(fw);
                 bw.write(nueva.nombre+";"+nueva.rut+";"+nueva.codIdentificador);               
            }
            
            bw.close();
            fw.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
          
          
          
     
         public void reservarDepto(Reserva nueva,String rutEstudiante,String nombreEstudiante){
        boolean bandera = false;
         try {
            File f = new File("Registro.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
               // boolean bandera = false;
                while((linea = br.readLine()) != null){
                    String estudiante [] = linea.split(";");
                    if (estudiante[1].equals(rutEstudiante) && estudiante[0].equals(nombreEstudiante)) {
                        bandera = true;
                        Cliente c = new Cliente(estudiante[0],estudiante[1],estudiante[2]);
                        
                        System.out.println("Estimado :"+c.getNombre());                                                      
                        System.out.println("Su Reserva ha sido realizada con exito!");
                        
                    }
                }
                if (bandera==false){
                    System.out.println("Este cliente no se encuentra resgistrado");
                    System.out.println("No se ha podido realizar la reserva");
                }
                
            }else {
                System.out.println("No hay nada por buscar");
            }
        }catch(Exception e){
           // System.out.println("ERROR");
        }
        if (bandera==true){
            try{
                File f = new File("Reserva.txt");
                FileWriter fw;
                BufferedWriter bw;
               
                if(f.exists()){
                     fw = new FileWriter(f,true);
                     bw = new BufferedWriter(fw);
                     bw.newLine();
                     bw.write(nueva.nombreEstudiante+";"+nueva.rutEstudiante+";"+nueva.numeroDepto+";"+nueva.precio);
                  
                    
                }else {
                     fw = new FileWriter(f);
                     bw = new BufferedWriter(fw);
                     bw.write(nueva.nombreEstudiante+";"+nueva.rutEstudiante+";"+nueva.numeroDepto+";"+nueva.precio);
                    
                }
                
                bw.close();
                fw.close();
            }catch(Exception e){
                System.out.println("ERROR");
            }
        } else {
            System.out.println("");
        }
    }
}