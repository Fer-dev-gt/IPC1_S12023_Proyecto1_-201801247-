package panelesAdministrador;
import Autenticar.VentanasPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistrarUsuario extends javax.swing.JFrame {                              
    String correo, nombre, apellido, fechaNacimiento, telefono, sobrenombre, password;      // Atributos de la clase RegistrarUsuario
    Object rol, genero, nacionalidad;
    int indexDeUsuarios = 0;
    
    public RegistrarUsuario() {
        initComponents();
        kioskosDisponiblesLabel.setVisible(false);
        kioskosDisponibles.setVisible(false);
    }
    
    public RegistrarUsuario(String correo, String nombre, String apellido, String fechaNacimiento, String password, String telefono, String sobrenombre,
                                    Object rol, Object genero, Object nacionalidad){
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
        this.telefono = telefono;
        this.sobrenombre = sobrenombre;
        this.rol = rol;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }   
    
    ArrayList <RegistrarUsuario> listaUsuarios = new ArrayList<RegistrarUsuario>();                 // Array de objetos que contiene los usuarios registrados
    public ArrayList<RegistrarUsuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
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
        sobrenombreUsuario = new javax.swing.JTextField();
        apellidoUsuarioNuevo = new javax.swing.JTextField();
        fechaNacimientoNuevoUsuario = new javax.swing.JTextField();
        rolUsuario = new javax.swing.JComboBox<>();
        generoUsuario = new javax.swing.JComboBox<>();
        telefonoUsuario = new javax.swing.JTextField();
        registrarDatos = new javax.swing.JButton();
        subirFoto = new javax.swing.JButton();
        nuevaPassword = new javax.swing.JPasswordField();
        confirmarNuevaPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        nacionalidadUsuario = new javax.swing.JComboBox<>();
        regregarLogin = new javax.swing.JButton();
        limpiarDatos = new javax.swing.JButton();
        kioskosDisponibles = new javax.swing.JComboBox<>();
        kioskosDisponiblesLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dpi = new javax.swing.JTextField();

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
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

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
        getContentPane().add(sobrenombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 123, -1));
        getContentPane().add(apellidoUsuarioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 160, 156, -1));

        fechaNacimientoNuevoUsuario.setText("dd/mm/aaaa");
        fechaNacimientoNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaNacimientoNuevoUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(fechaNacimientoNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 130, -1));

        rolUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario Individual", "Usuario Empresarial", "Kiosko" }));
        rolUsuario.setSelectedItem(null);
        rolUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rolUsuarioItemStateChanged(evt);
            }
        });
        getContentPane().add(rolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        generoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        generoUsuario.setSelectedItem(null);
        getContentPane().add(generoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));
        getContentPane().add(telefonoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 123, -1));

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

        nacionalidadUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemalteca", "Salvadoreña", "Hondureña", "Mexicana" }));
        nacionalidadUsuario.setSelectedItem(null);
        getContentPane().add(nacionalidadUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 120, -1));

        regregarLogin.setText("Regresar a Login");
        regregarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regregarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(regregarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        limpiarDatos.setText("Limpiar Casillas");
        limpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(limpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        kioskosDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Miraflores", "Xela", "Portales" }));
        kioskosDisponibles.setSelectedItem(null);
        getContentPane().add(kioskosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        kioskosDisponiblesLabel.setText("Kioskos Disponibles");
        getContentPane().add(kioskosDisponiblesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel13.setText("DPI");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));
        getContentPane().add(dpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosActionPerformed
       char[] password = nuevaPassword.getPassword();
       String passwordString = new String(password);
            if(buenaPassword(passwordString)){
                try{
                    listaUsuarios.add(new RegistrarUsuario(correoElectronico.getText(), nombreUsuarioNuevo.getText(), apellidoUsuarioNuevo.getText(), fechaNacimientoNuevoUsuario.getText(),
                            passwordString, telefonoUsuario.getText(), sobrenombreUsuario.getText(), rolUsuario.getSelectedItem().toString(), generoUsuario.getSelectedItem().toString(), nacionalidadUsuario.getSelectedItem().toString()));
                    System.out.println("Contraseña Aceptada");
                    System.out.println("Iteracion #" + indexDeUsuarios);
                    System.out.println("El correro registrado es: " + listaUsuarios.get(indexDeUsuarios).getCorreo());
                    System.out.println("El nombre registrado es: " + listaUsuarios.get(indexDeUsuarios).getNombre());
                    System.out.println("El apellido registrado es: " + listaUsuarios.get(indexDeUsuarios).getApellido());
                    System.out.println("La fecha registrada es: " + listaUsuarios.get(indexDeUsuarios).getFechaNacimiento());
                    System.out.println("La contraseña registrada es: " + listaUsuarios.get(indexDeUsuarios).getPassword());
                    System.out.println("El telefono registrado es: " + listaUsuarios.get(indexDeUsuarios).getTelefono());
                    System.out.println("El sobrenombre registrado es: " + listaUsuarios.get(indexDeUsuarios).getSobrenombre());
                    System.out.println("El rol registrado es: " + listaUsuarios.get(indexDeUsuarios).getRol());
                    System.out.println("El genero registrado es: " + listaUsuarios.get(indexDeUsuarios).getGenero());
                    System.out.println("La nacionalidad registrado es: " + listaUsuarios.get(indexDeUsuarios).getNacionalidad() + "\n\n");
                    indexDeUsuarios++;
                }catch(java.lang.NumberFormatException trono){
                    JOptionPane.showMessageDialog(null, "Ingrese numeros en vez de letras");
                }catch(java.lang.NullPointerException nulo){
                    JOptionPane.showMessageDialog(null, "No es permitido dejar el campo en blanco");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos: \nUna letra mayuscula\nUn número\nUn caracter especial");
                nuevaPassword.setText("");
                confirmarNuevaPassword.setText("");
                System.out.println("Contraseña Rechazada");
            }
 
        /*VentanasPrincipal ventana = new VentanasPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);*/
        
    }//GEN-LAST:event_registrarDatosActionPerformed

    private void fechaNacimientoNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaNacimientoNuevoUsuarioMouseClicked
        fechaNacimientoNuevoUsuario.setText("");
    }//GEN-LAST:event_fechaNacimientoNuevoUsuarioMouseClicked

    private void regregarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regregarLoginActionPerformed
        VentanasPrincipal ventana = new VentanasPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regregarLoginActionPerformed

    private void limpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarDatosActionPerformed
        try{
            correoElectronico.setText("");
            nombreUsuarioNuevo.setText("");
            apellidoUsuarioNuevo.setText("");
            sobrenombreUsuario.setText("");
            telefonoUsuario.setText("");
            dpi.setText("");
            fechaNacimientoNuevoUsuario.setText("dd/mm/aaaa");
            nuevaPassword.setText("");
            confirmarNuevaPassword.setText("");
            rolUsuario.setSelectedIndex(-1);
            nacionalidadUsuario.setSelectedIndex(-1);
            generoUsuario.setSelectedIndex(-1);
        }catch(java.lang.NullPointerException apuntaHaciaNulo){
            System.out.println("Error");    
            
        }
    }//GEN-LAST:event_limpiarDatosActionPerformed

    private void rolUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rolUsuarioItemStateChanged
        String rolEscogido = rolUsuario.getSelectedItem().toString();
        if(rolEscogido == "Kiosko"){
            kioskosDisponiblesLabel.setVisible(true);
            kioskosDisponibles.setVisible(true);
        }else{
            kioskosDisponiblesLabel.setVisible(false);
            kioskosDisponibles.setVisible(false);
        }
    }//GEN-LAST:event_rolUsuarioItemStateChanged

    
    
    
    // Declaracion de "Getters y Setters"
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }
    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public Object getRol() {
        return rol;
    }
    public void setRol(Object rol) {
        this.rol = rol;
    }

    public Object getGenero() {
        return genero;
    }
    public void setGenero(Object genero) {
        this.genero = genero;
    }

    public Object getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(Object nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoUsuarioNuevo;
    private javax.swing.JPasswordField confirmarNuevaPassword;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JTextField dpi;
    private javax.swing.JTextField fechaNacimientoNuevoUsuario;
    private javax.swing.JComboBox<String> generoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> kioskosDisponibles;
    private javax.swing.JLabel kioskosDisponiblesLabel;
    private javax.swing.JButton limpiarDatos;
    private javax.swing.JComboBox<String> nacionalidadUsuario;
    private javax.swing.JTextField nombreUsuarioNuevo;
    private javax.swing.JPasswordField nuevaPassword;
    private javax.swing.JButton registrarDatos;
    private javax.swing.JButton regregarLogin;
    private javax.swing.JComboBox<String> rolUsuario;
    private javax.swing.JTextField sobrenombreUsuario;
    private javax.swing.JButton subirFoto;
    private javax.swing.JTextField telefonoUsuario;
    // End of variables declaration//GEN-END:variables
}
