package Autenticar;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import panelesAdministrador.menuAdministrador;
import panelesAdministrador.panelDepartamentosMuni;
import panelesAdministrador.panelKioskos;
import panelesAdministrador.panelRegionesPrecios;
import panelesAdministrador.panelReportes;
import panelesUsuario.menuUsuario2;
import panelesUsuario.panelRegitstrarTarjeta;
import panelesUsuario.panelDatosFacturacion;
import panelesUsuario.panelCotizarPaquetes;
import panelesUsuario.panelRealizarCompra;
import panelesUsuario.panelDescargarFactura;
import panelesUsuario.panelVerEnvios;


public class ventanasPrincipal extends javax.swing.JFrame {
    private login login = new login();
    private menuAdministrador menuAdministrador = new menuAdministrador();
    private panelDepartamentosMuni panelDepartamentosMuni = new panelDepartamentosMuni();
    private panelKioskos panelKioskos = new panelKioskos();
    private panelRegionesPrecios panelRegionesPrecios = new panelRegionesPrecios();
    private panelReportes panelReportes = new panelReportes();
    private menuUsuario2 menuUsuario = new menuUsuario2();
    private panelRegitstrarTarjeta panelRegitstrarTarjeta = new panelRegitstrarTarjeta();
    private panelDatosFacturacion panelDatosFacturacion = new panelDatosFacturacion();
    private panelCotizarPaquetes panelCotizarPaquetes = new panelCotizarPaquetes();
    private panelRealizarCompra panelRealizarCompra = new panelRealizarCompra();
    private panelDescargarFactura panelDescargarFactura = new panelDescargarFactura();
    private panelVerEnvios panelVerEnvios = new panelVerEnvios();
    
    
    
    private void cambiarPanel(javax.swing.JPanel miPanel){
        miPanel.setSize(680,320);
        miPanel.setLocation(0,0);        
        panelBase.removeAll();
        panelBase.add(miPanel, BorderLayout.CENTER);
        panelBase.revalidate();
        panelBase.repaint();
    }
    
    public ventanasPrincipal() {
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
            .addGap(0, 384, Short.MAX_VALUE)
        );

        panelAbajo.setBackground(new java.awt.Color(0, 153, 153));

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
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ingresoLogIn)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresoLogIn)
                .addGap(59, 59, 59))
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
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        datosFacturacion.setText("Registras Datos Fac");
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
                .addGroup(opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datosFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cotizarPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descargarFacturaGuia)
                    .addComponent(verEnviosSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        opcionesUsuarioLayout.setVerticalGroup(
            opcionesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datosFacturacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cotizarPaquetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(realizarCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descargarFacturaGuia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verEnviosSolicitados)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionesAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(opcionesAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(opcionesUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
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
