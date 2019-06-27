/* API SISTEMA COLEGIO.
 *
 * 
 *
 * Codigo Basado en Pedro Gatica , Kimberly Soazo , Joaquin Valenzuela 
 *
 * 
 *
 * Este programa es software libre; Puedes redistribuirlo y / o modificarlo.
 * bajo los términos de la Licencia Pública General de GNU tal como fue publicada por
 * la Fundación de Software Libre; ya sea la versión 2 de la Licencia, o
 * (a su elección) cualquier versión posterior.
 *
 * ------------------------------------------------- ----------------------------
 * Copyright (c) 2019,Pedro Gatica , Joaquin Valenzuela,Kimberly Soazo
 * Todos los derechos reservados.
 *
 * CONDICIONES DE LA LICENCIA
 *
 * La distribución gratuita y el uso de este software tanto en origen como en binario.
 * Se permite el formulario (con o sin cambios) siempre que:
 *
 * 1. Las distribuciones de este código fuente incluyen el copyright anterior.
 * Aviso, esta lista de condiciones y el siguiente descargo de responsabilidad;
 *
 * 2. Las distribuciones en formato binario incluyen el copyright anterior.
 * Aviso, esta lista de condiciones y el siguiente aviso legal.
 * en la documentación y / u otros materiales asociados;
 *
 * 3. el nombre de los titulares de los derechos de autor no se utiliza para promocionar productos
 * construido utilizando este software sin permiso escrito específico.
 *
 * ALTERNATIVAMENTE, siempre que este aviso se mantenga en su totalidad, este producto
 * se puede distribuir según los términos de la Licencia Pública General de GNU (GPL),
 * en cuyo caso, las disposiciones de la GPL se aplican EN LUGAR DE las mencionadas anteriormente.
 *
 * DESCARGO DE RESPONSABILIDAD
 *
 * Este software se proporciona "tal cual" sin garantías explícitas ni implícitas
 * con respecto a sus propiedades, incluida, entre otras, la corrección
 * y / o aptitud para el propósito.
 * ------------------------------------------------- ----------------------------
 * /

*/

package vista;

//import controlador.Conexion;
import controlador.Ctrl_login;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.Panel_Admin;
 
/**
 *
 * @author The Law
 * @modificacion 
 * 
 */
public class Ingreso extends javax.swing.JFrame{

    static Connection conexion = null;
    String Item = "";
    
    Ctrl_login login;
    
    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
        initComponents();
        setLocationRelativeTo(null);
        login = new Ctrl_login();
        login.Conectar();
        setIconImage(new ImageIcon(getClass().getResource(
                "/imagenes/logo.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtclave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox();
        btningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 360, 350));

        jLabel4.setText("INGRESO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 70, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Rut:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtrut.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.add(txtrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 133, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Clave:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        txtclave.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 133, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Tipo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        cbtipo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Alumno", "Profesor" }));
        jPanel1.add(cbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 133, -1));

        btningresar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 133, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        

        String rut = txtrut.getText();
        String clave = txtclave.getText();
        

        Item = cbtipo.getSelectedItem().toString();
        
        if(Item == "Administrador"){
                
                login.LoginAdministrador(rut, clave);
                
                dispose();
             
        }else if(Item == "Alumno"){
            
            login.LoginAlumno(rut, clave);
            dispose();
            
        }else if(Item == "Profesor"){
           
            login.LoginProfesor(rut, clave);
            Panel_Profesor.txtrutprofesor.setText(txtrut.getText());
            Panel_Profesor.txtRut_prof.setText(txtrut.getText());
            dispose();
        }
        
            
    }//GEN-LAST:event_btningresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JComboBox cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtrut;
    // End of variables declaration//GEN-END:variables
}
