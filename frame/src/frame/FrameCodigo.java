package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class FrameCodigo extends JFrame {
    JPanel contenedorAPP;
    JPanel contenedorBotones;
    JPanel contenedorVentanas;
    JButton btn_pagina1, btn_pagina2;
    public FrameCodigo() {
        btn_pagina1 = new JButton("PÁGINA UNO");
        btn_pagina1.setSize(200, 40);
        btn_pagina1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanas(new PaginaUno());
            }
        });

        btn_pagina2 = new JButton("PÁGINA DOS");
        btn_pagina2.setSize(200, 40);
        btn_pagina2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanas(new PaginaDos());
            }
        });

        contenedorBotones = new JPanel();
        contenedorBotones.setBackground(new Color(74, 171, 44));
        contenedorBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        contenedorBotones.add(btn_pagina1);
        contenedorBotones.add(btn_pagina2);

        contenedorVentanas = new JPanel();
        contenedorVentanas.setBackground(new Color(200, 200, 200));
        contenedorVentanas.setLayout(new BorderLayout());

        mostrarVentanas(new VentanaInicial());
        
        contenedorAPP = new JPanel();
        contenedorAPP.setBackground(new Color(255, 255, 255));
        contenedorAPP.setLayout(new BorderLayout());
        contenedorAPP.add(contenedorBotones, BorderLayout.NORTH);
        contenedorAPP.add(contenedorBotones, BorderLayout.CENTER);

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
        new FrameCodigo().setVisible(true);
    }

}
