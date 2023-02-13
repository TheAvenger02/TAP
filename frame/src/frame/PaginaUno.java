package frame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class PaginaUno extends JPanel{
    JLabel titulo;

    public PaginaUno() {
        titulo = new JLabel("PÁGINA UNO");
        titulo.setFont(new Font("Algerian", Font.BOLD, 36));
        titulo.setForeground(new Color(255, 255, 255));

        this.setBackground(new Color(255, 255, 0));
        this.setSize(680, 420);
        this.add(titulo, BorderLayout.CENTER);
    }
}
