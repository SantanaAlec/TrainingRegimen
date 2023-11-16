// Copyright (c) Andrea Salazar Abigail Cárdenas, Alec Demian Santana Celaya, 
// Carlos Ariel Angulo Campos, Josue Emamnuel Flores Carballo, 
// Jesus Alejandro Izaguirre Gil. Licensed under the MIT Licence.
// See the LICENSE file in the repository root for full license text.
package com.itson.presentacion.nuevoRegimen;

import com.itson.dominio.Etapa;
import com.itson.dominio.Mesociclo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

public class DefinirMesociclo extends javax.swing.JFrame {

    private int general;
    private int especial;
    private int competitiva;
    private int semanasTotales;
    private List<Etapa> etapas;
    private String noMesociclos;
    private int contador=1;
    private int semanas;
    private String etapa;
    private List<Mesociclo> mesociclos = new ArrayList<>();
    private int contGeneral;
    private int contEspecial;
    private int contCompetitiva;
    
    public DefinirMesociclo() {
        initComponents();
    }

    public DefinirMesociclo(List<Etapa> etapas) {
        initComponents();
        JComponent editor = spnNoSemanas.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            JFormattedTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();
            textField.setEditable(false);
        }
        this.etapas = etapas;
        int general = etapas.get(0).getTotalSemanas();
        int especial = etapas.get(1).getTotalSemanas();
        int competitiva= etapas.get(2).getTotalSemanas();
        txtSemanaGeneral.setText(String.valueOf(general));
        txtSemanasEspecial.setText(String.valueOf(especial));
        txtSemanasCompetitiva.setText(String.valueOf(competitiva));
        txtGeneralContador.setText("0");
        txtEspecialContador.setText("0");
        txtCompetitivaContador.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbtMesociclos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtSemanaGeneral = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNoMesociclo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnNoSemanas = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cbxEtapa = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRestaurar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSemanasEspecial = new javax.swing.JTextField();
        txtSemanasCompetitiva = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtGeneralContador = new javax.swing.JTextField();
        txtEspecialContador = new javax.swing.JTextField();
        txtCompetitivaContador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Definición Mesociclos");

