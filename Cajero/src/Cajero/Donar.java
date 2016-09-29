package Cajero;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

public class Donar extends JFrame implements ActionListener {

    JButton boton, boton2, boton3, boton4;

    public Donar() {

        setLayout(null);
        setSize(250, 300);
        setLocation(300, 400);
        setTitle("Calculadora Simple");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        boton = new JButton("$5 pesos");
        boton.setLocation(55, 30);
        boton.setSize(120, 50);
        add(boton);
        boton.addActionListener(this);
        
        boton2 = new JButton("$10 pesos");
        boton2.setLocation(55, 90);
        boton2.setSize(120, 50);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3 = new JButton("$15 pesos");
        boton3.setLocation(55, 150);
        boton3.setSize(120, 50);
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("$20 pesos");
        boton4.setLocation(55, 210);
        boton4.setSize(120, 50);
        add(boton4);
        boton4.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadb = e.getActionCommand();
        if (cadb.equals("$5 pesos")) {
            JOptionPane.showMessageDialog(null, "Donaste $5 pesos");
            dispose();
            CAJERO uno = new CAJERO();
        } else if (cadb.equals("$10 pesos")) {
            JOptionPane.showMessageDialog(null, "Donaste $10 pesos");
            dispose();
            CAJERO uno = new CAJERO();
        }
        else if (cadb.equals("$15 pesos")) {
            JOptionPane.showMessageDialog(null, "Donaste $15 pesos");
            dispose();
            CAJERO uno = new CAJERO();
        }
        else if (cadb.equals("$20 pesos")) {
            JOptionPane.showMessageDialog(null, "Donaste $20 pesos");
            dispose();
            CAJERO uno = new CAJERO();
        }

    }

}
