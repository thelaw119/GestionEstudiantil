package controlador;

import com.sun.istack.internal.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import vista.ingresar_Docente;
import objeto.Especialidad;
      
/**
 *
 * @author Darlyn
 * @Modificado The Law
 */
public class Consulta_EspecialidadesDocente extends Conexion{
    ResultSet resultado = null;

    
    public void BuscarEspecialidad(JComboBox cbespecialidad) {
        
        Conectar();
        
        String sql = "select id_especialidad, nombre_especialidad from Especialidad"; 
        
        try{
            
            resultado  = sentencia.executeQuery(sql);
            
            cbespecialidad.addItem("Seleccione una especialidad");
            
            
            while(resultado.next()){

                cbespecialidad.addItem(
                new Especialidad(Integer.parseInt(resultado.getString("id_especialidad")),
                resultado.getString("nombre_especialidad")));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            if (conexion!=null){
                try{
                    conexion.close();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }
        

    
    
}
}