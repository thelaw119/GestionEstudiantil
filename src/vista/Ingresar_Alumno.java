/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import vista.Panel_Admin;
/**
 *
 * @author kimbe
 */
public class Ingresar_Alumno extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Alumno
     */
    public Ingresar_Alumno() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rut = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        matricula = new javax.swing.JLabel();
        ruta = new javax.swing.JLabel();
        nombrea = new javax.swing.JLabel();
        parentesco = new javax.swing.JLabel();
        datosalumno = new javax.swing.JLabel();
        datosapoderado = new javax.swing.JLabel();
        fechanac = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        txtrutalumno = new javax.swing.JTextField();
        txtnombrealumno = new javax.swing.JTextField();
        txtfechanacimiento = new javax.swing.JTextField();
        txtmatricula = new javax.swing.JTextField();
        txtrutapoderado = new javax.swing.JTextField();
        txtnombreapoderado = new javax.swing.JTextField();
        txtparentesco = new javax.swing.JTextField();
        rbfemenino = new javax.swing.JRadioButton();
        rbmasculino = new javax.swing.JRadioButton();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        contacto = new javax.swing.JLabel();
        txtcontacto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblapellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Ingresar Nuevo Alumno");

        rut.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rut.setText("Rut:");

        nombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nombre.setText("Nombre:");

        matricula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        matricula.setText("N° Matricula: ");

        ruta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ruta.setText("Rut Apoderado:");

        nombrea.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nombrea.setText("Nombre Apoderado:");

        parentesco.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        parentesco.setText("Parentesco:");

        datosalumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        datosalumno.setText("Datos del Alumno:");
        datosalumno.setToolTipText("");

        datosapoderado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        datosapoderado.setText("Datos del Apoderado:");

        fechanac.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fechanac.setText("Fecha Nacimiento: ");

        sexo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sexo.setText("Sexo:");

        txtrutalumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtrutalumno.setText("jTextField1");

        txtnombrealumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnombrealumno.setText("jTextField2");

        txtfechanacimiento.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtfechanacimiento.setText("jTextField3");

        txtmatricula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtmatricula.setText("jTextField4");

        txtrutapoderado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtrutapoderado.setText("jTextField5");

        txtnombreapoderado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnombreapoderado.setText("jTextField6");

        txtparentesco.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtparentesco.setText("jTextField7");

        Sexo.add(rbfemenino);
        rbfemenino.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbfemenino.setText("Femenino");

        Sexo.add(rbmasculino);
        rbmasculino.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbmasculino.setText("Masculino");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        contacto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        contacto.setText("Contacto:");

        txtcontacto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtcontacto.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Dirección:");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField1.setText("jTextField1");

        lblapellido.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblapellido.setText("Apellido:");

        txtapellido.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtapellido.setText("jTextField2");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña:");

        txtclave.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtclave.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnguardar)
                                .addGap(71, 71, 71)
                                .addComponent(btnlimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnvolver))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fechanac)
                                .addGap(299, 299, 299))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datosalumno)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(51, 51, 51)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(rut)
                                                        .addComponent(nombre)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(50, 50, 50)
                                                    .addComponent(lblapellido)))
                                            .addGap(112, 112, 112)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtrutalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtnombrealumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datosapoderado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ruta)
                                                .addComponent(nombrea))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel2)))
                                        .addGap(104, 104, 104))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(contacto)
                                            .addComponent(parentesco))
                                        .addGap(106, 106, 106)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnombreapoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrutapoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matricula)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(sexo))
                                .addGap(96, 96, 96)
                                .addComponent(rbfemenino)))
                        .addGap(34, 34, 34)
                        .addComponent(rbmasculino)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(datosalumno)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rut)
                    .addComponent(txtrutalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(txtnombrealumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechanac)
                    .addComponent(txtfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(rbfemenino)
                    .addComponent(rbmasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricula)
                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(datosapoderado)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreapoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parentesco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contacto)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ruta)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrutapoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnlimpiar)
                    .addComponent(btnvolver))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        dispose();
        Panel_Admin mostrar = new Panel_Admin();
        mostrar.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
      
        txtrutalumno.setText(null);
        txtnombrealumno.setText(null);
        txtfechanacimiento.setText(null);
        txtmatricula.setText(null);
        txtrutapoderado.setText(null);
        txtnombreapoderado.setText(null);
        txtparentesco.setText(null);
        txtcontacto.setText(null);
        txtapellido.setText(null);
        txtclave.setText(null);
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
     
        
        
        
    }//GEN-LAST:event_btnguardarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel contacto;
    private javax.swing.JLabel datosalumno;
    private javax.swing.JLabel datosapoderado;
    private javax.swing.JLabel fechanac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel matricula;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombrea;
    private javax.swing.JLabel parentesco;
    private javax.swing.JRadioButton rbfemenino;
    private javax.swing.JRadioButton rbmasculino;
    private javax.swing.JLabel rut;
    private javax.swing.JLabel ruta;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcontacto;
    private javax.swing.JTextField txtfechanacimiento;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnombrealumno;
    private javax.swing.JTextField txtnombreapoderado;
    private javax.swing.JTextField txtparentesco;
    private javax.swing.JTextField txtrutalumno;
    private javax.swing.JTextField txtrutapoderado;
    // End of variables declaration//GEN-END:variables
}
