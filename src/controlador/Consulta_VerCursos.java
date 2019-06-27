
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
