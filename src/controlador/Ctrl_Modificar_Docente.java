/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author kimbe
 */
public class Ctrl_Modificar_Docente extends Conexion{

    public Ctrl_Modificar_Docente() {
    }
    
    public void DatosDocente(JTable tbtModificaDocente) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Rut"); //agrega columnas
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Direccion");
        modelo.addColumn("Contacto");
        modelo.addColumn("Especialidad");

        String[] datos = new String[8]; // arreglo para recorrer la tabla
        tbtModificaDocente.setModel(modelo);
        ResultSet resultado = null;
 
        Conectar();   
    
    try {
            String sql = "SELECT * from Profesor";

            resultado = sentencia.executeQuery(sql);
            
 while (resultado.next()) {
                datos[0] = resultado.getString("rut_profesor");
                datos[1] = resultado.getString("nombre_profesor");
                datos[2] = resultado.getString("apellido_profesor");
                datos[3] = resultado.getString("nacimiento_profesor");
                datos[4] = resultado.getString("clave_profesor");
                datos[5] = resultado.getString("direccion_profesor");
                datos[6] = resultado.getString("contacto_profesor");
                datos[7] = resultado.getString("id_especialidad");

                modelo.addRow(datos);
            }
 tbtModificaDocente.setModel(modelo);
            sentencia.close();
            conexion.close();

        } catch (Exception e) {

        }

    }
public void ModificarDocente(String Modrut, String Modnombre, String Modapellido,
            String Modfecnac, String Modclave, String Moddirec, int Modcont,
            int Modespe)       {
        
        Conectar();
        try {
            String sql = "UPDATE Profesor Set nombre_profesor ='" + Modnombre + "',apellido_profesor = '" + Modapellido + "'"
                    + " , nacimiento_profesor = '" + Modfecnac + "', clave_profesor='" + Modclave + "',direccion_profesor='" + Moddirec + "'"
                    + " , contacto_profesor = '" + Modcont + "',id_especialidad = '" + Modespe + "'"
                    + " WHERE rut_profesor='" + Modrut + "'";
            
sentencia.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Modificado con exito");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    }
