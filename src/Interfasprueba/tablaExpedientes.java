/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfasprueba;

import Servicio.Expediente;
import Servicio.PilaExpedientes;
import TDA.Nodo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manue
 */
public class tablaExpedientes extends javax.swing.JFrame {

    private PilaExpedientes pilaexpediente; 
    
    
    public tablaExpedientes(PilaExpedientes pilaexpediente){
    initComponents();                               
        
    String[] columnNames = {"Identificador", "Nombre", "Apellido", "DNI","Prioridad", "Asunto", "Dependencia"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    tablaExpedientes.setModel(model);
    this.pilaexpediente = pilaexpediente;
    
    // Agrega los datos a la tabla
    agregarDatosATabla();
    
    this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
   private void agregarDatosATabla() {
    DefaultTableModel model = (DefaultTableModel) tablaExpedientes.getModel();
    List<Expediente> expedientes = new ArrayList<>();
    
    Nodo<Expediente> nodoActual = pilaexpediente.top;
    while (nodoActual != null) {
        Expediente expediente = nodoActual.getValue();
        expedientes.add(expediente);
        nodoActual = nodoActual.getNext();
    }
    
    // Ordenar la lista de expedientes por prioridad
    Collections.sort(expedientes, new Comparator<Expediente>() {
        @Override
        public int compare(Expediente e1, Expediente e2) {
            String prioridad1 = e1.getPrioridad();
            String prioridad2 = e2.getPrioridad();
            
            if (prioridad1.equals("Alta")) {
                return -1;
            } else if (prioridad1.equals("Media")) {
                if (prioridad2.equals("Alta")) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                if (prioridad2.equals("Alta") || prioridad2.equals("Media")) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    });
    
    // Agregar los expedientes ordenados a la tabla
    for (Expediente expediente : expedientes) {
        model.addRow(new Object[] {
            expediente.getIdentificadorUnico(),
            expediente.getNombres(),
            expediente.getApellidos(),
            expediente.getDNI(),
            expediente.getPrioridad(),
            expediente.getAsunto(),
            expediente.getDependencia(),
        });
    }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaExpedientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Expedientes");

        tablaExpedientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Apellido", "DNI", "Prioridad", "Asunto", "Dependencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaExpedientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        PilaExpedientes pilaExpedientes = new PilaExpedientes();
        tablaExpedientes tabla = new tablaExpedientes(pilaExpedientes);
        tabla.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaExpedientes;
    // End of variables declaration//GEN-END:variables
}