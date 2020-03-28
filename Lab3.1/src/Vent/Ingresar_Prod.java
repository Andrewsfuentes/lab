/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vent;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Ingresar_Prod extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Prod
     */
    public Ingresar_Prod() {
        initComponents();
                this.setLocationRelativeTo(null);
    }

    private static final String URL="jdbc:mysql://localhost:3306/db_farma_despertad";
    private static final String USERNAME="root";
    private static final String PASSWORD="";
      
    PreparedStatement ps;
    ResultSet rs;

    
    public static Connection getConection ()
    {
 
     Connection con = null;
     
     try{
    
         Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
        JOptionPane.showInputDialog(null,"Conectado");
     
     }
     catch (Exception e)
     {System.out.print(e);
     }
        return null;
           
    } 

    private void Limpiar(){
    /*nombres de las variables*/
        txtpname.setText(null);
        txtpdescription.setText(null);
        txtprice.setText(null);
        txtpcompra.setText(null);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1ReProd = new javax.swing.JLabel();
        jButton1Regis2 = new javax.swing.JButton();
        jButton1Regresar2 = new javax.swing.JButton();
        jLabel1NombreP = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        txtpdescription = new javax.swing.JTextField();
        jLabel1Descri = new javax.swing.JLabel();
        cmbcat = new javax.swing.JComboBox<>();
        jLabel1Cat = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtpcompra = new javax.swing.JTextField();
        cmbprovider = new javax.swing.JComboBox<>();
        jLabel1Precio = new javax.swing.JLabel();
        jLabel1Precio2 = new javax.swing.JLabel();
        jLabel1Provedo = new javax.swing.JLabel();
        jLabel1Stock = new javax.swing.JLabel();
        jSpinner1Stock = new javax.swing.JSpinner();
        jScrollPane1Productos = new javax.swing.JScrollPane();
        jTable1PRODUCTOS = new javax.swing.JTable();
        jButton1ElimarProductos = new javax.swing.JButton();
        jButton1ActualizarProductos = new javax.swing.JButton();
        jLabel1VentanaNombre3 = new javax.swing.JLabel();
        jLabel1FondoProd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1ReProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/Registro_Prod.png"))); // NOI18N
        getContentPane().add(jLabel1ReProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jButton1Regis2.setBackground(new java.awt.Color(0, 153, 204));
        jButton1Regis2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1Regis2.setText("Registrar");
        jButton1Regis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Regis2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 110, -1));

        jButton1Regresar2.setBackground(new java.awt.Color(255, 153, 0));
        jButton1Regresar2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1Regresar2.setText("Regresar");
        jButton1Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Regresar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 750, -1, -1));

        jLabel1NombreP.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1NombreP.setText("Nombre");
        getContentPane().add(jLabel1NombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));
        getContentPane().add(txtpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, 30));
        getContentPane().add(txtpdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 170, 30));

        jLabel1Descri.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Descri.setText("Descripción");
        getContentPane().add(jLabel1Descri, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        cmbcat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastilla", "Medicina", "Pomada", "Vacuna", " " }));
        getContentPane().add(cmbcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jLabel1Cat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Cat.setText("Categoria");
        getContentPane().add(jLabel1Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 80, 30));
        getContentPane().add(txtpcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 80, 30));

        cmbprovider.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbprovider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejemplo", " " }));
        getContentPane().add(cmbprovider, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel1Precio.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Precio.setText("Precio");
        getContentPane().add(jLabel1Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel1Precio2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Precio2.setText("Precio de Compra");
        getContentPane().add(jLabel1Precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel1Provedo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Provedo.setText("Proveedor");
        getContentPane().add(jLabel1Provedo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLabel1Stock.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Stock.setText("Stock");
        getContentPane().add(jLabel1Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        jSpinner1Stock.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(jSpinner1Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 70, 30));

        jTable1PRODUCTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1Productos.setViewportView(jTable1PRODUCTOS);

        getContentPane().add(jScrollPane1Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 440, 120));

        jButton1ElimarProductos.setBackground(new java.awt.Color(255, 51, 51));
        jButton1ElimarProductos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1ElimarProductos.setText("Eliminar");
        jButton1ElimarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ElimarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1ElimarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 690, 110, -1));

        jButton1ActualizarProductos.setBackground(new java.awt.Color(153, 153, 255));
        jButton1ActualizarProductos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1ActualizarProductos.setText("Actualizar");
        jButton1ActualizarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1ActualizarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 690, 110, -1));

        jLabel1VentanaNombre3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1VentanaNombre3.setText("Ingreso de Productos");
        getContentPane().add(jLabel1VentanaNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel1FondoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/Regis_Prod.jpg"))); // NOI18N
        getContentPane().add(jLabel1FondoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void jButton1Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Regresar2ActionPerformed
        // TODO add your handling code here:
        Menu pro = new Menu();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1Regresar2ActionPerformed

    private void jButton1Regis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Regis2ActionPerformed
         Connection con = null;
        try{
        con = getConection();
        
        /*OJO: falta el stock no agragado todavia en la sentecnia sql*/
        /*el numero de signos ed interrogacion igual al numero de columnas*/
        ps = con.prepareStatement("INSERT INTO BD_NOMBRE(columna1,columna2,columna3,columna4,columna5,columna6) VALUES (?,?,?,?,?,?)");
        
        /*la variable de acuerdo al tipo de dato que se va a ingresar a la base de datos*/
        /*el numero significa el indice de las columnas en las que se van a insertar */
        
        ps.setString(1,txtpname.getText());
        ps.setString(2,txtpdescription.getText());
        ps.setString(3,cmbcat.getSelectedItem().toString());
        ps.setDouble(4,Double.parseDouble(txtprice.getText()));
        ps.setDouble(5,Double.parseDouble(txtpcompra.getText()));
        ps.setString(6,cmbprovider.getSelectedItem().toString());
        
        /*
        para el stock
        ps.setString(7,txtcontraseña.getText());
        */
        
        int res = ps.executeUpdate();
        
        
        if(res>0){
        JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
        Limpiar();
        
        } else {
                JOptionPane.showMessageDialog(null,"Error al ingresar datos");
                Limpiar();
        }
        }
        catch(Exception e){
        System.err.println(e);
        }
    }//GEN-LAST:event_jButton1Regis2ActionPerformed

    private void jButton1ActualizarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActualizarProductosActionPerformed
        
        Connection con = null;
        try{
        con = getConection();
        
        /*OJO: falta el stock no agragado todavia en la sentecnia sql*/
        /*el numero de signos ed interrogacion igual al numero de columnas*/
        ps = con.prepareStatement("UPDATE tabla SET columna2=?,columna3=?,columna4=?,columna5=?,columna6=? WHERE Nombre=?" );
        
        /*la variable de acuerdo al tipo de dato que se va a ingresar a la base de datos*/
        /*el numero significa el indice de las columnas en las que se van a insertar */
        
        ps.setString(1,txtpname.getText());
        ps.setString(2,txtpdescription.getText());
        ps.setString(3,cmbcat.getSelectedItem().toString());
        ps.setDouble(4,Double.parseDouble(txtprice.getText()));
        ps.setDouble(5,Double.parseDouble(txtpcompra.getText()));
        ps.setString(6,cmbprovider.getSelectedItem().toString());
        
        
        
        /*
        para el stock
        ps.setString(7,txtcontraseña.getText());
        */
        
        int res = ps.executeUpdate();
        
        
        if(res>0){
        JOptionPane.showMessageDialog(null,"Datos modificados correctamente");
        Limpiar();
        
        } else {
                JOptionPane.showMessageDialog(null,"Error al Modificar datos");
                Limpiar();
        }
        }
        catch(Exception e){
        System.err.println(e);
        }
                                         
    }//GEN-LAST:event_jButton1ActualizarProductosActionPerformed

    private void jButton1ElimarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ElimarProductosActionPerformed
          Connection con = null;
        try{
        con = getConection();
        
        /*OJO: falta el stock no agragado todavia en la sentecnia sql*/
        /*el numero de signos ed interrogacion igual al numero de columnas*/
        ps = con.prepareStatement("DELETE FROM tabla WHERE Nombre=?" );
        
        /*la variable de acuerdo al tipo de dato que se va a ingresar a la base de datos*/
        /*el numero significa el indice de las columnas en las que se van a insertar */
        
        ps.setString(1,txtpname.getText());
        
        
        
        
        /*
        para el stock
        ps.setString(7,txtcontraseña.getText());
        */
        
        int res = ps.executeUpdate();
        
        
        if(res>0){
        JOptionPane.showMessageDialog(null,"Datos eliminados correctamente");
        Limpiar();
        
        } else {
                JOptionPane.showMessageDialog(null,"Error al Eliminar datos");
                Limpiar();
        }
        }
        catch(Exception e){
        System.err.println(e);
        }
                                         
    
    }//GEN-LAST:event_jButton1ElimarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Prod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbcat;
    private javax.swing.JComboBox<String> cmbprovider;
    private javax.swing.JButton jButton1ActualizarProductos;
    private javax.swing.JButton jButton1ElimarProductos;
    private javax.swing.JButton jButton1Regis2;
    private javax.swing.JButton jButton1Regresar2;
    private javax.swing.JLabel jLabel1Cat;
    private javax.swing.JLabel jLabel1Descri;
    private javax.swing.JLabel jLabel1FondoProd;
    private javax.swing.JLabel jLabel1NombreP;
    private javax.swing.JLabel jLabel1Precio;
    private javax.swing.JLabel jLabel1Precio2;
    private javax.swing.JLabel jLabel1Provedo;
    private javax.swing.JLabel jLabel1ReProd;
    private javax.swing.JLabel jLabel1Stock;
    private javax.swing.JLabel jLabel1VentanaNombre3;
    private javax.swing.JScrollPane jScrollPane1Productos;
    private javax.swing.JSpinner jSpinner1Stock;
    private javax.swing.JTable jTable1PRODUCTOS;
    private javax.swing.JTextField txtpcompra;
    private javax.swing.JTextField txtpdescription;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
