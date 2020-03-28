/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vent;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jButton1SalirMenu = new javax.swing.JButton();
        jButton1AgregarP = new javax.swing.JButton();
        jButton1AgregarCat = new javax.swing.JButton();
        jLabel1Log = new javax.swing.JLabel();
        jLabel1Titel = new javax.swing.JLabel();
        jLabel1AgregarPro = new javax.swing.JLabel();
        jLabel1AgregarCat = new javax.swing.JLabel();
        jButton1AgregarProve = new javax.swing.JButton();
        jLabel1ImgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1SalirMenu.setBackground(new java.awt.Color(255, 51, 51));
        jButton1SalirMenu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1SalirMenu.setText("X");
        jButton1SalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1SalirMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jButton1AgregarP.setBackground(new java.awt.Color(0, 255, 51));
        jButton1AgregarP.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1AgregarP.setText("Agregar un producto");
        jButton1AgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarPActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1AgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 60));

        jButton1AgregarCat.setBackground(new java.awt.Color(255, 204, 0));
        jButton1AgregarCat.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1AgregarCat.setText("Agregar una Categoría");
        jButton1AgregarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarCatActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1AgregarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 180, 60));

        jLabel1Log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/Icono.jpg"))); // NOI18N
        getContentPane().add(jLabel1Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel1Titel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1Titel.setText("Farmacias Despertad");
        getContentPane().add(jLabel1Titel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel1AgregarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/Agregar.png"))); // NOI18N
        getContentPane().add(jLabel1AgregarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel1AgregarCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/Agregar.png"))); // NOI18N
        getContentPane().add(jLabel1AgregarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jButton1AgregarProve.setBackground(new java.awt.Color(153, 153, 255));
        jButton1AgregarProve.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1AgregarProve.setText("Agregar un proveedor");
        jButton1AgregarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarProveActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1AgregarProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 180, 60));

        jLabel1ImgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/menu1.png"))); // NOI18N
        getContentPane().add(jLabel1ImgMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirMenuActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1SalirMenuActionPerformed

    private void jButton1AgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarPActionPerformed
        // TODO add your handling code here:
        
        //Pasar entre ventanas
        Ingresar_Prod pro = new Ingresar_Prod();
        pro.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1AgregarPActionPerformed

    private void jButton1AgregarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarCatActionPerformed
        // TODO add your handling code here:
                
        Regis_Cat pro = new Regis_Cat();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1AgregarCatActionPerformed

    private void jButton1AgregarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarProveActionPerformed
        // TODO add your handling code here:
        
       Proveedor pro = new Proveedor();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1AgregarProveActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1AgregarCat;
    private javax.swing.JButton jButton1AgregarP;
    private javax.swing.JButton jButton1AgregarProve;
    private javax.swing.JButton jButton1SalirMenu;
    private javax.swing.JLabel jLabel1AgregarCat;
    private javax.swing.JLabel jLabel1AgregarPro;
    private javax.swing.JLabel jLabel1ImgMenu;
    private javax.swing.JLabel jLabel1Log;
    private javax.swing.JLabel jLabel1Titel;
    // End of variables declaration//GEN-END:variables
}