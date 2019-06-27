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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joako
 */
public class Consulta_VerCursos extends Conexion{
    
     public void VerCursos(JTable tbtVerCurso,String rut_profe) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Aula"); //agrega columnas
        modelo.addColumn("Grado");
        
        String[] datos = new String[2]; // arreglo para recorrer la tabla
        tbtVerCurso.setModel(modelo);
        ResultSet resultado = null;

        Conectar();
        try {
            String sql = "SELECT Detalle_Curso.aula, Detalle_Curso.grado FROM Detalle_Curso"
                       + " JOIN Profesor"
                       + " ON Detalle_Curso.rut_profesor = Profesor.rut_profesor"
                       + " WHERE Profesor.rut_profesor = '"+ rut_profe +"'";

            resultado = sentencia.executeQuery(sql);
            
            int contador = 0;
            
            
            while (resultado.next()) {
                
                contador = contador + 1;
                datos[0] = resultado.getString("aula");
                datos[1] = resultado.getString("grado");
                
                modelo.addRow(datos);
            }
            
            if(contador == 1){
               
                JOptionPane.showMessageDialog(null, "Encontrado con exito!");
                //JOptionPane.showMessageDialog(null, "Bienvenido:" + nombre_admin + "  " + "Rut: " + rut_admin);
                tbtVerCurso.setModel(modelo);
                sentencia.close();
                conexion.close();
                
   
           }else if(contador > 1){
               //JOptionPane.showMessageDialog(null, "Rut Profesor DUPLICADO!");
           }else{
               JOptionPane.showMessageDialog(null, "Rut No se encuentra en la DB");
           }
            
            
//            tbtVerCurso.setModel(modelo);
//            sentencia.close();
//            conexion.close();

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }
}
