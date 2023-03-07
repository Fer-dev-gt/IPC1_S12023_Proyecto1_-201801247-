package panelesAdministrador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelRegionesPrecios extends javax.swing.JPanel {
    public String[][] listaPreciosRegiones = new String[6][4];
    int nuevoPrecioEstandar, nuevoPrecioEspecial;
    
    public PanelRegionesPrecios() {
        listaPreciosRegiones[0][0] = "(M) Metropolitana";
        listaPreciosRegiones[0][1] = "35.00";
        listaPreciosRegiones[0][2] = "25.00";
        
        listaPreciosRegiones[1][0] = "(NT) Norte";
        listaPreciosRegiones[1][1] = "68.50";
        listaPreciosRegiones[1][2] = "45.55";
        
        listaPreciosRegiones[2][0] = "(NO) Nororiente";
        listaPreciosRegiones[2][1] = "58.68";
        listaPreciosRegiones[2][2] = "35.48";
        
        listaPreciosRegiones[3][0] = "(SO) Suroriente";
        listaPreciosRegiones[3][1] = "38.68";
        listaPreciosRegiones[3][2] = "32.48";
        
        listaPreciosRegiones[4][0] = "(SOC) Suroccidente";
        listaPreciosRegiones[4][1] = "34.00";
        listaPreciosRegiones[4][2] = "29.00";
        
        listaPreciosRegiones[5][0] = "(NOC) Noroccidente";
        listaPreciosRegiones[5][1] = "44.50";
        listaPreciosRegiones[5][2] = "40.00";
                
        
        initComponents();
        DefaultTableModel tablaPreciosRegiones = (DefaultTableModel) tablaPrecios.getModel();
        tablaPreciosRegiones.setRowCount(0);
        tablaPreciosRegiones.setColumnIdentifiers(new Object[] { "Region y Nombre", "Precio Estandar", "Precio Especial" });
        tablaPrecios.setModel(tablaPreciosRegiones);
        
        for (int i = 0; i < listaPreciosRegiones.length; i++) {
                Object[] rowData = { listaPreciosRegiones[i][0], listaPreciosRegiones[i][1], listaPreciosRegiones[i][2]};
                tablaPreciosRegiones.addRow(rowData);
        }
    }
    
    public void actualizarTabla(){
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPrecios = new javax.swing.JTable();
        codigoRegion = new javax.swing.JComboBox<>();
        actualizarPrecios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precioEspecial = new javax.swing.JTextField();
        precioEstandar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Manejo de regiones y precios");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 25, -1, -1));

        tablaPrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tablaPrecios);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 440, 370));

        codigoRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(M) Metropolitana", "(NT) Norte", "(NO) Nororiente", "(SO) Suroriente", "(SOC) Suroccidente", "(NOC) Noroccidente" }));
        codigoRegion.setSelectedItem(null);
        add(codigoRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        actualizarPrecios.setText("Actualizar Precios");
        actualizarPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPreciosActionPerformed(evt);
            }
        });
        add(actualizarPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        jLabel1.setText("Nombre y código de región");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setText("Modificar Precio Estandar");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel3.setText("Modificar Precio Especial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        precioEspecial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioEspecialFocusLost(evt);
            }
        });
        add(precioEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 90, -1));

        precioEstandar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioEstandarFocusLost(evt);
            }
        });
        add(precioEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 90, -1));

        jLabel4.setText("Q");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jLabel6.setText("Q");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPreciosActionPerformed
     try{
         if(!precioEstandar.getText().isEmpty()){
     nuevoPrecioEstandar = Integer.parseInt(precioEstandar.getText());
         }
         if(!precioEspecial.getText().isEmpty()){
     nuevoPrecioEspecial = Integer.parseInt(precioEspecial.getText());
         }
     DefaultTableModel tablaPreciosRegiones = (DefaultTableModel) tablaPrecios.getModel();
     String nuevoPrecioEstandarString = precioEstandar.getText();
     String nuevoPrecioEspecialString = precioEspecial.getText();
     String regionToFind = codigoRegion.getSelectedItem().toString();
     
     for (int i = 0; i < tablaPreciosRegiones.getRowCount(); i++) {
        String regionSeleccionada = (String) tablaPreciosRegiones.getValueAt(i, 0);                 // Obtiene el Valor de fila seleccionada
        if (regionSeleccionada.equals(regionToFind)) {
            if(!precioEstandar.getText().isEmpty()){                                                        // Verifica si hay un nuevo valor en Precio Especial
                tablaPreciosRegiones.setValueAt(nuevoPrecioEstandarString, i, 1);
            }
            if(!precioEspecial.getText().isEmpty()){                                                        // Verifica si hay un nuevo valor en Precio Especial
                tablaPreciosRegiones.setValueAt(nuevoPrecioEspecialString, i, 2);
                System.out.println("Precio Especial Actualizado");
            }
            tablaPreciosRegiones.fireTableDataChanged();                                                    // Actualiza los valores en la tabla
            JOptionPane.showMessageDialog(null, "SE ACTUALIZARON LOS PRECIOS");
            precioEspecial.setText("");
            precioEstandar.setText("");
            codigoRegion.setSelectedItem(null);
            break; 
         }
        }
     }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dato Invalido, Ingrese un numero");
            precioEstandar.setText("");
       }catch(java.lang.NullPointerException comboBoxNull){
            JOptionPane.showMessageDialog(null, "Seleccione una region");
       }
    }//GEN-LAST:event_actualizarPreciosActionPerformed

    private void precioEstandarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioEstandarFocusLost
        try {
            nuevoPrecioEstandar = Integer.parseInt(precioEstandar.getText());
       } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dato Invalido, Ingrese un numero");
            System.out.println("Dato Invalido");
            precioEstandar.setText("");
       }
    }//GEN-LAST:event_precioEstandarFocusLost

    private void precioEspecialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioEspecialFocusLost
        try {
            nuevoPrecioEspecial = Integer.parseInt(precioEspecial.getText());
       } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dato Invalido, Ingrese un numero");
            System.out.println("Dato Invalido");
            precioEspecial.setText("");
       }
    }//GEN-LAST:event_precioEspecialFocusLost


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarPrecios;
    private javax.swing.JComboBox<String> codigoRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField precioEspecial;
    private javax.swing.JTextField precioEstandar;
    private javax.swing.JTable tablaPrecios;
    // End of variables declaration//GEN-END:variables
}
