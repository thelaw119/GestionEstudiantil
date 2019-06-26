package controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author joako
 * @Modificado The Law
 */
public class Consulta_IngresoNota extends Conexion{
    
    public void IngresarDocente(String rutprofesor, String rutalumno, String aula, double notafinal){
        
     
        Conectar();
        
        try{
        
        String sql = "Insert into Detalle_Curso(aula, notas, rut_profesor, rut_alumno) "
                + "values('"+aula+"','"+notafinal+"',"
                + "'"+rutprofesor+"','"+rutalumno+"')";
        
        
        sentencia.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "Ingresado con exito!");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
