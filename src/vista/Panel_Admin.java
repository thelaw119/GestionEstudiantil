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
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import vista.ingresar_Docente;
//import vista.Ingresar_Alumno;
import objeto.Especialidad;
import controlador.Ctrl_Especialidad;
import controlador.Ctrl_Buscar_Alumno;
import controlador.Ctrl_Buscar_Docente;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import objeto.Alumno;
/**
 *
 * @author Darlyn
 */
public class Panel_Admin extends javax.swing.JFrame implements Runnable{
String hora,minutos,segundos;
Calendar calendario;    
Thread h1;
Ctrl_Especialidad ctr_especialidad;
Ctrl_Buscar_Alumno ctr_alumno;
Ctrl_Buscar_Docente ctr_docente;

    /**
     * Creates new form Panel_Admin
     */
    public Panel_Admin() {
        initComponents();
        ctr_especialidad = new Ctrl_Especialidad();
        ctr_especialidad.Conectar();
        ctr_alumno = new Ctrl_Buscar_Alumno();
        ctr_alumno.Conectar();
        ctr_docente = new Ctrl_Buscar_Docente();
        ctr_docente.Conectar();
        Calendar cal = Calendar.getInstance(); 
        lblfecha.setText(fecha());
        h1 = new Thread(this);
        h1.start();
        setLocationRelativeTo(null);
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource(
                "/imagenes/logo.png")).getImage());
       
    }
    
    
    
    
    public void hora () {     
        
    Calendar calendario = new GregorianCalendar();
    Date fechaHoraActual = new Date();
    calendario.setTime(fechaHoraActual);
   
   hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+
            calendario.get(Calendar.HOUR_OF_DAY):"0"+
                calendario.get(Calendar.HOUR_OF_DAY);
   
   minutos = calendario.get(Calendar.MINUTE)>9?""+
            calendario.get(Calendar.MINUTE):"0"+
            calendario.get(Calendar.MINUTE);
   
   segundos = calendario.get(Calendar.SECOND)>9?""+
            calendario.get(Calendar.SECOND):"0"+
            calendario.get(Calendar.SECOND); 
   
      
}
                

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cursoss = new javax.swing.ButtonGroup();
        tabbedPaneAdministrador = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        panel_docentes = new javax.swing.JPanel();
        btnbuscardocente = new javax.swing.JButton();
        txtbuscaDocente = new javax.swing.JTextField();
        btnDocenteNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panel_alumnos = new javax.swing.JPanel();
        txtbuscaralumno = new javax.swing.JTextField();
        btnbuscaralumno = new javax.swing.JButton();
        btnAlumnoNuevo = new javax.swing.JButton();
        panel_especialidades = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtespecialidad = new javax.swing.JTextField();
        btnguardarespecialidad = new javax.swing.JButton();
        panel_ayuda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_inicio.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Hora: ");

        lblhora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblhora.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Fecha:");

        lblfecha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblfecha.setText("jLabel5");

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(152, 152, 152)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfecha)
                    .addComponent(lblhora))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhora))
                .addGap(79, 79, 79)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfecha)
                    .addComponent(jLabel4))
                .addContainerGap(501, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Inicio", panel_inicio);

        panel_docentes.setBackground(new java.awt.Color(0, 204, 255));

        btnbuscardocente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnbuscardocente.setText("Buscar Docente");
        btnbuscardocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscardocenteActionPerformed(evt);
            }
        });

        txtbuscaDocente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnDocenteNuevo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDocenteNuevo.setText("Agregar Docente");
        btnDocenteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocenteNuevoActionPerformed(evt);
            }
        });

        jLabel6.setText("Rut Docente:");

        javax.swing.GroupLayout panel_docentesLayout = new javax.swing.GroupLayout(panel_docentes);
        panel_docentes.setLayout(panel_docentesLayout);
        panel_docentesLayout.setHorizontalGroup(
            panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_docentesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panel_docentesLayout.createSequentialGroup()
                        .addComponent(txtbuscaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnbuscardocente))
                    .addGroup(panel_docentesLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnDocenteNuevo)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panel_docentesLayout.setVerticalGroup(
            panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_docentesLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscardocente))
                .addGap(157, 157, 157)
                .addComponent(btnDocenteNuevo)
                .addContainerGap(416, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Docentes", panel_docentes);

        panel_alumnos.setBackground(new java.awt.Color(0, 204, 255));

        txtbuscaralumno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnbuscaralumno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnbuscaralumno.setText("Buscar Alumno");
        btnbuscaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaralumnoActionPerformed(evt);
            }
        });

        btnAlumnoNuevo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlumnoNuevo.setText("Ingresar nuevo Alumno");
        btnAlumnoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_alumnosLayout = new javax.swing.GroupLayout(panel_alumnos);
        panel_alumnos.setLayout(panel_alumnosLayout);
        panel_alumnosLayout.setHorizontalGroup(
            panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_alumnosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(txtbuscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuscaralumno)
                    .addComponent(btnAlumnoNuevo))
                .addGap(98, 98, 98))
        );
        panel_alumnosLayout.setVerticalGroup(
            panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alumnosLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscaralumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                .addComponent(btnAlumnoNuevo)
                .addGap(96, 96, 96))
        );

        tabbedPaneAdministrador.addTab("Alumnos", panel_alumnos);

        panel_especialidades.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Especialidad:");

        txtespecialidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnguardarespecialidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnguardarespecialidad.setText("Guardar");
        btnguardarespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarespecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_especialidadesLayout = new javax.swing.GroupLayout(panel_especialidades);
        panel_especialidades.setLayout(panel_especialidadesLayout);
        panel_especialidadesLayout.setHorizontalGroup(
            panel_especialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_especialidadesLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(panel_especialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardarespecialidad)
                    .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panel_especialidadesLayout.setVerticalGroup(
            panel_especialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_especialidadesLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(panel_especialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addComponent(btnguardarespecialidad)
                .addContainerGap(496, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Especialidades", panel_especialidades);

        panel_ayuda.setBackground(new java.awt.Color(0, 204, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Bienvenidos a GS GESTION ESTUDIANTIL \n\nsistema de colegio con exclusividad en educación de\nenseñanza media.\n\ncontiene modulos para cada uno de los usuarios,\ncon sus actividades especificas que necesita \ncada uno de estos.\n\nMODO BETA!.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panel_ayudaLayout = new javax.swing.GroupLayout(panel_ayuda);
        panel_ayuda.setLayout(panel_ayudaLayout);
        panel_ayudaLayout.setHorizontalGroup(
            panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ayudaLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panel_ayudaLayout.setVerticalGroup(
            panel_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ayudaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Ayuda", panel_ayuda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneAdministrador)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneAdministrador)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarespecialidadActionPerformed
        
        String nombre_especialidad = txtespecialidad.getText();
        Ctrl_Especialidad guardar = new Ctrl_Especialidad();
        
             if(nombre_especialidad != ""){

                JOptionPane.showMessageDialog(null, "Campo Vacio");

                }else{

                

               guardar.IngresarEspecialidad(nombre_especialidad);
               
       
        }
    }//GEN-LAST:event_btnguardarespecialidadActionPerformed

    private void btnAlumnoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoNuevoActionPerformed
        dispose();
        Ingresar_Alum mostrar = new Ingresar_Alum();
        mostrar.setLocationRelativeTo(null);
        mostrar.setVisible(true);
    }//GEN-LAST:event_btnAlumnoNuevoActionPerformed

    private void btnbuscaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaralumnoActionPerformed

        /*
        boton buscar un alumno por rut
        en la base de datos
        */

        String buscar_alumno = txtbuscaralumno.getText();

        ctr_alumno.BuscarAlumno(buscar_alumno);

        txtbuscaralumno.setText(null);
    }//GEN-LAST:event_btnbuscaralumnoActionPerformed

    private void btnDocenteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocenteNuevoActionPerformed
        dispose();
        ingresar_Docente mostrar = new ingresar_Docente();
        mostrar.setLocationRelativeTo(null);
        mostrar.setVisible(true);
    }//GEN-LAST:event_btnDocenteNuevoActionPerformed

    private void btnbuscardocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscardocenteActionPerformed
        /*
        boton buscar un alumno por rut
        en la base de datos
        */

        //        try{

            String buscar_docente = txtbuscaDocente.getText();

            ctr_docente.BuscarDocente(buscar_docente);

            //        }catch(HeadlessException e){
            //            JOptionPane.showMessageDialog(null,e.getMessage());
            //        }catch(Exception i){
            //            JOptionPane.showMessageDialog(null,i.getMessage());
            //        }
        txtbuscaDocente.setText(null);
    }//GEN-LAST:event_btnbuscardocenteActionPerformed

    
    public void limpiarEspecialidad(){
        
        txtespecialidad.setText(null);
    }
    
//     public void limpiarMatricula(){
//        
//        txtmatricula.setText(null);
//    }
    /**
     * @param args the command line arguments
     */
    
    
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
   
    public void run(){
        //while
    Thread ct = Thread.currentThread();
    while(ct == h1) {   
    hora();
    lblhora.setText(hora + ":" + minutos + ":" + segundos);
    
    }
}
  
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
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Admin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnoNuevo;
    private javax.swing.JButton btnDocenteNuevo;
    private javax.swing.JButton btnbuscaralumno;
    private javax.swing.JButton btnbuscardocente;
    private javax.swing.JButton btnguardarespecialidad;
    private javax.swing.ButtonGroup cursoss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JPanel panel_alumnos;
    private javax.swing.JPanel panel_ayuda;
    private javax.swing.JPanel panel_docentes;
    private javax.swing.JPanel panel_especialidades;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JTabbedPane tabbedPaneAdministrador;
    private javax.swing.JTextField txtbuscaDocente;
    private javax.swing.JTextField txtbuscaralumno;
    private javax.swing.JTextField txtespecialidad;
    // End of variables declaration//GEN-END:variables
}
