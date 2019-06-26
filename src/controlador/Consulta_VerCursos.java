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
public class Consulta_VerCursos extends Conexion{
    
     public void VerCursos(JTable tbtVerCurso,String rut_profe) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Aula"); //agrega columnas
        modelo.addColumn("Grado");
        
        String[] datos = new String[2]; // arreglo para recorrer la tabla
        tbtVerCurso.setModel(modelo);
        ResultSet resultado = null;

        Conectar();
        try {
            String sql = "SELECT Detalle_Curso.aula , Detalle_Curso.grado FROM Detalle_Curso"
                       + " JOIN Profesor"
                       + " ON Detalle_Curso.rut_profesor = Profesor.rut_profesor"
                       + " WHERE Profesor.rut_profesor = '"+ rut_profe +"'";

            resultado = sentencia.executeQuery(sql);
                                                                                
            while (resultado.next()) {
                datos[0] = resultado.getString("aula");
                datos[1] = resultado.getString("grado");
                
                modelo.addRow(datos);
            }
            tbtVerCurso.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }
}
