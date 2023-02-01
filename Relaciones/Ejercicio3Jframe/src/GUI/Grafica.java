package GUI;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class Grafica extends javax.swing.JFrame {

  
    public Grafica() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        copa2 = new javax.swing.JLabel();
        copa1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        copa2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pablo\\Documents\\NetBeansProjects\\Relaciones\\Cartas truco\\2_Oro.png")); // NOI18N
        copa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                copa2MousePressed(evt);
            }
        });

        copa1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pablo\\Documents\\NetBeansProjects\\Relaciones\\Cartas truco\\1_Copa.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(copa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copa1)
                .addGap(0, 319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copa2)
                    .addComponent(copa1))
                .addGap(0, 167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copa2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copa2MousePressed
        JComponent jc = (JComponent) evt.getSource();
        TransferHandler th = jc.getTransferHandler();
        th.exportAsDrag(jc, evt, TransferHandler.MOVE);
    }//GEN-LAST:event_copa2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel copa1;
    public javax.swing.JLabel copa2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
