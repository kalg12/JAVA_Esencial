package Informador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Informador informador = new Informador();

        informador.mostrarPorPantalla("Kevin");

        // Vamos a pasarle un byte
        byte unByte = 2;
        informador.mostrarPorPantalla(unByte);

        // Ahora con un double
        informador.mostrarPorPantalla(5.4);

        // Ahora lo hacemos para el color
        informador.mostrarPorPantalla("Hola", Informador.COLOR_AZUL);
        informador.mostrarPorPantalla("Hola");

        // Pedir al usuario que ingrese algo
        System.out.println("Ingresa el valor que tú desees:");
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.nextLine();

        // Intentamos detectar el tipo
        try {
            int entero = Integer.parseInt(valor);
            informador.mostrarPorPantalla(entero);
        } catch (NumberFormatException e1) {
            try {
                double decimal = Double.parseDouble(valor);
                informador.mostrarPorPantalla(decimal);
            } catch (NumberFormatException e2) {
                informador.mostrarPorPantalla(valor); // Es texto
            }
        }

        scanner.close(); // buena práctica
    }
}