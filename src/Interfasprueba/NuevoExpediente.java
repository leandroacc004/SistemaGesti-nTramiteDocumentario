
package Interfasprueba;

import Servicio.Expediente;
import Servicio.PilaExpedientes;
import TDA.Nodo;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class NuevoExpediente extends javax.swing.JFrame {
    
    private javax.swing.JTable tablaExpedientes; // Declaro la variable tablaExpedientes
    private PilaExpedientes pilaExpdiente;

    public NuevoExpediente(PilaExpedientes pilaExpdiente) {
        initComponents();
        tablaExpedientes = new JTable(); // Inicializo la variable tablaExpedientes
        this.pilaExpdiente = pilaExpdiente;
        FillDependencia.addItem("Ing. Sistemas");
        FillDependencia.addItem("Ing. Industrial");
        FillDependencia.addItem("Marketing");
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }
//FillIdentificadorDeExpediente.getText() FillDependencia.getSelectedItem()
    // Método que devuelve los datos ingresados en los campos de texto
    private Expediente getExpedienteData() {
        return new Expediente(FillIdentificadorDeExpediente.getText(),
                FillPrioridadExpediente.getSelectedItem().toString(), 
                FillDNI.getText(), FillNombre.getText(),
                FillApellido.getText(), FillAsunto.getText(), 
                selectedFile, (String) FillDependencia.getSelectedItem());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FillIdentificadorDeExpediente = new javax.swing.JTextField();
        BotonSelecArchivo = new javax.swing.JButton();
        FillDependencia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        FillNombre = new javax.swing.JTextField();
        FillApellido = new javax.swing.JTextField();
        FillDNI = new javax.swing.JTextField();
        FillAsunto = new javax.swing.JTextField();
        BotonEnviarExpediente = new javax.swing.JButton();
        BotonEnviarOtroExpediente = new javax.swing.JButton();
        BotonShowTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        FillPrioridadExpediente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Nuevo Expediente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 320, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Información del Expediente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, -1));

        jLabel3.setText("Identificador del Expediente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        jLabel4.setText("Prioridad del expediente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, -1));

        jLabel5.setText("Documento de referencia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 160, -1));

        jLabel6.setText("Seleccione dependencia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 140, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Datos del solicitante");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 180, -1));

        jLabel8.setText("Nombres");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel9.setText("Apellidos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, 20));

        jLabel10.setText("DNI");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));
        jPanel1.add(FillIdentificadorDeExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 170, -1));

        BotonSelecArchivo.setText("Seleccionar archivo");
        BotonSelecArchivo.setToolTipText("");
        BotonSelecArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSelecArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSelecArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 150, 20));
        jPanel1.add(FillDependencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, -1));

        jLabel11.setText("Asunto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 50, -1));
        jPanel1.add(FillNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 180, -1));
        jPanel1.add(FillApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 170, -1));
        jPanel1.add(FillDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 160, -1));
        jPanel1.add(FillAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 570, 70));

        BotonEnviarExpediente.setBackground(new java.awt.Color(255, 153, 0));
        BotonEnviarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        BotonEnviarExpediente.setText("ENVIAR EXPEDIENTE");
        BotonEnviarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarExpedienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEnviarExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 503, 370, 40));

        BotonEnviarOtroExpediente.setText("Enviar otro expediente");
        BotonEnviarOtroExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarOtroExpedienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEnviarOtroExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, 40));

        BotonShowTabla.setText("Ver Tablas");
        BotonShowTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonShowTablaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonShowTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 100, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 600));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo ulima.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 90, 90));

        FillPrioridadExpediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        FillPrioridadExpediente.setToolTipText("");
        jPanel1.add(FillPrioridadExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    java.io.File selectedFile = null;
    private void BotonEnviarOtroExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarOtroExpedienteActionPerformed
        // Limpiar los campos de texto
        FillIdentificadorDeExpediente.setText("");
        FillPrioridadExpediente.setSelectedIndex(0);
        FillNombre.setText("");
        FillApellido.setText("");
        FillDNI.setText("");
        FillAsunto.setText("");
        selectedFile = null;
    }//GEN-LAST:event_BotonEnviarOtroExpedienteActionPerformed

    private void BotonSelecArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSelecArchivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Documentos", "doc", "docx", "pdf");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            //noDocumentoSeleccionado.setText(selectedFile.getName());
        }
    }//GEN-LAST:event_BotonSelecArchivoActionPerformed

    private void BotonEnviarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarExpedienteActionPerformed
        
        javax.swing.JOptionPane.showMessageDialog(this, "Se envió el expediente");
        
        Expediente expediente = getExpedienteData();
        FillIdentificadorDeExpediente.setText("");
        FillPrioridadExpediente.setSelectedIndex(0);
        FillNombre.setText("");
        FillApellido.setText("");
        FillDNI.setText("");
        FillAsunto.setText("");
        selectedFile = null;
    
        this.pilaExpdiente.push(expediente);
    
    
        // Actualiza la tabla con el nuevo expediente
        actualizarTabla(this.pilaExpdiente);
    
        // Crea una nueva instancia de tablaExpedientes y pasa la tabla actualizada
        tablaExpedientes tabla = new tablaExpedientes(this.pilaExpdiente);
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null);
    

    
    }
   
// Método para actualizar la tabla
private void actualizarTabla(PilaExpedientes pilaExpedientes) {
    DefaultTableModel model = (DefaultTableModel) tablaExpedientes.getModel();
    model.setRowCount(0); // Limpia la tabla
    Nodo<Expediente> nodoActual = pilaExpedientes.top;
    while (nodoActual!= null) {
        Expediente expediente = nodoActual.getValue();
        model.addRow(new Object[] {
            expediente.getIdentificadorUnico(),
            expediente.getNombres(),
            expediente.getApellidos(),
            expediente.getDNI(),
            expediente.getAsunto(),
            expediente.getPrioridad(),
            expediente.getDependencia()
        });
        nodoActual = nodoActual.getNext();
    }
    }//GEN-LAST:event_BotonEnviarExpedienteActionPerformed

    private void BotonShowTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonShowTablaActionPerformed
        tablaExpedientes tabla = new tablaExpedientes(this.pilaExpdiente);
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotonShowTablaActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
    }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviarExpediente;
    private javax.swing.JButton BotonEnviarOtroExpediente;
    private javax.swing.JButton BotonSelecArchivo;
    private javax.swing.JButton BotonShowTabla;
    private javax.swing.JTextField FillApellido;
    private javax.swing.JTextField FillAsunto;
    private javax.swing.JTextField FillDNI;
    private javax.swing.JComboBox<String> FillDependencia;
    private javax.swing.JTextField FillIdentificadorDeExpediente;
    private javax.swing.JTextField FillNombre;
    private javax.swing.JComboBox<String> FillPrioridadExpediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
