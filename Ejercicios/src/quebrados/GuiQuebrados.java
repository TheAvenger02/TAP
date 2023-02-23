package quebrados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GuiQuebrados extends JPanel {

    JTextField txt_n1, txt_d1, txt_n2, txt_d2;
    JLabel lbl_titulo, lbl_q1, lbl_q2, lbl_n1, lbl_d1, lbl_n2, lbl_d2;
    JPanel panelTitulo, panelQ1, panelQ2, panelN1, panelD1, panelN2, panelD2, panelBotones;
    JButton btn_crear, btn_limpiar;

    quebrados.Quebrados fraction = quebrados.General.fraction;

    GridBagConstraints constraints = new GridBagConstraints();

    public GuiQuebrados() {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        lbl_titulo = new JLabel("Crear Quebrados");
        lbl_titulo.setFont(new Font("Calibri", Font.BOLD, 54));
        lbl_titulo.setForeground(Color.white);

        this.add(lbl_titulo);
        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(255, 255, 0));

        panelTitulo = new JPanel();
        panelQ1 = new JPanel();
        panelQ2 = new JPanel();
        panelN1 = new JPanel();
        panelD1 = new JPanel();
        panelN2 = new JPanel();
        panelD2 = new JPanel();
        panelBotones = new JPanel();

        lbl_q1 = new JLabel("Quebrado 1: ");
        lbl_n1 = new JLabel("Numerador: ");
        lbl_d1 = new JLabel("Denominador: ");
        lbl_q2 = new JLabel("Quebrado 2: ");
        lbl_n2 = new JLabel("Numerador: ");
        lbl_d2 = new JLabel("Denominador: ");

        txt_n1 = new JTextField(8);
        txt_d1 = new JTextField(8);
        txt_n2 = new JTextField(8);
        txt_d2 = new JTextField(8);

        btn_crear = new JButton("Crear quebrado");
        btn_limpiar = new JButton("Limpiar");

        lbl_q1.setFont(new Font("Calibri", 2, 30));
        lbl_q1.setForeground(Color.white);
        lbl_n1.setFont(new Font("Calibri", 2, 24));
        lbl_n1.setForeground(Color.white);
        lbl_d1.setBounds(125, 255, 160, 30);
        lbl_d1.setFont(new Font("Calibri", 2, 24));
        lbl_d1.setForeground(Color.white);

        lbl_q2.setFont(new Font("Calibri", 2, 30));
        lbl_q2.setForeground(Color.white);
        lbl_n2.setFont(new Font("Calibri", 2, 24));
        lbl_n2.setForeground(Color.white);
        lbl_d2.setFont(new Font("Calibri", 2, 24));
        lbl_d2.setForeground(Color.white);

        txt_n1.setForeground(Color.BLACK);
        txt_n1.setBackground(Color.white);
        txt_d1.setForeground(Color.BLACK);
        txt_d1.setBackground(Color.white);
        txt_n2.setForeground(Color.BLACK);
        txt_n2.setBackground(Color.white);
        txt_d2.setForeground(Color.BLACK);
        txt_d2.setBackground(Color.white);

        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelTitulo.setBackground(new Color(221, 141, 46));
        panelTitulo.add(lbl_titulo);

        panelQ1.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 0));
        panelQ1.setBackground(new Color(221, 141, 46));
        panelQ1.add(lbl_q1);

        panelN1.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 0));
        panelN1.setBackground(new Color(221, 141, 46));
        panelN1.add(lbl_n1);
        panelN1.add(txt_n1);

        panelD1.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 0));
        panelD1.setBackground(new Color(221, 141, 46));
        panelD1.add(lbl_d1);
        panelD1.add(txt_d1);

        panelQ2.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 0));
        panelQ2.setBackground(new Color(221, 141, 46));
        panelQ2.add(lbl_q2);

        panelN2.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 0));
        panelN2.setBackground(new Color(221, 141, 46));
        panelN2.add(lbl_n2);
        panelN2.add(txt_n2);

        panelD2.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 0));
        panelD2.setBackground(new Color(221, 141, 46));
        panelD2.add(lbl_d2);
        panelD2.add(txt_d2);

        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelBotones.setBackground(new Color(221, 141, 46));
        panelBotones.add(btn_crear);
        panelBotones.add(btn_limpiar);

        this.add(panelTitulo);
        this.add(panelQ1);
        this.add(panelN1);
        this.add(panelD1);
        this.add(panelQ2);
        this.add(panelN2);
        this.add(panelD2);
        this.add(panelBotones);

        btn_crear.setFont(new Font("Georgia", 2, 14));
        btn_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    fraction.setNumerador1(Integer.parseInt(txt_n1.getText()));
                    fraction.setDenominador1(Integer.parseInt(txt_d1.getText()));
                    fraction.setNumerador2(Integer.parseInt(txt_n2.getText()));
                    fraction.setDenominador2(Integer.parseInt(txt_d2.getText()));

                    JOptionPane.showMessageDialog(locate(320, 285), "Se han creado los quebrados, da clic en la página 'Operaciones'");

                    txt_n1.setText("");
                    txt_d1.setText("");
                    txt_n2.setText("");
                    txt_d2.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(locate(320, 285), "Por favor, rellena todos los campos.");
                }
            }
        });

        btn_limpiar.setFont(new Font("Georgia", 2, 14));
        btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_n1.setText("");
                txt_d1.setText("");
                txt_n2.setText("");
                txt_d2.setText("");
            }
        });
    }
}
