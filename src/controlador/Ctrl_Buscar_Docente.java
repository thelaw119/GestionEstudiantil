/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Darlyn
 */
public class Ctrl_Buscar_Docente extends Conexion {

    public Ctrl_Buscar_Docente() {
    }

    public void BuscarDocente(String buscar_docente) {

        ResultSet resultado = null;
        Conectar();
        try {
        String sql = "select Profesor.nombre_profesor, Profesor.apellido_profesor,"
                    + "Profesor.rut_profesor, Especialidad.nombre_especialidad"
                    + " from Profesor "
                    + " inner join Especialidad "
                    + " on Profesor.id_especialidad = Especialidad.id_especialidad"
                    + " where rut_profesor =  '" + buscar_docente + "'";

            String[] datos = new String[4];
            resultado = sentencia.executeQuery(sql);

            while (resultado.next()) {
                datos[0] = resultado.getString("nombre_profesor");
                datos[1] = resultado.getString("apellido_profesor");
                datos[2] = resultado.getString("rut_profesor");
                datos[3] = resultado.getString("nombre_especialidad");}
            
            
            /*Consulta si el rut ingresado existe en la DB
            * datos[2] este vector trae el rut del Docente
            */
            if(datos[2] == null){ 
                JOptionPane.showMessageDialog(null, "No Se ha encontrado");
            }else{
            
            JOptionPane.showMessageDialog(null, datos);
            
            sentencia.close();
            conexion.close();
 }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }
}
