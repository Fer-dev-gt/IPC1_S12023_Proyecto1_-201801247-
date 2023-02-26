package Autenticar;
import java.awt.BorderLayout;
import panelesAdministrador.menuAdministrador2;


public class ventanasPrincipal extends javax.swing.JFrame {
    login login = new login();
    menuAdministrador2 menuAdministrador= new menuAdministrador2();
    
    public ventanasPrincipal() {
        initComponents();        
        cambiarPanel(login);
        panelOpciones.setVisible(false);
        this.setTitle("Ventanas Administrador");
    }
    
    private void cambiarPanel(javax.swing.JPanel miPanel){
        miPanel.setSize(680,320);
        miPanel.setLocation(0,0);        
        panelBase.removeAll();
        panelBase.add(miPanel, BorderLayout.CENTER);
        panelBase.revalidate();
        panelBase.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelAbajo = new javax.swing.JPanel();
        ingresologin = new javax.swing.JButton();
        etiquetaError = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setBackground(new java.awt.Color(51, 102, 0));

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        panelAbajo.setBackground(new java.awt.Color(0, 153, 153));

        ingresologin.setText("Ingresar");
        ingresologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresologinActionPerformed(evt);
            }
        });

        etiquetaError.setText("...");

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(ingresologin)
                .addGap(18, 18, 18)
                .addComponent(etiquetaError)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresologin)
                    .addComponent(etiquetaError))
                .addGap(32, 32, 32))
        );

        panelOpciones.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresologinActionPerformed
        if(login.getUsuario().equals("a") && login.getClave().equals("a")){
            cambiarPanel(menuAdministrador);
            panelAbajo.setVisible(false);
            panelOpciones.setVisible(true);
        }else{
            etiquetaError.setText("Usuario o Clave incorrectas, intente nuevamente");
        }

    }//GEN-LAST:event_ingresologinActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaError;
    private javax.swing.JButton ingresologin;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}
