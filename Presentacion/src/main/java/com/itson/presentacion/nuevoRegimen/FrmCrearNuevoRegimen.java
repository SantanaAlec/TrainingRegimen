// Copyright (c) Andrea Salazar Abigail Cárdenas, Alec Demian Santana Celaya, 
// Carlos Ariel Angulo Campos, Josue Emamnuel Flores Carballo, 
// Jesus Alejandro Izaguirre Gil. Licensed under the MIT Licence.
// See the LICENSE file in the repository root for full license text.
package com.itson.presentacion.nuevoRegimen;

import com.itson.dominio.Estado;
import com.itson.dominio.Etapa;
import com.itson.dominio.Medio;
import com.itson.dominio.Regimen;
import com.itson.dominio.RegimenEstado;
import com.itson.dominio.Usuario;
import com.itson.presentacion.medios.FrmAñadirMedio;
import implementaciones.Persistencia;
import implementaciones.RegimenDAO;
import interfaces.IPersistencia;
import interfaces.IRegimenDAO;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmCrearNuevoRegimen extends javax.swing.JFrame {

    private static Regimen regimen;
    private Long semanasEtapas;
    private Usuario usuarioLogged;
    private IPersistencia persistencia;

    /**
     * Creates new form FrmCrearNuevoRegimen
     */
    public FrmCrearNuevoRegimen(Usuario usuarioLogged) {
        try {
            initComponents();
            this.usuarioLogged = usuarioLogged;
            persistencia = new Persistencia();
            regimen = new Regimen();
            regimen.setEntrenador(usuarioLogged);
            txtEntrenador.setText(usuarioLogged.getNombre());
            llenarJefesRama();
            llenarDatosActualizar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error en la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void recibirDatos(Long semanas) {
        this.semanasEtapas = semanas;
        System.out.println("Datos recibidos en CrearNuevoRegimen: " + semanas);
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
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEntrenador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbDeporte = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbRama = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresarFechas = new javax.swing.JButton();
        btnEditarEtapas = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        cmbMetodologo = new javax.swing.JComboBox<>();
        cmbJefeRama = new javax.swing.JComboBox<>();
        btnAñadirMedios = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(5, 109, 182));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nuevo regimen");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 109, 182));
        jLabel2.setText("Entrenador:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 109, 182));
        jLabel3.setText("Deporte:");

        cmbDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beisbol", "Softbol", "Tenis", "Tenis de Mesa", "Voleibol Playa", "Ajedrez", "Atletismo Lanzamiento", "Atletismo Pista", "Atletismo Saltos", "Baloncesto", "Balonmano", "Boxeo Universitario", "Escalada Deportiva", "Esgrima", "Natación", "Gimnasia aerobica", "Halterofilia", "Judo", "Karate do", "Lucha Universitaria", "Rugby Seven", "Futbol Americano", "Tae Kwon Do", "Futbol Bardas", "Tochito", "Triatlon", "Voleibol Sala" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 109, 182));
        jLabel4.setText("Rama: ");

        cmbRama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Varonil", "Femenil", "Mixto" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 109, 182));
        jLabel5.setText("Jefe rama:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(5, 109, 182));
        jLabel6.setText("Metodologo:");

        btnIngresarFechas.setBackground(new java.awt.Color(5, 109, 182));
        btnIngresarFechas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarFechas.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarFechas.setText("Ingresar fechas");
        btnIngresarFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFechasActionPerformed(evt);
            }
        });

        btnEditarEtapas.setBackground(new java.awt.Color(5, 109, 182));
        btnEditarEtapas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarEtapas.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEtapas.setText("Definir etapas");
        btnEditarEtapas.setEnabled(false);
        btnEditarEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEtapasActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(5, 109, 182));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        cmbMetodologo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benjamin Murrieta", "Jesus Borquez" }));

        btnAñadirMedios.setBackground(new java.awt.Color(5, 109, 182));
        btnAñadirMedios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadirMedios.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirMedios.setText("Añadir medios físicos");
        btnAñadirMedios.setEnabled(false);
        btnAñadirMedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirMediosActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(5, 109, 182));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEntrenador)
                            .addComponent(cmbRama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMetodologo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnAñadirMedios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarEtapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbJefeRama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(cmbDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIngresarFechas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbRama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbJefeRama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnIngresarFechas)
                    .addComponent(cmbMetodologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEtapas)
                    .addComponent(btnAñadirMedios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFechasActionPerformed
        FrmIngresarFechas frmIngresarFechas = new FrmIngresarFechas(this);
        frmIngresarFechas.setVisible(true);
        frmIngresarFechas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmIngresarFechas.setResizable(false);
        btnEditarEtapas.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarFechasActionPerformed

    private void btnEditarEtapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEtapasActionPerformed
        System.out.println("Esto le estoy mandado a definir etapas: " + semanasEtapas);
        DefinirEtapas definirEtapas = new DefinirEtapas(semanasEtapas);
        definirEtapas.setVisible(true);
        definirEtapas.setResizable(false);
        definirEtapas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btnAñadirMedios.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEtapasActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        if (regimen.getFechaFinal() == null || regimen.getFechaInicio() == null) {
            JOptionPane.showMessageDialog(this,
                    "No has elegido las fechas del nuevo régimen",
                    "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (regimen.getEtapas() == null) {
            JOptionPane.showMessageDialog(this,
                    "No has elegido las etapas del nuevo régimen",
                    "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario jefeSelected = new Usuario();
        jefeSelected.setNombre(cmbJefeRama.getSelectedItem().toString());
        Usuario metodologoSelected = new Usuario();
        metodologoSelected.setNombre(cmbMetodologo.getSelectedItem().toString());

        regimen.setDeporte(cmbDeporte.getSelectedItem().toString());
        regimen.setRama(cmbRama.getSelectedItem().toString());
        regimen.setJefeRama(jefeSelected);
        regimen.setMetodologo(metodologoSelected);

        RegimenEstado regimenEstado = new RegimenEstado(regimen.getDeporte(), usuarioLogged, Estado.NO_APROBADO);
        try {
            persistencia.guardarRegimen(regimen);
            persistencia.agregarRegimenEstado(regimenEstado);
            // TODO: guardar régimen
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error al crear el régimen", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.dispose();
        }


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAñadirMediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirMediosActionPerformed
        if (regimen.getEtapas() == null) {
            JOptionPane.showMessageDialog(this,
                    "Debe definir las etapas de entrenamiento",
                    "Datos incompletos", JOptionPane.INFORMATION_MESSAGE);
        }
        FrmAñadirMedio añadirMedio = new FrmAñadirMedio(regimen.getEtapas(), regimen.getMedios());
        añadirMedio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        añadirMedio.setResizable(false);
        añadirMedio.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirMediosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Usuario jefeSelected = new Usuario();
        jefeSelected.setNombre(cmbJefeRama.getSelectedItem().toString());
        Usuario metodologoSelected = new Usuario();
        metodologoSelected.setNombre(cmbMetodologo.getSelectedItem().toString());

        regimen.setDeporte(cmbDeporte.getSelectedItem().toString());
        regimen.setRama(cmbRama.getSelectedItem().toString());
        regimen.setJefeRama(jefeSelected);
        regimen.setMetodologo(metodologoSelected);

        //RegimenEstado regimenEstado = new RegimenEstado(regimen.getDeporte(), usuarioLogged, Estado.NO_APROBADO);
        try {
            persistencia.actualizarRegimen(regimen);
            //   persistencia.agregarRegimenEstado(regimenEstado);
            // TODO: guardar régimen
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error al actualizar el régimen", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.dispose();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    public static void setFechasRegimen(LocalDate fechaInicio, LocalDate fechaFinal) {
        regimen.setFechaInicio(fechaInicio);
        regimen.setFechaFinal(fechaFinal);
    }

    public static void setEtapasRegimen(List<Etapa> etapas) {
        regimen.setEtapas(etapas);

    }

    public static void setMediosRegimen(List<Medio> medios) {
        regimen.setMedios(medios);
    }

    /**
     * Consulta todos los jefes guardados en la base de datos
     *
     * @throws Exception
     */
    public void llenarJefesRama() throws Exception {
        List<Usuario> personal = persistencia.consultarEntrenadores();

        for (int i = 0; i < personal.size(); i++) {
            cmbJefeRama.addItem(personal.get(i).getNombre());
        }

    }

    public void llenarDatosActualizar() {
        if (btnActualizar.isVisible()) {
            try {
                Regimen regimen = persistencia.consultarRegimen();
                cmbDeporte.setSelectedItem(regimen.getDeporte());
                cmbJefeRama.setSelectedItem(regimen.getJefeRama().getNombre());
                cmbMetodologo.setSelectedItem(regimen.getMetodologo().getNombre());
                cmbRama.setSelectedItem(regimen.getRama());
            } catch (Exception ex) {
                Logger.getLogger(FrmCrearNuevoRegimen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAñadirMedios;
    public javax.swing.JButton btnCrear;
    public javax.swing.JButton btnEditarEtapas;
    public javax.swing.JButton btnIngresarFechas;
    private javax.swing.JComboBox<String> cmbDeporte;
    private javax.swing.JComboBox<String> cmbJefeRama;
    private javax.swing.JComboBox<String> cmbMetodologo;
    private javax.swing.JComboBox<String> cmbRama;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtEntrenador;
    // End of variables declaration//GEN-END:variables
}
