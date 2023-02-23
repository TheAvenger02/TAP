package quebrados;

import java.awt.*;
import javax.swing.*;

public class Vetana_Inicial extends JPanel {

    JLabel lbl_titulo;

    public Vetana_Inicial() {
        lbl_titulo = new JLabel("Calcular las operaciones entre quebrados");
        lbl_titulo.setFont(new Font("Algerian", Font.BOLD, 30));
        lbl_titulo.setForeground(new Color(255, 255, 255));
        
        this.add(lbl_titulo, BorderLayout.CENTER);
        this.setBackground(new Color(0, 0, 255));
    }
}
