package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class GUIFibonacci extends JFrame {

    JButton btn1, btn2;
    JLabel lbl_termino, lbl_resultado;
    JTextField txt_termino, txt_resultado;

    public GUIFibonacci() {
        super("SERIE DE FIBONACCI");
        this.setLayout(null);

        btn1 = new JButton("PROCEDER");
        btn1.setBounds(50, 200, 200, 50);
        this.add(btn1);

        btn2 = new JButton("SALIR");
        btn2.setBounds(250, 200, 200, 50);
        this.add(btn2);

        lbl_termino = new JLabel("Término: ");
        lbl_resultado = new JLabel("Resultado: ");

        txt_termino = new JTextField(80);
        txt_resultado = new JTextField(80);

        this.add(lbl_termino);
        this.add(lbl_resultado);
        this.add(txt_termino);
        this.add(txt_resultado);

        lbl_termino.setBounds(100, 50, 100, 50);
        txt_termino.setBounds(200, 50, 200, 50);
        lbl_resultado.setBounds(100, 100, 100, 50);
        txt_resultado.setBounds(200, 100, 200, 50);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                int n = Integer.parseInt(txt_termino.getText());
                Fibonacci fibo = new Fibonacci(n);
                fibo.fibonacci();
                txt_resultado.setText(Integer.toString(fibo.b));
                JOptionPane.showMessageDialog(btn1, "LA SERIE FIBONACCI ES: " + fibo.sFiboSerie);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lo que queremos que realice el botón
                dispose();
            }
        });

        this.setBounds(100, 100, 500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new GUIFibonacci();
    }

    class Fibonacci {

        int n, a = 0, b = 1, c = 0;
        String sFiboSerie = "";

        public Fibonacci(int n) {
            n = this.n;
        }

        public void fibonacci() {
            for (int i = 0; i < n; i++) {
                c = a;
                a = b;
                b = c + a;
                sFiboSerie += b + " ";
            }
        }

    }
}