        tbtMesociclos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Mesociclos", "Semanas", "Etapa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbtMesociclos.setGridColor(new java.awt.Color(255, 255, 255));
        tbtMesociclos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbtMesociclos);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtSemanaGeneral.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 109, 182));
        jLabel2.setText("Datos esperados:");

        txtNoMesociclo.setEditable(false);
        txtNoMesociclo.setText("1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 109, 182));
        jLabel3.setText("No.Semanas:");

        spnNoSemanas.setModel(new javax.swing.SpinnerNumberModel(2, 2, 6, 1));
        spnNoSemanas.setEditor(new javax.swing.JSpinner.NumberEditor(spnNoSemanas, ""));
        spnNoSemanas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnNoSemanasKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 109, 182));
        jLabel4.setText("Etapa:");

        cbxEtapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Especial", "Competitiva" }));

        btnAñadir.setBackground(new java.awt.Color(5, 109, 182));
        btnAñadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(5, 109, 182));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 109, 182));
        jLabel5.setText("Definición de Mesociclos");

        btnRestaurar.setBackground(new java.awt.Color(5, 109, 182));
        btnRestaurar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRestaurar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(5, 109, 182));
        jLabel6.setText("Mesociclo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(5, 109, 182));
        jLabel7.setText("Semanas General:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(5, 109, 182));
        jLabel8.setText("Semanas Especial:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(5, 109, 182));
        jLabel9.setText("Semanas Competitiva:");

        txtSemanasEspecial.setEditable(false);

        txtSemanasCompetitiva.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(5, 109, 182));
        jLabel10.setText("Datos recibidos:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(5, 109, 182));
        jLabel11.setText("Semanas General:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(5, 109, 182));
        jLabel12.setText("Semanas Especial:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(5, 109, 182));
        jLabel13.setText("Semanas Competitiva:");

        txtGeneralContador.setEditable(false);

        txtEspecialContador.setEditable(false);

        txtCompetitivaContador.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAñadir)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbxEtapa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spnNoSemanas)
                                        .addComponent(txtNoMesociclo)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(btnCrear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRestaurar)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel5)))
                        .addContainerGap(239, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSemanasCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSemanasEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSemanaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompetitivaContador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneralContador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspecialContador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoMesociclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnNoSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSemanaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(txtGeneralContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSemanasEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(txtEspecialContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSemanasCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(txtCompetitivaContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnRestaurar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        noMesociclos = txtNoMesociclo.getText();
        semanas = (int) spnNoSemanas.getValue();
        etapa = (String) cbxEtapa.getSelectedItem();
        // Crear un array de objetos con los datos a agregar
        Object[] rowData = {noMesociclos, semanas, etapa};

        // Agregar la fila al modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tbtMesociclos.getModel();
        model.addRow(rowData);
        spnNoSemanas.setValue(2);
        txtNoMesociclo.setText(String.valueOf(Integer.parseInt(txtNoMesociclo.getText()) + 1));
        
        DefaultTableModel modelo = (DefaultTableModel) tbtMesociclos.getModel();
        int filas = modelo.getRowCount();
        System.out.println(filas);
        int noMesociclo = Integer.parseInt(modelo.getValueAt(filas - 1, 0).toString());
        int noSemanas = Integer.parseInt(modelo.getValueAt(filas - 1, 1).toString());
        String nombreEtapa = (String) modelo.getValueAt(filas - 1, 2);
        Etapa objEtapa =new Etapa(nombreEtapa,noSemanas);
        Mesociclo mesociclo1 = new Mesociclo((noMesociclo),noSemanas);
        mesociclos.add(mesociclo1);
        switch (nombreEtapa) {
            case "General":
                contGeneral=contGeneral+noSemanas;
                txtGeneralContador.setText(String.valueOf(contGeneral));
                general = general + noSemanas;
                etapas.get(0).addMesociclo(mesociclo1);
                break;
            case "Especial":
                contEspecial=contEspecial+noSemanas;
                txtEspecialContador.setText(String.valueOf(contEspecial));
                especial = especial + noSemanas;
                etapas.get(1).addMesociclo(mesociclo1);
                break;
            case "Competitiva":
                contCompetitiva=contCompetitiva+noSemanas;
                txtCompetitivaContador.setText(String.valueOf(contCompetitiva));
                competitiva = competitiva + noSemanas;
                etapas.get(2).addMesociclo(mesociclo1);
                break;
        }
        contador++;
        semanasTotales = semanasTotales + noSemanas;
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void spnNoSemanasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnNoSemanasKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_spnNoSemanasKeyTyped

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        int semanasGeneral = etapas.get(0).getTotalSemanas();
        int semanasEspecial = etapas.get(1).getTotalSemanas();
        int semanasCompetitiva = etapas.get(2).getTotalSemanas();
        int validarSemanas = semanasGeneral + semanasEspecial + semanasCompetitiva;
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de definir los mesociclos?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (semanasTotales != validarSemanas) {
            JOptionPane.showMessageDialog(null, "El número de semanas totales no coinciden con las establecidas en la definicion de etapas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (general != semanasGeneral) {
            JOptionPane.showMessageDialog(null, "El número de semanas para la etapa general no coinciden con las establecidas en la definicion de etapas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (especial != semanasEspecial) {
            JOptionPane.showMessageDialog(null, "El número de semanas para la etapa especial no coinciden con las establecidas en la definicion de etapas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (competitiva != semanasCompetitiva) {
            JOptionPane.showMessageDialog(null, "El número de semanas para la etapa competitiva no coinciden con las establecidas en la definicion de etapas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (confirmacion == JOptionPane.NO_OPTION) {
            return;
        }
        for (Mesociclo mesociclo : mesociclos) {
            System.out.println("No. Mesociclo: " + mesociclo.getNoMesociclo());
            System.out.println("Semanas: " + mesociclo.getNoSemanas());
            System.out.println();
        }
        JOptionPane.showMessageDialog(null, "Se han creado los mesociclos con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        super.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        // TODO add your handling code here:
        txtGeneralContador.setText("0");
        txtEspecialContador.setText("0");
        txtCompetitivaContador.setText("0");
        contGeneral=0;
        contEspecial=0;
        contCompetitiva=0;
        noMesociclos = "";
        contador = 1;
        semanasTotales=0;
        semanas = 0;
        etapa = "";
        general=0;
        especial=0;
        competitiva=0;
        txtNoMesociclo.setText("1");
        DefaultTableModel model = (DefaultTableModel) tbtMesociclos.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnRestaurarActionPerformed

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
            java.util.logging.Logger.getLogger(DefinirMesociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirMesociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirMesociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirMesociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirMesociclo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JComboBox<String> cbxEtapa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnNoSemanas;
    private javax.swing.JTable tbtMesociclos;
    private javax.swing.JTextField txtCompetitivaContador;
    private javax.swing.JTextField txtEspecialContador;
    private javax.swing.JTextField txtGeneralContador;
    private javax.swing.JTextField txtNoMesociclo;
    private javax.swing.JTextField txtSemanaGeneral;
    private javax.swing.JTextField txtSemanasCompetitiva;
    private javax.swing.JTextField txtSemanasEspecial;
    // End of variables declaration//GEN-END:variables
}
