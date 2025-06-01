import java.util.Scanner;

public class operadorInterroganteDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entre 1 y 3");
        int numeroIngresado = scanner.nextInt();
        
        String mensaje = (numeroIngresado != 2) ? "Elegiste un número que no es el dos" : "Elegiste 2";
        
        System.out.println(mensaje);
    }
}
