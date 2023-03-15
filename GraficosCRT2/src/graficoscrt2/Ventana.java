package graficoscrt2;

import java.awt.MouseInfo;
import libgraph.*;

/**
 *
 * @author emiliomurillo
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpnBotones = new javax.swing.JPanel();
        jbtRectangulo = new javax.swing.JButton();
        jbtCirculo = new javax.swing.JButton();
        jbtTriangulo = new javax.swing.JButton();
        jpnDibujo = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtRectangulo.setText("Rectángulo");
        jbtRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRectanguloActionPerformed(evt);
            }
        });
        jpnBotones.add(jbtRectangulo);

        jbtCirculo.setText("Círculo");
        jbtCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCirculoActionPerformed(evt);
            }
        });
        jpnBotones.add(jbtCirculo);

        jbtTriangulo.setText("Triángulo");
        jbtTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTrianguloActionPerformed(evt);
            }
        });
        jpnBotones.add(jbtTriangulo);

        getContentPane().add(jpnBotones, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jpnDibujoLayout = new javax.swing.GroupLayout(jpnDibujo);
        jpnDibujo.setLayout(jpnDibujoLayout);
        jpnDibujoLayout.setHorizontalGroup(
            jpnDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jpnDibujoLayout.setVerticalGroup(
            jpnDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        getContentPane().add(jpnDibujo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRectanguloActionPerformed
        Rectangulo rect = new Rectangulo();
        rect.setSize(50,60);
        rect.setLocation(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
        jpnDibujo.add(rect);
        jpnDibujo.repaint();
    }//GEN-LAST:event_jbtRectanguloActionPerformed

    private void jbtCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCirculoActionPerformed
        Circulo circu = new Circulo();
        circu.setSize(50,50);
        circu.setLocation(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
        jpnDibujo.add(circu);
        jpnDibujo.repaint();
    }//GEN-LAST:event_jbtCirculoActionPerformed

    private void jbtTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTrianguloActionPerformed
        Triangulo trian= new Triangulo();
        trian.setSize(50,50);
        trian.setLocation(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
        jpnDibujo.add(trian);
        jpnDibujo.repaint();
    }//GEN-LAST:event_jbtTrianguloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtCirculo;
    private javax.swing.JButton jbtRectangulo;
    private javax.swing.JButton jbtTriangulo;
    private javax.swing.JPanel jpnBotones;
    private javax.swing.JPanel jpnDibujo;
    // End of variables declaration//GEN-END:variables
}
