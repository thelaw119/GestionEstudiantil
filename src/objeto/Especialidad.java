 
package objeto;

/**
 *
 * @author kimbe
 * @Modificado The Law
 */
public class Especialidad {
    
    private int id_Especialidad;
    private String nombre_Especialidad;
    
    

    public Especialidad(int id_Especialidad, String nombre_Especialidad) {
        this.id_Especialidad = id_Especialidad;
        this.nombre_Especialidad = nombre_Especialidad;
        
    }

    
    
    public int getId_Especialidad() {
        return id_Especialidad;
    }

    public void setId_Especialidad(int id_Especialidad) {
        this.id_Especialidad = id_Especialidad;
    }
    
    
    public String getNombre_Especialidad() {
        return nombre_Especialidad;
    }

    public void setNombre_Especialidad(String nombre_Especialidad) {
        this.nombre_Especialidad = nombre_Especialidad;
    }
    
    
    @Override
    public String toString() {
        return id_Especialidad + ". " + nombre_Especialidad;
    }
    
    
    
    
}
