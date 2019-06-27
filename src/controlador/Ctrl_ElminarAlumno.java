
package controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author joako
 */
public class Ctrl_ElminarAlumno extends Conexion {

    public Ctrl_ElminarAlumno() {

    }

    public void EliminarAlumno(String rutAlumno) {

        Conectar();
        try {

            String sql = "DELETE FROM Alumno "
                    + "WHERE rut_alumno = '" + rutAlumno + "'";

            sentencia.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Agregado con exito!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void EliminarMatricula(String rutAlumno) {
        Conectar();
        try {

            String sql = "DELETE FROM Matricula "
                    + "WHERE rut_alumno = '" + rutAlumno + "'";

            sentencia.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Agregado con exito!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
