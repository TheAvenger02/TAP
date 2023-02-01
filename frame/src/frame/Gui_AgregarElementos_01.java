package frame;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class Gui_AgregarElementos_01 extends JFrame {
    private Container panel;
    private JButton btn1;
    
    public Gui_AgregarElementos_01(){
        super("CON HERENCIA CON CONTAINER");
        btn1 = new JButton("Aceptar");
        //panel = getContentPane();
        panel = this.getContentPane();
        panel.add(btn1);
        //this.pack();
        this.setBounds(30, 50, 200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Gui_AgregarElementos_01();
    }
    
}
