/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

/**
 *
 * @author joako
 * @version
 */
public class Alumno {
     private String rut_alumno ;
     private String nombre_alumno;
     private String apellido_alumno;
     private String nacimiento_alumno;
     private String clave_alumno;
     private String rut_apoderado;
     private String parentesco_apoderado;
     private String contacto_apoderado;
     private String direccion_apoderado;

    public Alumno() {
    }

     
     
    public Alumno(String rut_alumno, String nombre_alumno, String apellido_alumno,
            String nacimiento_alumno, String clave_alumno, String rut_apoderado, 
            
            String parentesco_apoderado, String contacto_apoderado, String direccion_apoderado) {
        this.rut_alumno = rut_alumno;
        this.nombre_alumno = nombre_alumno;
        this.apellido_alumno = apellido_alumno;
        this.nacimiento_alumno = nacimiento_alumno;
        this.clave_alumno = clave_alumno;
        this.rut_apoderado = rut_apoderado;
        this.parentesco_apoderado = parentesco_apoderado;
        this.contacto_apoderado = contacto_apoderado;
        this.direccion_apoderado = direccion_apoderado;
    }

    public String getRut_alumno() {
        return rut_alumno;
    }

    public void setRut_alumno(String rut_alumno) {
        this.rut_alumno = rut_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getApellido_alumno() {
        return apellido_alumno;
    }

    public void setApellido_alumno(String apellido_alumno) {
        this.apellido_alumno = apellido_alumno;
    }

    public String getNacimiento_alumno() {
        return nacimiento_alumno;
    }

    public void setNacimiento_alumno(String nacimiento_alumno) {
        this.nacimiento_alumno = nacimiento_alumno;
    }

    public String getClave_alumno() {
        return clave_alumno;
    }

    public void setClave_alumno(String clave_alumno) {
        this.clave_alumno = clave_alumno;
    }

    public String getRut_apoderado() {
        return rut_apoderado;
    }

    public void setRut_apoderado(String rut_apoderado) {
        this.rut_apoderado = rut_apoderado;
    }

    public String getParentesco_apoderado() {
        return parentesco_apoderado;
    }

    public void setParentesco_apoderado(String parentesco_apoderado) {
        this.parentesco_apoderado = parentesco_apoderado;
    }

    public String getContacto_apoderado() {
        return contacto_apoderado;
    }

    public void setContacto_apoderado(String contacto_apoderado) {
        this.contacto_apoderado = contacto_apoderado;
    }

    public String getDireccion_apoderado() {
        return direccion_apoderado;
    }

    public void setDireccion_apoderado(String direccion_apoderado) {
        this.direccion_apoderado = direccion_apoderado;
    }
     
}
