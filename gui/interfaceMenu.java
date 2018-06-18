/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Vinett
 */
public class interfaceMenu extends JFrame implements ActionListener{
    
    JLabel etiqueta1, etiqueta2, etiqueta3,etiqueta4;
    JTextField num1,num2, num3;
    JComboBox operacion;
    JButton btnver1,btnver2,btnver3,btnver4;
    
    public interfaceMenu(){
        
        this.setLayout(null);
        etiqueta1 = new JLabel("Departamento 1:");
        etiqueta1.setBounds(50, 50, 110, 20);
        this.add(etiqueta1);
        
        this.setLayout(null);
        etiqueta2 = new JLabel("Departamento 2:");
        etiqueta2.setBounds(50, 150, 110, 20);
        this.add(etiqueta2);
        
        this.setLayout(null);
        etiqueta3 = new JLabel("Departamento 3:");
        etiqueta3.setBounds(50, 250, 110, 20);
        this.add(etiqueta3);
        
        this.setLayout(null);
        etiqueta4 = new JLabel("Departamento 4 :");
        etiqueta4.setBounds(50, 350, 110, 20);
        this.add(etiqueta4);
        
        num1 = new JTextField();
        num1.setBounds(200, 50, 100, 20);
        this.add(num1);
        
        num2 = new JTextField();
        num2.setBounds(200, 150, 100, 20);
        this.add(num2);
        
        num3 = new JTextField();
        num3.setBounds(200, 250, 100, 20);
        this.add(num3);

        
        operacion = new JComboBox();
        operacion.setBounds(200, 350, 150, 20);
        this.add(operacion);
        operacion.addItem("1");
        operacion.addItem("2");
        operacion.addItem("3");
        
        
        btnver1 = new JButton("Ver");
        btnver1.setBounds(340, 50, 55, 20);
        this.add(btnver1);
        
        btnver2 = new JButton("Ver");
        btnver2.setBounds(340, 150, 55, 20);
        this.add(btnver2);
        
        btnver3 = new JButton("Ver");
        btnver3.setBounds(340, 250, 55, 20);
        this.add(btnver3);
        
        btnver4 = new JButton("Ver");
        btnver4.setBounds(350, 350, 55, 25);
        this.add(btnver4);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
}
