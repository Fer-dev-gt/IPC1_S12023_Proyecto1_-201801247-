package panelesUsuario;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.util.function.Function;


public class PanelRegitstrarTarjeta extends javax.swing.JPanel {

    public PanelRegitstrarTarjeta() {
        initComponents();
    }
    
    public static Function<String, String> f1=(S)->{
            return S.substring(0,S.length()-4).replaceAll("[0-9]","*")
            +S.substring(S.length()-4,S.length());
    };
            

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fechaVencimiento = new javax.swing.JTextField();
        nombreTarjeta = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        numeroTarjeta = new javax.swing.JTextField();
        guardarTarjeta = new javax.swing.JButton();

        jLabel15.setText("Número de la tarjeta ");

        jLabel16.setText("Nombre de la tarjeta");

        jLabel17.setText("Fecha de vencimiento");

        jLabel18.setText("CVV");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Registro de tarjeta de crédito/débito");

        numeroTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeroTarjetaFocusLost(evt);
            }
        });

        guardarTarjeta.setText("Guardar");
        guardarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(415, 415, 415))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(nombreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(numeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(fechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarTarjeta)
                .addGap(405, 405, 405))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addComponent(guardarTarjeta)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTarjetaActionPerformed
        String numeroTarjetaRegistrada = numeroTarjeta.getText();
        System.out.println(f1.apply(numeroTarjetaRegistrada));
        
    }//GEN-LAST:event_guardarTarjetaActionPerformed

    
    
    private void numeroTarjetaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroTarjetaFocusLost
        try {
            MaskFormatter formatter = new MaskFormatter("#### #### #### ####");
            JFormattedTextField formattedTextField = new JFormattedTextField(formatter);
            formattedTextField.setText(numeroTarjeta.getText()); 
            System.out.println("funciono");
        } catch (ParseException e) {
            System.out.println("No funciono");
        }
    }//GEN-LAST:event_numeroTarjetaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField fechaVencimiento;
    private javax.swing.JButton guardarTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JTextField nombreTarjeta;
    private javax.swing.JTextField numeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
