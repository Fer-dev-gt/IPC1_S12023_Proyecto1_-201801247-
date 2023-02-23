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

        labelMenuUsuario = new javax.swing.JLabel();
        btnRegistrarTarjeta = new javax.swing.JButton();
        btnVerEnviosSolicitados = new javax.swing.JButton();
        btnDatosFacturacion = new javax.swing.JButton();
        btnCotizarPaquetes = new javax.swing.JButton();
        btnRealizarCompra = new javax.swing.JButton();
        btnDescargarFacturaGuia = new javax.swing.JButton();
        btnCerrarSesionUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMenuUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelMenuUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenuUsuario.setText("Menú Usuario");

        btnRegistrarTarjeta.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRegistrarTarjeta.setText("Registrar Tarjeta");
        btnRegistrarTarjeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnVerEnviosSolicitados.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnVerEnviosSolicitados.setText("Ver Envíos");
        btnVerEnviosSolicitados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnDatosFacturacion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDatosFacturacion.setText("Registras Datos Fac");
        btnDatosFacturacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCotizarPaquetes.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCotizarPaquetes.setText("Cotizar Paquetes");
        btnCotizarPaquetes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnRealizarCompra.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRealizarCompra.setText("Realizar Compra");
        btnRealizarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCompraActionPerformed(evt);
            }
        });

        btnDescargarFacturaGuia.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDescargarFacturaGuia.setText("Descargar Fac y Guia");
        btnDescargarFacturaGuia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCerrarSesionUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCerrarSesionUsuario.setText("Cerrar Sesión");
        btnCerrarSesionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289)
                .addComponent(btnCerrarSesionUsuario)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDatosFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCotizarPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDescargarFacturaGuia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerEnviosSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatosFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCotizarPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescargarFacturaGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerEnviosSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(550, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarCompraActionPerformed

    private void btnCerrarSesionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionUsuarioActionPerformed

    }//GEN-LAST:event_btnCerrarSesionUsuarioActionPerformed

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
    private javax.swing.JLabel labelMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
