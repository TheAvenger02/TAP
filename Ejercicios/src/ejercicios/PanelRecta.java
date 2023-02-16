package ejercicios;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class PanelRecta extends JPanel {

    private final JLabel titulo;

    public PanelRecta() {
        titulo = new JLabel("Recta");
        titulo.setFont(new Font("ALEGRIAN", Font.BOLD, 36));
        titulo.setForeground(new Color(255, 255, 255));

        this.setBackground(new Color(255, 0, 0));
        this.setSize(680, 420);
        this.add(titulo, BorderLayout.CENTER);
    }
}
