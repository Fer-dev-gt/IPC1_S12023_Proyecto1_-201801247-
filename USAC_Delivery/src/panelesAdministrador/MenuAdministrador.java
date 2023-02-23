package panelesAdministrador;
import panelesUsuario.menuUsuario;
import java.awt.BorderLayout;


public class MenuAdministrador extends javax.swing.JFrame {
    RegionesPrecios ventanaRegiones = new RegionesPrecios();
    DepartamentoMunicipio ventanaDepartamentoMuni = new DepartamentoMunicipio();
    Reportes ventanaReportes = new Reportes();

    
    public MenuAdministrador() {
        initComponents();
        btnRegionesPrecios.setText("<html><p>Manejar Regiones</p><p>y Precios</p></html>");
        btnDepartamentoMunicipios.setText("<html><p>Departamentos</p><p>y Municipios</p></html>");
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

        labelMenuAdministrador = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnManejarKioskos = new javax.swing.JButton();
        btnRegionesPrecios = new javax.swing.JButton();
        btnMenuUsuario = new javax.swing.JButton();
        btnDepartamentoMunicipios = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnMenuUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnMenuUsuario.setText("Ir a Menu U.");
        btnMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuUsuarioActionPerformed(evt);
            }
        });

        btnDepartamentoMunicipios.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDepartamentoMunicipios.setText("Depart, Muni");

        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton6.setText("Registrar Usuario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelMenuAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnCerrarSesion)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManejarKioskos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegionesPrecios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepartamentoMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMenuAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManejarKioskos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegionesPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepartamentoMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(577, Short.MAX_VALUE))
        );

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
        Kioskos ventanaKiosko = new Kioskos();
        this.getContentPane().removeAll();
        this.getContentPane().add(ventanaKiosko);
        this.getContentPane().validate();
        this.getContentPane().repaint();
    }//GEN-LAST:event_btnManejarKioskosActionPerformed

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
    private javax.swing.JButton btnManejarKioskos;
    private javax.swing.JButton btnMenuUsuario;
    private javax.swing.JButton btnRegionesPrecios;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel labelMenuAdministrador;
    // End of variables declaration//GEN-END:variables
}
