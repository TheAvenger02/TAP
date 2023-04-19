package textboxext;

import java.awt.Color;

/**
 *
 * @author emiliomurillo
 */
public class TextBoxEx extends javax.swing.JTextField{

    public TextBoxEx() {
        super();
        java.awt.event.FocusAdapter fl = new java.awt.event.FocusAdapter(){	
    public void focusGained(java.awt.event.FocusEvent evt){	
        jtfTextBoxExFocusGained(evt);		
    }	
    public void	focusLost(java.awt.event.FocusEvent evt){	
    jtfTextBoxExFocusLost(evt);	
    }		
        };	
            addFocusListener(fl);	
    }
    private boolean CambiarColor = true;
    public boolean getCambiarColor() {
        return CambiarColor;
    }
    public void setCambiarColor(boolean CambiarColor) {
        this.CambiarColor = CambiarColor;
    }
    
    private java.awt.Color colorOriginal = Color.white;
    //Inicializada en blanco
    
    private void jtfTextBoxExFocusGained(java.awt.event.FocusEvent evt){
        if(getCambiarColor()){
            colorOriginal = getBackground();
            setBackground(Color.pink);
        }
        else
            setBackground(colorOriginal);
    }
    private void jtfTextBoxExFocusLost(java.awt.event.FocusEvent evt){
        setBackground(colorOriginal);
    }

}