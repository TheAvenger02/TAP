package frame;

import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class Gui_AgregarVariosElementos extends JFrame {

    JButton btn1, btn2, btn3;

    public Gui_AgregarVariosElementos() {
        super("AGREGAR VARIOS ELEMENTOS");
        this.setLayout(null);

        btn1 = new JButton("ACCIÓN 1");
        btn2 = new JButton("ACCIÓN 2");
        btn3 = new JButton("ACCIÓN 3");

        btn1.setBounds(100, 100, 100, 50);
        btn2.setBounds(210, 100, 100, 50);
        btn3.setBounds(320, 100, 100, 50);

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);

        this.setBounds(100, 100, 500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Gui_AgregarVariosElementos();
    }
}
