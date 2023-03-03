package Autenticar;
import panelesAdministrador.RegistrarUsuario;

public class LogIn extends javax.swing.JPanel{
RegistrarUsuario registrarUsuarios1 = new RegistrarUsuario();

    public LogIn() {
        initComponents();
        this.setLocation(0,0);
    }
    
    public String getUsuario(){
        return textFieldCorreo.getText();
    }
    
    public String getClave(){
        char[] password = PasswordField.getPassword();
        return new String(password);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPassword = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        registrarUsuarios = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPassword.setText("Contraseña");
        add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        labelCorreo.setText("Correo Electrónico");
        add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        add(textFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 246, -1));
        add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 246, -1));

        registrarUsuarios.setText("Registrar Nuevo Usuario");
        registrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuariosActionPerformed(evt);
            }
        });
        add(registrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 670, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuariosActionPerformed
        registrarUsuarios1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarUsuariosActionPerformed




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JButton registrarUsuarios;
    private javax.swing.JTextField textFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
