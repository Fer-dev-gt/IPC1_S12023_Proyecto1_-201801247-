package panelesAdministrador;
import panelesUsuario.menuUsuario;
import java.awt.BorderLayout;


public class MenuAdministrador extends javax.swing.JFrame {
    RegionesPrecios ventanaRegiones = new RegionesPrecios();
    DepartamentoMunicipio ventanaDepartamentoMuni = new DepartamentoMunicipio();
    Reportes ventanaReportes = new Reportes();

    
    public MenuAdministrador() {
        initComponents();
        btnRegionesPrecios.setText("<html>Manejar Regiones <br>y Precios<br></</html>");
        btnDepartamentoMunicipios.setText("<html>Departamentos <br>y Municipios</html>");
        btnMenuUsuario.setText("<html><p>Ir a Menú</p><p>de Usuario</p></html>");
    }
    
    
    private void cambiarPanel(javax.swing.JPanel miPanel){
    miPanel.setSize(680,320);
    miPanel.setLocation(0,0);  
    miPanel.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNavegador = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        labelMenuAdministrador = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnManejarKioskos = new javax.swing.JButton();
        btnRegionesPrecios = new javax.swing.JButton();
        btnMenuUsuario = new javax.swing.JButton();
        btnDepartamentoMunicipios1 = new javax.swing.JButton();
        btnDepartamentoMunicipios = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNavegador.setBackground(new java.awt.Color(204, 255, 255));
        panelNavegador.setForeground(new java.awt.Color(204, 255, 255));

        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton6.setText("Registrar Usuario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        labelMenuAdministrador.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelMenuAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenuAdministrador.setText("Menú Administrador");

        btnCerrarSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnManejarKioskos.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnManejarKioskos.setText("Manejar Kioskos");
        btnManejarKioskos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManejarKioskosActionPerformed(evt);
            }
        });

        btnRegionesPrecios.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRegionesPrecios.setText("Regiones, Precio");
        btnRegionesPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegionesPreciosActionPerformed(evt);
            }
        });

        btnMenuUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnMenuUsuario.setText("Ir a Menu U.");
        btnMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuUsuarioActionPerformed(evt);
            }
        });

        btnDepartamentoMunicipios1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDepartamentoMunicipios1.setText("Depart, Muni");
        btnDepartamentoMunicipios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentoMunicipios1ActionPerformed(evt);
            }
        });

        btnDepartamentoMunicipios.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDepartamentoMunicipios.setText("Reportes");
        btnDepartamentoMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentoMunicipiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNavegadorLayout = new javax.swing.GroupLayout(panelNavegador);
        panelNavegador.setLayout(panelNavegadorLayout);
        panelNavegadorLayout.setHorizontalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavegadorLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNavegadorLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManejarKioskos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegionesPrecios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepartamentoMunicipios1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepartamentoMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNavegadorLayout.createSequentialGroup()
                        .addComponent(labelMenuAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(btnCerrarSesion)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panelNavegadorLayout.setVerticalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavegadorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMenuAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManejarKioskos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegionesPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepartamentoMunicipios1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepartamentoMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(panelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setText("Manejar Kioskos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(jLabel4)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(682, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Regiones, Precio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(562, 562, 562))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addContainerGap(661, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setText("Departamentos, Municipios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(537, 537, 537))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addContainerGap(653, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        jLabel7.setText("Reportes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel7)
                .addContainerGap(720, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel7)
                .addContainerGap(635, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 223, 1240, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuUsuarioActionPerformed
            menuUsuario menuUsuario = new menuUsuario();
            menuUsuario.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnMenuUsuarioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RegistrarUsuario registrar = new RegistrarUsuario();
        registrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnManejarKioskosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManejarKioskosActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnManejarKioskosActionPerformed

    private void btnRegionesPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegionesPreciosActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnRegionesPreciosActionPerformed

    private void btnDepartamentoMunicipios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentoMunicipios1ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnDepartamentoMunicipios1ActionPerformed

    private void btnDepartamentoMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentoMunicipiosActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnDepartamentoMunicipiosActionPerformed

    
    
    
    
    
    
    
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDepartamentoMunicipios;
    private javax.swing.JButton btnDepartamentoMunicipios1;
    private javax.swing.JButton btnManejarKioskos;
    private javax.swing.JButton btnMenuUsuario;
    private javax.swing.JButton btnRegionesPrecios;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelMenuAdministrador;
    private javax.swing.JPanel panelNavegador;
    // End of variables declaration//GEN-END:variables
}
