
package Cajero;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;


public class Abonar extends JFrame implements ActionListener {

    JButton boton1, boton2, boton3;
    JTextField pantalla;

    public Abonar() {
        
        setLayout(null);
        setSize(250, 300);
        setLocation(300, 400);
        setTitle("Calculadora Simple");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pantalla = new JTextField();
        pantalla.setLocation(0,0);
        pantalla.setSize(300,50);
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        add(pantalla);

     
        
        boton2 = new JButton("Aceptar");
        boton2.setLocation(55, 130);
        boton2.setSize(120, 50);
        add(boton2);
        boton2.addActionListener(this);
        
  
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String cadb = e.getActionCommand();
        if(cadb.equals("Aceptar"))
        {
             JOptionPane.showMessageDialog(null, "Abono realizado con éxito");
             dispose();
             CAJERO uno = new CAJERO();
        }
   

        
    }

}
