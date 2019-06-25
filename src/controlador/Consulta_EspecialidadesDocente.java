/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;

/**
 *
 * @author Darlyn
 */
public class Consulta_EspecialidadesDocente extends Conexion{

    public Consulta_EspecialidadesDocente() {
    }
    
    public void BuscarDocente(String buscar_docente) {

        ResultSet resultado = null;
        Conectar();
        
        try{
            
          String sql = "select * from Especialidad" ; 
            
//          String[] datos = new String;
          
          resultado = sentencia.executeQuery(sql);
            
        }catch(Exception e){
            
        }
    
    
}
}