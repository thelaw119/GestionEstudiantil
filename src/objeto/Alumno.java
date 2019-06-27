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

    public Alumno(String rut_alumno, String nombre_alumno, String apellido_alumno, String nacimiento_alumno, String clave_alumno, String rut_apoderado, String parentesco_apoderado, String contacto_apoderado, String direccion_apoderado) {
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

    public Alumno(String rut_alumno, String nombre_alumno) {
        this.rut_alumno = rut_alumno;
        this.nombre_alumno = nombre_alumno;
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
     
    @Override
    public String toString() {
        return rut_alumno + ". " + nombre_alumno;
    }
}
