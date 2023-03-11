package panelesAdministrador;

public class PanelDepartamentosMuni extends javax.swing.JPanel {
    
    public PanelDepartamentosMuni() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setText("Manejo de departamentos y municipios");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel7.setText("Datos de departamentos:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel13.setText("Datos de Municipio");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(M) Metropolitana", "(NT) Norte", "(NO) Nororiente", "(SO) Suroriente", "(SOC) Suroccidente", "(NOC) Noroccidente" }));
        jComboBox1.setSelectedItem(null);
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
