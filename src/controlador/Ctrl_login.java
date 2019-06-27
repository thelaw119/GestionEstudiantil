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

package controlador;

import controlador.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import vista.Panel_Admin;
import vista.Panel_Alumno;
import vista.Panel_Profesor;

/**
 *
 * @author The Law
 * 
 */
public class Ctrl_login extends Conexion{
    
    ResultSet resultado = null;
    
    public Ctrl_login(){
        
    }
    
    /**
     * CREAMOS EL METODO LOGINADMINISTRADOR
     * @param rut
     * @param clave 
     */
    public void LoginAdministrador(String rut, String clave){
        
        try{
        String sql = "Select rut_profesor, clave_profesor, nombre_profesor"
                + " from Profesor where rut_profesor = '"+rut+"' "
                + "and clave_profesor = '"+clave+"'";
        
     
            resultado  = sentencia.executeQuery(sql);
        
           
           int contador = 0;
           
           String rut_admin = null;
           String nombre_admin = null;
           
            while(resultado.next()){
                contador = contador + 1;
                rut_admin = resultado.getString("rut_profesor");
                nombre_admin = resultado.getString("nombre_profesor");
            }
   
           System.out.println(contador);
 
           System.out.println(nombre_admin +"  "+ rut_admin);
           
           if(contador == 1){
               
               JOptionPane.showMessageDialog(null, "Ingresado con exito!");
               JOptionPane.showMessageDialog(null, "Bienvenido:" + nombre_admin + "  " + "Rut: " + rut_admin);
                Panel_Admin mostrar_adm = new Panel_Admin();
                mostrar_adm.setLocationRelativeTo(null);
                mostrar_adm.setVisible(true);
                
   
           }else if(contador > 1){
               JOptionPane.showMessageDialog(null, "Rut DUPLICADO!");
           }else{
               JOptionPane.showMessageDialog(null, "Rut o Clave INVALIDA!");
           }
           
           
           }catch(Exception e){
               
           }
        }
        
    /**
     * CREAMOS EL METODO LOGINPROFESOR
     * @param rut
     * @param clave 
     */
        public void LoginProfesor(String rut, String clave){
        
        try{
        String sql = "Select rut_profesor, clave_profesor, nombre_profesor"
                + " from Profesor where rut_profesor = '"+rut+"' "
                + "and clave_profesor = '"+clave+"'";
        
     
            resultado  = sentencia.executeQuery(sql);
        
           
           int contador = 0;
           
           String rut_prof = null;
           String nombre_prof = null;
           
            while(resultado.next()){
                contador = contador + 1;
                rut_prof = resultado.getString("rut_profesor");
                nombre_prof = resultado.getString("nombre_profesor");
            }
   
           System.out.println(contador);
 
           System.out.println(rut_prof +"  "+ nombre_prof);
           
           if(contador == 1){
               
               JOptionPane.showMessageDialog(null, "Ingresado con exito!");
               JOptionPane.showMessageDialog(null, "Bienvenido:" + nombre_prof  + "  " + "Rut: " + rut_prof);
               Panel_Profesor mostrar_prof = new Panel_Profesor();
               mostrar_prof.setLocationRelativeTo(null);
               mostrar_prof.setVisible(true);
               //Ingreso.DISPOSE_ON_CLOSE = 1; 
   
           }else if(contador > 1){
               JOptionPane.showMessageDialog(null, "Rut DUPLICADO!");
           }else{
               JOptionPane.showMessageDialog(null, "Rut o Clave INVALIDA!");
           }
           
           
           }catch(Exception e){
               
           }
        }
    
    /**
     * CREAMOS EL METODO LOGINALUMNO
     * @param rut
     * @param clave 
     */
        public void LoginAlumno(String rut, String clave){
        
        try{
        String sql = "Select rut_alumno, clave_alumno, nombre_alumno"
                + " from Alumno where rut_alumno = '"+rut+"' "
                + "and clave_alumno = '"+clave+"'";
        
     
            resultado  = sentencia.executeQuery(sql);
        
           
           int contador = 0;
           
           String rut_alum = null;
           String nombre_alum = null;
           
            while(resultado.next()){
                contador = contador + 1;
                rut_alum = resultado.getString("rut_alumno");
                nombre_alum = resultado.getString("nombre_alumno");
            }
   
           System.out.println(contador);
 
           System.out.println(rut_alum +"  "+ nombre_alum);
           
           if(contador == 1){
               
               JOptionPane.showMessageDialog(null, "Ingresado con exito!");
               JOptionPane.showMessageDialog(null, "Bienvenido:"+ nombre_alum + "  " + "Rut: " + rut_alum);
               
               
               Panel_Alumno mostrar_alum = new Panel_Alumno();
               mostrar_alum.setLocationRelativeTo(null);
               mostrar_alum.setVisible(true);
                
   
           }else if(contador > 1){
               JOptionPane.showMessageDialog(null, "Rut DUPLICADO!");
           }else{
               JOptionPane.showMessageDialog(null, "Rut o Clave INVALIDA!");
           }
           
           
           }catch(Exception e){
               
           }
        }
    
}
