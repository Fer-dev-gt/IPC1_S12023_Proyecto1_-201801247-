package Autenticar;
import javax.swing.JOptionPane;
import panelesAdministrador.RegistrarUsuario;
import panelesUsuario.menuUsuario;
import panelesAdministrador.menuAdministrador2;

public class login extends javax.swing.JPanel {
RegistrarUsuario registrarUsuario = new RegistrarUsuario();

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPassword = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        registrarUsuarios = new javax.swing.JButton();

        labelPassword.setText("Contraseña");

        labelCorreo.setText("Correo Electrónico");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        registrarUsuarios.setText("Registrar Nuevo Usuario");
        registrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(257, 257, 257))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo)
                    .addComponent(registrarUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if(getUsuario().equals("a") && getClave().equals("a")){
            menuAdministrador.setVisible(true);
            this.setVisible(false);
        }else if(getUsuario().equals("c") && getClave().equals("c")){
            menuUsuario.setVisible(true);
            this.setVisible(false);
        }else{
            textFieldCorreo.setText("");
            PasswordField.setText("");
            JOptionPane.showMessageDialog(null, "Usuario o Clave incorrectas, intente nuevamente");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void registrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuariosActionPerformed
        registrarUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarUsuariosActionPerformed
    public String getUsuario(){
        return textFieldCorreo.getText();
    }
    
    
    public String getClave(){
        char[] password = PasswordField.getPassword();
        return new String(password);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JButton registrarUsuarios;
    private javax.swing.JTextField textFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
