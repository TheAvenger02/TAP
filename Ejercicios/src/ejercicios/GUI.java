package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author emiliomurillo
 */
public class GUI extends JFrame {

    JButton btn1, btn2;
    JLabel lbl_termino, lbl_resultado;
    JTextField txt_termino, txt_resultado;

    public GUI() {
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
                int suma = 0;
                String resultado = "";
                for (int i = 0; i < n; i++) {
                    resultado += fibonacciRecursivo(i) + " ";
                    suma += fibonacciRecursivo(i);
                }
                txt_resultado.setText(String.valueOf(suma));
                JOptionPane.showMessageDialog(btn1, "LA SERIE FIBONACCI ES: " + resultado);
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
        new GUI();
    }

    public static int fibonacciRecursivo(int n) {

        //CASO BASE, si es cero devuelve un cero
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}
