/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author The Law
 */
public class Ctrl_login extends Conexion{
    
    public Ctrl_login(){
        
    }
    
    public boolean insertar(String sql){
        boolean valor = true;
        Conectar();
        try {
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
                valor = false;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }      
        finally{  
            try{    
                 sentencia.close();  
                 conexion.close();  
             }catch (Exception e){                 
                 e.printStackTrace();  
             }  
        }
        return valor;
    }
    
}
