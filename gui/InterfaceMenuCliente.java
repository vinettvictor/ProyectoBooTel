/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author V. Vinett, C. Herrera, J. LLanos
 */

public class InterfaceMenuCliente extends javax.swing.JFrame implements ActionListener{
    
    JLabel lblDepto1, etiqueta2, etiqueta3,etiqueta4,lblImg1,lblImg2,lblImg3,lblImg4,etiqueta9;
    JTextField num1,num2, num3;
    JComboBox operacion;
    JButton btnver1,btnver2,btnver3,btnver4;
    private JPanel miPanel;
    ImageIcon img1,img2,img3,img4,img5;
    JScrollPane scrollPane;
    
    public InterfaceMenuCliente() {
        miPanel = new JPanel();
        scrollPane = new JScrollPane();
        scrollPane.setBounds(5,10,1000,720);
        
        IniciaInterfaceMenuCliente();
        miPanel.setPreferredSize(new Dimension(1024,1024));
        scrollPane.setViewportView((miPanel));
        this.add(scrollPane);
     
    }
    private void  IniciaInterfaceMenuCliente(){        
        img1 = new ImageIcon("z_Imagenes/depto1/img1.png");
        lblImg1 = new JLabel(img1);
        lblImg1.setBounds(200, 50 , 220, 200);
        this.add(lblImg1);
        
        
        img2 = new ImageIcon("z_Imagenes/depto1/img2.png");
        lblImg2 = new JLabel(img2);
        lblImg2.setBounds(200, 260 , 220, 200);
        this.add(lblImg2);
        
        img2 = new ImageIcon("z_Imagenes/depto1/img3.png");
        lblImg3 = new JLabel(img2);
        lblImg3.setBounds(440, 260 , 220, 200);
        this.add(lblImg3);
        
        img3= new ImageIcon("z_Imagenes/depto1/img4.png");
        lblImg4 = new JLabel(img3);
        lblImg4.setBounds(440, 50 , 400, 200);
        this.add(lblImg4);
        
        
        this.setLayout(null);
        lblDepto1 = new JLabel("Departamento 1:");
        lblDepto1.setBounds(50, 50, 110, 20);
        this.add(lblDepto1);
        
        miPanel.add(lblDepto1);
        miPanel.add(lblImg1);
        miPanel.add(lblImg2);
        miPanel.add(lblImg3);
        miPanel.add(lblImg4);
        
        
      /* 
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
        
        */
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
