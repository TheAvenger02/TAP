package quebrados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GuiOpQuebrados extends JPanel {

    JLabel lbl_titulo, lbl_q1, lbl_q2, lbl_formule, lbl_resultado;
    JButton btn_suma, btn_resta, btn_multiplicacion, btn_division, btn_borrar;
    JPanel panelTitulo, panelQ1, panelQ2, panelResultado, panelButones;

    quebrados.Quebrados quebrado1 = quebrados.General.fraction;
    quebrados.Quebrados quebrado2 = quebrados.General.fraction;
    quebrados.Operaciones operacion = quebrados.General.operations;

    public GuiOpQuebrados() {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        lbl_titulo = new JLabel("Operaciones con quebrados");
        lbl_titulo.setFont(new Font("Calibri", Font.BOLD, 54));
        lbl_titulo.setForeground(Color.WHITE);
        this.add(lbl_titulo, BorderLayout.CENTER);

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(0, 255, 255));

        panelTitulo = new JPanel();
        panelQ1 = new JPanel();
        panelQ2 = new JPanel();
        panelResultado = new JPanel();
        panelButones = new JPanel();

        lbl_q1 = new JLabel("Quebrado 1: " + quebrado1.getNumerador1() + "/" + quebrado2.getDenominador1());
        lbl_q2 = new JLabel("Quebrado 2: " + quebrado1.getNumerador2() + "/" + quebrado2.getDenominador2());
        lbl_resultado = new JLabel("El resultado es: ");

        btn_suma = new JButton("Sumar");
        btn_resta = new JButton("Restar");
        btn_multiplicacion = new JButton("Multiplicar");
        btn_division = new JButton("Dividir");
        btn_borrar = new JButton("Borrar");

        this.add(panelTitulo);
        this.add(panelQ1);
        this.add(panelQ2);
        this.add(panelResultado);
        this.add(panelButones);

        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelTitulo.setBackground(new Color(196, 41, 104));
        panelTitulo.add(lbl_titulo);

        panelQ1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelQ1.setBackground(new Color(196, 41, 104));
        panelQ1.add(lbl_q1);

        panelQ2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelQ2.setBackground(new Color(196, 41, 104));
        panelQ2.add(lbl_q2);

        panelResultado.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelResultado.setBackground(new Color(196, 41, 104));
        panelResultado.add(lbl_resultado);

        panelButones.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelButones.setBackground(new Color(196, 41, 104));
        panelButones.add(btn_suma);
        panelButones.add(btn_resta);
        panelButones.add(btn_multiplicacion);
        panelButones.add(btn_division);
        panelButones.add(btn_borrar);

        lbl_titulo.setForeground(Color.white);
        lbl_q1.setBounds(90, 160, 300, 30);
        lbl_q1.setFont(new Font("Calibri", 2, 26));
        lbl_q1.setForeground(Color.white);
        lbl_q2.setBounds(280, 160, 300, 30);
        lbl_q2.setFont(new Font("Calibri", 2, 26));
        lbl_q2.setForeground(Color.white);
        lbl_resultado.setBounds(490, 160, 500, 30);
        lbl_resultado.setFont(new Font("Calibri", 2, 26));
        lbl_resultado.setForeground(Color.white);

        btn_suma.setFont(new Font("Georgia", 2, 14));
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_resultado.setText("El resultado es: ");
                lbl_resultado.setText(lbl_resultado.getText() + operacion.sumar(quebrado1, quebrado2));
            }
        });

        btn_resta.setFont(new Font("Georgia", 2, 14));
        btn_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_resultado.setText("El resultado es: ");
                lbl_resultado.setText(lbl_resultado.getText() + operacion.restar(quebrado1, quebrado2));
            }
        });

        btn_multiplicacion.setFont(new Font("Georgia", 2, 14));
        btn_multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_resultado.setText("El resultado es: ");
                lbl_resultado.setText(lbl_resultado.getText() + operacion.multiplicar(quebrado1, quebrado2));
            }
        });

        btn_division.setFont(new Font("Georgia", 2, 14));
        btn_division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_resultado.setText("El resultado es: ");
                lbl_resultado.setText(lbl_resultado.getText() + operacion.dividir(quebrado1, quebrado2));
            }
        });

        btn_borrar.setFont(new Font("Georgia", 2, 14));
        btn_borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quebrado1.setNumerador1(0);
                quebrado1.setDenominador1(0);
                quebrado2.setNumerador2(1);
                quebrado2.setDenominador2(1);

                lbl_q1.setText("Quebrado 1: ");
                lbl_q2.setText("Quebrado 2: ");
                lbl_resultado.setText("El resultado es: ");

                JOptionPane.showMessageDialog(locate(320, 260), "Los datos se han borrado. Para continuar\n"
                        + "crea de nuevo los quebrados");
            }
        });
    }
}
