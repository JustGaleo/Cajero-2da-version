package Cajero;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

public class Cuenta extends JFrame implements ActionListener {

    JButton boton3, boton4;
    JTextField pantalla, IP, Pago;
    JLabel Etiqueta1, Etiqueta2;

    public Cuenta() {

        setLayout(null);
        setSize(250, 300);
        setLocation(300, 400);
        setTitle("Calculadora Simple");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        /*
        pantalla = new JTextField();
        pantalla.setLocation(0,0);
        pantalla.setSize(300,50);
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        add(pantalla);
                
         */
        
        Etiqueta1 = new JLabel("IP: ");
        Etiqueta1.setLocation(45, 70);
        
        IP = new JTextField();
        IP.setLocation(55, 70);
        IP.setSize(120, 30);
        IP.setFont(new Font("Arial", Font.BOLD, 25));
        IP.setBackground(Color.WHITE);
        add(IP);
        add(Etiqueta1);

        Etiqueta2 = new JLabel("Saldo: ");
        Etiqueta2.setLocation(45, 130);

        Pago = new JTextField();
        Pago.setLocation(55, 130);
        Pago.setSize(120, 30);
        Pago.setFont(new Font("Arial", Font.BOLD, 25));
        Pago.setBackground(Color.WHITE);
        add(Pago);

        add(Etiqueta2);

        boton3 = new JButton("Registrar");
        boton3.setLocation(55, 190);
        boton3.setSize(120, 50);
        add(boton3);
        boton3.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadb = e.getActionCommand();
        if (cadb.equals("Registrar")) {
            JOptionPane.showMessageDialog(null, "Registro dado de alta");
            dispose();
            CAJERO uno = new CAJERO();
        } else {
            if (cadb.equals("Regresar")) {
                dispose();
                CAJERO uno = new CAJERO();
            }
        }

    }

}
