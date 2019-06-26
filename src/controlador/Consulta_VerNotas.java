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
public class Consulta_VerNotas extends Conexion {

    public Consulta_VerNotas() {

    }

    public void VerNotas(JTable tbtVerNotas, String rut) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Asignatura"); //agrega columnas
        modelo.addColumn("Nota");

        String[] datos = new String[2]; // arreglo para recorrer la tabla
        tbtVerNotas.setModel(modelo);
        ResultSet resultado = null;

        Conectar();
        try {
            String sql = "SELECT notas , nombre_especialidad FROM Especialidad"
                    + " JOIN Profesor "
                    + " ON Especialidad.id_especialidad = Profesor.id_especialidad "
                    + " JOIN Detalle_Curso"
                    + " ON Profesor.rut_profesor = Detalle_curso.rut_profesor"
                    + " JOIN Alumno "
                    + " ON Detalle_Curso.rut_alumno = Alumno.rut_alumno"
                    + " WHERE Alumno.rut_alumno = '"+ rut +"'";

            resultado = sentencia.executeQuery(sql);

            while (resultado.next()) {
                datos[0] = resultado.getString("nombre_especialidad");
                datos[1] = resultado.getString("notas");

                modelo.addRow(datos);
            }

            tbtVerNotas.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }

}
