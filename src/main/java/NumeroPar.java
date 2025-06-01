//Importacion de Scanner
import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        //Se va a determinar si un número es par o impar
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese número");
        int valorNumerico = scanner.nextInt();
        double residuo = valorNumerico % 2;
        
        if(residuo == 0.0){
            System.out.println("El valor numérico " + valorNumerico + " ingresado es número par");
        } else {
            System.out.println("El valor numérico " + valorNumerico + " ingresado es número impar");
        }
  
    }
}
