/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author joako
 */
public class Consulta_IngresoNota extends Conexion{
    
    public void ingresoNotas(){
        Conectar();
        try{
            String sql = "Update Detalle_Curso set notas= ' ' ";
        }catch(Exception e){
            
        }
        
        
    }
}
