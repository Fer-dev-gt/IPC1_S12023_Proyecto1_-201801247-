package panelesAdministrador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PanelKioskos extends javax.swing.JPanel {
    String nombreKiosko, regionKiosko;
    static int idKiosko;
    int contadorKioskosIngresado = 0;
    
   
    public PanelKioskos() {
        initComponents();
    }
    
    public PanelKioskos(int idKioskos, String nombreKiosko, String regionKiosko){
        this.idKiosko = idKioskos;
        this.nombreKiosko = nombreKiosko;
        this.regionKiosko = regionKiosko;
    }
    
    ArrayList <PanelKioskos> listaKioskos = new ArrayList<PanelKioskos>();                 // Array de objetos que contiene los kioskos registrados
    public ArrayList<PanelKioskos> getListaKioskos() {
        return listaKioskos;
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

        codigoRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(M) Metropolitana", "(NT) Norte", "(NO) Nororiente", "(SO) Suroriente", "(SOC) Suroccidente", "(NOC) Noroccidente" }));
        codigoRegion.setSelectedItem(null);
        add(codigoRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        registrarKiosko.setText("Registrar Kiosko");
        registrarKiosko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarKioskoActionPerformed(evt);
            }
        });
        add(registrarKiosko, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jLabel1.setText("Código de Kiosko");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel2.setText("Código de la Región");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        jLabel3.setText("Nombre de Kiosko");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));
        add(codigoKiosko, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 163, -1));
        add(nombrekiosko, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 163, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setText("Manejo de Kioscos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarKioskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarKioskoActionPerformed
       try {
            idKiosko = Integer.parseInt(codigoKiosko.getText());
       } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID tiene que ser un número");
            System.out.println("ID tiene que ser un número");
            codigoKiosko.setText("");
       }
        listaKioskos.add(new PanelKioskos(idKiosko, nombrekiosko.getText(), codigoRegion.getSelectedItem().toString()));
        System.out.println("Kiosko Registrado Exitosamente");
        System.out.println("El ID registrado es: " + listaKioskos.get(contadorKioskosIngresado).getIdKiosko());
        System.out.println("El nombre registrado es: " + listaKioskos.get(contadorKioskosIngresado).getNombreKiosko());
        System.out.println("La región registrada es: " + listaKioskos.get(contadorKioskosIngresado).getRegionKiosko());
        
        contadorKioskosIngresado++;
    }//GEN-LAST:event_registrarKioskoActionPerformed

    public String getNombreKiosko() {
        return nombreKiosko;
    }
    public void setNombreKiosko(String nombreKiosko) {
        this.nombreKiosko = nombreKiosko;
    }

    public String getRegionKiosko() {
        return regionKiosko;
    }
    public void setRegionKiosko(String regionKiosko) {
        this.regionKiosko = regionKiosko;
    }

    public static int getIdKiosko() {
        return idKiosko;
    }
    public static void setIdKiosko(int idKiosko) {
        PanelKioskos.idKiosko = idKiosko;
    }

    
    
    
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
