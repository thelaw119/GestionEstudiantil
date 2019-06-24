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

    public void VerAlumn(JTable tbtVerAlumn) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre"); //agrega columnas
        modelo.addColumn("Apellido");
        modelo.addColumn("Rut");
       
        String[] datos = new String[3]; // arreglo para recorrer la tabla
        tbtVerAlumn.setModel(modelo);
        ResultSet resultado = null;

        Conectar();
        try {
            String sql = "Select * from Alumno";

            resultado = sentencia.executeQuery(sql);

            while (resultado.next()) {
                datos[0] = resultado.getString("nombre_alumno");
                datos[1] = resultado.getString("apellido_alumno");
                datos[2] = resultado.getString("rut_alumno");
               

                modelo.addColumn(datos);
            }
            tbtVerAlumn.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }

}
