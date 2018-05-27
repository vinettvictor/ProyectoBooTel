/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import bootel.Departamento;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;
import java.lang.String;
/**
 *
 * @author Vinett
 */
public class ArchivoDepto {
    
    public void mostrarDeptos() {
       
        try{
            File f = new File("Departamentos.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null){
                        
                        
                        String [] cont = linea.split(";");
                        Departamento inv = new Departamento(cont[0],cont[1],cont[2],cont[3],cont[4],cont[5],cont[6],cont[7],cont[8],cont[9]);
                        inv.mostrarDepto();
                        System.out.println("--------------------------");                   
                }
            }else {
                System.out.println("No existen departamentos");
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}
