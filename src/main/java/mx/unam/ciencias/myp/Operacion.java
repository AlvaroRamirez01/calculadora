package mx.unam.ciencias.myp;

/**
 * Interfaz para operaciones matemáticas.
 * @author Alvaro Ramirez
 * @version 1.0
 */

public interface Operacion {
    
    /**
     * Realiza una operación matemática.
     * @param a el primer operando.
     * @param b el segundo operando.
     * @return el resultado de la operación.
     */
    public int operacion(int a, int b);
}
