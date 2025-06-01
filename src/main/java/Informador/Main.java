package Informador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Informador informador = new Informador();

        informador.mostrarPorPantalla("Kevin");

        //Vamos a pasarle un byte
        byte unByte = 2;
        informador.mostrarPorPantalla(unByte);

        //Ahora con un double
        informador.mostrarPorPantalla(5.4);

        //Ahora lo hacemos para el color
        informador.mostrarPorPantalla("Hola", Informador.COLOR_AZUL);
        informador.mostrarPorPantalla("Hola");

        //Now we request to user X argument
        System.out.println("Ingresa el valor que tu desees");
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.nextLine();

        informador.mostrarPorPantalla(valor);

        scanner.close(); //Esto es para cerrar el scanner por buena práctica


    }
}
