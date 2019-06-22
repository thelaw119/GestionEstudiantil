/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author The Law
 */
public class DB {
    
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    String driver = "org.sqlite.JDBC";
    String nombredb = "Gestion_Estudiantil.sqlite";
    String url = "jdbc:sqlite:"+nombredb;
    
    
    public void crearBD(){
        
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e.getLocalizedMessage());
        }
        System.out.println("DB Creada con exito!");
    }
    
}
