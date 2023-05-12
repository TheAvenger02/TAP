package Practica9_ComparandoHiilos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author emiliomurillo
 */
public class PanelGraf extends JPanel implements Runnable{
    Graphics gra;
    Thread t;
    
    public PanelGraf(){ //constructor
        super(); // constructor clase padre
        t = new Thread(this);
    }
    
    public void pintar(){
        int cx = getWidth()/2;
        int cy = getHeight()/2;
        //definimos el color rojo para las líneas
        gra.setColor(Color.red);
        int radio = getWidth()/2;
        //ciclo que varía el ángulo desde 0 hasta 360 y pinta líneas
        for(int ang=0;ang<360;ang++){
            int xn = cx + (int)(radio * Math.cos(Math.toRadians(ang)));
            int yn = cy - (int)(radio * Math.sin(Math.toRadians(ang)));            
            gra.drawLine(cx,cy,xn,yn);
            //ciclos vacíos para hacer tiempo, provocar retraso
            for(int i=0;i<100000;i++);
                for(int j=0;j<100;j++);
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.white);
    }
    
    @Override
    public void run(){
        pintar();
    }
    
}
