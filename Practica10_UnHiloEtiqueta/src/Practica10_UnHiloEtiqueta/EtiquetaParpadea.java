package Practica10_UnHiloEtiqueta;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JLabel;

/**
 *
 * @author emiliomurillo
 */
public class EtiquetaParpadea implements Runnable{
    private JLabel etiqueta;
    private boolean suspendedFlag;
    
    public EtiquetaParpadea(JLabel aux){ //constructor
        etiqueta = aux;
        suspendedFlag = false;
    }
    
    @Override
    public void run() {
        while(true){
            if(etiqueta.isVisible())
                etiqueta.setVisible(false);
            else
                etiqueta.setVisible(true);
            
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(EtiquetaParpadea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            synchronized(this){
                while(suspendedFlag){
                    try{
                        wait();
                    } catch(InterruptedException ex){
                    java.util.logging.Logger.getLogger(EtiquetaParpadea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);                        
                    }// del catch
                } // del while(suspendedFlag)
            } // del synchronized
        } //del while(true)
    } // del run
    
    synchronized void mySuspend(){
        suspendedFlag = true;
    }
    synchronized void myResume(){
        suspendedFlag = false;
        notify();
    }
}