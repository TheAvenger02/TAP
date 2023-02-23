package ejercicios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class PanelPunto extends javax.swing.JPanel {

    JLabel lbl_p1, lbl_x1, lbl_y1, lbl_p2, lbl_x2, lbl_y2;
    JButton btnCrear, btnLimpiar;
    JTextField txt_x1, txt_y1, txt_x2, txt_y2;

    public PanelPunto() {
        initComponents();

        lbl_p1 = new JLabel("Punto 1 ");
        lbl_x1 = new JLabel("Coordenada X: ");
        lbl_y1 = new JLabel("Coordenada Y: ");
        lbl_p2 = new JLabel("Punto 2 ");
        lbl_x2 = new JLabel("Coordenada X: ");
        lbl_y2 = new JLabel("Coordenada Y: ");

        txt_x1 = new JTextField(80);
        txt_y1 = new JTextField(80);
        txt_x2 = new JTextField(80);
        txt_y2 = new JTextField(80);

        this.add(lbl_p1);
        this.add(lbl_x1);
        this.add(lbl_y1);
        this.add(lbl_p2);
        this.add(lbl_x2);
        this.add(lbl_y2);

        this.add(txt_x1);
        this.add(txt_y1);
        this.add(txt_x2);
        this.add(txt_y2);

        lbl_p1.setBounds(300, 0, 210, 50);
        lbl_p1.setFont(new Font("Algerian", Font.BOLD, 20));
        lbl_x1.setBounds(110, 50, 210, 50);
        lbl_x1.setFont(new Font("Algerian", Font.BOLD, 12));
        txt_x1.setBounds(220, 50, 100, 50);
        lbl_y1.setBounds(400, 50, 240, 50);
        lbl_y1.setFont(new Font("Algerian", Font.BOLD, 12));
        txt_y1.setBounds(500, 50, 100, 50);

        lbl_p2.setBounds(300, 150, 100, 50);
        lbl_p2.setFont(new Font("Algerian", Font.BOLD, 20));
        lbl_x2.setBounds(100, 200, 100, 50);
        lbl_x2.setFont(new Font("Algerian", Font.BOLD, 12));
        txt_x2.setBounds(220, 200, 100, 50);
        lbl_y2.setBounds(400, 200, 100, 50);
        lbl_y2.setFont(new Font("Algerian", Font.BOLD, 12));
        txt_y2.setBounds(500, 200, 100, 50);

        btnCrear = new JButton("CREAR PUNTOS");
        btnCrear.setBounds(250, 300, 150, 50);
        this.add(btnCrear);

        btnLimpiar = new JButton("LIMPIAR");
        btnLimpiar.setBounds(400, 300, 100, 50);
        this.add(btnLimpiar);

        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                Punto x1 = Recta.punto1;
                double a = Double.parseDouble(txt_x1.getText());
                x1.setX1(a);

                Punto y1 = Recta.punto1;
                double b = Double.parseDouble(txt_y1.getText());
                y1.setY1(b);

                Punto x2 = Recta.punto2;
                double c = Double.parseDouble(txt_x2.getText());
                x2.setX2(c);

                Punto y2 = Recta.punto2;
                double d = Double.parseDouble(txt_y2.getText());
                y2.setY2(d);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                txt_x1.setText("");
                txt_y1.setText("");
                txt_x2.setText("");
                txt_y2.setText("");
            }
        });

        this.setBackground(new Color(255, 255, 0));
        this.setSize(680, 420);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
