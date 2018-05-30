/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bootel.Register;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Vinett
 */
public class JRegister extends JDialog implements ActionListener {
    private final JPanel contentPanel;
    private JTextField textField,textField_r1,textField_r2;
    private JPasswordField textField_1;
    private JButton btnIngresar;
    private VentanaInicio ventanaPrincipal;
    
    public JRegister(VentanaInicio ventana, boolean b){
        super(ventana,b);
        this.contentPanel = new JPanel();
        this.ventanaPrincipal = ventana;
        setResizable(false);
        setTitle("Register");
        setBounds(this.getParent().getX() + 600, this.getParent().getY() + 350, 325, 279);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(new GridLayout(5, 3, 5, 25));
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
            JLabel lblNewLabel_r1 = new JLabel("RUT");
            contentPanel.add(lblNewLabel_r1);     
        }
        {
                textField_r1 = new JTextField();
                contentPanel.add(textField_r1);
                textField_r1.setColumns(10);
        }
                 {
            JLabel lblNewLabel_r2 = new JLabel("Institucion");
            contentPanel.add(lblNewLabel_r2);     
        }
        {
                textField_r2 = new JTextField();
                contentPanel.add(textField_r2);
                textField_r2.setColumns(10);
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
       if (ae.getSource() == btnIngresar){
           Register register = new Register(textField.getText(),textField_1.getText(),textField_r1.getText(),textField_r2.getText());
           register.registrarUsuario();
           
               
           }
        }     
}
