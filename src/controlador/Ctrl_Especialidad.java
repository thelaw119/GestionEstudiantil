package controlador;

import objeto.Especialidad;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Darlyn
 */
public class Ctrl_Especialidad extends Conexion {

    public Ctrl_Especialidad() {
    }

    public boolean Insertar(String SQL) {
        boolean valor = true;
        Conectar();
        try {
            sentencia.executeUpdate(SQL);
            
        }catch(SQLException e){
                valor =false;
                JOptionPane.showMessageDialog(null,e.getMessage());
        }finally{
            try{
                sentencia.close();
                conexion.close();
            }catch(SQLException i){
                JOptionPane.showMessageDialog(null, i.getMessage());
            }
        }
        return valor;
    }

    public void Guardar_Datos(Especialidad especialidad) {
//        Especialidad mostrar = new Especialidad();

        Insertar("insert into ESPECIALIDAD values('"+
                especialidad.getNombre_Especialidad()+"')");
                
              
    }

}
