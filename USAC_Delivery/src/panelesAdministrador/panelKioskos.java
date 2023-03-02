package panelesAdministrador;

public class PanelKioskos extends javax.swing.JPanel {

    
    public PanelKioskos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoRegion = new javax.swing.JComboBox<>();
        registrarKiosko = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigoKiosko = new javax.swing.JTextField();
        nombrekiosko = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(codigoRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        registrarKiosko.setText("Registrar Kiosko");
        add(registrarKiosko, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel1.setText("Código de Kiosko");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel2.setText("Código de la Región");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jLabel3.setText("Nombre de Kiosko");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));
        add(codigoKiosko, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 163, -1));
        add(nombrekiosko, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 163, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setText("Manejo de Kioscos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoKiosko;
    private javax.swing.JComboBox<String> codigoRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombrekiosko;
    private javax.swing.JButton registrarKiosko;
    // End of variables declaration//GEN-END:variables
}
