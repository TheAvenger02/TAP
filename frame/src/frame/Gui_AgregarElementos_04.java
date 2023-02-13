package frame;

import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class Gui_AgregarElementos_04 {

    JButton btn4;

    public Gui_AgregarElementos_04() {
        JFrame jf = new JFrame("SIN REFERENCIA SIN CONTAINER");

        btn4 = new JButton("ACCIÓN");
        jf.add(btn4);

        //this.pack();
        jf.setBounds(100, 100, 500, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Gui_AgregarElementos_04();
    }
}
