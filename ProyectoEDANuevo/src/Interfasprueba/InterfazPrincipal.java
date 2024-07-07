/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfasprueba;

import Servicio.Administrador;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jose Francisco
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    public JPasswordField getFillContraseña() {
        return FillContraseña;
    }

    public void setFillContraseña(JPasswordField FillContraseña) {
        this.FillContraseña = FillContraseña;
    }

    public JTextField getFillUsuario() {
        return FillUsuario;
    }

    public void setFillUsuario(JTextField FillUsuario) {
        this.FillUsuario = FillUsuario;
    }

    public InterfazPrincipal() {
        initComponents();
        setSize(800, 600); // Establece el tamaño del JFrame
        setLocationRelativeTo(null); // Establece la posición del JFrame en el centro de la pantalla
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonInicioSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        FillUsuario = new javax.swing.JTextField();
        FillContraseña = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Sistema de trámites");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 276, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Inicie sesión para acceder al sistema");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 230, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        BotonInicioSesion.setBackground(new java.awt.Color(255, 153, 0));
        BotonInicioSesion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        BotonInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicioSesion.setText("INICIAR SESIÓN");
        BotonInicioSesion.setBorder(null);
        BotonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(BotonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 380, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo ulima.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 0, 97, 92));

        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 380, 10));

        FillUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        FillUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(FillUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 380, 30));

        FillContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        FillContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(FillContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 380, 30));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setText("Recuerdame");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 490, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAnaranjado.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 960));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 960));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String usuario;
    private String contraseña;
    
    private void BotonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioSesionActionPerformed
    Administrador administrador = new Administrador(this);
    if (administrador.autenticar()) {
        // Cerrar este JFrame y abrir el JFrame Destino
        this.dispose();
        Destino destino = new Destino();
        destino.setVisible(true);
    }else{
        // Mostrar mensaje de error
        JOptionPane.showMessageDialog(this, "Usuario y/o contraseña no son correctas", "Error", JOptionPane.ERROR_MESSAGE);
        
        // Limpiar los campos de texto para que el usuario pueda intentar de nuevo
        FillUsuario.setText("");
        FillContraseña.setText("");
        }
    }//GEN-LAST:event_BotonInicioSesionActionPerformed

    private void FillUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillUsuarioActionPerformed
        usuario = FillUsuario.getText();
    }//GEN-LAST:event_FillUsuarioActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void FillContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillContraseñaActionPerformed
        contraseña = new String(FillContraseña.getPassword());
    }//GEN-LAST:event_FillContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicioSesion;
    private javax.swing.JPasswordField FillContraseña;
    private javax.swing.JTextField FillUsuario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
