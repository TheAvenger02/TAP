package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class EjemploEventoAction extends JFrame {

    JButton btn1;

    public EjemploEventoAction() {
        super("EVENTOS");
        this.setLayout(null);

        btn1 = new JButton("ACCIÓN");
        btn1.setBounds(100, 100, 100, 50);
        this.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                JOptionPane.showMessageDialog(btn1, "DETECTÉ EL EVENTO ACTION");
            }
        });

        this.setBounds(100, 100, 500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new EjemploEventoAction();
    }
}
