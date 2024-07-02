/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;


import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author hecto
 */
public class UserExpediente extends javax.swing.JFrame {

    /**
     * Creates new form UserExpediente
     */
    private String correoElectronico;
    private String nombre;

    public UserExpediente(String correoElectronico, String nombre) {
        initComponents();
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        for (TipoExpediente tipo : TipoExpediente.values()) {
            comboBoxModel.addElement(TipoExpediente.fromEnumToString(tipo));
        }

        tipoExpediente.setModel(comboBoxModel);
        nuevoExpediente.setText("Hola " + this.nombre + ", realiza tu solicitud");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        nuevoExpediente = new javax.swing.JLabel();
        tipoExpediente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EnviarExpediente = new javax.swing.JButton();
        enviarRealizarNuevoExpediente = new javax.swing.JButton();
        noDocumentoSeleccionado = new javax.swing.JLabel();
        elegirArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nuevoExpediente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nuevoExpediente.setForeground(new java.awt.Color(102, 102, 102));
        nuevoExpediente.setText("Nuevo Expediente");

        tipoExpediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("¿Cual es su solicitud?");

        jLabel3.setText("Asunto");

        EnviarExpediente.setBackground(new java.awt.Color(51, 51, 51));
        EnviarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        EnviarExpediente.setText("Enviar expediente");
        EnviarExpediente.setBorder(null);
        EnviarExpediente.setDefaultCapable(false);
        EnviarExpediente.setFocusPainted(false);
        EnviarExpediente.setFocusable(false);
        EnviarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarExpedienteActionPerformed(evt);
            }
        });

        enviarRealizarNuevoExpediente.setBackground(new java.awt.Color(204, 204, 204));
        enviarRealizarNuevoExpediente.setText("Enviar y hacer otra solicitud");
        enviarRealizarNuevoExpediente.setBorder(null);
        enviarRealizarNuevoExpediente.setBorderPainted(false);
        enviarRealizarNuevoExpediente.setDefaultCapable(false);
        enviarRealizarNuevoExpediente.setFocusPainted(false);
        enviarRealizarNuevoExpediente.setFocusable(false);
        enviarRealizarNuevoExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarRealizarNuevoExpedienteActionPerformed(evt);
            }
        });

        noDocumentoSeleccionado.setText("No documento seleccionado");

        elegirArchivo.setText("Elegir archivo");
        elegirArchivo.setToolTipText("");
        elegirArchivo.setBorder(null);
        elegirArchivo.setDefaultCapable(false);
        elegirArchivo.setFocusPainted(false);
        elegirArchivo.setFocusable(false);
        elegirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirArchivoActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(tipoExpediente, 0, 492, Short.MAX_VALUE)
                            .addComponent(nuevoExpediente)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noDocumentoSeleccionado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(elegirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enviarRealizarNuevoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EnviarExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nuevoExpediente)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noDocumentoSeleccionado)
                    .addComponent(elegirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnviarExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarRealizarNuevoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarExpedienteActionPerformed
        realizarNuevoExpediente();
        dispose();
        UserMain userMain = new UserMain(this.correoElectronico);
        userMain.setVisible(true);
    }//GEN-LAST:event_EnviarExpedienteActionPerformed

    private void enviarRealizarNuevoExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarRealizarNuevoExpedienteActionPerformed
        realizarNuevoExpediente();
        limpiarFormulario();

    }//GEN-LAST:event_enviarRealizarNuevoExpedienteActionPerformed
    java.io.File selectedFile = null;
    private void elegirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirArchivoActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Documentos", "doc", "docx", "pdf");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            noDocumentoSeleccionado.setText(selectedFile.getName());
        }
    }//GEN-LAST:event_elegirArchivoActionPerformed

    private void realizarNuevoExpediente() {
        String tipoExpedienteValue = (String) tipoExpediente.getSelectedItem();
        String asuntoValue = jTextArea2.getText();
        int prioridadValue;
        switch (TipoExpediente.fromStringToEnum(tipoExpedienteValue)) {
            case CERTIFICADO:
                prioridadValue = 2;
                break;
            case CONSTANCIA:
                prioridadValue = 2;
                break;
            case CARNET_UNIVERSITARIO:
                prioridadValue = 3;
                break;
            case LICENCIA:
                prioridadValue = 3;
                break;
            case RECLAMO:
                prioridadValue = 1;
                break;
            case AUTORIZACION:
                prioridadValue = 1;
                break;
            case HISTORIAL_ACADEMICO:
                prioridadValue = 2;
                break;
            default:
                prioridadValue = 0;
                break;
        }

        User foundUser = Servicio.UsersServicios.obtenerUsuario(this.correoElectronico);
        TiempoExpediente tiempoExpediente = new TiempoExpediente();
        tiempoExpediente.setFechaInicial(LocalDateTime.now());
        Expediente expedienteNuevo = new Expediente(Utils.Utils.generarIdentificador(), prioridadValue, TipoExpediente.fromStringToEnum(tipoExpedienteValue), asuntoValue, foundUser, selectedFile, tiempoExpediente);
        Servicio.ExpedientesServicios.agregarExpediente(expedienteNuevo);
        foundUser.agregarExpediente(expedienteNuevo);
    }

    private void limpiarFormulario() {
        tipoExpediente.setSelectedIndex(0);
        jTextArea2.setText("");
        noDocumentoSeleccionado.setText("No documento seleccionado");
        selectedFile = null;
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
            java.util.logging.Logger.getLogger(UserExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserExpediente("default@example.com", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarExpediente;
    private javax.swing.JButton elegirArchivo;
    private javax.swing.JButton enviarRealizarNuevoExpediente;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel noDocumentoSeleccionado;
    private javax.swing.JLabel nuevoExpediente;
    private javax.swing.JComboBox<String> tipoExpediente;
    // End of variables declaration//GEN-END:variables
}
