/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author V.Vinett, C. Herrera, J. LLanos
 */
public class VentanaInicio extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton btnLogin;
    private JButton btnRegister;
    
    public VentanaInicio(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,0, 1024, 720);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 0, 0));
        contentPane.setForeground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        this.setTitle("BooTel");
        this.setResizable(false);
        
        JLabel lblBooTel = new JLabel("BooTel");
        lblBooTel.setBounds(302, 310, 413, 113);
        lblBooTel.setFont(new Font("Arial Black", Font.PLAIN, 80));
        lblBooTel.setForeground(new Color(218, 165, 32));
        contentPane.add(lblBooTel);
        
        
        JLabel creators = new JLabel("V. Vinett");
        creators.setBounds(370, 550, 500, 100);
        creators.setFont(new Font("Arial Black", Font.PLAIN, 12));
        creators.setForeground(new Color(218, 165, 32));
        contentPane.add(creators);
        
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(770, 632, 97, 25);
	btnLogin.setForeground(new Color(120,20,40));
	btnLogin.setBackground(new Color(230, 200, 130));
	btnLogin.setFont(new Font("Arial Black", Font.PLAIN, 13));
	btnLogin.addActionListener(this);
	contentPane.add(btnLogin);
        
        btnRegister = new JButton("Register");
        btnRegister.setBounds(900,632,97,25);
        btnRegister.setForeground(new Color(120,20,40));
        btnRegister.setBackground(new Color(230, 200, 130));
        btnRegister.setFont(new Font("Arial Black", Font.PLAIN, 13));
        btnRegister.addActionListener(this);
        contentPane.add(btnRegister);
       
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
            if(btnLogin == ae.getSource() ){               
                JLogin login = new JLogin(this,true);
                login.setVisible(true);             
            }else if (btnRegister == ae.getSource()) {
                JRegister register = new JRegister (this,true);
                register.setVisible(true);                
            }
 
    }
    
}
