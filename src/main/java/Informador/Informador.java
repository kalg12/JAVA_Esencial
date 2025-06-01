package Informador;

public class Informador {
    //Definimos constantes fijas que no pueden ser modificables
    public static final String COLOR_POR_DEFECTO = "\u001B[0m";
    public static final String COLOR_NEGRO = "\u001B[31m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_AZUL = "\u001B[34m";




    //Definimos metodo mostrarPorPantalla pero podemos definir varios con el mismo nombre
    void mostrarPorPantalla(int entero){
        System.out.println("Mostrando el entero: " + entero);
    }

    void mostrarPorPantalla(double decimal){
        System.out.println("Mostrando el decimal: " + decimal);
    }

    void mostrarPorPantalla(String palabra){
        System.out.println("Mostrando la palabra: " + palabra);
    }

    void mostrarPorPantalla(String palabra, String color){
        System.out.println(color + "Mostrando la palabra con color: " + palabra + COLOR_POR_DEFECTO);
    }
}
