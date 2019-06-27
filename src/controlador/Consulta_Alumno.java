/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.istack.internal.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
//import javaapplication6.Panel_IngresoNotas;
import vista.Panel_Profesor;
import objeto.Alumno;

/**
 *
 * @author Darlyn
 * @Modificado The law
 */
public class Consulta_Alumno extends Conexion{
    ResultSet resultado = null;

    
    public void BuscarAlumno(JComboBox cbalumno) {
        
        Conectar();
        
        String sql = "select rut_alumno, nombre_alumno from Alumno"; 
        
        try{
            
            resultado  = sentencia.executeQuery(sql);
            
            cbalumno.addItem("Seleccione un ALumno");
            

            
            while(resultado.next()){

                cbalumno.addItem(
                new Alumno(resultado.getString("rut_alumno"), resultado.getString("nombre_alumno")));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            if (conexion!=null){
                try{
                    conexion.close();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }
        

    
    
}
}