package practica11_bouncingballs;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 *
 * @author emiliomurillo
 */
class NewBall extends Thread {

    private Ellipse2D.Double thisBall;
    private boolean ballStarted;
    private int size, speed; // características
    private int deltax, deltay; // de la pelota
    private JPanel drawPanel; // panel de dibujo

    public NewBall(JPanel drawPanel) {
// Creamos una nueva pelota con valores randomizados,
// de velocidad, punto de inicio y dirección. "Speed" es el tiempo de espera
// entre movimientos.
        ballStarted = true;
        size = 10 + (int) (Math.random() * 60);
        speed = 10 + (int) (Math.random() * 100);
        int startx = (int) (Math.random() * 300);
        int starty = (int) (Math.random() * 300);
        deltax = -10 + (int) (Math.random() * 21);
        deltay = -10 + (int) (Math.random() * 21);
        if ((deltax == 0) && (deltay == 0)) {
            deltax = 1;
        }
        thisBall = new Ellipse2D.Double(startx, starty, size, size);
        this.drawPanel = drawPanel;
    }

    public NewBall() {
    }

    public NewBall(Ellipse2D.Double thisBall, boolean ballStarted, int size, int speed, int deltax, int deltay, JPanel drawPanel) {
        this.thisBall = thisBall;
        this.ballStarted = ballStarted;
        this.size = size;
        this.speed = speed;
        this.deltax = deltax;
        this.deltay = deltay;
        this.drawPanel = drawPanel;
    }

    public void draw(Graphics2D g2d) {
        if (thisBall != null) {
            g2d.setColor(Color.BLUE);
            g2d.fill(thisBall);
        }
    }

    public void run() {
        while (ballStarted) { // mantener la bola en movimiento
            try {
// darle un tiempo libre al procesador
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                System.out.println("Woke up prematurely");
            }
// calcular nueva posición y mover la pelota
            int oldx = (int) thisBall.getX();
            int oldy = (int) thisBall.getY();
            int newx = oldx + deltax;
            if (newx + size > this.drawPanel.getWidth() || newx < 0) {
                deltax = -deltax;
            }
            int newy = oldy + deltay;
            if (newy + size > this.drawPanel.getHeight() || newy < 0) {
                deltay = -deltay;
            }
            thisBall.setFrame(newx, newy, size, size);
// no es muy eficiente el repintar para cada hilo en su run
            this.drawPanel.repaint();
        }
    }
} // end NewBall
