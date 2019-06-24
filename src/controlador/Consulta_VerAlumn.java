/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author joako
 */
public class Consulta_VerAlumn extends Conexion {

    public Consulta_VerAlumn() {
        
    }
 
    public void VerAlumn(JTable tbtVerAlumn, String grado) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre"); //agrega columnas
        modelo.addColumn("Apellido");
        modelo.addColumn("Rut");
        modelo.addColumn("Matricula");
        
        String[] datos = new String[4]; // arreglo para recorrer la tabla
        tbtVerAlumn.setModel(modelo);
        ResultSet resultado = null;

        Conectar();
        try {
            String sql = "SELECT Alumno.nombre_alumno , Alumno.apellido_alumno , Alumno.rut_alumno , Matricula.estado_matricula"
                    + " FROM Alumno "
                    + " JOIN Matricula "
                    + " ON Alumno.rut_alumno = Matricula.rut_alumno"
                    + " JOIN Detalle_Curso "
                    + " ON Alumno.rut_alumno = Detalle_Curso.rut_alumno"
                    + " WHERE Detalle_Curso.grado = '" + grado +"'";

            resultado = sentencia.executeQuery(sql);

            while (resultado.next()) {
                datos[0] = resultado.getString("nombre_alumno");
                datos[1] = resultado.getString("apellido_alumno");
                datos[2] = resultado.getString("rut_alumno");
                datos[3] = resultado.getString("estado_matricula");
               

                modelo.addRow(datos);
            }
            
            //JOptionPane.showMessageDialog(null, datos);
            tbtVerAlumn.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }

}
