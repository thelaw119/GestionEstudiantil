package controlador;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joako
 */
public class Ctrl_Ingresar_Alumno extends Conexion {

    public Ctrl_Ingresar_Alumno() {
    }

    public void IngresarAlumno(String rutalumno, String nombrealumno,
            String apellidoalumno, String fechanacimiento, String clave,
            String rutapoderado, String nombreapoderado, String parentesco,
            int contacto, String direccion) {

        Conectar();

        try {

            String sql = "Insert into Alumno(rut_alumno, nombre_alumno, apellido_alumno, "
                    + "nacimiento_alumno, clave_alumno,rut_apoderado, nombre_apoderado, "
                    + "parentesco_apoderado , contacto_apoderado,direccion_apoderado) values"
                    + "('" + rutalumno + "','" + nombrealumno + "','" + apellidoalumno + "',"
                    + "'" + fechanacimiento + "','" + clave + "','" + rutapoderado + "',"
                    + "'" + nombreapoderado + "','" + parentesco + "','" + contacto + "',"
                    + "'" + direccion + "')";

            sentencia.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Agregado con exito!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void IngresarMatricula(String estadoMatricula,String fecha
    ,String rutalumno){
        Conectar();
        try{
            String sql = "INSERT INTO Matricula(estado_matricula,rut_alumno,fecha_matricula)values"
                    + "('"+estadoMatricula+"','"+rutalumno+"','"+fecha+"')";
            
            sentencia.executeUpdate(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
