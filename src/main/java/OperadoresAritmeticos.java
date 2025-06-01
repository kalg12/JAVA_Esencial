//Paso 1 - Importamos el paquete Scanner 
import java.util.Scanner;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Paso 2 - Creamos el objeto de Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Paso 3 - Reemplazar el valor numérico -> scanner.nextInt();
        
        //Suma, Resta, Multiplición y División
        
        System.out.println("Ingresa el valor uno: ");
        int valorUno = scanner.nextInt();
        
        System.out.println("Ingresa el valor dos: ");
        int valorDos = scanner.nextInt();
        
        System.out.println(valorUno + valorDos);
        System.out.println(valorUno - valorDos);
        System.out.println(valorUno * valorDos);
        System.out.println(valorUno / valorDos);
              
    }
}
