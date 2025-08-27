package mx.unam.ciencias.myp;

import java.io.IOException;

/**
 * Clase que proporciona mensajes para la calculadora.
 * Incluye métodos para mostrar mensajes de saludo, despedida, menú y resultados,
 * así como para limpiar la consola.
 * 
 * @autor Alvaro Ramirez
 * @version 1.0
 */
public class Mensajes {

    /**
     * Devuelve un mensaje de saludo al iniciar la calculadora.
     * 
     * @return el mensaje de saludo.
     */
    public String saludo() {
        return "............Iniciando calculadora............"+
        "\r\n" + //
                        "\r\n" + //
                        "=========================================================================\r\n" + //
                        ":'######:::::'###:::::'######::'####::'#######:::::'##::::'##:'########::\r\n"+
"'##... ##:::'## ##:::'##... ##:. ##::'##.... ##::::. ##::'##:: ##.... ##:\r\n"+
" ##:::..:::'##:. ##:: ##:::..::: ##:: ##:::: ##:::::. ##'##::: ##:::: ##:\r\n"+
" ##:::::::'##:::. ##:. ######::: ##:: ##:::: ##::::::. ###:::: ##:::: ##:\r\n"+
" ##::::::: #########::..... ##:: ##:: ##:::: ##:::::: ## ##::: ##:::: ##:\r\n"+
" ##::::::: ##.... ##:'##::: ##:: ##:: ##:::: ##::::: ##:. ##:: ##:::: ##:\r\n"+
". ######:: ##:::: ##:. ######::'####:. #######::::: ##:::. ##: ########::\r\n"+
":......:::..:::::..:::......:::....:::.......::::::..:::::..::........:::\r\n"+
                        "=========================================================================\r\n" + //
                        "\r\n" + //
                        "............Iniciando calculadora............";
    }

    /**
     * Devuelve un mensaje de despedida al terminar la calculadora.
     * 
     * @return el mensaje de despedida.
     */
    public String despedida() {
        return "............Terminando calculadora............"+
        "\r\n" + //
                        "\r\n" + //
                        "==========================================================================\r\n" + //
                        ":::'###::::'########::'####::'#######:::'######:::::'##::::'##:'########::\r\n"+
"::'## ##::: ##.... ##:. ##::'##.... ##:'##... ##::::. ##::'##:: ##.... ##:\r\n"+
":'##:. ##:: ##:::: ##:: ##:: ##:::: ##: ##:::..::::::. ##'##::: ##:::: ##:\r\n"+
"'##:::. ##: ##:::: ##:: ##:: ##:::: ##:. ######:::::::. ###:::: ##:::: ##:\r\n"+
" #########: ##:::: ##:: ##:: ##:::: ##::..... ##:::::: ## ##::: ##:::: ##:\r\n"+
" ##.... ##: ##:::: ##:: ##:: ##:::: ##:'##::: ##::::: ##:. ##:: ##:::: ##:\r\n"+
" ##:::: ##: ########::'####:. #######::. ######::::: ##:::. ##: ########::\r\n"+
"..:::::..::........:::....:::.......::::......::::::..:::::..::........:::\r\n"+
                        "==========================================================================\r\n" + //
                        "\r\n" + //
                        "............Terminando calculadora............";
    }

    /**
     * Devuelve el menú de opciones para la calculadora.
     * 
     * @return el menú de opciones.
     */
    public String menu() {
        return "Que operacion desea realizar?\n"+
        "1.- Suma\n"+
        "2.- Resta\n"+
        "3.- Multiplicacion\n"+
        "4.- Division\n"+
        "5.- Salir\n";
    }

    /**
     * Devuelve el mensaje para solicitar el primer número.
     * 
     * @return el mensaje para el primer número.
     */
    public String primerNumero() {
        return "Introduce el primer numero: ";
    }

    /**
     * Devuelve el mensaje para solicitar el segundo número.
     * 
     * @return el mensaje para el segundo número.
     */
    public String segundoNumero() {
        return "Introduce el segundo numero: ";
    }

    /**
     * Devuelve el mensaje con el resultado de la operación.
     * 
     * @param resultado el resultado de la operación.
     * @return el mensaje con el resultado.
     */
    public String resultado(int resultado) {
        return "El resultado es: " + resultado;
    }

    /**
     * Limpia la consola.
     */
    public void limpiarConsola() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder builder;
            if (os.contains("win")) {
                builder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                builder = new ProcessBuilder("clear");
            }
            builder.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}