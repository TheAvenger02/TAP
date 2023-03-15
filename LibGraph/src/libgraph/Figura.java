package libgraph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author emiliomurillo
 */
public class Figura extends JComponent implements MouseListener, MouseMotionListener{

    private int xi, yi;
    
    public Figura(){
        setSize(100,100);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(Figura.getSeleccionada()==this)
            g.setColor(Color.red);
        else
            g.setColor(Color.black);
    }
    
    private static Figura seleccionada = null;

    /**
     * Get the value of seleccionada
     *
     * @return the value of seleccionada
     */
    public static Figura getSeleccionada() {
        return seleccionada;
    }

    /**
     * Set the value of seleccionada
     *
     * @param seleccionada new value of seleccionada
     */
    public static void setSeleccionada(Figura aseleccionada) {
        Figura auxi = seleccionada;//seleccionada actual se gurda en auxi
        seleccionada=aseleccionada; //la nueva figura se guarda en seleccionada
        if(auxi!=null)
            auxi.repaint();//llama a repintar a auxi, le regresa su color
        seleccionada.repaint(); //llama a repintar a seleccionada, le cambia su color
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        xi = e.getX(); //guarda posición x donde se hizo click
        yi = e.getY(); //guarda posición y
        setSeleccionada(this); //se manda marcar y por consecuencia repintar
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int xf, yf, increX, increY;
        xf = e.getX(); //posición x donde anda el mouse
        yf = e.getY(); //posición y donde anda el mouse
        increX= xf - xi; //cambio de valor en eje x
        increY=yf - yi; //cambio de valor en eje y
        setLocation(getX()+ increX, getY()+increY);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}
