package mx.unam.ciencias.myp;

import java.util.Scanner;

/**
 * Clase principal que ejecuta la aplicación de la calculadora.
 * Proporciona un menú para realizar operaciones aritméticas básicas.
 * 
 * @autor Alvaro Ramirez
 * @version 1.0
 */
public class App {

    private static Mensajes msj = new Mensajes();
    private static Scanner sc = new Scanner(System.in);
    private static Operacion op;

    /**
     * Método principal que inicia la aplicación de la calculadora.
     * 
     * @param args los argumentos de la línea de comandos.
     */
    public static void main( String[] args ){
        try { Thread.sleep(2000); } catch (InterruptedException e) { }
        msj.limpiarConsola();
        System.out.println( msj.saludo());
        try { Thread.sleep(2000); } catch (InterruptedException e) { }
        msj.limpiarConsola();
        while (true) {
            System.out.println( msj.menu());
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    msj.limpiarConsola();
                    op = new Suma();
                    System.out.println( msj.primerNumero());
                    int a = sc.nextInt();
                    System.out.println( msj.segundoNumero());
                    int b = sc.nextInt();
                    System.out.println( msj.resultado(op.operacion(a, b)));
                    break;
                case 2:
                    msj.limpiarConsola();
                    op = new Resta();
                    System.out.println( msj.primerNumero());
                    a = sc.nextInt();
                    System.out.println( msj.segundoNumero());
                    b = sc.nextInt();
                    System.out.println( msj.resultado(op.operacion(a, b)));
                    break;
                case 3:
                    msj.limpiarConsola();
                    op = new Multiplicacion();
                    System.out.println( msj.primerNumero());
                    a = sc.nextInt();
                    System.out.println( msj.segundoNumero());
                    b = sc.nextInt();
                    System.out.println( msj.resultado(op.operacion(a, b)));
                    break;
                case 4:
                    msj.limpiarConsola();
                    op = new Division();
                    System.out.println( msj.primerNumero());
                    a = sc.nextInt();
                    System.out.println( msj.segundoNumero());
                    b = sc.nextInt();
                    System.out.println( msj.resultado(op.operacion(a, b)));
                    break;
                case 5:
                    try { Thread.sleep(2000); } catch (InterruptedException e) { }
                    msj.limpiarConsola();
                    System.out.println( msj.despedida());
                    try { Thread.sleep(2000); } catch (InterruptedException e) { }
                    msj.limpiarConsola();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida.");
            }
        }  
    }
}
