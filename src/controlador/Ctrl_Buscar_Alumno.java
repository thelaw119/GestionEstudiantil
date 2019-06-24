/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import objeto.Alumno;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Darlyn
 */
public class Ctrl_Buscar_Alumno extends Conexion{

    public Ctrl_Buscar_Alumno() {
    }
        
    public void BuscarAlumno(String buscar_alumno){
        
    ResultSet resultado = null;
    Conectar();
        try {
            String sql = "SELECT Alumno.nombre_alumno , Alumno.apellido_alumno , "
                    + "Alumno.rut_alumno , Matricula.estado_matricula"
                    + " FROM Alumno "
                    + " JOIN Matricula "
                    + " ON Alumno.rut_alumno = Matricula.rut_alumno"
                    + " Where Alumno.rut_alumno =  '" + buscar_alumno +"'";
             
            
            
            String[] datos = new String[4];
            resultado = sentencia.executeQuery(sql);
            
            
            while (resultado.next()) {
                datos[0] = resultado.getString("nombre_alumno");
                datos[1] = resultado.getString("apellido_alumno");
                datos[2] = resultado.getString("rut_alumno");
                datos[3] = resultado.getString("estado_matricula");
               

                //modelo.addRow(datos);
            }
          
            /*Consulta si el rut ingresado existe en la DB
            * datos[2] este vector trae el rut del Alumno
            */
            if(datos[2] == null){ 
                JOptionPane.showMessageDialog(null, "No Se ha encontrado");
            }else{
            
            JOptionPane.showMessageDialog(null, datos);
            //tbtVerAlumn.setModel(modelo);
            sentencia.close();
            conexion.close();
 }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    
    }
}
 
