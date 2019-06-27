/* API SISTEMA COLEGIO.
 *
 * 
 *
 * Codigo Basado en Pedro Gatica , Kimberly Soazo , Joaquin Valenzuela 
 *
 * 
 *
 * Este programa es software libre; Puedes redistribuirlo y / o modificarlo.
 * bajo los términos de la Licencia Pública General de GNU tal como fue publicada por
 * la Fundación de Software Libre; ya sea la versión 2 de la Licencia, o
 * (a su elección) cualquier versión posterior.
 *
 * ------------------------------------------------- ----------------------------
 * Copyright (c) 2019,Pedro Gatica , Joaquin Valenzuela,Kimberly Soazo
 * Todos los derechos reservados.
 *
 * CONDICIONES DE LA LICENCIA
 *
 * La distribución gratuita y el uso de este software tanto en origen como en binario.
 * Se permite el formulario (con o sin cambios) siempre que:
 *
 * 1. Las distribuciones de este código fuente incluyen el copyright anterior.
 * Aviso, esta lista de condiciones y el siguiente descargo de responsabilidad;
 *
 * 2. Las distribuciones en formato binario incluyen el copyright anterior.
 * Aviso, esta lista de condiciones y el siguiente aviso legal.
 * en la documentación y / u otros materiales asociados;
 *
 * 3. el nombre de los titulares de los derechos de autor no se utiliza para promocionar productos
 * construido utilizando este software sin permiso escrito específico.
 *
 * ALTERNATIVAMENTE, siempre que este aviso se mantenga en su totalidad, este producto
 * se puede distribuir según los términos de la Licencia Pública General de GNU (GPL),
 * en cuyo caso, las disposiciones de la GPL se aplican EN LUGAR DE las mencionadas anteriormente.
 *
 * DESCARGO DE RESPONSABILIDAD
 *
 * Este software se proporciona "tal cual" sin garantías explícitas ni implícitas
 * con respecto a sus propiedades, incluida, entre otras, la corrección
 * y / o aptitud para el propósito.
 * ------------------------------------------------- ----------------------------
 * /

*/

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
