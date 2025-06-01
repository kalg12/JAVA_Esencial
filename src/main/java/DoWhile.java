import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 10");
        int numero = scanner.nextInt();
    
       if(numero <=10 & numero > 0){
        do{
                System.out.println("Este es el número: " + numero);
                numero++;
        }while(numero<=10);
       }
    }
    
}
