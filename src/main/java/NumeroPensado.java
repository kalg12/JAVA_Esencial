import java.util.Scanner;
import java.util.Random;

public class NumeroPensado {
    public static void main(String[] args) {
        //Create a game for guess the number
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroRandom = random.nextInt(5);
        int numeroIngresado;
        
        do{
            System.out.print("Ingrese un número al azar del 1 al 5: ");
            numeroIngresado = scanner.nextInt();
            
            if(numeroIngresado == numeroRandom){
                System.out.println("Adivinaste");
            }
        }while (numeroIngresado != numeroRandom);
        
    }
    
}
