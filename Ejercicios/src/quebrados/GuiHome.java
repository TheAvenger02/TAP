package quebrados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GuiHome extends JFrame {

    JPanel panelApp, panelBotones, panelVentanas;
    JButton btn_home, btn_quebrados, btn_operaciones, btn_salir;

    public GuiHome() {

        btn_home = new JButton("Inicio");
        btn_home.setSize(180, 30);
        btn_home.setFont(new Font("Georgia", 2, 14));
        btn_home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Vetana_Inicial());
            }
        });

        btn_quebrados = new JButton("Quebrados");
        btn_quebrados.setSize(180, 30);
        btn_quebrados.setFont(new Font("Georgia", 2, 14));
        btn_quebrados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new GuiQuebrados());
            }
        });

        btn_operaciones = new JButton("Operaciones");
        btn_operaciones.setSize(180, 30);
        btn_operaciones.setFont(new Font("Georgia", 2, 14));
        btn_operaciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new GuiOpQuebrados());
            }
        });

        btn_salir = new JButton("Salir");
        btn_salir.setSize(180, 30);
        btn_salir.setFont(new Font("Georgia", 2, 14));
        btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panelBotones = new JPanel();
        panelBotones.setBackground(new Color(51, 214, 182));
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBotones.add(btn_home);
        panelBotones.add(btn_quebrados);
        panelBotones.add(btn_operaciones);
        panelBotones.add(btn_salir);

        panelVentanas = new JPanel();
        panelVentanas.setBackground(new Color(79, 38, 40));
        panelVentanas.setLayout(new BorderLayout());

        panelApp = new JPanel();
        panelApp.setBackground(new Color(255, 255, 255));
        panelApp.setLayout(new BorderLayout());
        panelApp.add(panelBotones, BorderLayout.NORTH);
        panelApp.add(panelVentanas, BorderLayout.CENTER);

        showWindows(new Vetana_Inicial());

        this.setBounds(150, 15, 800, 700);
        this.setLayout(new BorderLayout());
        this.add(panelApp, BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void showWindows(JPanel window) {
        window.setSize(800, 700);
        window.setLocation(0, 0);

        panelVentanas.removeAll();
        panelVentanas.add(window, BorderLayout.CENTER);
        panelVentanas.revalidate();
        panelVentanas.repaint();
    }

    public static void main(String[] args) {
        new GuiHome();
    }
}
