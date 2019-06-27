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
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objeto.Profesor;

/**
 *
 * @author Darlyn
 * @Modificado The Law
 */
public class Ctrl_ingresar_Docente extends Conexion{

    ResultSet resultado = null;
    
    public Ctrl_ingresar_Docente() {
    }
    

    
    
    
    public void IngresarDocente(String rutdocente, String nombredocente, String apellidodocente, String nacimientodocente, String clavedocente, String direcciondocente, String contactodocente, int id){
        
        
        Conectar();
        
        try{
        
        String sql = "Insert into Profesor(rut_profesor, nombre_profesor, apellido_profesor, nacimiento_profesor, clave_profesor, "
                + "direccion_profesor, contacto_profesor, id_especialidad) values('"+rutdocente+"','"+nombredocente+"',"
                + "'"+apellidodocente+"','"+nacimientodocente+"','"+clavedocente+"','"+direcciondocente+"','"+contactodocente+"','"+id+"')";
        
        
        sentencia.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "Agregado con exito!");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
 
}
   
