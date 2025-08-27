package mx.unam.ciencias.myp;

/**
 * Clase que implementa la interfaz Operacion para realizar una multiplicación.
 * @autor Alvaro Ramirez
 * @version 1.0
 */

public class Multiplicacion implements Operacion {
    
    /**
     * Realiza una multiplicación.
     * @param a el primer operando.
     * @param b el segundo operando.
     * @return la multiplicación de a y b.
     */
    public int operacion(int a, int b) {
        return a * b;
    }
    
}
