/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import vista.ingresar_Docente;
import vista.Ingresar_Alumno;
import objeto.Especialidad;
import controlador.Ctrl_Especialidad;
import controlador.Ctrl_Buscar_Alumno;
import controlador.Ctrl_Buscar_Docente;
import java.awt.HeadlessException;
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
        panel_alumnos = new javax.swing.JPanel();
        txtbuscaralumno = new javax.swing.JTextField();
        btnbuscaralumno = new javax.swing.JButton();
        btnAlumnoNuevo = new javax.swing.JButton();
        panel_cursos = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        btncurso = new javax.swing.JButton();
        panel_matricula = new javax.swing.JPanel();
        btnestadomatricula = new javax.swing.JButton();
        txtmatricula = new javax.swing.JTextField();
        panel_especialidades = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtespecialidad = new javax.swing.JTextField();
        btnguardarespecialidad = new javax.swing.JButton();
        panel_ayuda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(246, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Inicio", panel_inicio);

        btnbuscardocente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnbuscardocente.setText("Buscar Docente");
        btnbuscardocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscardocenteActionPerformed(evt);
            }
        });

        txtbuscaDocente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnDocenteNuevo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDocenteNuevo.setText("Ingresar nuevo Docente");
        btnDocenteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocenteNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_docentesLayout = new javax.swing.GroupLayout(panel_docentes);
        panel_docentes.setLayout(panel_docentesLayout);
        panel_docentesLayout.setHorizontalGroup(
            panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_docentesLayout.createSequentialGroup()
                .addGroup(panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_docentesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDocenteNuevo))
                    .addGroup(panel_docentesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtbuscaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(btnbuscardocente)))
                .addGap(94, 94, 94))
        );
        panel_docentesLayout.setVerticalGroup(
            panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_docentesLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscardocente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(btnDocenteNuevo)
                .addGap(94, 94, 94))
        );

        tabbedPaneAdministrador.addTab("Docentes", panel_docentes);

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
                .addGroup(panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_alumnosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlumnoNuevo))
                    .addGroup(panel_alumnosLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(txtbuscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btnbuscaralumno)))
                .addGap(98, 98, 98))
        );
        panel_alumnosLayout.setVerticalGroup(
            panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alumnosLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtbuscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscaralumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(btnAlumnoNuevo)
                .addGap(96, 96, 96))
        );

        tabbedPaneAdministrador.addTab("Alumnos", panel_alumnos);

        cursoss.add(jRadioButton1);
        jRadioButton1.setText("1 medio");

        cursoss.add(jRadioButton2);
        jRadioButton2.setText("2 medio");

        cursoss.add(jRadioButton3);
        jRadioButton3.setText("3 medio");

        cursoss.add(jRadioButton4);
        jRadioButton4.setText("4 medio");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione curso:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione Materias:");

        jCheckBox1.setText("Lenguaje");

        jCheckBox2.setText("Matemáticas");

        jCheckBox3.setText("Religión");

        jCheckBox4.setText("Historia");

        jCheckBox5.setText("Ingles");

        jCheckBox6.setText("Artes");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Fisica");

        jCheckBox8.setText("Quimica");

        jCheckBox9.setText("Biologia");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("Ed. Fisica");

        jCheckBox11.setText("Filosofía");

        jCheckBox12.setText("Consejo de Curso");

        btncurso.setText("Generar tabla");
        btncurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_cursosLayout = new javax.swing.GroupLayout(panel_cursos);
        panel_cursos.setLayout(panel_cursosLayout);
        panel_cursosLayout.setHorizontalGroup(
            panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cursosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panel_cursosLayout.createSequentialGroup()
                        .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox7))
                        .addGap(33, 33, 33)
                        .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox10)))
                    .addComponent(jCheckBox9)
                    .addGroup(panel_cursosLayout.createSequentialGroup()
                        .addComponent(jCheckBox11)
                        .addGap(37, 37, 37)
                        .addComponent(jCheckBox12)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cursosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncurso)
                .addGap(238, 238, 238))
        );
        panel_cursosLayout.setVerticalGroup(
            panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cursosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jRadioButton2)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jRadioButton3)
                    .addComponent(jCheckBox10))
                .addGap(18, 18, 18)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox7)
                        .addComponent(jCheckBox8)))
                .addGap(18, 18, 18)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox6))
                .addGap(18, 18, 18)
                .addGroup(panel_cursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12))
                .addGap(76, 76, 76)
                .addComponent(btncurso)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Curso", panel_cursos);

        btnestadomatricula.setText("Ver estado de Matricula");
        btnestadomatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadomatriculaActionPerformed(evt);
            }
        });

        txtmatricula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtmatricula.setText("jTextField3");

        javax.swing.GroupLayout panel_matriculaLayout = new javax.swing.GroupLayout(panel_matricula);
        panel_matricula.setLayout(panel_matriculaLayout);
        panel_matriculaLayout.setHorizontalGroup(
            panel_matriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_matriculaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(btnestadomatricula)
                .addGap(92, 92, 92))
        );
        panel_matriculaLayout.setVerticalGroup(
            panel_matriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_matriculaLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(panel_matriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnestadomatricula))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Matricula", panel_matricula);

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
                .addContainerGap(242, Short.MAX_VALUE))
        );

        tabbedPaneAdministrador.addTab("Especialidades", panel_especialidades);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Bienvenidos a SYSTUDENT \n\nsistema de colegio con exclusividad en educación de\nenseñanza media.\n\ncontiene modulos para cada uno de los usuarios,\ncon sus actividades especificas que necesita \ncada uno de estos.");
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
                .addContainerGap(55, Short.MAX_VALUE))
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

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void btnDocenteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocenteNuevoActionPerformed
        dispose();
        ingresar_Docente mostrar = new ingresar_Docente();
        mostrar.setLocationRelativeTo(null);
        mostrar.setVisible(true);
        
        
    }//GEN-LAST:event_btnDocenteNuevoActionPerformed

    private void btnbuscaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaralumnoActionPerformed
       
        /*
        boton buscar un alumno por rut 
        en la base de datos       
        */
        
            String buscar_alumno = txtbuscaralumno.getText();
            
            ctr_alumno.BuscarAlumno(buscar_alumno);

            txtbuscaralumno.setText(null);
    }//GEN-LAST:event_btnbuscaralumnoActionPerformed

    private void btnAlumnoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoNuevoActionPerformed
        dispose();
        Ingresar_Alumno mostrar = new Ingresar_Alumno();
        mostrar.setLocationRelativeTo(null);
        mostrar.setVisible(true);
        
    }//GEN-LAST:event_btnAlumnoNuevoActionPerformed

    private void btncursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncursoActionPerformed
        
        dispose();
        Tabla_Curso mostrar = new Tabla_Curso();
        mostrar.setLocationRelativeTo(null);
        mostrar.setVisible(true);        
        
    }//GEN-LAST:event_btncursoActionPerformed

    
    public void limpiarEspecialidad(){
        
        txtespecialidad.setText(null);
    }
    
    private void btnguardarespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarespecialidadActionPerformed
     try{
        //if(txtespecialidad.getText() != ""){
            
            //JOptionPane.showMessageDialog(null, "Campo Vacio");
            
        //}else{
            
        
        String nombre_especialidad = txtespecialidad.getText();
        
        //Especialidad especialidad = new Especialidad(
        //txtespecialidad.getText());
        //ctr_especialidad.Guardar_Datos(especialidad);
        
         JOptionPane.showMessageDialog(null,"guardado");
//        controlador.Ctrl_Especialidad(Ctrl_Especialidad)
        limpiarEspecialidad();
        //}
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
     }
        
    }//GEN-LAST:event_btnguardarespecialidadActionPerformed

     public void limpiarMatricula(){
        
        txtmatricula.setText(null);
    }
    private void btnestadomatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadomatriculaActionPerformed
       
