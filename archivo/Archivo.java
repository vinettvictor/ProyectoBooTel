/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;


import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;
import java.lang.String;
import bootel.Persona;
/**
 *
 * @author Vinett
 */
public class Archivo {
    
    // Se escribira un archivo en la carpeta del proyecto llamado Reserva.txt
     public void registrarUsuario(Persona nueva){
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
    }
}
