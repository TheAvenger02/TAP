package ejercicios;

/**
 *
 * @author emiliomurillo
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class GUIFG extends JFrame {

    JButton btn1, btn2, btn3;
    JLabel lbl_a, lbl_b, lbl_c, lbl_resultados;
    JTextField txt_a, txt_b, txt_c, txt_resultado1, txt_resultado2;

    public GUIFG() {
        super("Fórmula General");
        this.setLayout(null);
        this.pack();
        //this.setBounds(100, 350, 830, 830);

        btn1 = new JButton("PROCESAR");
        btn1.setBounds(50, 200, 200, 50);
        this.add(btn1);

        btn2 = new JButton("LIMPIAR");
        btn2.setBounds(300, 200, 200, 50);
        this.add(btn2);

        btn3 = new JButton("SALIR");
        btn3.setBounds(550, 200, 200, 50);
        this.add(btn3);

        lbl_a = new JLabel("Coeficiente término cuadrático: ");
        lbl_b = new JLabel("Coeficiente término lineal: ");
        lbl_c = new JLabel("Coeficiente término independiente: ");
        lbl_resultados = new JLabel("Resultados: ");

        txt_a = new JTextField(80);
        txt_b = new JTextField(80);
        txt_c = new JTextField(80);
        txt_resultado1 = new JTextField(80);
        txt_resultado2 = new JTextField(80);

        this.add(lbl_a);
        this.add(lbl_b);
        this.add(lbl_c);
        this.add(lbl_resultados);
        this.add(txt_a);
        this.add(txt_b);
        this.add(txt_c);
        this.add(txt_resultado1);
        this.add(txt_resultado2);

        lbl_a.setBounds(20, 50, 210, 50);
        txt_a.setBounds(220, 50, 40, 50);
        lbl_b.setBounds(280, 50, 210, 50);
        txt_b.setBounds(450, 50, 40, 50);
        lbl_c.setBounds(500, 50, 240, 50);
        txt_c.setBounds(720, 50, 40, 50);
        lbl_resultados.setBounds(100, 120, 100, 50);
        txt_resultado1.setBounds(200, 120, 200, 50);
        txt_resultado2.setBounds(400, 120, 200, 50);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                int a = Integer.parseInt(txt_a.getText());
                int b = Integer.parseInt(txt_b.getText());
                int c = Integer.parseInt(txt_c.getText());
                FG fg = new FG(a, b, c);
                fg.x1();
                fg.x2();
                txt_resultado1.setText(Double.toString(fg.x1));
                txt_resultado2.setText(Double.toString(fg.x2));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                txt_a.setText("");
                txt_b.setText("");
                txt_c.setText("");
                txt_resultado1.setText("");
                txt_resultado2.setText("");

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                dispose();
            }
        });

        txt_a.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_a.setBackground(Color.LIGHT_GRAY);
                txt_a.setForeground(Color.black);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txt_a.setBackground(Color.white);
                txt_a.setForeground(Color.black);
            }
        });

        txt_b.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_b.setBackground(Color.LIGHT_GRAY);
                txt_b.setForeground(Color.black);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txt_b.setBackground(Color.white);
                txt_b.setForeground(Color.black);
            }
        });

        txt_c.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_c.setBackground(Color.LIGHT_GRAY);
                txt_c.setForeground(Color.black);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txt_c.setBackground(Color.white);
                txt_c.setForeground(Color.black);
            }
        });

        txt_resultado1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_resultado1.setBackground(Color.LIGHT_GRAY);
                txt_resultado1.setForeground(Color.black);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txt_resultado1.setBackground(Color.white);
                txt_resultado1.setForeground(Color.black);
            }
        });

        txt_resultado2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_resultado2.setBackground(Color.LIGHT_GRAY);
                txt_resultado2.setForeground(Color.black);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txt_resultado2.setBackground(Color.white);
                txt_resultado2.setForeground(Color.black);
            }
        });

        this.setBounds(100, 100, 800, 300);
        //this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GUIFG();
    }
}
