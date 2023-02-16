package ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class GUIHome extends JFrame {

    JPanel contenedorAPP;
    JPanel contenedorBotones;
    JPanel contenedorVentanas;
    JButton btnPunto, btnRecta;

    public GUIHome() {
        super("Aplicación para calcular distancia de una recta");
        
        btnPunto = new JButton("CREAR PUNTO");
        btnPunto.setSize(200, 40);
        btnPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanas(new PanelPunto());
            }
        });

        btnRecta = new JButton("CREAR RECTA");
        btnRecta.setSize(200, 40);
        btnRecta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanas(new PanelRecta());
            }
        });

        contenedorBotones = new JPanel();
        contenedorBotones.setBackground(new Color(74, 171, 44));
        contenedorBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        contenedorBotones.add(btnPunto);
        contenedorBotones.add(btnRecta);

        contenedorVentanas = new JPanel();
        contenedorVentanas.setBackground(new Color(200, 200, 200));
        contenedorVentanas.setLayout(new BorderLayout());

        mostrarVentanas(new VentanaInicial());

        contenedorAPP = new JPanel();
        contenedorAPP.setBackground(new Color(255, 255, 255));
        contenedorAPP.setLayout(new BorderLayout());
        contenedorAPP.add(contenedorBotones, BorderLayout.NORTH);
        contenedorAPP.add(contenedorVentanas, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(contenedorAPP, BorderLayout.CENTER);

        this.setBounds(100, 100, 720, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    private void mostrarVentanas(JPanel ventana) {
        ventana.setSize(720, 480);
        ventana.setLocation(0, 0);

        contenedorVentanas.removeAll();
        contenedorVentanas.add(ventana, BorderLayout.CENTER);
        contenedorVentanas.revalidate();
        contenedorVentanas.repaint();
    }

    public static void main(String[] args) {
        new GUIHome().setVisible(true);
    }
}
