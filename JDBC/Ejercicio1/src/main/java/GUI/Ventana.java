package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrinc = new javax.swing.JPanel();
        crearBorrarBtn = new javax.swing.JButton();
        mostrarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrinc.setBackground(new java.awt.Color(102, 102, 255));
        panelPrinc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearBorrarBtn.setBackground(new java.awt.Color(51, 51, 255));
        crearBorrarBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        crearBorrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        crearBorrarBtn.setText("CREAR/BORRAR");
        crearBorrarBtn.setFocusable(false);
        crearBorrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBorrarBtnActionPerformed(evt);
            }
        });
        panelPrinc.add(crearBorrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 70, 183, 95));

        mostrarBtn.setBackground(new java.awt.Color(51, 51, 255));
        mostrarBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mostrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        mostrarBtn.setText("MOSTRAR");
        mostrarBtn.setFocusable(false);
        panelPrinc.add(mostrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 183, 183, 95));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBorrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBorrarBtnActionPerformed
        try {
            CrearoBorrar v = new CrearoBorrar();
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearBorrarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearBorrarBtn;
    private javax.swing.JButton mostrarBtn;
    private javax.swing.JPanel panelPrinc;
    // End of variables declaration//GEN-END:variables
}
