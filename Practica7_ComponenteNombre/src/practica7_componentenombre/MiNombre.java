package practica7_componentenombre;

/**
 *
 * @author emiliomurillo
 */
public class MiNombre extends javax.swing.JPanel implements java.beans.Customizer {
    private Object bean;
    /** Creates new customizer MiNombre */
   
    public MiNombre() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbName = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbApePat = new javax.swing.JLabel();
        jlbApeMat = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApePat = new javax.swing.JTextField();
        jtfApeMat = new javax.swing.JTextField();

        jlbName.setText("Name:");

        jlbNombre.setText("Nombre");

        jlbApePat.setText("Apellido P");

        jlbApeMat.setText("Apellido M");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jtfApePat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApePatActionPerformed(evt);
            }
        });
        jtfApePat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApePatKeyTyped(evt);
            }
        });

        jtfApeMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApeMatKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbApePat)
                            .addComponent(jlbNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombre)
                            .addComponent(jtfApePat)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbApeMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfApeMat, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbApePat)
                    .addComponent(jtfApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbApeMat)
                    .addComponent(jtfApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfApePatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApePatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApePatActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
    jlbName.setText("Name:" + jtfNombre.getText() + " " + jtfApePat.getText() + " "
    + jtfApeMat.getText());
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApePatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApePatKeyTyped
    jlbName.setText("Name:" + jtfNombre.getText() + " " + jtfApePat.getText() + " " +
    jtfApeMat.getText());
    }//GEN-LAST:event_jtfApePatKeyTyped

    private void jtfApeMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApeMatKeyTyped
    jlbName.setText("Name:" + jtfNombre.getText() + " " + jtfApePat.getText() + " "
    + jtfApeMat.getText());
    }//GEN-LAST:event_jtfApeMatKeyTyped

    @Override
    public void setObject(Object bean) {
        this.bean = bean;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbApeMat;
    private javax.swing.JLabel jlbApePat;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JTextField jtfApeMat;
    private javax.swing.JTextField jtfApePat;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
