
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
            String sql = "SELECT Alumno.rut_alumno , Alumno.nombre_alumno ,Alumno.apellido_alumno"
                    + " Alumno.nacimiento_alumno , Alumno.rut_apoderado ,Alumno.nombre_apoderado"
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
            tbtModificarAlumn.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (Exception e) {

        }

    }

    public void ModificarAlumn(String Modrut, String Modnombre, String Modapellido,
            String Modfecnac, String Modruta, String ModnomA, String ModparenA, int ModconA,
            String Moddir) {

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

        try {
            String sql = "UPDATE Matricula SET estado_matricula ='"+ModestaM+"',fecha_matricula='"+ModFecM+"'"
                    + " WHERE rut_alumno='"+Modrut+"'";

            sentencia.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Modificado con exito");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
