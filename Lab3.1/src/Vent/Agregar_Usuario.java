
package Vent;

import com.mysql.jdbc.Connection;
/*import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/
import java.sql.*;
import javax.swing.*;
/*import static javax.swing.JOptionPane.showMessageDialog;*/


public class Agregar_Usuario extends javax.swing.JFrame {

    
    public Agregar_Usuario() {
        initComponents();
                this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Adduser = new javax.swing.JLabel();
        jButton1Regre = new javax.swing.JButton();
        btn_Registro = new javax.swing.JButton();
        jLabel1UserRe = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel1PassRe = new javax.swing.JLabel();
        jLabel1VentanaNombr5 = new javax.swing.JLabel();
        fieldPass = new javax.swing.JPasswordField();
        txtNombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1FondoRe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Adduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/adduser_1.png"))); // NOI18N
        getContentPane().add(jLabel1Adduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 140));

        jButton1Regre.setBackground(new java.awt.Color(255, 153, 0));
        jButton1Regre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1Regre.setText("Regresar");
        jButton1Regre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegreActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        btn_Registro.setBackground(new java.awt.Color(0, 153, 204));
        btn_Registro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_Registro.setText("Registrar");
        btn_Registro.setName("btnregistraru"); // NOI18N
        btn_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RegistroMouseClicked(evt);
            }
        });
        btn_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel1UserRe.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1UserRe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1UserRe.setText("Usuario");
        getContentPane().add(jLabel1UserRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtusuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtusuario.setName("txtusuario"); // NOI18N
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 30));

        jLabel1PassRe.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1PassRe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1PassRe.setText("Contraseña");
        getContentPane().add(jLabel1PassRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel1VentanaNombr5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1VentanaNombr5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1VentanaNombr5.setText("Nuevo Usuario");
        getContentPane().add(jLabel1VentanaNombr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fieldPass.setToolTipText("");
        fieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPass(evt);
            }
        });
        getContentPane().add(fieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        txtNombres.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 190, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Nombres");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Apellidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        txtApellidos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 190, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Dui");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        txtDui.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 190, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 190, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Tipo de usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel1FondoRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/FondoRe.jpg"))); // NOI18N
        getContentPane().add(jLabel1FondoRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private static Connection conexion;
    
    private static final String CONECTOR = "com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/db_farma_despertad";
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    String consulta;
    String usuario;
    String usuario_pass;
    String nombres;
    String apellidos;
    int telefono;
    int dui;
    int tipo_usuario;
    
      
    /*PreparedStatement ps;
    ResultSet rs;*/

    private void Limpiar(){
    
        txtusuario.setText(null);
        fieldPass.setText(null);
    }
    
    
    private void jButton1RegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegreActionPerformed
        
        Login pro = new Login();
        pro.setVisible(true);
        this.setVisible(false);
               
    }//GEN-LAST:event_jButton1RegreActionPerformed

    private void btn_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroActionPerformed

       
    }//GEN-LAST:event_btn_RegistroActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void fieldPass(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPass
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPass

    private void btn_RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegistroMouseClicked
       usuario = txtusuario.getText();
       usuario_pass = fieldPass.getText();
       nombres = txtNombres.getText();
       apellidos = txtApellidos.getText();
       dui = Integer.parseInt(txtDui.getText());
       telefono = Integer.parseInt(txtTelefono.getText());
       tipo_usuario = 3;
       ingresarUsuario();
    }//GEN-LAST:event_btn_RegistroMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registro;
    private javax.swing.JPasswordField fieldPass;
    private javax.swing.JButton jButton1Regre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Adduser;
    private javax.swing.JLabel jLabel1FondoRe;
    private javax.swing.JLabel jLabel1PassRe;
    private javax.swing.JLabel jLabel1UserRe;
    private javax.swing.JLabel jLabel1VentanaNombr5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void ingresarUsuario(){
       consulta = "INSERT INTO dbo_usuario VALUES ('', '"+ nombres +"', '"+ apellidos +"', '"+ usuario +"', '"+ usuario_pass +"', '"+ tipo_usuario +"', '"+ dui +"', '"+ telefono +"')";
       //consulta = "INSERT INTO dbo_usuario VALUES ('', 'zuleyma', 'fuentes', 'lizzy23', '123', '3', '123456789', '74998913')";
       conexion = null;
       Statement s;
       ResultSet rs;
        
        try{
            Class.forName(CONECTOR);
            conexion = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            s = conexion.createStatement();
            s.execute(consulta);
            s.close();
            conexion.close();
              
        }
        
        catch (ClassNotFoundException | SQLException e){
        } 
    }

}
