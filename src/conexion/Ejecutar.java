/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author The Law
 */
public class Ejecutar {
    
    public static void main(String[] args) {
        DB exec = new DB();
        exec.crearBD();
    }
}
