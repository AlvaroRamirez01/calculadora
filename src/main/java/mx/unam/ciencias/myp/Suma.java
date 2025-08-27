package mx.unam.ciencias.myp;

/**
 * Clase que implementa la interfaz Operacion para realizar una suma.
 * @autor Alvaro Ramirez
 * @version 1.0
 */
public class Suma implements Operacion {
    
    /**
     * Realiza una suma.
     * @param a el primer operando.
     * @param b el segundo operando.
     * @return la suma de a y b.
     */
    public int operacion(int a, int b) {
        return a + b;
    }
    
}
