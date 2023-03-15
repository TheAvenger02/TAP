package libgraph;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author emiliomurillo
 */
public class Rectangulo extends Figura{
        @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.GREEN);
        //g.drawRect(0,0,getWidth-1,getHeight()-1);
        g.fillRect(0,0,getWidth()-1,getHeight()-1);
    }
}
