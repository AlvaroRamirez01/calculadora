package mx.unam.ciencias.myp;

/**
 * Clase que implementa la interfaz Operacion para realizar una división.
 * @autor Alvaro Ramirez
 * @version 1.0
 */

public class Division implements Operacion {
    
    /**
     * Realiza una división.
     * @param a el primer operando.
     * @param b el segundo operando.
     * @return la división de a y b.
     * @throws ArithmeticException si b es 0.
     */
    public int operacion(int a, int b) {
        return a / b;
    }
    
}
