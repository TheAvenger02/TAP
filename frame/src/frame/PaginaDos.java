package frame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class PaginaDos extends JPanel {

    private final JLabel titulo;

    public PaginaDos() {
        titulo = new JLabel("BIENVENIDO A LA PÁGINA 2");
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setFont(new Font("Algerian", Font.BOLD, 36));

        this.setSize(680, 420);
        this.setBackground(new Color(255, 0, 0));
        this.add(titulo, BorderLayout.CENTER);
    }
}
