package Autenticar;
import javax.swing.JOptionPane;
import panelesAdministrador.RegistrarUsuario;
import panelesUsuario.menuUsuario;
import panelesAdministrador.menuAdministrador;

public class frameLogin extends javax.swing.JFrame {
    
    menuAdministrador menuAdministrador = new menuAdministrador();
    menuUsuario menuUsuario = new menuUsuario();
    RegistrarUsuario registrarUsuario = new RegistrarUsuario();
    
    
    public frameLogin() {
        initComponents();
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
        btnIngresar = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        registrarUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)
                            .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(registrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCorreo)
                    .addComponent(registrarUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnIngresar)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        pack();
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

    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JButton registrarUsuarios;
    private javax.swing.JTextField textFieldCorreo;
    // End of variables declaration//GEN-END:variables
}