//        String numero_matricula = txtmatricula.getText();
//        Matricula matricula = new Matricula(
//        txtmatricula.getText());
////        ctr_especialidad.Guardar_Datos(especialidad);

//         JOptionPane.showMessageDialog(null,"guardado");

        limpiarMatricula();

//     }catch(Exception e){
//         JOptionPane.showMessageDialog(null, e.getMessage());
//     }
        
        
        
        
        
    }//GEN-LAST:event_btnestadomatriculaActionPerformed

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
    private javax.swing.JButton btncurso;
    private javax.swing.JButton btnestadomatricula;
    private javax.swing.JButton btnguardarespecialidad;
    private javax.swing.ButtonGroup cursoss;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JPanel panel_alumnos;
    private javax.swing.JPanel panel_ayuda;
    private javax.swing.JPanel panel_cursos;
    private javax.swing.JPanel panel_docentes;
    private javax.swing.JPanel panel_especialidades;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_matricula;
    private javax.swing.JTabbedPane tabbedPaneAdministrador;
    private javax.swing.JTextField txtbuscaDocente;
    private javax.swing.JTextField txtbuscaralumno;
    private javax.swing.JTextField txtespecialidad;
    private javax.swing.JTextField txtmatricula;
    // End of variables declaration//GEN-END:variables
}
