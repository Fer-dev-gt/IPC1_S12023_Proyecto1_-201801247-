package panelesUsuario;
import java.awt.BorderLayout;

public class menuUsuario extends javax.swing.JFrame {

    public menuUsuario() {
        initComponents();
        btnRegistrarTarjeta.setText("<html><p>Registrar Tarjeta</p><p>Crédito Débito</p></html>");
        btnDatosFacturacion.setText("<html><p>Registrar Datos</p><p>Facturacion</p></html>");
        btnDescargarFacturaGuia.setText("<html><p>Descargar Factura</p><p>y Guía</p></html>");
        btnVerEnviosSolicitados.setText("<html><p>Ver Envíos</p><p>Solicitados</p></html>");
    }
    
    
        private void cambiarPanel(javax.swing.JPanel miPanel){
        miPanel.setSize(680,320);
        miPanel.setLocation(0,0);  
        miPanel.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarTarjeta = new javax.swing.JButton();
        btnVerEnviosSolicitados = new javax.swing.JButton();
        btnDatosFacturacion = new javax.swing.JButton();
        btnCotizarPaquetes = new javax.swing.JButton();
        btnRealizarCompra = new javax.swing.JButton();
        btnDescargarFacturaGuia = new javax.swing.JButton();
        btnCerrarSesionUsuario = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelNavegador = new javax.swing.JPanel();
        labelMenuUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarTarjeta.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRegistrarTarjeta.setText("Registrar Tarjeta");
        btnRegistrarTarjeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 199, 101));

        btnVerEnviosSolicitados.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnVerEnviosSolicitados.setText("Ver Envíos");
        btnVerEnviosSolicitados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerEnviosSolicitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEnviosSolicitadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerEnviosSolicitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 95, 202, 101));

        btnDatosFacturacion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDatosFacturacion.setText("Registras Datos Fac");
        btnDatosFacturacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDatosFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosFacturacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnDatosFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 95, 213, 101));

        btnCotizarPaquetes.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCotizarPaquetes.setText("Cotizar Paquetes");
        btnCotizarPaquetes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCotizarPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarPaquetesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCotizarPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 95, 202, 101));

        btnRealizarCompra.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRealizarCompra.setText("Realizar Compra");
        btnRealizarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnRealizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 95, 199, 101));

        btnDescargarFacturaGuia.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDescargarFacturaGuia.setText("Descargar Fac y Guia");
        btnDescargarFacturaGuia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDescargarFacturaGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarFacturaGuiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescargarFacturaGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 95, -1, 101));

        btnCerrarSesionUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCerrarSesionUsuario.setText("Cerrar Sesión");
        btnCerrarSesionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 33, -1, 38));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Tarjeta de Débito/Crédito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(jLabel1)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(627, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("Registrar Datos Factura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(jLabel2)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(633, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Cotizar Paquetes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(jLabel3)
                .addContainerGap(558, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(635, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setText("Realizar Compra");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(538, 538, 538))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(643, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setText("Descargar Factura y Guía");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(486, 486, 486))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(643, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel5);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Ver Envíos");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(586, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(563, 563, 563))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(643, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1270, 710));

        panelNavegador.setBackground(new java.awt.Color(204, 255, 255));
        panelNavegador.setForeground(new java.awt.Color(204, 255, 255));

        labelMenuUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelMenuUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenuUsuario.setText("Menú Usuario");

        javax.swing.GroupLayout panelNavegadorLayout = new javax.swing.GroupLayout(panelNavegador);
        panelNavegador.setLayout(panelNavegadorLayout);
        panelNavegadorLayout.setHorizontalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavegadorLayout.createSequentialGroup()
                .addContainerGap(503, Short.MAX_VALUE)
                .addComponent(labelMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(484, 484, 484))
        );
        panelNavegadorLayout.setVerticalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavegadorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        getContentPane().add(panelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCompraActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnRealizarCompraActionPerformed

    private void btnCerrarSesionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionUsuarioActionPerformed

    }//GEN-LAST:event_btnCerrarSesionUsuarioActionPerformed

    private void btnRegistrarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTarjetaActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegistrarTarjetaActionPerformed

    private void btnDatosFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosFacturacionActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnDatosFacturacionActionPerformed

    private void btnCotizarPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarPaquetesActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnCotizarPaquetesActionPerformed

    private void btnDescargarFacturaGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarFacturaGuiaActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnDescargarFacturaGuiaActionPerformed

    private void btnVerEnviosSolicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEnviosSolicitadosActionPerformed
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_btnVerEnviosSolicitadosActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesionUsuario;
    private javax.swing.JButton btnCotizarPaquetes;
    private javax.swing.JButton btnDatosFacturacion;
    private javax.swing.JButton btnDescargarFacturaGuia;
    private javax.swing.JButton btnRealizarCompra;
    private javax.swing.JButton btnRegistrarTarjeta;
    private javax.swing.JButton btnVerEnviosSolicitados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelMenuUsuario;
    private javax.swing.JPanel panelNavegador;
    // End of variables declaration//GEN-END:variables
}
