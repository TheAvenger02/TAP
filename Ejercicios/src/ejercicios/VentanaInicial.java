package ejercicios;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class VentanaInicial extends JPanel {
    
    JLabel lbl_titulo;
    
    VentanaInicial() {
        lbl_titulo = new JLabel("APLICACIÓN PARA CALCULAR DISTANCIA DE UNA RECTA");
        lbl_titulo.setFont(new Font("Algerian", Font.BOLD, 36));
        lbl_titulo.setForeground(new Color(255, 255, 255));
        
        this.add(lbl_titulo, BorderLayout.CENTER);
        this.setBackground(new Color(0, 0, 255));
    }
}
