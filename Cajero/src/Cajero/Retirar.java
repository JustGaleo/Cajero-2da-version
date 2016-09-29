package Cajero;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

public class Retirar extends JFrame implements ActionListener {

    JButton boton2;
    JTextField pantalla;
    JPanel panelNumeros;

    public Retirar() {

        setLayout(null);
        setSize(300, 400);
      
        setTitle("Calculadora Simple");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pantalla = new JTextField();
        pantalla.setLocation(0, 0);
        pantalla.setSize(300, 50);
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        add(pantalla);

        boton2 = new JButton("Aceptar");
        boton2.setLocation(120, 220);
        boton2.setSize(120, 50);
        add(boton2);
        boton2.addActionListener(this);
        
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());
        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(6, 6));
        panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));

        for (int n = 9; n >= 0; n--) {
            nuevoBotonNumerico("" + n);
        }

        nuevoBotonNumerico(".");

        panel.add("Center", panelNumeros);

        setVisible(true);
    }

    private void nuevoBotonNumerico(String digito) {
        JButton btn = new JButton();
        btn.setText(digito);
        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                numeroPulsado(btn.getText());
            }
        });

        panelNumeros.add(btn);
    }

    private void numeroPulsado(String digito) {
        if (pantalla.getText().equals("0")) {
            pantalla.setText(digito);
        } else {
            pantalla.setText(pantalla.getText() + digito);
        }
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadb = e.getActionCommand();
        if (cadb.equals("Aceptar")) {
            JOptionPane.showMessageDialog(null, "Retiro realizado con éxito");
            dispose();
            CAJERO uno = new CAJERO();
        }

    }

}
