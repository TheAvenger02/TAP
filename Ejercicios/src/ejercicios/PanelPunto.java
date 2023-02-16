package ejercicios;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class PanelPunto extends JPanel {

    JLabel titulo;

    public PanelPunto() {
        titulo = new JLabel("Punto");
        titulo.setFont(new Font("ALEGRIAN", Font.BOLD, 36));
        titulo.setForeground(new Color(255, 255, 255));

        this.setBackground(new Color(255, 255, 0));
        this.setSize(680, 420);
        this.add(titulo, BorderLayout.CENTER);
    }
}
