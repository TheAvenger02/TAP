package eventolbtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author emiliomurillo
 */
public class EjemploEventoFocus extends JFrame {

    JLabel lbl_nombre, lbl_apellido, lbl_edad;
    JTextField txt_nombre, txt_apellido, txt_edad;
    JButton btn_salir;

    public EjemploEventoFocus() {
        super("EVENTO FOCUS");
        this.setLayout(null);

        lbl_nombre = new JLabel("NOMBRE: ");
        lbl_apellido = new JLabel("APELLIDO: ");
        lbl_edad = new JLabel("EDAD: ");

        txt_nombre = new JTextField(80);
        txt_apellido = new JTextField(80);
        txt_edad = new JTextField(80);

        btn_salir = new JButton("SALIR");

        txt_nombre.setBackground(Color.LIGHT_GRAY);
        txt_nombre.setBackground(Color.black);
        txt_apellido.setBackground(Color.LIGHT_GRAY);
        txt_apellido.setBackground(Color.black);
        txt_edad.setBackground(Color.LIGHT_GRAY);
        txt_edad.setBackground(Color.black);

        this.add(lbl_nombre);
        this.add(lbl_apellido);
        this.add(lbl_edad);
        this.add(txt_nombre);
        this.add(txt_apellido);
        this.add(txt_edad);
        this.add(btn_salir);

        lbl_nombre.setBounds(100, 100, 100, 50);
        txt_nombre.setBounds(220, 100, 200, 50);
        lbl_apellido.setBounds(100, 160, 100, 50);
        txt_apellido.setBounds(220, 160, 200, 50);
        lbl_edad.setBounds(100, 220, 100, 50);
        txt_edad.setBounds(220, 220, 200, 50);
        btn_salir.setBounds(220, 280, 100, 50);

        txt_nombre.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_nombre.setBackground(Color.red);
                txt_nombre.setForeground(Color.white);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txt_nombre.setBackground(Color.LIGHT_GRAY);
                txt_nombre.setForeground(Color.black);
            }
        });

        this.setBounds(100, 100, 500, 600);
        //this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploEventoFocus();
    }

}
