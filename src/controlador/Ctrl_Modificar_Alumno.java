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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joako
 */
public class Ctrl_Modificar_Alumno extends Conexion {

    public Ctrl_Modificar_Alumno() {

    }

    public void DatosAlumn(JTable tbtModificarAlumn) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Rut"); //agrega columnas
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Rut Apoderado");
        modelo.addColumn("Nombre Apoderado");
        modelo.addColumn("Parentesco");
        modelo.addColumn("Contacto");
        modelo.addColumn("Direccion");
        modelo.addColumn("Est. Matricula");
        modelo.addColumn("Fecha Matricula");

        String[] datos = new String[11]; // arreglo para recorrer la tabla
        tbtModificarAlumn.setModel(modelo);
        ResultSet resultado = null;
 
        Conectar();
        try {
            String sql = "SELECT Alumno.rut_alumno , Alumno.nombre_alumno ,Alumno.apellido_alumno,"
                    + " Alumno.nacimiento_alumno , Alumno.rut_apoderado ,Alumno.nombre_apoderado, "
                    + " Alumno.parentesco_apoderado ,Alumno.contacto_apoderado,Alumno.direccion_apoderado,"
                    + " Matricula.estado_matricula,Matricula.fecha_matricula FROM Alumno"
                    + " JOIN Matricula "
                    + " ON Alumno.rut_alumno = Matricula.rut_alumno";

            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString("rut_alumno");
                datos[1] = resultado.getString("nombre_alumno");
                datos[2] = resultado.getString("apellido_alumno");
                datos[3] = resultado.getString("nacimiento_alumno");
                datos[4] = resultado.getString("rut_apoderado");
                datos[5] = resultado.getString("nombre_apoderado");
                datos[6] = resultado.getString("parentesco_apoderado");
                datos[7] = resultado.getString("contacto_apoderado");
                datos[8] = resultado.getString("direccion_apoderado");
                datos[9] = resultado.getString("estado_matricula");
                datos[10] = resultado.getString("fecha_matricula");

                modelo.addRow(datos);
            }
            //System.out.println(datos[0]);
            tbtModificarAlumn.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (Exception e) {

        }

    }

    public void ModificarAlumn(String Modrut, String Modnombre, String Modapellido,
            String Modfecnac, String Modruta, String ModnomA, String ModparenA, int ModconA,
            String Moddir) {
        
        Conectar();
        try {
            String sql = "UPDATE Alumno Set nombre_alumno ='" + Modnombre + "',apellido_alumno = '" + Modapellido + "'"
                    + " , nacimiento_alumno = '" + Modfecnac + "', rut_apoderado='" + Modruta + "',nombre_apoderado='" + ModnomA + "'"
                    + " , parentesco_apoderado = '" + ModparenA + "',contacto_apoderado = '" + ModconA + "',"
                    + "direccion_apoderado ='" + Moddir + "' "
                    + " WHERE rut_alumno='" + Modrut + "'";

            sentencia.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Modificado con exito");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void ModificarMatricula(String Modrut,String ModestaM,String ModFecM) {
    Conectar();
        try {
            String sql = "UPDATE Matricula SET estado_matricula ='"+ModestaM+"',fecha_matricula='"+ModFecM+"'"
                    + " WHERE rut_alumno='"+Modrut+"'";

            sentencia.executeUpdate(sql);
//            sentencia.close();
//            conexion.close();
            JOptionPane.showMessageDialog(null, "Modificado con exito");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
