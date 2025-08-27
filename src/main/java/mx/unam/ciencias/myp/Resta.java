package mx.unam.ciencias.myp;

/**
 * Clase que implementa la interfaz Operacion para realizar una resta.
 * @autor Alvaro Ramirez
 * @version 1.0
 */

public class Resta implements Operacion {
    
    /**
     * Realiza una resta.
     * @param a el primer operando.
     * @param b el segundo operando.
     * @return la resta de a y b.
     */
    public int operacion(int a, int b) {
        return a - b;
    }
    
}
