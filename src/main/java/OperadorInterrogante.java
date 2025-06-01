import java.util.Scanner;

public class OperadorInterrogante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero");        
        int dividiendo = scanner.nextInt();
        System.out.println("Introduce otro número entero");     
        int divisor = scanner.nextInt();

         // Usar el operador ternario para evitar la división por 0
        int resultado = (divisor != 0) ? (dividiendo / divisor) : 0;
        String mensaje = (divisor != 0) ? "El resultado de la división es: " + resultado : "No se puede dividir por 0";
        
        System.out.println(mensaje);
        
    }
}
