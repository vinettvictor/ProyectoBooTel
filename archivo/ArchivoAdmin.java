/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import bootel.Departamento;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;

/**
 *
 * @author Vinett
 */
public class ArchivoAdmin {
    
        public void agregarDepto(Departamento nueva){
        try{
            File f = new File("Departamentos.txt");
            FileWriter fw;
            BufferedWriter bw;
           
            if(f.exists()){
                 fw = new FileWriter(f,true);
                 bw = new BufferedWriter(fw);
                 bw.newLine();
                 bw.write(nueva.numero+";"+nueva.nHabitacion+";"+nueva.nBaño+";"+nueva.estacionamiento+";"+nueva.capacidad+";"+nueva.distC+";"+nueva.distU+";"+nueva.parteCercana+";"+nueva.valor+";"+nueva.infoDepto);
              
                
            }else {
                 fw = new FileWriter(f);
                 bw = new BufferedWriter(fw);
                 bw.write(nueva.numero+";"+nueva.nHabitacion+";"+nueva.nBaño+";"+nueva.estacionamiento+";"+nueva.capacidad+";"+nueva.distC+";"+nueva.distU+";"+nueva.parteCercana+";"+nueva.valor+";"+nueva.infoDepto);
                
            }
            
            bw.close();
            fw.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }

}
