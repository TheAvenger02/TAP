package practica11_bouncingballs;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JLabel;

class ShapePanel extends JPanel {
    private int prefwid, prefht;
    private List<NewBall> balls = new ArrayList<>();
    private JLabel message;

    public ShapePanel(int pwid, int pht, JLabel message) {
        prefwid = pwid;
        prefht = pht;
        this.message = message;

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                NewBall nextBall = new NewBall();
                balls.add(nextBall);
                nextBall.start();
                message.setText("Number of Balls: " + balls.size());
            }
        });
    }

    public Dimension getPreferredSize() {
        return new Dimension(prefwid, prefht);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < balls.size(); i++) {
            balls.get(i).draw(g2d);
        }
    }
}
