/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import javax.swing.JOptionPane;

/**
 *
 * @author rftecnicos
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        btbEntrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblContraseña.setBackground(new java.awt.Color(0, 0, 0));
        lblContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Password:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 20));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, -1));

        Password.setBackground(new java.awt.Color(0, 0, 0));
        Password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, -1));

        btbEntrar.setBackground(new java.awt.Color(0, 0, 0));
        btbEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btbEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btbEntrar.setText("Entrar");
        btbEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbEntrarMouseClicked(evt);
            }
        });
        btbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 70, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondodados.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbEntrarActionPerformed
        // TODO add your handling code here:
        
        

    }//GEN-LAST:event_btbEntrarActionPerformed

    private void btbEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbEntrarMouseClicked
        // TODO add your handling code here:
        
        String Usuario = "cvasquez";
        String Contraseña = "poo2019";
        String Pass = new String(Password.getPassword());
        
        if(txtUsuario.getText().equals(Usuario) && Pass.equals(Contraseña)){
          Monedas Mn = new Monedas();
          Mn.setVisible(true);
          dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta");
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btbEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btbEntrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
