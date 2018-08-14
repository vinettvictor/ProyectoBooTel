/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author V. Vinett, C. Herrera, J. LLanos
 */
public class InterfaceMenuCliente extends javax.swing.JFrame implements ActionListener {

    private JLabel lblDepto1, lblImg1, lblImg2, lblImg3, lblImg4, lblImg5, lblImg6, lbldescript;
    private JTextField num1, num2, num3;
    private JComboBox operacion;
    private JButton btnver1, btnver2, btnver3, btnver4, btnreserva, btnsiguiente;
    private JPanel miPanel;
    private ImageIcon img1, img2, img3, img4, img5, iconImgWifi, iconImgNf;
    private JScrollPane scrollPane;
    private JTextArea textarea, textarea2;
    private String texto;
    private String textoDescripcion = "";
    private String texto2;
    private FileReader fr;
    private BufferedReader lector;

    public InterfaceMenuCliente() {
        setSize(420, 250);

        setLocationRelativeTo(null);
        scrollPane = new JScrollPane();
        scrollPane.setBounds(5, 10, 1000, 720);

        IniciaMenuDepto();
        miPanel.setPreferredSize(new Dimension(1024, 1024));
        scrollPane.setViewportView((miPanel));
        this.add(scrollPane);

    }

    private void IniciaMenuDepto() {
        try {
            fr = new FileReader("Infodepto.txt");
            lector = new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfaceMenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        miPanel = new JPanel();
        miPanel.setLayout(null);

        img1 = new ImageIcon("z_Imagenes/depto1/img1.png");
        lblImg1 = new JLabel(img1);
        lblImg1.setBounds(200, 50, 220, 200);
        this.add(lblImg1);

        img2 = new ImageIcon("z_Imagenes/depto1/img2.png");
        lblImg2 = new JLabel(img2);
        lblImg2.setBounds(200, 260, 220, 200);
        this.add(lblImg2);

        img2 = new ImageIcon("z_Imagenes/depto1/img3.png");
        lblImg3 = new JLabel(img2);
        lblImg3.setBounds(440, 260, 220, 200);
        this.add(lblImg3);

        img3 = new ImageIcon("z_Imagenes/depto1/img4.png");
        lblImg4 = new JLabel(img3);
        lblImg4.setBounds(440, 50, 400, 200);
        this.add(lblImg4);

        iconImgWifi = new ImageIcon("z_Imagenes/iconImage/icon_wifi.png");
        lblImg5 = new JLabel(iconImgWifi);
        lblImg5.setBounds(75, 800, 20, 20);
        this.add(lblImg5);

        iconImgNf = new ImageIcon("z_Imagenes/iconImage/icon_nofumadores.png");
        lblImg6 = new JLabel(iconImgNf);
        lblImg6.setBounds(75, 825, 20, 20);
        this.add(lblImg6);

        try {
            /*textoRespaldo = " El Hotel Boutique Goblin´s House se encuentra a 300 metros de la zona comercial de Temuco\ny ofrece habitaciones con WiFi gratuita y TV de plasma. También facilita aparcamiento gratuito.\n" +
            "\n" +
            "Las habitaciones del Hotel Boutique Goblin´s House son muy amplias, están decoradas con muebles elegantes \ny disponen de baño privado.\n" +
            "\n" +
            "El desayuno se sirve a diario en la cafetería \"Cafe Peregrino\", ubicada a 30 metros del albergue.\n" +
            "\n" +
            "El Hotel Boutique Goblin's House está a 100 km del volcán Villarrica y a 7,2 km del aeropuerto de Manquehue. \n" +
            "\n" +
            "Nuestros clientes dicen que esta parte de Temuco es su favorita, según los comentarios independientes.\n" +
            "\n" +
            "A las parejas les encanta la ubicación — Le han puesto un 9,3 para viajes de dos personas.";*/
            while ((texto = lector.readLine()) != null) {

                textoDescripcion += "\n" + texto;

            }
        } catch (IOException ex) {
            Logger.getLogger(InterfaceMenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        texto2 = "Conexión WiFi gratuita "
                + "\nHabitaciones no fumadores "
                + "\nIdeal para estudiantes";

        textarea = new JTextArea();
        textarea.setText(textoDescripcion);
        textarea.setBounds(100, 500, 840, 260);
        textarea.setEditable(false);

        textarea2 = new JTextArea();
        textarea2.setText(texto2);
        textarea2.setBounds(100, 800, 160, 80);
        textarea2.setEditable(false);

        this.setLayout(null);
        lblDepto1 = new JLabel("Departamento 1:");
        lblDepto1.setBounds(100, 20, 200, 300);
        this.add(lblDepto1);

        btnreserva = new JButton("Reservar");
        btnreserva.setBounds(750, 800, 120, 20);
        btnreserva.addActionListener(this);
        this.add(btnreserva);

        miPanel.add(lblDepto1);
        miPanel.add(lblImg1);
        miPanel.add(lblImg2);
        miPanel.add(lblImg3);
        miPanel.add(lblImg4);
        miPanel.add(textarea);
        miPanel.add(textarea2);
        miPanel.add(lblImg5);
        miPanel.add(lblImg6);
        miPanel.add(btnreserva);

     
       /*
        operacion = new JComboBox();
        operacion.setBounds(200, 350, 150, 20);
        this.add(operacion);
        operacion.addItem("1");
        operacion.addItem("2");
        operacion.addItem("3");
        */
        

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        VentanaReserva vr = new VentanaReserva();
        if (btnreserva == ae.getSource()) {

            vr.setDefaultCloseOperation(3);
            vr.setSize(420, 520);
            vr.setLocationRelativeTo(null);
            vr.setResizable(false);
            vr.setTitle("Reserva");
            vr.setVisible(true);
            dispose();

        }
    }

}
