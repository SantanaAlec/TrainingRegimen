// Copyright (c) Andrea Salazar Abigail Cárdenas, Alec Demian Santana Celaya, 
// Carlos Ariel Angulo Campos, Josue Emamnuel Flores Carballo, 
// Jesus Alejandro Izaguirre Gil. Licensed under the MIT Licence.
// See the LICENSE file in the repository root for full license text.
package com.itson.presentacion.principal;

import com.itson.dominio.TipoUsuario;
import com.itson.dominio.Usuario;
import com.itson.presentacion.nuevoRegimen.FrmCrearNuevoRegimen;
import com.itson.presentacion.nuevoRegimen.VistaPorMesociclo;
import implementaciones.Persistencia;
import interfaces.IPersistencia;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class FrmPrincipal extends javax.swing.JFrame {

    private IPersistencia persistencia;

    /**
     * Creates new form FrmNuevoRegimen
     */
    public FrmPrincipal() {
        initComponents();
        persistencia = new Persistencia();
        VistaPorMesociclo vistaMesociclo = new VistaPorMesociclo(persistencia);
        tblPanel.setComponentAt(1, vistaMesociclo);
        vistaMesociclo.llenarTabla();
        //resizePanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        mainPanel = new javax.swing.JPanel();
        btnCrearNuevoRegimen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tblPanel = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelMesosiclos = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        lblEstadoRegimen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnCrearNuevoRegimen.setBackground(new java.awt.Color(5, 109, 182));
        btnCrearNuevoRegimen.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearNuevoRegimen.setText("Crear nuevo regimen");
        btnCrearNuevoRegimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoRegimenActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(5, 109, 182));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar regimen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(5, 109, 182));
        jLabel2.setText("Estado regimen seleccionado:");

        tblPanel.addTab("Macrociclo", jScrollPane1);
        tblPanel.addTab("Mesociclos", panelMesosiclos);
        tblPanel.addTab("Microciclos", jScrollPane3);

        lblEstadoRegimen.setText("No aprovado");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstadoRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(btnCrearNuevoRegimen)
                            .addGap(1150, 1150, 1150)
                            .addComponent(jButton2))
                        .addComponent(tblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(471, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEstadoRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearNuevoRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(tblPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                .addContainerGap(716, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Usuario usuario= new Usuario(1,"Carlos", "4321", TipoUsuario.ENTRENADOR);
        FrmCrearNuevoRegimen frm = new FrmCrearNuevoRegimen (usuario);
        frm.btnIngresarFechas.setVisible(false);
        frm.btnEditarEtapas.setVisible(false);
        frm.btnAñadirMedios.setVisible(false);
        frm.btnActualizar.setVisible(true);
        frm.btnCrear.setVisible(false);
        frm.lblTitulo.setText("Actualizar Regimén");
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.setResizable(false);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCrearNuevoRegimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevoRegimenActionPerformed

        Usuario usuario = new Usuario(1, "Carlos", "4321", TipoUsuario.ENTRENADOR);//usuario de prueba, TODO:lOGIN
        FrmCrearNuevoRegimen frmCrearNuevoRegimen = new FrmCrearNuevoRegimen(usuario);
        frmCrearNuevoRegimen.btnActualizar.setVisible(false);
        frmCrearNuevoRegimen.setResizable(false);
        frmCrearNuevoRegimen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCrearNuevoRegimen.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearNuevoRegimenActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    
//    public void resizePanel(){
//         // Agregar un ComponentListener al frame
//        addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                // Este método se llama cuando el frame cambia de tamaño
//                // Obtener las nuevas dimensiones del frame
//                int nuevoAncho = getWidth();
//                int nuevoAlto = getHeight();
//
//                // Establecer el nuevo tamaño del panel
//                mainPanel.setSize(nuevoAncho, nuevoAlto);
//                tblPanel.setSize(nuevoAncho-20, tblPanel.getHeight());
//                panelMesosiclos.setSize(nuevoAncho-20, tblPanel.getHeight());
//                // Repintar el panel
//                mainPanel.repaint();
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearNuevoRegimen;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblEstadoRegimen;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane panelMesosiclos;
    private javax.swing.JTabbedPane tblPanel;
    // End of variables declaration//GEN-END:variables
}
