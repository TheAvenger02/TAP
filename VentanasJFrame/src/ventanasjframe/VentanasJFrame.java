package ventanasjframe;

import javax.swing.JFrame;

/**
 *
 * @author emiliomurillo
 */
public class VentanasJFrame extends JFrame{

    public VentanasJFrame(){
        super("VENTANA HERADANDO DE JFrame"); //Título de la ventana
        //Definir ancho y altura de la ventana
        this.pack(); //Dimensiona el marco de tal manera que el contenido del marco está en o por encima de
        this.setBounds(100, 100, 300, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new VentanasJFrame();
    }
    
}
