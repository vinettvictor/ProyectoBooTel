/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;
import java.util.regex.*;
/**
 *
 * @author V. Vinett, C. Herrera, J. llanos.
 */
public class Validador {

//Metodo para validar rut
    
public   boolean validarRut (String rut ) {
        boolean validacion = false;
        
        try {
            if(rut.matches("^[0-9]{1,2}.[0-9]{3}.[0-9]{3}-(k|[0-9]{1})$")){ // exprecion regular para validar el rut 
                validacion = true;
            }
        }catch(java.lang.NumberFormatException e){            
        }catch (Exception e){            
        }    
       return validacion; 
}

public boolean validarNombre(String nombre){
   
    boolean validacion = false;
    try {      
        if (nombre.matches("^[A-Z]{1}[a-z]*$")){   // exprecion regular para validar nombre         
            validacion = true;
        }
                    
    }catch(java.lang.NumberFormatException e) {
        
    }catch (Exception e){
        
    }
   return validacion; 
}

public boolean validarTexto(String institucion){
    boolean validacion = false;
    
    try {
        if(institucion.matches("^[A-zZ-a]*$")){ // exprecion regular para validar textos 
            validacion = true;
        }
        
    }catch (java.lang.NumberFormatException e){
        
    }catch (Exception e){
        
    }
    
    return validacion;
}

public boolean validarPass (String pass) {
    boolean validacion = false;
    try {
      
        if (pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,15}[^'\\s]")) {
            validacion = true;
        }
    }catch (java.lang.NumberFormatException e){
        
    }catch (Exception e){
    }
    return validacion;
}
}
