package Cajero;

/**
 *
 * @author García Martínez Leonardo
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

public class CAJERO extends JFrame implements ActionListener {

    JButton boton1, boton2, boton3, boton4;
    JTextField pantalla;

    public CAJERO() {
        
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
        boton1 = new JButton("Crear cuenta");
        boton1.setLocation(55, 20);
        boton1.setSize(120, 50);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("Abonar");
        boton2.setLocation(55, 90);
        boton2.setSize(120, 50);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3 = new JButton("Retirar");
        boton3.setLocation(55, 150);
        boton3.setSize(120, 50);
        add(boton3);
        boton3.addActionListener(this);
        
        boton4 = new JButton("Donar");
        boton4.setLocation(55,230);
        boton4.setSize(120,20);
        add(boton4);
        boton4.addActionListener(this);
      
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
                String cadb = e.getActionCommand();
        if(cadb.equals("Crear cuenta"))
        {
            dispose();
             Cuenta uno = new Cuenta();
        }
        else
        if(cadb.equals("Abonar"))
        {
            dispose();
            Abonar uno = new Abonar();
        }
        else
            if(cadb.equals("Retirar"))
        {
            dispose();
            Retirar uno = new Retirar();
        }
        else
                if(cadb.equals("Donar")){
                    dispose();
                    Donar d = new Donar();
                }

        
    }

}
