// Copyright (c) Andrea Salazar Abigail Cárdenas, Alec Demian Santana Celaya, 
// Carlos Ariel Angulo Campos, Josue Emamnuel Flores Carballo, 
// Jesus Alejandro Izaguirre Gil. Licensed under the MIT Licence.
// See the LICENSE file in the repository root for full license text.
package com.itson.presentacion.medios;

import com.itson.dominio.Etapa;
import com.itson.dominio.Medio;
import com.itson.presentacion.nuevoRegimen.FrmCrearNuevoRegimen;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmAñadirMedio extends javax.swing.JFrame {

    private List<Medio> medios;
    private List<Etapa> etapas;
    private int medioSeleccionado;

    public FrmAñadirMedio(List<Etapa> etapas, List<Medio> medios) {
        initComponents();
        this.etapas = etapas;
        inicializarMedios(medios);
        medioSeleccionado=-1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedios = new javax.swing.JTable();
        txtMedio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMinGeneral = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMedicion = new javax.swing.JTextField();
        txtMaxGeneral = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtInstGeneral = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtInstEspecial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMinEspecial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaxEspecial = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMinCompetitiva = new javax.swing.JTextField();
        txtMaxCompetitiva = new javax.swing.JTextField();
        txtInstCompetitiva = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnAceptar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 109, 182));
        jLabel5.setText("Medios físicos");

        tblMedios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medio", "Etapa general", "Etapa especial", "Etapa competitiva"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMediosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedios);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 109, 182));
        jLabel2.setText("Medio");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 109, 182));
        jLabel3.setText("Medicion");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 109, 182));
        jLabel4.setText("Etapa general");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(5, 109, 182));
        jLabel6.setText("Min");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(5, 109, 182));
        jLabel7.setText("Max");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(5, 109, 182));
        jLabel8.setText("Inst.");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(5, 109, 182));
        jLabel9.setText("Max");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(5, 109, 182));
        jLabel10.setText("Inst.");

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(5, 109, 182));
        jLabel11.setText("Etapa especial");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(5, 109, 182));
        jLabel12.setText("Min");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(5, 109, 182));
        jLabel13.setText("Max");

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(5, 109, 182));
        jLabel14.setText("Inst.");

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(5, 109, 182));
        jLabel15.setText("Etapa competitiva");

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(5, 109, 182));
        jLabel16.setText("Min");

        btnEliminar.setBackground(new java.awt.Color(5, 109, 182));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(5, 109, 182));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAñadir.setBackground(new java.awt.Color(5, 109, 182));
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(127, 127, 127))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtMinGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addGap(7, 7, 7)
                                                .addComponent(txtMaxGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)
                                                .addGap(7, 7, 7)
                                                .addComponent(txtInstGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtMinCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel13)
                                                .addGap(7, 7, 7)
                                                .addComponent(txtMaxCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel14)
                                                .addGap(7, 7, 7)
                                                .addComponent(txtInstCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtMinEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addGap(7, 7, 7)
                                                .addComponent(txtMaxEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addGap(7, 7, 7)
                                                .addComponent(txtInstEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4))
                                        .addGap(16, 16, 16))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMinGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaxGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtInstGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtMinEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaxEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtInstEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtMinCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaxCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtInstCompetitiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminarMedio();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        FrmCrearNuevoRegimen.setMediosRegimen(medios);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tblMediosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMediosMouseClicked
        if (evt.getClickCount() == 2 && tblMedios.getSelectedRow() != -1) {
            medioSeleccionado = tblMedios.getSelectedRow();
            recuperarInfoMedio();
            btnAñadir.setText("Actualizar");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tblMediosMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        if (validarCampos()) {
            añadirMedio();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirActionPerformed

    public void inicializarMedios(List<Medio> medios){
        if(medios!=null){
            this.medios=medios;
            for (Medio medio : medios) {
                añadirMedioTabla(medio);
            }
        }
        else{
            this.medios = new ArrayList<>();
        }
    }
    
    /**
     * Añada medio a la lista de medios
     */
    public void añadirMedio() {
        String nombre = txtMedio.getText();
        String medicion = txtMedicion.getText();
        int minGeneral = Integer.parseInt(txtMinGeneral.getText());
        int maxGeneral = Integer.parseInt(txtMaxGeneral.getText());
        int instGeneral = Integer.parseInt(txtInstGeneral.getText());

        int minEspecial = Integer.parseInt(txtMinEspecial.getText());
        int maxEspecial = Integer.parseInt(txtMaxEspecial.getText());
        int instEspecial = Integer.parseInt(txtInstEspecial.getText());

        int minCompetitiva = Integer.parseInt(txtMinCompetitiva.getText());
        int maxCompetitiva = Integer.parseInt(txtMaxCompetitiva.getText());
        int instCompetitiva = Integer.parseInt(txtInstCompetitiva.getText());

        Medio medioNuevo = new Medio(nombre, medicion, 0);

        List<Etapa> etapasNuevas = new ArrayList<>();
        Etapa etapaGeneral = new Etapa("General");
        int semanasGeneral = etapas.get(0).getTotalSemanas();

        double volGeneral = ((minGeneral + maxGeneral) / 2) * instGeneral * semanasGeneral;
        etapaGeneral.setVolMin(minGeneral);
        etapaGeneral.setVolMax(maxGeneral);
        etapaGeneral.setInstanciasMedio(instGeneral);
        etapaGeneral.setVolumen(volGeneral);
        etapaGeneral.setMesociclos(etapas.get(0).getMesociclos());
        etapasNuevas.add(etapaGeneral);

        Etapa etapaEspecial = new Etapa("Epecial");
        int semanasEspecial = etapas.get(1).getTotalSemanas();
        double volEspecial = ((minEspecial + maxEspecial) / 2) * instEspecial * semanasEspecial;
        etapaEspecial.setVolMin(minEspecial);
        etapaEspecial.setVolMax(maxEspecial);
        etapaEspecial.setInstanciasMedio(instEspecial);
        etapaEspecial.setVolumen(volEspecial);
        etapaEspecial.setMesociclos(etapas.get(1).getMesociclos());
        etapasNuevas.add(etapaEspecial);

        Etapa etapaCompetitiva = new Etapa("Competitiva");
        int semanasCompetitiva = etapas.get(2).getTotalSemanas();
        double volCompetitiva = ((minCompetitiva + maxCompetitiva) / 2) * instCompetitiva * semanasCompetitiva;
        etapaCompetitiva.setVolMin(minCompetitiva);
        etapaCompetitiva.setVolMax(maxCompetitiva);
        etapaCompetitiva.setInstanciasMedio(instCompetitiva);
        etapaCompetitiva.setVolumen(volCompetitiva);
        etapaCompetitiva.setMesociclos(etapas.get(2).getMesociclos());
        etapasNuevas.add(etapaCompetitiva);

        medioNuevo.setEtapas(etapasNuevas);

        if (medioSeleccionado < 0) {
            medios.add(medioNuevo);
            añadirMedioTabla(medioNuevo);
        } else {
            medios.remove(medioSeleccionado);
            medios.add(medioSeleccionado, medioNuevo);
            modificarMedioTabla(medioSeleccionado, medioNuevo);
            medioSeleccionado = -1;
            btnAñadir.setText("Añadir");

        }
        vaciarCampos();

    }
    
    public void eliminarMedio(){
        int indexMedio= tblMedios.getSelectedRow();
        if(indexMedio>=0){
            medios.remove(indexMedio);
            DefaultTableModel model = (DefaultTableModel) tblMedios.getModel();
            model.removeRow(indexMedio);
        }
        
    }
    

    public void añadirMedioTabla(Medio medio) {

        Object[] rowData = {medio.getMedio(),
            medio.getEtapas().get(0).getVolumen(),
            medio.getEtapas().get(1).getVolumen(),
            medio.getEtapas().get(2).getVolumen()};
        // Agregar la fila al modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblMedios.getModel();
        model.addRow(rowData);

    }

    public void modificarMedioTabla(int medioIndex, Medio medio) {
        tblMedios.setValueAt(medio.getMedio(), medioIndex, 0);
        tblMedios.setValueAt(medio.getEtapas().get(0).getVolumen(), medioIndex, 1);
        tblMedios.setValueAt(medio.getEtapas().get(1).getVolumen(), medioIndex, 2);
        tblMedios.setValueAt(medio.getEtapas().get(2).getVolumen(), medioIndex, 3);
    }

    public void vaciarCampos() {
        txtInstCompetitiva.setText("");
        txtInstEspecial.setText("");
        txtInstGeneral.setText("");
        txtMaxCompetitiva.setText("");
        txtMaxEspecial.setText("");
        txtMaxGeneral.setText("");
        txtMedicion.setText("");
        txtMedio.setText("");
        txtMinCompetitiva.setText("");
        txtMinEspecial.setText("");
        txtMinGeneral.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblMedios;
    private javax.swing.JTextField txtInstCompetitiva;
    private javax.swing.JTextField txtInstEspecial;
    private javax.swing.JTextField txtInstGeneral;
    private javax.swing.JTextField txtMaxCompetitiva;
    private javax.swing.JTextField txtMaxEspecial;
    private javax.swing.JTextField txtMaxGeneral;
    private javax.swing.JTextField txtMedicion;
    private javax.swing.JTextField txtMedio;
    private javax.swing.JTextField txtMinCompetitiva;
    private javax.swing.JTextField txtMinEspecial;
    private javax.swing.JTextField txtMinGeneral;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
        List<JTextField> camposNumericos = new ArrayList<>();
        camposNumericos.addAll(Arrays.asList(txtInstCompetitiva, txtInstEspecial,
                txtInstGeneral, txtMaxCompetitiva, txtMaxEspecial, txtMaxEspecial,
                txtMaxGeneral, txtMinCompetitiva, txtMinEspecial, txtMinGeneral));

        if (txtMedicion.getText().isBlank() || txtMedio.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,
                    "Debe llenar todos los campos",
                    "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        for (JTextField campo : camposNumericos) {
            String text = campo.getText();
            if (text.isBlank()) {
                JOptionPane.showMessageDialog(this,
                        "Debe llenar todos los campos",
                        "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            try {
                int cantidad = Integer.parseInt(text);
                if (cantidad < 0) {
                    JOptionPane.showMessageDialog(this,
                            "Las cantidades deben ser mayores a 0",
                            "Datos invalidos", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                        "No se permiten decimales",
                        "Datos invalidos", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        int minGeneral = Integer.parseInt(txtMinGeneral.getText());
        int maxGeneral = Integer.parseInt(txtMaxGeneral.getText());

        int minEspecial = Integer.parseInt(txtMinEspecial.getText());
        int maxEspecial = Integer.parseInt(txtMaxEspecial.getText());

        int minCompetitiva = Integer.parseInt(txtMinCompetitiva.getText());
        int maxCompetitiva = Integer.parseInt(txtMaxCompetitiva.getText());
        
        if(minGeneral>maxGeneral||minEspecial>maxEspecial||minCompetitiva>maxCompetitiva){
            JOptionPane.showMessageDialog(this,
                        "Las cantidades minimas no pueden ser mayor a las máximas",
                        "Datos invalidos", JOptionPane.ERROR_MESSAGE);
                return false;
        }
        return true;
    }

    private void recuperarInfoMedio() {
        
        Medio medio = medios.get(medioSeleccionado);
        
        txtInstCompetitiva.setText(String.valueOf(medio.getEtapas().get(2).getInstanciasMedio()));
        txtInstEspecial.setText(String.valueOf(medio.getEtapas().get(1).getInstanciasMedio()));
        txtInstGeneral.setText(String.valueOf(medio.getEtapas().get(0).getInstanciasMedio()));
        txtMaxCompetitiva.setText(String.valueOf(medio.getEtapas().get(2).getVolMax()));
        txtMaxEspecial.setText(String.valueOf(medio.getEtapas().get(1).getVolMax()));
        txtMaxGeneral.setText(String.valueOf(medio.getEtapas().get(0).getVolMax()));
        txtMedicion.setText(medio.getMedicion());
        txtMedio.setText(medio.getMedio());
        txtMinCompetitiva.setText(String.valueOf(medio.getEtapas().get(2).getVolMin()));
        txtMinEspecial.setText(String.valueOf(medio.getEtapas().get(1).getVolMin()));
        txtMinGeneral.setText(String.valueOf(medio.getEtapas().get(0).getVolMin()));
    }
}
