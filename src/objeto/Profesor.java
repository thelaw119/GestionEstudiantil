
package objeto;

/**
 *
 * @author The Law
 */
public class Profesor {
    
    private String rut_profesor;
    private String nombre_profesor;
    private String apellido_profesor;
    private String nacimiento_profesor;
    private String clave_profesor;
    private String direccion_profesor;
    private String contacto_profesor;
    private int id_especialidad;

    public Profesor(String rut_profesor, String nombre_profesor, String apellido_profesor, String nacimiento_profesor, String clave_profesor, String direccion_profesor, String contacto_profesor, int id_especialidad) {
        this.rut_profesor = rut_profesor;
        this.nombre_profesor = nombre_profesor;
        this.apellido_profesor = apellido_profesor;
        this.nacimiento_profesor = nacimiento_profesor;
        this.clave_profesor = clave_profesor;
        this.direccion_profesor = direccion_profesor;
        this.contacto_profesor = contacto_profesor;
        this.id_especialidad = id_especialidad;
    }

    public String getRut_profesor() {
        return rut_profesor;
    }

    public void setRut_profesor(String rut_profesor) {
        this.rut_profesor = rut_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getApellido_profesor() {
        return apellido_profesor;
    }

    public void setApellido_profesor(String apellido_profesor) {
        this.apellido_profesor = apellido_profesor;
    }

    public String getNacimiento_profesor() {
        return nacimiento_profesor;
    }

    public void setNacimiento_profesor(String nacimiento_profesor) {
        this.nacimiento_profesor = nacimiento_profesor;
    }

    public String getClave_profesor() {
        return clave_profesor;
    }

    public void setClave_profesor(String clave_profesor) {
        this.clave_profesor = clave_profesor;
    }

    public String getDireccion_profesor() {
        return direccion_profesor;
    }

    public void setDireccion_profesor(String direccion_profesor) {
        this.direccion_profesor = direccion_profesor;
    }

    public String getContacto_profesor() {
        return contacto_profesor;
    }

    public void setContacto_profesor(String contacto_profesor) {
        this.contacto_profesor = contacto_profesor;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }
    
    
    
}
