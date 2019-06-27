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
        
    public void BuscarAlumno(String buscar_alumno){
        
    ResultSet resultado = null;
    Conectar();
        try {
            String sql = "SELECT Alumno.nombre_alumno , Alumno.apellido_alumno , "
                    + "Alumno.rut_alumno , Matricula.estado_matricula"
                    + " FROM Alumno "
                    + " JOIN Matricula "
                    + " ON Alumno.rut_alumno = Matricula.rut_alumno"
                    + " Where Alumno.rut_alumno =  '" + buscar_alumno +"'";
             
            
            
            String[] datos = new String[4];
            resultado = sentencia.executeQuery(sql);
            
            
            while (resultado.next()) {
                datos[0] = resultado.getString("nombre_alumno");
                datos[1] = resultado.getString("apellido_alumno");
                datos[2] = resultado.getString("rut_alumno");
                datos[3] = resultado.getString("estado_matricula");
               

                //modelo.addRow(datos);
            }
          
            /*Consulta si el rut ingresado existe en la DB
            * datos[2] este vector trae el rut del Alumno
            */
            if(datos[2] == null){ 
                JOptionPane.showMessageDialog(null, "No Se ha encontrado");
            }else{
            
            JOptionPane.showMessageDialog(null, datos);
            //tbtVerAlumn.setModel(modelo);
            sentencia.close();
            conexion.close();
 }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    
    }
}
 
