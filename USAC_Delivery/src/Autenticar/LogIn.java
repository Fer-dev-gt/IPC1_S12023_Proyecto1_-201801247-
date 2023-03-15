package Autenticar;
import javax.swing.JOptionPane;
import panelesAdministrador.RegistrarUsuario;

public class LogIn extends javax.swing.JPanel{
RegistrarUsuario registrarUsuarios1 = new RegistrarUsuario();

    public LogIn() {
        initComponents();
        this.setLocation(0,0);
        mensajeAlerta.setVisible(false);
    }
    
    public String getUsuario(){
        return textFieldCorreo.getText();
    }
    
    public String getClave(){
        char[] password = PasswordField.getPassword();
        return new String(password);
    }
    
        public void resetearCampos(){
        textFieldCorreo.setText("");
        PasswordField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPassword = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        registrarUsuarios = new javax.swing.JButton();
        limpiarCasillas = new javax.swing.JButton();
        mensajeAlerta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPassword.setText("Contraseña");
        add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        labelCorreo.setText("Correo Electrónico");
        add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        add(textFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 246, -1));

        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 246, -1));

        registrarUsuarios.setText("Registrar Nuevo Usuario");
        registrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuariosActionPerformed(evt);
            }
        });
        add(registrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 670, 180, -1));

        limpiarCasillas.setText("Limpiar Casillas");
        limpiarCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCasillasActionPerformed(evt);
            }
        });
        add(limpiarCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 180, -1));

        mensajeAlerta.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        mensajeAlerta.setForeground(new java.awt.Color(255, 0, 51));
        mensajeAlerta.setText("La contraseña tiene que contener 1 letra minuscula, 1 letra mayuscula, 1 número y 1 caracter especial");
        add(mensajeAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuariosActionPerformed
        registrarUsuarios1.setVisible(true);
    }//GEN-LAST:event_registrarUsuariosActionPerformed

    private void limpiarCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCasillasActionPerformed
        PasswordField.setText("");
        textFieldCorreo.setText("");
    }//GEN-LAST:event_limpiarCasillasActionPerformed

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        mensajeAlerta.setVisible(false);
        
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        char[] password = PasswordField.getPassword();
        String passwordString = new String(password);
        if(buenaPassword(passwordString)){
                try{
                    
                }catch(java.lang.NumberFormatException trono){
                }catch(java.lang.NullPointerException nulo){
                }
            }else{
                mensajeAlerta.setVisible(true);
                PasswordField.setText("");
                System.out.println("Contraseña Rechazada");
            }
    }//GEN-LAST:event_PasswordFieldFocusGained

    public static boolean buenaPassword(String password) {                                          // Metodo para validar si la contraseña tiene buen formato
        boolean tieneMayuscula = false, tieneNumero = false, tieneSimboloEspecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            char letra = password.charAt(i);
            if (Character.isUpperCase(letra)) {
                tieneMayuscula = true;
            } else if (Character.isDigit(letra)) {
                tieneNumero = true;
            } else if (esCaracterEspecial(letra)) {
                tieneSimboloEspecial = true;
            }
        }
        return tieneMayuscula && tieneNumero && tieneSimboloEspecial;
    }
    
    private static boolean esCaracterEspecial(char letra) {
        return !Character.isLetterOrDigit(letra);
    }

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JButton limpiarCasillas;
    private javax.swing.JLabel mensajeAlerta;
    private javax.swing.JButton registrarUsuarios;
    private javax.swing.JTextField textFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
