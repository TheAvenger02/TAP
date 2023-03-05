package jtab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class Jtab extends JFrame {

    JTable table;
    JScrollPane scrollPanel;
    JButton btn_verconsola;
    JPanel panel_botones;

    public Jtab() {
        super("PERSONAS");

        //Desactivarla después de mostrar los datos en consola
        //DatosPersonas datos = new DatosPersonas();
        table = new JTable();
        //table.setModel(new MyTableModel(datos.getPersonas(), datos.getColumnNames()));
        table.setModel(new ModeloPersonas());

        table.setPreferredScrollableViewportSize(new Dimension(700, 300));
        scrollPanel = new JScrollPane(table);
        this.add(scrollPanel, BorderLayout.CENTER);

        panel_botones = new JPanel();
        this.add(panel_botones, BorderLayout.SOUTH);

        btn_verconsola = new JButton("VER DATOS EN CONSOLA");
        panel_botones.add(btn_verconsola);

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_verconsola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //datos.desplegarDatosConsola();
            }
        });
    }

    public static void main(String[] args) {
        new Jtab();
    }

}
