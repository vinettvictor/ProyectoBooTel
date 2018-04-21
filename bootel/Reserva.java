/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;



/**
 *
 * @author Vinett
 */
public class Reserva {
    private String nombreEstudiante;
    private int numeroDepto;
    private String rutEstudiante;
   
    
    public Reserva(String nombreEstudiante,String rutEstudiante,int numeroDepto){
        this.nombreEstudiante=nombreEstudiante;
        this.rutEstudiante=rutEstudiante;
        this.numeroDepto=numeroDepto;

    }
    
    public void mostrarReserva(){
        String msj ="";
        msj = "\t"+this.nombreEstudiante;
        msj +="\t\t"+this.rutEstudiante;
        msj +="\t\t"+this.numeroDepto;
    }
}
