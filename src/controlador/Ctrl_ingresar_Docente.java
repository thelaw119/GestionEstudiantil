/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objeto.Profesor;

/**
 *
 * @author Darlyn
 * @Modificado The Law
 */
public class Ctrl_ingresar_Docente extends Conexion{

    ResultSet resultado = null;
    
    public Ctrl_ingresar_Docente() {
    }
    

    
    
    
    public void IngresarDocente(String rutdocente, String nombredocente, String apellidodocente, String nacimientodocente, String clavedocente, String direcciondocente, String contactodocente, int id){
        
        
        Conectar();
        
        try{
        
        String sql = "Insert into Profesor(rut_profesor, nombre_profesor, apellido_profesor, nacimiento_profesor, clave_profesor, "
                + "direccion_profesor, contacto_profesor, id_especialidad) values('"+rutdocente+"','"+nombredocente+"',"
                + "'"+apellidodocente+"','"+nacimientodocente+"','"+clavedocente+"','"+direcciondocente+"','"+contactodocente+"','"+id+"')";
        
        
        sentencia.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "Agregado con exito!");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
 
}
   
