/* API SISTEMA COLEGIO.
 *
 * 
 *
 * Codigo Basado en Pedro Gatica , Kimberly Soazo , Joaquin Valenzuela 
 *
 * 
 *
 * Este programa es software libre; Puedes redistribuirlo y / o modificarlo.
 * bajo los términos de la Licencia Pública General de GNU tal como fue publicada por
 * la Fundación de Software Libre; ya sea la versión 2 de la Licencia, o
 * (a su elección) cualquier versión posterior.
 *
 * ------------------------------------------------- ----------------------------
 * Copyright (c) 2019,Pedro Gatica , Joaquin Valenzuela,Kimberly Soazo
 * Todos los derechos reservados.
 *
 * CONDICIONES DE LA LICENCIA
 *
 * La distribución gratuita y el uso de este software tanto en origen como en binario.
 * Se permite el formulario (con o sin cambios) siempre que:
 *
 * 1. Las distribuciones de este código fuente incluyen el copyright anterior.
 * Aviso, esta lista de condiciones y el siguiente descargo de responsabilidad;
 *
 * 2. Las distribuciones en formato binario incluyen el copyright anterior.
 * Aviso, esta lista de condiciones y el siguiente aviso legal.
 * en la documentación y / u otros materiales asociados;
 *
 * 3. el nombre de los titulares de los derechos de autor no se utiliza para promocionar productos
 * construido utilizando este software sin permiso escrito específico.
 *
 * ALTERNATIVAMENTE, siempre que este aviso se mantenga en su totalidad, este producto
 * se puede distribuir según los términos de la Licencia Pública General de GNU (GPL),
 * en cuyo caso, las disposiciones de la GPL se aplican EN LUGAR DE las mencionadas anteriormente.
 *
 * DESCARGO DE RESPONSABILIDAD
 *
 * Este software se proporciona "tal cual" sin garantías explícitas ni implícitas
 * con respecto a sus propiedades, incluida, entre otras, la corrección
 * y / o aptitud para el propósito.
 * ------------------------------------------------- ----------------------------
 * /

*/
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
