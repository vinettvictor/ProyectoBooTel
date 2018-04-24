/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootel;

import java.util.ArrayList;

/**
 *
 * @author Vinett
 */
public class inventarioDepartamento {
    ArrayList<Departamento> invDepto = new ArrayList<Departamento>();
    private int precio;
    public void Depto(){
        agregarDepto(invDepto,1,3,3,5,1,"UFRO",180000);
        agregarDepto(invDepto,2,2,2,1,6,"centro",120000);
        agregarDepto(invDepto,3,1,1,6,3,"UM",80000);
        agregarDepto(invDepto,4,1,1,8,1,"centro",65000);
        agregarDepto(invDepto,5,1,1,7,2,"centro",90000);     
    }
    
    public void mostrarDeptoDisponibles(){
        mostrarDepartamentos(invDepto);
    }
    
    private  void agregarDepto(ArrayList<Departamento> depto, int numero ,int capacidad,int numeroHabitaciones,int distC,int distU,String parteCercana ,int precio){
        depto.add(new Departamento(numero,capacidad,numeroHabitaciones,distC,distU,parteCercana,precio));
    }
    
    private void mostrarDepartamentos(ArrayList<Departamento> depto){
        System.out.println("Departamentos disponibles");
        System.out.println("\tNumero Depto."+"\tCapacidad"+"\tNumero de habitaciones"+"\tDistancia al centro(km)"+"\tDistancia a Universidad(km)"+"\tCercano a"+"\t\tPrecio");
        for (int i=0;i< depto.size();i++) {
            System.out.println();
            depto.get(i).mostrarDepto();            
        }
        
    }
    

      
          public int getValorDepto(int nDepto){
              
       if(nDepto==1){
            precio = 180000;
       }else if (nDepto==2){
           precio = 120000;
       }else if (nDepto==3){
           precio = 80000;
       }else if (nDepto==4){
           precio = 65000;
       }else if (nDepto==5){
           precio = 90000;
       }
       return precio;
       }


}
