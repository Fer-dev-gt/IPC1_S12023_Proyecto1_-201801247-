package Autenticar;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import panelesAdministrador.MenuAdministrador;
import panelesAdministrador.PanelDepartamentosMuni;
import panelesAdministrador.PanelKioskos;
import panelesAdministrador.PanelRegionesPrecios;
import panelesAdministrador.PanelReportes;
import panelesUsuario.MenuUsuario;
import panelesUsuario.PanelRegitstrarTarjeta;
import panelesUsuario.PanelDatosFacturacion;
import panelesUsuario.PanelCotizarPaquetes;
import panelesUsuario.PanelRealizarCompra;
import panelesUsuario.PanelDescargarFactura;
import panelesUsuario.PanelVerEnvios;


public class VentanasPrincipal extends javax.swing.JFrame {
    private login login = new login();
    private MenuAdministrador menuAdministrador = new MenuAdministrador();
    private PanelDepartamentosMuni panelDepartamentosMuni = new PanelDepartamentosMuni();
    private PanelKioskos panelKioskos = new PanelKioskos();
    private PanelRegionesPrecios panelRegionesPrecios = new PanelRegionesPrecios();
    private PanelReportes panelReportes = new PanelReportes();
    private MenuUsuario menuUsuario = new MenuUsuario();
    private PanelRegitstrarTarjeta panelRegitstrarTarjeta = new PanelRegitstrarTarjeta();
    private PanelDatosFacturacion panelDatosFacturacion = new PanelDatosFacturacion();
    private PanelCotizarPaquetes panelCotizarPaquetes = new PanelCotizarPaquetes();
    private PanelRealizarCompra panelRealizarCompra = new PanelRealizarCompra();
    private PanelDescargarFactura panelDescargarFactura = new PanelDescargarFactura();
    private PanelVerEnvios panelVerEnvios = new PanelVerEnvios();
    
    
    
    private void cambiarPanel(javax.swing.JPanel miPanel){
        miPanel.setLocation(0,0);       
        miPanel.setSize(1200,720);
        panelBase.removeAll();
        panelBase.add(miPanel, BorderLayout.CENTER);
        panelBase.revalidate();
        panelBase.repaint();
    }
    
    public VentanasPrincipal() {
        initComponents();        
        cambiarPanel(login);
        opcionesAdministrador.setVisible(false);
        opcionesUsuario.setVisible(false);
        this.setTitle("Iniciar Sesión");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelAbajo = new javax.swing.JPanel();
        ingresoLogIn = new javax.swing.JButton();
        opcionesAdministrador = new javax.swing.JPanel();
        btnManejarKioskos = new javax.swing.JButton();
        btnRegionesPrecios = new javax.swing.JButton();
        btnDepartamentoMunicipios = new javax.swing.JButton();
        btnreportes = new javax.swing.JButton();
        opcionesUsuario = new javax.swing.JPanel();
        registrarTarjeta = new javax.swing.JButton();
        datosFacturacion = new javax.swing.JButton();
        cotizarPaquetes = new javax.swing.JButton();
        realizarCompra = new javax.swing.JButton();
        descargarFacturaGuia = new javax.swing.JButton();
        verEnviosSolicitados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setBackground(new java.awt.Color(51, 102, 0));

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        panelAbajo.setBackground(new java.awt.Color(0, 153, 153));

        ingresoLogIn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ingresoLogIn.setText("Ingresar");
        ingresoLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(ingresoLogIn)
                .addGap(105, 105, 105))
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ingresoLogIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        opcionesAdministrador.setBackground(new java.awt.Color(153, 153, 153));

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

