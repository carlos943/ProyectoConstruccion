/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorClientes;
import Controlador.ControladorProveedores;
import Controlador.ControladorServicios;
import Modelo.Cliente;
import Modelo.Proveedor;
import Modelo.Servicio;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class VtnAgrega_oModificaProveedor extends javax.swing.JFrame {

     private static VtnAgrega_oModificaProveedor 
            instanciaVtnAgregaoModificaProveedor = new VtnAgrega_oModificaProveedor();

    private boolean seModificaraProveedor;
    /**
     * Creates new form VtnAgrega_oModificaProveedor
     */
    public VtnAgrega_oModificaProveedor() {
        initComponents();
        //colocamos la ventana en el centro.
        setLocationRelativeTo(null);
        seModificaraProveedor= false;
    }
    public static VtnAgrega_oModificaProveedor getInstanciaVtnAgregaoModificaProveedor() {
        return instanciaVtnAgregaoModificaProveedor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarProveedor = new javax.swing.JButton();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtCorreoProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        btnRegresarVtnProveedores = new javax.swing.JButton();
        Correo = new javax.swing.JLabel();
        Dirección = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCarpaEvento = new javax.swing.JCheckBox();
        cbBanqueteraEvento = new javax.swing.JCheckBox();
        cbLucesEvento = new javax.swing.JCheckBox();
        cbLugarEvento = new javax.swing.JCheckBox();
        cbMusicaEvento = new javax.swing.JCheckBox();
        txtBanqueteraEvento = new javax.swing.JTextField();
        txtCarpaEvento = new javax.swing.JTextField();
        txtLucesEvento = new javax.swing.JTextField();
        txtLugarEvento = new javax.swing.JTextField();
        txtMusicaEvento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Proveedor");

        btnGuardarProveedor.setText("Guardar");
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });

        btnRegresarVtnProveedores.setText("Regresar");
        btnRegresarVtnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVtnProveedoresActionPerformed(evt);
            }
        });

        Correo.setText("Correo:");

        Dirección.setText("Dirección:");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Teléfono:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Proveedor");

        cbCarpaEvento.setText("Carpa");
        cbCarpaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCarpaEventoActionPerformed(evt);
            }
        });

        cbBanqueteraEvento.setText("Banquetera");
        cbBanqueteraEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBanqueteraEventoActionPerformed(evt);
            }
        });

        cbLucesEvento.setText("Luces");
        cbLucesEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLucesEventoActionPerformed(evt);
            }
        });

        cbLugarEvento.setText("Lugar");
        cbLugarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLugarEventoActionPerformed(evt);
            }
        });

        cbMusicaEvento.setText("Música");
        cbMusicaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMusicaEventoActionPerformed(evt);
            }
        });

        txtBanqueteraEvento.setEditable(false);
        txtBanqueteraEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanqueteraEventoActionPerformed(evt);
            }
        });

        txtCarpaEvento.setEditable(false);

        txtLucesEvento.setEditable(false);
        txtLucesEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLucesEventoActionPerformed(evt);
            }
        });

        txtLugarEvento.setEditable(false);
        txtLugarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarEventoActionPerformed(evt);
            }
        });

        txtMusicaEvento.setEditable(false);
        txtMusicaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMusicaEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresarVtnProveedores)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbBanqueteraEvento)
                    .addComponent(cbCarpaEvento)
                    .addComponent(cbLucesEvento))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLucesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMusicaEvento))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBanqueteraEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbLugarEvento))
                            .addComponent(txtCarpaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 10, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMusicaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dirección)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionProveedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreProveedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Correo)
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreoProveedor))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardarProveedor)
                        .addGap(151, 151, 151)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dirección)
                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correo)
                    .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBanqueteraEvento)
                    .addComponent(cbLugarEvento)
                    .addComponent(txtBanqueteraEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCarpaEvento)
                    .addComponent(txtCarpaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLucesEvento)
                    .addComponent(cbMusicaEvento)
                    .addComponent(txtLucesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMusicaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProveedor)
                    .addComponent(btnRegresarVtnProveedores))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void cbCarpaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCarpaEventoActionPerformed
        if (this.cbCarpaEvento.isSelected()){
            this.txtCarpaEvento.setEditable(true);
        }else{
            this.txtCarpaEvento.setText("");
            this.txtCarpaEvento.setEditable(false);
        }
    }//GEN-LAST:event_cbCarpaEventoActionPerformed

    private void cbMusicaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMusicaEventoActionPerformed
        if (this.cbMusicaEvento.isSelected()){
            this.txtMusicaEvento.setEditable(true);
        }else{
            this.txtMusicaEvento.setText("");
            this.txtMusicaEvento.setEditable(false);
        }
    }//GEN-LAST:event_cbMusicaEventoActionPerformed

    private void txtBanqueteraEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanqueteraEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanqueteraEventoActionPerformed

    private void cbBanqueteraEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBanqueteraEventoActionPerformed
        if (this.cbBanqueteraEvento.isSelected()){
            this.txtBanqueteraEvento.setEditable(true);
        }else{
            this.txtBanqueteraEvento.setText("");
            this.txtBanqueteraEvento.setEditable(false);
        }
    }//GEN-LAST:event_cbBanqueteraEventoActionPerformed

    private void txtLucesEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLucesEventoActionPerformed
        
    }//GEN-LAST:event_txtLucesEventoActionPerformed

    private void txtLugarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarEventoActionPerformed
        
    }//GEN-LAST:event_txtLugarEventoActionPerformed

    private void txtMusicaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMusicaEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMusicaEventoActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        
        ArrayList<Servicio> array=new ArrayList();
        
        
        if (this.cbBanqueteraEvento.isSelected()){
            array.add(new Servicio("Banquetera",Float.parseFloat(this.txtBanqueteraEvento.getText())));
        }
        if (this.cbCarpaEvento.isSelected()){
            array.add(new Servicio("Carpa",Float.parseFloat(this.txtBanqueteraEvento.getText())));
        }
        if (this.cbLucesEvento.isSelected()){
            array.add(new Servicio("Luces",Float.parseFloat(this.txtBanqueteraEvento.getText())));
        }
        if (this.cbLugarEvento.isSelected()){
            array.add(new Servicio("Lugar",Float.parseFloat(this.txtBanqueteraEvento.getText())));
        }
        if (this.cbMusicaEvento.isSelected()){
            array.add(new Servicio("Banquetera",Float.parseFloat(this.txtBanqueteraEvento.getText())));
        }
        Servicio arreglo[]=new Servicio[array.size()];
        array.toArray(arreglo);
        String nombre = this.txtNombreProveedor.getText();
        String direccion = this.txtDireccionProveedor.getText();
        String telefono = this.txtTelefonoProveedor.getText();
        String correo = this.txtCorreoProveedor.getText();
        
         Proveedor tempProveedor = new Proveedor(0,nombre, direccion, telefono, correo, arreglo);
        ControladorProveedores ctrlProveedor = new ControladorProveedores();
        ControladorServicios ctrlServicio=new ControladorServicios();
        
        try {
            
            for(Servicio serv : array){
                ctrlServicio.agregarServicio(serv);
            }
            
            
             
            if (!seModificaraProveedor) {
                boolean seAgregoProveedor = ctrlProveedor.agregar(tempProveedor);
                 if (seAgregoProveedor) mensaje("Proveedor Agregado");
                 else mensaje("Proveedor No Agregado");
                
            }else{
                boolean seModificoProveedor = ctrlProveedor.modificar(tempProveedor);
                 if (seModificoProveedor) mensaje("Proveedor Modificado");
                 else  mensaje("Proveedor No Modificado");
                 //lo devolvemos a su estado de inicio.
                seModificaraProveedor = false;
            }
        } catch (SQLException ex) {
            mensaje("Hubo un error con la "
                    + "base de datos. " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnRegresarVtnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVtnProveedoresActionPerformed
         VtnProveedores vtnRegreso = VtnProveedores.getInstanciaDeVtnProveedores();
        vtnRegreso.setVisible(true);
        cerrarEstaVentana();

    }//GEN-LAST:event_btnRegresarVtnProveedoresActionPerformed

    private void cbLucesEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLucesEventoActionPerformed
        if (this.cbLucesEvento.isSelected()){
            this.txtLucesEvento.setEditable(true);
        }else{
            this.txtLucesEvento.setText("");
            this.txtLucesEvento.setEditable(false);
        }
    }//GEN-LAST:event_cbLucesEventoActionPerformed

    private void cbLugarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLugarEventoActionPerformed
        if (this.cbLugarEvento.isSelected()){
            this.txtLugarEvento.setEditable(true);
        }else{
            this.txtLugarEvento.setText("");
            this.txtLugarEvento.setEditable(false);
        }
    }//GEN-LAST:event_cbLugarEventoActionPerformed

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Cuidado", 0);
    }

    private void borraDatosDeCampos() {
        this.txtCorreoProveedor.setText("");
        this.txtDireccionProveedor.setText("");
        this.txtNombreProveedor.setText("");
        this.txtTelefonoProveedor.setText("");
        this.txtBanqueteraEvento.setText("");
        this.txtCarpaEvento.setText("");
        this.txtLucesEvento.setText("");
        this.txtLugarEvento.setText("");
        this.txtMusicaEvento.setText("");
        this.cbBanqueteraEvento.setSelected(false);
        this.cbCarpaEvento.setSelected(false);
        this.cbLucesEvento.setSelected(false);
        this.cbLugarEvento.setSelected(false);
        this.cbMusicaEvento.setSelected(false);
    }

    private void cerrarEstaVentana() {
        borraDatosDeCampos();
        this.dispose();
    }
    
    public javax.swing.JTextField getTxtCorreoProveedor() {
        return txtCorreoProveedor;
    }

    /**
     * @return the txtDireccionCliente
     */
    public javax.swing.JTextField getTxtDireccionProveedor() {
        return txtDireccionProveedor;
    }

    /**
     * @return the txtNombreCliente
     */
    public javax.swing.JTextField getTxtNombreProveedor() {
        return txtNombreProveedor;
    }

    /**
     * @return the txtTelefonoCliente
     */
    public javax.swing.JTextField getTxtTelefonoCliente() {
        return txtTelefonoProveedor;
    }
    public javax.swing.JTextField getTxtBanqueterEvento() {
        return txtBanqueteraEvento;
    }
    public javax.swing.JTextField getTxtCarpaEvento() {
        return txtCarpaEvento;
    }
    public javax.swing.JTextField getTxtLucesEvento() {
        return txtLucesEvento;
    }
    public javax.swing.JTextField getTxtLugarEvento() {
        return txtLugarEvento;
    }
    public javax.swing.JTextField getTxtMusicaEvento() {
        return txtMusicaEvento;
    }

    /**
     * @return the seModificaraCliente
     */
    public boolean isSeModificaraProveedor() {
        return seModificaraProveedor;
    }

    /**
     * @param seModificaraCliente the seModificaraCliente to set
     */
    public void setSeModificaraCliente(boolean seModificaraProveedor) {
        this.seModificaraProveedor = seModificaraProveedor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnAgrega_oModificaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnAgrega_oModificaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnAgrega_oModificaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnAgrega_oModificaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnAgrega_oModificaProveedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Dirección;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnRegresarVtnProveedores;
    private javax.swing.JCheckBox cbBanqueteraEvento;
    private javax.swing.JCheckBox cbCarpaEvento;
    private javax.swing.JCheckBox cbLucesEvento;
    private javax.swing.JCheckBox cbLugarEvento;
    private javax.swing.JCheckBox cbMusicaEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBanqueteraEvento;
    private javax.swing.JTextField txtCarpaEvento;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtLucesEvento;
    private javax.swing.JTextField txtLugarEvento;
    private javax.swing.JTextField txtMusicaEvento;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
