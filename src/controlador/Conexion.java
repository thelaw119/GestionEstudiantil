/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author The Law
 */
public class Conexion {
    
    Connection conexion = null;
    Statement sentencia = null;
    
    public String rutaDB; 
    
    public Conexion(){
        rutaDB = "C:\\Users\\The Law\\Documents\\NetBeansProjects\\GestionEstudiantil\\Gestion_Estudiantil.s3db";
    }
    
    public void Conectar(){
        
        try{
            Class.forName("org.sqlite.JDBC");
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
            try{
                conexion = DriverManager.getConnection("jdbc:sqlite:"+rutaDB);
                sentencia = conexion.createStatement();
                JOptionPane.showMessageDialog(null, "Conectado");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
    
}
