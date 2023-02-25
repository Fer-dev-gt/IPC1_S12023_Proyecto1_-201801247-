package panelesAdministrador;
import Autenticar.Auntetificacion;

public class RegistrarUsuario extends javax.swing.JFrame {
    public RegistrarUsuario() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        nombreUsuarioNuevo = new javax.swing.JTextField();
        sobrenombre = new javax.swing.JTextField();
        apellidoUsuarioNuevo = new javax.swing.JTextField();
        fechaNacimientoNuevoUsuario = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        telefono = new javax.swing.JTextField();
        registrarDatos = new javax.swing.JButton();
        subirFoto = new javax.swing.JButton();
        nuevaPassword = new javax.swing.JPasswordField();
        confirmarNuevaPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        naacionalidad = new javax.swing.JComboBox<>();
        regregarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Correo Electrónico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 44, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 122, -1, -1));

        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 122, -1, -1));

        jLabel4.setText("Confirmar Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 212, -1, -1));

        jLabel5.setText("Rol");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 329, -1, -1));

        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 212, -1, -1));

        jLabel7.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 131, -1, -1));

        jLabel8.setText("Nacionalidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 131, -1, -1));

        jLabel9.setText("Sobrenombre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 193, -1, -1));

        jLabel10.setText("Teléfono");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, -1, -1));

        jLabel11.setText("Genéro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 251, -1, -1));
        getContentPane().add(correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 73, 346, -1));
        getContentPane().add(nombreUsuarioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 160, 156, -1));
        getContentPane().add(sobrenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 123, -1));
        getContentPane().add(apellidoUsuarioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 160, 156, -1));

        fechaNacimientoNuevoUsuario.setText("dd/mm/aaaa");
        fechaNacimientoNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaNacimientoNuevoUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(fechaNacimientoNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 130, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario Individual", "Kiosko" }));
        jComboBox1.setSelectedItem(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        jComboBox2.setSelectedItem(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 123, -1));

        registrarDatos.setText("Registrar Datos");
        registrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(registrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        subirFoto.setText("Subir Foto");
        getContentPane().add(subirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));
        getContentPane().add(nuevaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, -1));
        getContentPane().add(confirmarNuevaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, -1));

        jLabel12.setText(".");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 710, -1, -1));

        naacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemalteca", "Salvadoreña", "Hondureña", "Mexicana" }));
        naacionalidad.setSelectedItem(null);
        getContentPane().add(naacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 120, -1));

        regregarLogin.setText("Regresar a Login");
        regregarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regregarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(regregarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosActionPerformed
        Auntetificacion login = new Auntetificacion();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarDatosActionPerformed

    private void fechaNacimientoNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaNacimientoNuevoUsuarioMouseClicked
        fechaNacimientoNuevoUsuario.setText("");
    }//GEN-LAST:event_fechaNacimientoNuevoUsuarioMouseClicked

    private void regregarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regregarLoginActionPerformed
        Auntetificacion login = new Auntetificacion();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regregarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoUsuarioNuevo;
    private javax.swing.JPasswordField confirmarNuevaPassword;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JTextField fechaNacimientoNuevoUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> naacionalidad;
    private javax.swing.JTextField nombreUsuarioNuevo;
    private javax.swing.JPasswordField nuevaPassword;
    private javax.swing.JButton registrarDatos;
    private javax.swing.JButton regregarLogin;
    private javax.swing.JTextField sobrenombre;
    private javax.swing.JButton subirFoto;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
