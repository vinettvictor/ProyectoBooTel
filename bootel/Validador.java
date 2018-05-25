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
            if(rut.matches("^[0-9]{1,2}.[0-9]{3}.[0-9]{3}-(k|[0-9]{1})$")){
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
        if (nombre.matches("^[A-Z]{1}[a-z]*$")){           
            validacion = true;
        }
                    
    }catch(java.lang.NumberFormatException e) {
        
    }catch (Exception e){
        
    }
   return validacion; 
}

public boolean validarInstitucion(String institucion){
    boolean validacion = false;
    
    try {
        if(institucion.matches("^[A-zZ-a]*$")){
            validacion = true;
        }
        
    }catch (java.lang.NumberFormatException e){
        
    }catch (Exception e){
        
    }
    
    return validacion;
}
}
