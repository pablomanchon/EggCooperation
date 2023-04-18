package GUI;

import BaseDatos.FabricanteDAO;
import BaseDatos.ProductoDAO;
import Entidades.Fabricante.Fabricante;
import Entidades.Producto.Producto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearoBorrar extends javax.swing.JFrame {

    public CrearoBorrar() throws Exception {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        obtenerProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        indiceLbl = new javax.swing.JLabel();
        anteriorBtn = new javax.swing.JButton();
        proximoBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        panelAtrib = new javax.swing.JPanel();
        nombreLab = new javax.swing.JLabel();
        codigoLab = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        codigoTxt = new javax.swing.JTextField();
        panelAtrib2 = new javax.swing.JPanel();
        codigoFabLab = new javax.swing.JLabel();
        precioLab = new javax.swing.JLabel();
        codigoFabTxt = new javax.swing.JTextField();
        precioTxt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        objeto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INDICE");

        indiceLbl.setForeground(new java.awt.Color(0, 0, 0));
        indiceLbl.setText("0");

        anteriorBtn.setText("<");
        anteriorBtn.setFocusable(false);
        anteriorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorBtnActionPerformed(evt);
            }
        });

        proximoBtn.setText(">");
        proximoBtn.setFocusable(false);
        proximoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(anteriorBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(indiceLbl)
                .addGap(18, 18, 18)
                .addComponent(proximoBtn)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(indiceLbl)
                    .addComponent(proximoBtn)
                    .addComponent(anteriorBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR");
        jButton1.setFocusable(false);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BORRAR");
        jButton2.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        panelAtrib.setBackground(new java.awt.Color(102, 102, 255));

        nombreLab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreLab.setForeground(new java.awt.Color(255, 255, 255));
        nombreLab.setText("Nombre");

        codigoLab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        codigoLab.setForeground(new java.awt.Color(255, 255, 255));
        codigoLab.setText("Codigo");

        nombreTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        codigoTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelAtribLayout = new javax.swing.GroupLayout(panelAtrib);
        panelAtrib.setLayout(panelAtribLayout);
        panelAtribLayout.setHorizontalGroup(
            panelAtribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtribLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelAtribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoLab)
                    .addComponent(nombreLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(panelAtribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        panelAtribLayout.setVerticalGroup(
            panelAtribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAtribLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAtribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLab))
                .addGap(18, 18, 18)
                .addGroup(panelAtribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLab))
                .addGap(96, 96, 96))
        );

        panelAtrib2.setBackground(new java.awt.Color(102, 102, 255));

        codigoFabLab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        codigoFabLab.setForeground(new java.awt.Color(255, 255, 255));
        codigoFabLab.setText("Codigo_Fabricante");

        precioLab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        precioLab.setForeground(new java.awt.Color(255, 255, 255));
        precioLab.setText("Precio");

        codigoFabTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        precioTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelAtrib2Layout = new javax.swing.GroupLayout(panelAtrib2);
        panelAtrib2.setLayout(panelAtrib2Layout);
        panelAtrib2Layout.setHorizontalGroup(
            panelAtrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtrib2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelAtrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoFabLab)
                    .addComponent(precioLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelAtrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoFabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        panelAtrib2Layout.setVerticalGroup(
            panelAtrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtrib2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAtrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoFabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoFabLab))
                .addGap(18, 18, 18)
                .addGroup(panelAtrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioLab))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OBJETO");

        objeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Fabricante", "Producto" }));
        objeto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemSelected(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(objeto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAtrib2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAtrib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(panelAtrib, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelAtrib2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void itemSelected(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemSelected
        
        String opcion = objeto.getSelectedItem().toString();
        switch (opcion) {
            case "Fabricante":
                mostrarPaneles(true,false);
                break;
            case "Producto":
                mostrarPaneles(true,true);
                break;
            case "-":
                mostrarPaneles(false,false);
                break;
        }
    }//GEN-LAST:event_itemSelected

    private void mostrarPaneles(boolean panel1, boolean panel2) {
        panelAtrib.setVisible(panel1);
        panelAtrib2.setVisible(panel2);
        try {
            obtenerProductos();
        } catch (Exception ex) {
            Logger.getLogger(CrearoBorrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void anteriorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorBtnActionPerformed
        int ind = Integer.parseInt(indiceLbl.getText());
        if (ind != 0) {
            ind--;
            indiceLbl.setText(String.valueOf(ind));
        }
        extraerProducto(ind);
    }//GEN-LAST:event_anteriorBtnActionPerformed

    private void proximoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoBtnActionPerformed
        int ind = Integer.parseInt(indiceLbl.getText());
        ind++;
        indiceLbl.setText(String.valueOf(ind));
        extraerProducto(ind);
    }//GEN-LAST:event_proximoBtnActionPerformed

    private void extraerProducto(int ind) {
        try {
            String opcion = objeto.getSelectedItem().toString();
            if (opcion.equals("Producto")) {
                Producto ob = productos.get(ind);
                nombreTxt.setText(ob.getNombre());
                codigoTxt.setText(String.valueOf(ob.getCodigo()));
                codigoFabTxt.setText(String.valueOf(ob.getCodigo_fabricante()));
                precioTxt.setText(String.valueOf(ob.getPrecio()));
            } else if (opcion.equals("Fabricante")) {
                Fabricante fab = fabricantes.get(ind);
                nombreTxt.setText(fab.getNombre());
                codigoTxt.setText(String.valueOf(fab.getCodigo()));
            }
        } catch (IndexOutOfBoundsException e) {
            nombreTxt.setText("");
            codigoTxt.setText("");
            codigoFabTxt.setText("");
            precioTxt.setText("");
        }
    }

    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Fabricante> fabricantes = new ArrayList();

    private void obtenerProductos() throws Exception {
        String obj = objeto.getSelectedItem().toString();
        if (obj.equals("Fabricante")) {
            fabricantes.clear();
            FabricanteDAO fD = new FabricanteDAO();
            fabricantes = fD.listarFab();
        } else if (obj.equals("Producto")) {
            productos.clear();
            ProductoDAO pD = new ProductoDAO();
            productos = pD.listarProd();
        }
            extraerProducto(Integer.parseInt(indiceLbl.getText()));
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorBtn;
    private javax.swing.JLabel codigoFabLab;
    private javax.swing.JTextField codigoFabTxt;
    private javax.swing.JLabel codigoLab;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JLabel indiceLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel nombreLab;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> objeto;
    private javax.swing.JPanel panelAtrib;
    private javax.swing.JPanel panelAtrib2;
    private javax.swing.JLabel precioLab;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JButton proximoBtn;
    // End of variables declaration//GEN-END:variables

}