        btnDepartamentoMunicipios.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDepartamentoMunicipios.setText("Depart, Muni");
        btnDepartamentoMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentoMunicipiosActionPerformed(evt);
            }
        });

        btnreportes.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnreportes.setText("Reportes");
        btnreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesAdministradorLayout = new javax.swing.GroupLayout(opcionesAdministrador);
        opcionesAdministrador.setLayout(opcionesAdministradorLayout);
        opcionesAdministradorLayout.setHorizontalGroup(
            opcionesAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAdministradorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(opcionesAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(opcionesAdministradorLayout.createSequentialGroup()
                        .addComponent(btnManejarKioskos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(opcionesAdministradorLayout.createSequentialGroup()
                        .addComponent(btnRegionesPrecios)
                        .addGap(29, 29, 29)
                        .addComponent(btnDepartamentoMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        opcionesAdministradorLayout.setVerticalGroup(
            opcionesAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionesAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManejarKioskos)
                    .addComponent(btnreportes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionesAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegionesPrecios)
                    .addComponent(btnDepartamentoMunicipios))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        opcionesUsuario.setBackground(new java.awt.Color(153, 255, 255));

        registrarTarjeta.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        registrarTarjeta.setText("Registrar Tarjeta");
        registrarTarjeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarTarjetaActionPerformed(evt);
            }
        });

        datosFacturacion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        datosFacturacion.setText("Registrar Datos Factura");
        datosFacturacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datosFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosFacturacionActionPerformed(evt);
            }
        });

        cotizarPaquetes.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cotizarPaquetes.setText("Cotizar Paquetes");
        cotizarPaquetes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cotizarPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizarPaquetesActionPerformed(evt);
            }
        });

        realizarCompra.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        realizarCompra.setText("Realizar Compra");
        realizarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        realizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarCompraActionPerformed(evt);
            }
        });

        descargarFacturaGuia.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        descargarFacturaGuia.setText("Descargar Fac y Guia");
        descargarFacturaGuia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        descargarFacturaGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarFacturaGuiaActionPerformed(evt);
            }
        });

        verEnviosSolicitados.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        verEnviosSolicitados.setText("Ver Envíos");
        verEnviosSolicitados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verEnviosSolicitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEnviosSolicitadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesUsuarioLayout = new javax.swing.GroupLayout(opcionesUsuario);
        opcionesUsuario.setLayout(opcionesUsuarioLayout);
        opcionesUsuarioLayout.setHorizontalGroup(
            opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(opcionesUsuarioLayout.createSequentialGroup()
                        .addComponent(registrarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datosFacturacion))
                    .addGroup(opcionesUsuarioLayout.createSequentialGroup()
                        .addComponent(realizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descargarFacturaGuia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cotizarPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verEnviosSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        opcionesUsuarioLayout.setVerticalGroup(
            opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarTarjeta)
                    .addComponent(datosFacturacion)
                    .addComponent(cotizarPaquetes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realizarCompra)
                    .addComponent(descargarFacturaGuia)
                    .addComponent(verEnviosSolicitados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcionesAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcionesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcionesAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionesUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoLogInActionPerformed
        if(login.getUsuario().equals("a") && login.getClave().equals("a")){
            cambiarPanel(menuAdministrador);
            panelAbajo.setVisible(false);
            opcionesAdministrador.setVisible(true);
        }else if(login.getUsuario().equals("c") && login.getClave().equals("c")){
            cambiarPanel(menuUsuario);
            panelAbajo.setVisible(false);
            opcionesUsuario.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o Clave incorrectas, intente nuevamente");
        }

    }//GEN-LAST:event_ingresoLogInActionPerformed

    
    // Botones del menú del Admnistrador
    private void btnManejarKioskosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManejarKioskosActionPerformed
        cambiarPanel(panelKioskos);
    }//GEN-LAST:event_btnManejarKioskosActionPerformed

    private void btnRegionesPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegionesPreciosActionPerformed
        cambiarPanel(panelRegionesPrecios);
    }//GEN-LAST:event_btnRegionesPreciosActionPerformed

    private void btnDepartamentoMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentoMunicipiosActionPerformed
        cambiarPanel(panelDepartamentosMuni);
    }//GEN-LAST:event_btnDepartamentoMunicipiosActionPerformed

    private void btnreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesActionPerformed
        cambiarPanel(panelReportes);
    }//GEN-LAST:event_btnreportesActionPerformed

    
    // Botones del menú del Usuario
    private void registrarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarTarjetaActionPerformed
        cambiarPanel(panelRegitstrarTarjeta);
    }//GEN-LAST:event_registrarTarjetaActionPerformed

    private void datosFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosFacturacionActionPerformed
        cambiarPanel(panelDatosFacturacion);
    }//GEN-LAST:event_datosFacturacionActionPerformed

    private void cotizarPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizarPaquetesActionPerformed
        cambiarPanel(panelCotizarPaquetes);
    }//GEN-LAST:event_cotizarPaquetesActionPerformed

    private void realizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarCompraActionPerformed
        cambiarPanel(panelRealizarCompra);
    }//GEN-LAST:event_realizarCompraActionPerformed

    private void descargarFacturaGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarFacturaGuiaActionPerformed
        cambiarPanel(panelDescargarFactura);
    }//GEN-LAST:event_descargarFacturaGuiaActionPerformed

    private void verEnviosSolicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEnviosSolicitadosActionPerformed
        cambiarPanel(panelVerEnvios);
    }//GEN-LAST:event_verEnviosSolicitadosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepartamentoMunicipios;
    private javax.swing.JButton btnManejarKioskos;
    private javax.swing.JButton btnRegionesPrecios;
    private javax.swing.JButton btnreportes;
    private javax.swing.JButton cotizarPaquetes;
    private javax.swing.JButton datosFacturacion;
    private javax.swing.JButton descargarFacturaGuia;
    private javax.swing.JButton ingresoLogIn;
    private javax.swing.JPanel opcionesAdministrador;
    private javax.swing.JPanel opcionesUsuario;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelBase;
    private javax.swing.JButton realizarCompra;
    private javax.swing.JButton registrarTarjeta;
    private javax.swing.JButton verEnviosSolicitados;
    // End of variables declaration//GEN-END:variables
}
