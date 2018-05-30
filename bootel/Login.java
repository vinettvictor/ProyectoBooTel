/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import archivo.ArchivoLog;
/**
 *
 * @author Vinett
 */
public class Login {
    private String username;
    private String password;
    
    public Login (String username, String password){
        this.username=username;
        this.password=password;
    }
    
    public void usuarioExiste(){
        ArchivoLog log = new ArchivoLog();       
        log.loginCliente(this,this.username, this.password);         
        
    }
    
}
