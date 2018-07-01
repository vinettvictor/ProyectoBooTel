/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bootel.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Vinett
 */
public class JLogin extends JDialog implements ActionListener{
    private final JPanel contentPanel;
    private JTextField textField;
    private JPasswordField textField_1;
    private JButton btnIngresar;
    private VentanaInicio ventanaPrincipal;
    
    public JLogin (VentanaInicio ventana, boolean b){
        super(ventana,b);
        this.contentPanel = new JPanel();
        //contentPanel.setBackground(Color.yellow);
        this.ventanaPrincipal = ventana;
        setResizable(false);
        setTitle("Login");
        setBounds(this.getParent().getX() + 600, this.getParent().getY() + 350, 300, 280);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(new GridLayout(4, 4, 5, 40));
        
        
        {
            JLabel lblNewLabel = new JLabel("Usuario:");
            contentPanel.add(lblNewLabel);
        }
        {
            textField = new JTextField();
            contentPanel.add(textField);
            textField.setColumns(10);
        }
        {
            JLabel lblNewLabel_1 = new JLabel("Contrasena");
            contentPanel.add(lblNewLabel_1);
        }
        {
            textField_1 = new JPasswordField();
            contentPanel.add(textField_1);
            textField_1.setColumns(10);
        }
        {
            JLabel lblNewLabel_2 = new JLabel("");
            contentPanel.add(lblNewLabel_2);
        }
        {
            btnIngresar = new JButton("Ingresar");
            btnIngresar.addActionListener(this);
            contentPanel.add(btnIngresar);
        }
    }     

    @Override
    public void actionPerformed(ActionEvent ae) {
        InterfaceMenuCliente menu = new InterfaceMenuCliente();
        if (ae.getSource() == btnIngresar ){
            Login login = new Login(textField.getText(),String.copyValueOf(textField_1.getPassword()));
            
            if(login.usuarioClienteExiste()) { // Este se ejecutara si un cliente ingresa a la app
                
                menu.setDefaultCloseOperation(3);
                menu.setSize(1024,720);
                menu.setLocationRelativeTo(null);
                menu.setResizable(false);
                menu.setTitle(" Menu  BooTel");
                menu.setVisible(true);   
                dispose();
                
            }else if (login.usuarioAdminExiste()){  // este se ejecuta cuando un administrador ingresa
                
               
                
            }else if (textField.getText().isEmpty() && textField_1.getText().isEmpty()) {  
                JOptionPane.showMessageDialog(this, "Los campos de texto estan vacio, asegurece de ingresar un nombre y una contraseña");
                this.textField.setText("");
                this.textField_1.setText("");
                              
                    }else if ((textField.getText().isEmpty() || textField_1.getText().isEmpty())){
                    JOptionPane.showMessageDialog(this, "Debe ingresar datos en ambos campos");
                    this.textField.setText("");
                    this.textField_1.setText("");
                    
                    } else {
                       JOptionPane.showMessageDialog(this, "El usuario no existe");
                        this.textField.setText("");
                        this.textField_1.setText(""); 
                }          
            }  
         
        } 
    }

