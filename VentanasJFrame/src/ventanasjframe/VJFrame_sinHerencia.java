package ventanasjframe;
import javax.swing.JFrame;
/**
 *
 * @author emiliomurillo
 */
public class VJFrame_sinHerencia {
    //Container panel;
    JFrame jf = new JFrame("SIN HERENCIA");
    
    public VJFrame_sinHerencia(){
        jf.setBounds(100, 100, 400, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new VJFrame_sinHerencia();
    }
}