package frame;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class Gui_AgregarElementos_02 extends JFrame {
    JButton btn2;
    
    public Gui_AgregarElementos_02(){
        super("CON HERENCIA SIN CONTAINER");
        btn2 = new JButton("ACCIÓN");
        
        this.add(btn2);
        
        //this.pack();
        this.setBounds(30, 30, 200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Gui_AgregarElementos_02();
    } 
}