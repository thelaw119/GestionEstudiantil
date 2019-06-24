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
    
//    public boolean Buscar(String SQL) {
//        boolean valor = true;
//        
//        Conectar();
//        try {
//            sentencia.executeUpdate(SQL);
//            
//        }catch(SQLException e){
//                valor =false;
//                JOptionPane.showMessageDialog(null,e.getMessage());
//                
//        }finally{
//            try{
//                sentencia.close();
//                conexion.close();
//            }catch(SQLException i){
//                JOptionPane.showMessageDialog(null, i.getMessage());
//            }
//        }
//        return valor;
//    }
    
//    public void Buscar_Alumno(Alumno alumno){
//        
//        Buscar("select * from Alumno where rut_alumno='"+
//                alumno.getRut_alumno() +"'");
//        
//    }
    
    public void BuscarAlumno(String buscar_alumno){
        
    ResultSet resultado = null;
    Conectar();
        try {
            String sql = "Select * from Alumno where rut_alumno = '" + buscar_alumno + "'";
            
            String[] datos = new String[3];
            resultado = sentencia.executeQuery(sql);

            while (resultado.next()) {
                datos[0] = resultado.getString("nombre_alumno");
                datos[1] = resultado.getString("apellido_alumno");
                datos[2] = resultado.getString("rut_alumno");
                //datos[3] = resultado.getString("estado_matricula");
               

                //modelo.addRow(datos);
            }
            
            JOptionPane.showMessageDialog(null, datos);
            //tbtVerAlumn.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    
    }
}
 
