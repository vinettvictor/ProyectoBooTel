/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import bootel.Cliente;
import bootel.Login;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Vinett
 */
public class ArchivoLog {
    
    
    public void loginCliente(Login nueva,String nombre,String pass){
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
                    if (estudiante[0].equals(nombre) && estudiante[1].equals(pass)) {
                        bandera = true;
                        Cliente c = new Cliente(estudiante[0],estudiante[1],estudiante[2],estudiante[3]);
                        
                        System.out.println("Estimado :"+c.getNombre());                                                      
                        System.out.println("Ha iniciado session exitosamente");
                        
                    }
                }
                if (bandera==false){
                    System.out.println("Este cliente no se encuentra resgistrado");
                    System.out.println("No se ha podido iniciar session");
                }
                
            }else {
                System.out.println("No hay nada por buscar");
            }
        }catch(Exception e){
           // System.out.println("ERROR");
        }
    }
    
    
        public void loginAdmin(Login nueva,String nombre,String pass){
        boolean bandera = false;
         try {
            File f = new File("Admins.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
               // boolean bandera = false;
                while((linea = br.readLine()) != null){
                    String estudiante [] = linea.split(";");
                    if (estudiante[0].equals(nombre) && estudiante[2].equals(pass)) {
                        bandera = true;
                        Cliente c = new Cliente(estudiante[0],estudiante[1],estudiante[2],estudiante[3]);
                        
                        System.out.println("Estimado :"+c.getNombre());                                                      
                        System.out.println("Ha iniciado session exitosamente");
                        
                    }
                }
                if (bandera==false){
                    System.out.println("Este cliente no se encuentra resgistrado");
                    System.out.println("No se ha podido iniciar session");
                }
                
            }else {
                System.out.println("No hay nada por buscar");
            }
        }catch(Exception e){
           // System.out.println("ERROR");
        }
    }
}
