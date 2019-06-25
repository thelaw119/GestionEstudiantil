/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import objeto.Profesor;

/**
 *
 * @author Darlyn
 */
public class Ctrl_ingresar_Docente extends Conexion{

    public Ctrl_ingresar_Docente() {
    }
    
    public boolean Insertar(String SQL) {
        boolean valor = true;
        Conectar();
        try {
            sentencia.executeUpdate(SQL);
            
        }catch(SQLException e){
                valor =false;
                JOptionPane.showMessageDialog(null,e.getMessage());
        }finally{
            try{
                sentencia.close();
                conexion.close();
            }catch(SQLException i){
                JOptionPane.showMessageDialog(null, i.getMessage());
            }
        }
        return valor;
    }

    public void Guardar_Datos(Profesor docente) {
//      Especialidad mostrar = new Especialidad();

        Insertar("insert into Profesor(rut_profesor,nombre_profesor,"
                + "apellido_profesor,nacimiento_profesor,clave_profesor,"
                + "direccion_profesor,contacto_profesor,id_especialidad) "
                + "values('"+ docente.getRut_profesor()+"'"
                        + "'"+ docente.getNombre_profesor()+"'"
                        + "'"+ docente.getApellido_profesor()+"'"
                        + "'"+ docente.getNacimiento_profesor()+"'"
                        + "'"+ docente.getClave_profesor()+"'"
                        + "'"+ docente.getDireccion_profesor()+"'"
                        + "'"+ docente.getContacto_profesor()+"'"
                        + "'"+ docente.getId_especialidad()+"')");
                
              
    }

}
   
