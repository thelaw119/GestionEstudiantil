package controlador;

import javax.swing.JOptionPane;
  
/**
 *
 * @author joako
 * @Modificado The Law
 */
public class Consulta_IngresoNota extends Conexion{
    
    public void IngresarDocente(String rutprofesor, String rutalumno, double notafinal){
        
     
        Conectar();
        
        try{
        
        String sql = "Insert into nota(final_nota, rut_alumno, rut_profesor) "
                + "values('"+notafinal+"','"+rutalumno+"',"
                + "'"+rutprofesor+"')";
        
        
        sentencia.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "Ingresado con exito!");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
